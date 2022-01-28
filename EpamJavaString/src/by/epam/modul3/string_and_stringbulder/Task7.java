package by.epam.modul3.string_and_stringbulder;
/*
 7. Вводится строка. Требуется удалить из нее повторяющийся символы и все пробелы. Например "abc cde def", то должно
 быть выведено "abcdef".
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {
     StringBuilder str = new StringBuilder(new Scanner(System.in).nextLine());
     NewString(str);
    }
    public static void NewString(StringBuilder str){
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' '){
                str.deleteCharAt(i);
            }
        }
        String newStr = String.valueOf(str);
        char[] chars = newStr.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
        }
}
