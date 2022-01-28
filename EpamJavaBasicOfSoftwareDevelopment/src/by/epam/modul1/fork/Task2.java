package by.epam.modul1.fork;
/*
2. Найти max{min(a,b),min(c,d)}.
 */

public class Task2 {
    public static void main(String[] args) {
        int a = 2, b = 4, c = 1, d = 7;
        int t1, t2;
        if (a > b) {
            t1 = b;
        } else {
            t1 = a;
        }
        if (c > d) {
            t2 = d;
        } else {
            t2 = c;
        }
        if (t1 > t2) {
            System.out.println("max{min(a,b),mib(c,d)}=" + t1);
        } else {
            System.out.println("max{min(a,b),mib(c,d)}=" + t2);
        }

        System.out.println();

    }
}

