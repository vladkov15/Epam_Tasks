package by.epam.modul1.loop;
/*
2. Вычислить значения функции на отрезке [a,b] c шагом h:
 */

public class Task2 {
    public static void main(String[] args) {
        int a=4,b=5,h=2;
        for (int x = a; x < b; x += h) {
            if (x > 2) {
                System.out.println(x);

            } else System.out.println(-x);
        }
    }
}
