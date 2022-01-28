package by.epam.modul2.array_matrix;

import java.util.Random;

/*
 *2. ���� ���������� �������. ������� �� ����� ��������, ������� �� ���������.
 */

public class Task2 {
    public static void main(String args[]) {
        Random rand = new Random();
        int [][] matrix = new int [6][6];
        for(int i =0;i<matrix.length;i++) {
            for(int j =0; j<matrix[i].length;j++) {
                matrix[i][j]=rand.nextInt(10);
            }
        }
        for(int i =0;i<matrix.length;i++) {
            for(int j =0; j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("�������� �������");
        for(int i =0;i<matrix.length;i++) {
            for(int j =0; j<matrix[i].length;j++) {
                if(i==j) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.print("��������� ������� ");
        System.out.println();
        for (int i =matrix.length-1 ; i >= 0; i--) {
            System.out.print(matrix[i][matrix.length-1 - i] + " ");
        }
        System.out.println();
        System.out.println("��������� ��������");
    }

}
