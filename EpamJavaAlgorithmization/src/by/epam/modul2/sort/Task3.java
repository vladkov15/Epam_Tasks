package by.epam.modul2.sort;

import java.util.Random;

/*
 * 3. ���������� �������. ���� ������������������ ����� a1<=a2<=...<=an. ���������
 * ����������� �������� ���, ����� ��� ���� ������������ �� ��������. ��� �����
 * � �������, ������� � �������, ���������� ���������� ������� � ��������� ��
 * ������ �����, ������ �� ����� �����������. ����� ������� �� �������, ���
 * ��������� �����������. �������� �������� ���������� �������.
 *
 */

public class Task3 {
    public static void main(String args[]) {
        int[] array = new int [10];
        Random random =new Random();
        for(int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(25);
        }
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] > array[minInd]) {
                    minInd = i;
                }
            }
            int tmp = array[left];
            array[left] = array[minInd];
            array[minInd] = tmp;
        }
        for(int i:array) {
            System.out.print(i+" ");
        }
    }

}
