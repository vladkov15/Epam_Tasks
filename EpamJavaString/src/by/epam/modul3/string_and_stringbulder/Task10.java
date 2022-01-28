package by.epam.modul3.string_and_stringbulder;
/*
10. Строка Х состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определите кол-во предложений в строке Х.
 */

public class Task10 {
    public static void main(String[] args) {
    AmountOfSentences("привет, это певое предложение. Это второе! это наверное третье?");
    }
    public static void AmountOfSentences(String str){
        int amount=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='.' || str.charAt(i)=='!' || str.charAt(i)=='?' ){
                amount++;
            }
        }
        System.out.println("кол-во предложений = "+amount);
    }
}
