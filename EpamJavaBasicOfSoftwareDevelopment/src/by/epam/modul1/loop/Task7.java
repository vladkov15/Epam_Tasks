package by.epam.modul1.loop;
/*
7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            boolean tmp = false;
            System.out.printf("Для %d делители:\n", i);
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    System.out.println(j);
                    tmp = true;
                }
            }
            if (tmp == false) {
                System.out.println("Отсутствуют");
            }
        }
    }
}
