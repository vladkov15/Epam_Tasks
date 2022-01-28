package by.epam.modul3.string_and_stringbulder;

/*
1. Дан текст(строка). Найдите наибольшее количество подрят идущих пробелов в нем.
 */

public class Task1 {
    public static void main(String[] args) {
        String test = "1 2  3   4    1 2  ";
        FindMaxSpaces(test);
    }
    public static void FindMaxSpaces(String str){
        int max=0;
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isSpaceChar(str.charAt(i))){
                count++;
                if (count>max){
                    max=count;
                }
            }else{
               count=0;
            }
        }
        System.out.println("наибольшее кол-во пробелов="+max);
    }
}
