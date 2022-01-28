package by.epam.modul2.sort;

import java.util.Arrays;
import java.util.Random;

/*
 * 5. ���������� ���������. ���� ������������������ ����� a1,a2,..,an. ���������
 * ����������� ����� � ������� �����������. �������� ��� ��������� �������.
 * ����� a1,a2,..an. - ������������� ������������������, �.� a1<=a2<=....<=an.
 * ������� ��������� ����� �i+1 � ����������� � ������������������ ���, �����
 * ����� ������������������ ���� ���� ������������. ������� ������������ �� ��� ���
 * ����� ��� �������� �� i+1 �� n �� ����� ���������. ����������. ����� ���������
 * ���������� �������� � ��������������� ����� ����������� � ������� ���������
 * ������. �������� ����� �������� � ���� ��������� �������.
 */


public class Task5 {
    public static void main(String args[]){
        int[] arr = createArray();
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] createArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(15);
        }

        return array;
    }
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int index;
            index = Arrays.binarySearch(arr, 0, k, newElement);
            if (index < 0) {
                index = -(index) - 1;
            }
            System.arraycopy(arr, index, arr, index + 1, k - index);
            arr[index] = newElement;
        }
    }
}
