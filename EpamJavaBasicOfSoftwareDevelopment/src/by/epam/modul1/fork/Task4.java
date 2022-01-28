package by.epam.modul1.fork;
/*
4. Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через
отверстие.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а,b");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Введите x,y,z");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Пройдет");}
        else {
            System.out.println("Не пройдет");
        }
        in.close();
        System.out.println();

    }

}
