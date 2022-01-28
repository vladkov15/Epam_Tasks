package by.epam.modul1.fork;
/*
5. Вычислить знаение функции:

 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ведите x");
        int x = in.nextInt();
        if(x<=3) {
            double y = Math.pow(x, 2)-3*x+9;
            System.out.println("ответ:="+y);
        }else {
            double y = 1/(Math.pow(x, 3)+6);
            System.out.println("ответ:="+y);
        }
        in.close();
        System.out.println();

    }
}
