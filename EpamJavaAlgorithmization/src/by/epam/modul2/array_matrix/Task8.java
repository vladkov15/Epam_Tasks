package by.epam.modul2.array_matrix;

import java.util.Random;
import java.util.Scanner;

/*
 * 8. � �������� ������� �������� ������� ���  ����� �������, �.� ��� ��������
 * ������ ������� ���������� �� ��������������� �� ������� 2��, � �������� 2��
 *����������� � 1��. ������ �������� ������ ������������ � ����������.
 */

public class Task8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int [][] matrix = new int [3][4];
        Random random = new Random();
        for(int i=0;i<matrix.length;i++) {
            for(int j =0;j<matrix[i].length;j++) {
                matrix[i][j]=random.nextInt(10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("�������� ������ �������     ");
        int choise1=scanner.nextInt();
        System.out.println("�������� ������ �������    ");
        int choise2=scanner.nextInt();
        scanner.close();
        int temp =0;
        for(int i=0;i<matrix.length;i++) {
            for(int j =0;j<matrix[i].length;j++) {
                if(choise1==j) {
                }else if(choise2==j) {
                    temp=matrix[i][choise1];
                    matrix[i][choise1]=matrix[i][choise2];
                    matrix[i][choise2]=temp;
                }
            }
        }
        for(int i=0;i<matrix.length;i++) {
            for(int j =0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
