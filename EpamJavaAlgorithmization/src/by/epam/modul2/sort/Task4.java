package by.epam.modul2.sort;

import java.util.Random;

/*
 * 4. ���������� ��������. ���� ������������������ ����� a1<=a2<=...<=an. ���������
 * ����������� ����� � ������� �����������. ��� ����� ������������ ��� �������� �����
 * �i � �i+1. ���� �i > �i+1, �� �������� ������������. ��� ������������ �� ��� ���,
 * ���� ��� �������� �� ������ � ������� �����������. ��������� �������� ����������,
 * ����������� ��� ���� ���-�� ������������.
 */

public class Task4 {
    public static void main(String args[]) {
        int[] array = new int [10];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(25);
        }
        for(int i:array) {
            System.out.print("|"+i+"|");
        }
        System.out.println();
        boolean checker= true;
        int temp=0;
        int count=0;
        while (checker) {
            checker = false;
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] > array[k + 1]) {
                    temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    count++;
                    checker = true;
                }

            }
        }

        for(int i = 0;i<array.length;i++) {
            System.out.print("|"+array[i]+"|");
        }
        System.out.println();
        System.out.print("���������� ������������= "+count);
    }
}
