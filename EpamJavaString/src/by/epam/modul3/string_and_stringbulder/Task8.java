package by.epam.modul3.string_and_stringbulder;
/*
8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных
слов несколько, не обрабатывать.
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        MaxLen(new Scanner(System.in).nextLine());
    }
    public static void MaxLen(String str)
    {
        String[]words=str.split(" ");
        String res="";
        for(String word: words)
        {
            if(word.length()>res.length())
                res=word;
            if (word.length()==res.length()){
                res="";
            }
        }
        System.out.println(res);
    }
}
