package by.epam.modul1.loop;
/*
5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
 */

public class Task5 {
    public static void main(String[] args) {
        int n=5;
        double e=0.1;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, n);

            if (Math.abs(a) >= e) {
                sum += a;
            }
        }

        System.out.println(sum);
    }
}
