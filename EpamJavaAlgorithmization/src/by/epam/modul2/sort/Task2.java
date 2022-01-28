package by.epam.modul2.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 2. ���� ��� ������������������ �1<=a2<=a3<=...<=an � b1<=b2<=b3<=...<=bn. ����������
 * �� ��� ����� ������������������ ����� ���, ����� ��� ���� ���� �� ���������.
 * ���������� �������������� ������ �� ������������.
 */

public class Task2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int aLenght = scanner.nextInt();
        int[] a=new int[aLenght];
        int bLenght = scanner.nextInt();
        int[] b=new int[bLenght];
        scanner.close();
        Random random = new Random();
        for(int i=0;i<aLenght;i++) {
            a[i] =random.nextInt(12);
        }
        for(int i=0;i<bLenght;i++) {
            b[i] =random.nextInt(15);
        }
        System.out.print("a[]=");
        for(int i: a) {
            System.out.print(i +"|");
        }
        System.out.print("b[]=");
        for(int i: b) {
            System.out.print(i +"|");
        }
        System.out.println("////// ");
        int []c=new int[(a.length+b.length)];
        for (int i = 0; i < c.length; i++) {
            if ((a.length) > i){
                c[i] = a[i];
            }else
                c[i] = b[i-a.length];
        }
        Arrays.sort(c);

        for(int i: c) {
            System.out.print(i +"|");
        }
    }
}
