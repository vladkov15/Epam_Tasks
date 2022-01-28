package by.epam.modul1.linear_program;
/*
6. Для данной области составить линейную программу, которая печатает true, если точка с кординатами (x,y)
принадлежит закрашенной области, и false - в противном случае:
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите x");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите y");
        int y = new Scanner(System.in).nextInt();
        if(x<=2 && y<=4 && x>=-2 && y>=-3
                || x<=4 && y<=0 && x>=2 && y>=-3
                || x<=-2 && y<=0 && x>=-4 && y>=-3 ) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
