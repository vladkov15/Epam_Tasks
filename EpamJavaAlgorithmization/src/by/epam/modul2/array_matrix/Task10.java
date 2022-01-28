package by.epam.modul2.array_matrix;

import java.util.Random;
import java.util.Scanner;

/*
 * 10. ����� ������������� �������� ������� ��������� � ���������� �������.
 */

public class Task10 {
    public static void main(String args[]) {
        System.out.println("������� �����������");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        scanner.close();
        int [][] matrix = new int[n][n];
        for(int i = 0;i<n;i++) {
            for(int j =0;j<n;j++) {
                matrix[i][j]=random.nextInt(15)-5;
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("������������� �������� ����. ���������");
        for(int i = 0;i<n;i++) {
            for(int j=i;j==i;j++) {
                if(matrix[i][j]>0) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }

    }
}
