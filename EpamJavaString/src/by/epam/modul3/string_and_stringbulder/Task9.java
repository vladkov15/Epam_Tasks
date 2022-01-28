package by.epam.modul3.string_and_stringbulder;
/*
9. Подсчитать кол-во сточных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
 */

public class Task9 {
    public static void main(String[] args) {
        String str = new String("Test String");
        AmountOfChar1(str);
    }
    public static void AmountOfChar1(String str){
        int high = 0;
        int low = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                high++;
            }else
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                low++;
            }
        }
        System.out.println("кол-во заглавный букв= "+high+" кол-во строчных букв= "+low);
    }

}
