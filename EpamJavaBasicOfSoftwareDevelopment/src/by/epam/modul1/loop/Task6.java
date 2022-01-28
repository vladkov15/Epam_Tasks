package by.epam.modul1.loop;
/*
 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 */

public class Task6 {
    public static void main(String[] args) {
        char c = 0;
        for (int i = 0; i < Character.MAX_VALUE; i++, c++) {
            System.out.println(c + " - " + (int) c);
        }
    }
}
