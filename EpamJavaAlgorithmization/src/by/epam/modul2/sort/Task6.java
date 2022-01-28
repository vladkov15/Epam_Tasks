package by.epam.modul2.sort;

import java.util.Arrays;
import java.util.Random;

/*
 * 6. ���������� �����. ��� ������ n �������������� �����. ��������� �����������
 * ��� �� �����������. �������� ��� ����. �������. ������������ ��� �������� ��������
 * ai � ai+1. ���� ai<ai+1, �� ������������ �� 1 ������� ������. ���� ai>a+1
 * �� ������������ ������������ � ���������� �� 1 ������� �����. ��������� �������
 * ���� ����������.
 */

public class Task6 {
    public static void main(String args[]) {
        double[] arr = createArray();
        System.out.println(Arrays.toString(arr));
        sortShell(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static double[] createArray() {
        double[] array = new double[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextDouble()*10;
        }

        return array;
    }
    public static void sortShell(double[] arr) {
        boolean checker =true;
        while(checker) {
            checker=false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]<=arr[i+1]) {

                }else if(arr[i]>=arr[i+1]){
                    double temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    i--;
                    checker =true;
                }
            }
        }
    }
}
