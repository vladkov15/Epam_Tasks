package by.epam.modul3.regular_expression;

/*
 * 1. Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом
 * три различных операции: отсортировать абзацы по количеству предложений, в каждом предложении отсортировать
 *  слова по длине, отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String str ="Первый обзац. В котором три предложения! Which has three sentences.\n"
                +"Второй обзац. С двумя предложениями.\n"
                +"Третий обзац.";
        Menu(str);
    }
    public static void Menu(String text) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(" '1' = для сортировки абзацев по количеству предложений \n" +
                " '2' = для сортировки в каждом предложении слов по длине\n" +
                " '3' = для сортировки лексем в предложениях по убыванию количества " +
                "  вхождений заданного символа, а в случае равенства - по алфавиту.\n" +
                "Для завершения работы приложения введите 'close' \n");
        String choice = "";
        Boolean flag = false;
        while (!flag) {
            System.out.print("Выберите операцию = ");
            choice = sc.next();
            switch (choice) {
                case "1":
                    SortParagraph(text);
                    break;
                case "2":
                    SortWord(text);
                    break;
                case "3":
                    SortLexemes(text);
                    break;
                case "close":
                    System.out.println(" До свидания");
                    flag=true;
                    break;
                default:
                    System.out.println(" Проверьте данные");
            }
        }
    }
    public static String[] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    public static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }
    public static void SortParagraph(String txt){
        String[] paragraphs = txt.split("\n");
        int[] counterSentences = new int[paragraphs.length];
        int maxLengthParagraph = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitSentences(paragraphs[i]);
            counterSentences[i] = sentences.length;
            if (maxLengthParagraph < sentences.length) {
                maxLengthParagraph = sentences.length;
            }
        }

        for (int i = 1; i <= maxLengthParagraph; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }
    public static void SortWord(String txt) {
        String[] paragraphs = txt.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        if (words[m].length() > words[m + 1].length()) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        }
                    }
                }

                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void SortLexemes(String txt){
        System.out.print(" Введите символ = ");
        String letter = new Scanner(System.in).next();
        String[] paragraphs = txt.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) { //считаем количество вхождений
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {   //считаем количество вхождений следующего символа
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {   //сравниваем количесво вхождений
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) { //если количество вхождений равно, сортировка по алфавиту
                            String[] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }

                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
