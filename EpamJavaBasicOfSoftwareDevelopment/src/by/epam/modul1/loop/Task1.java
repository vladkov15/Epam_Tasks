package by.epam.modul1.loop;
/*
1. Напишите программу, где пользователь вводит любое целое положительное число. A программа
суммирует все числа от 1 до введенного числа.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите целое положителное число");
            int choise = sc.nextInt();
            if(choise>0){
                Sum(choise);
                break;
            }
        }
    }
    public static void Sum(int a){
        int sum=0;
        for (int i = 0; i <=a; i++) {
            sum+=i;
        }
        System.out.println("Сумма ="+sum);
    }

}
