package by.epam.modul3.string_and_stringbulder;
/*
5. Подсчитать, сколько раз среди символов заданной строки встречается буква "а".
 */
public class Task5 {
    public static void main(String[] args) {
     StringBuilder str = new StringBuilder("тестовая строка");
     AmountOfA(str);
     StringBuilder str2 = new StringBuilder("tested string aaa");
     AmountOfA(str2);
    }
    public static void AmountOfA(StringBuilder str){
        int counter=0;
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i)=='а' || str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println("кол-во *а* в строке равна ="+counter);
    }
}
