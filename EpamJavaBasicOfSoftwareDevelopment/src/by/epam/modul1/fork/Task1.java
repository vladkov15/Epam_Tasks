package by.epam.modul1.fork;
/*
1. Даны два угла треугольника (в градусах). Оперделить, существует ли такой треугольник, и если да, то будет ли он
прямоугольным.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите первый угол");
        double a=new Scanner(System.in).nextDouble();
        System.out.println("Введите второй угол");
        double b=new Scanner(System.in).nextDouble();
        if(a+b<180) {
            System.out.println("Такой треугольник существует");
            double c=180-(a+b);
            if(a==90 || b==90 || c==90) {
                System.out.println("Этот треугольник прямоугольный");
            }
        }else {
            System.out.println("Такого треугольника не существует!!!");
        }
        System.out.println();
    }
}
