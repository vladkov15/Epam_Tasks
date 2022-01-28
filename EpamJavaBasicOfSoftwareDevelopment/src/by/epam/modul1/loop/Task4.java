package by.epam.modul1.loop;
/*
 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {
    public static void main(String[] args) {
        long sum=1;
        for (int i = 1; i <=200 ; i++) {
          sum *= i * i;
        }
        System.out.println(sum);
    }
}
