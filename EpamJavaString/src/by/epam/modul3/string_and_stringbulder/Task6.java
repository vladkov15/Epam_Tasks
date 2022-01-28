package by.epam.modul3.string_and_stringbulder;
/*
6. Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task6 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("тестовая строка");
        MakeNewString(str);
    }
    public static void MakeNewString(StringBuilder str){
        System.out.println("до = "+str.toString());
        StringBuilder str2 = new StringBuilder(str.length()*2);
        for (int i = 0; i <str.length() ; i++) {
                str2.append(str.charAt(i));
                str2.append(str.charAt(i));
        }
        str2.deleteCharAt(str2.indexOf("  "));
        System.out.println("после = "+str2.toString());
    }
}
