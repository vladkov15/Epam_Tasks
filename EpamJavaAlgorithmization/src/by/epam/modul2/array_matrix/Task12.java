package by.epam.modul2.array_matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 12. ������������� ������ ������� �� ����������� � �������� �������� ���������.
 */

public class Task12 {
    public static void main(String args[]) {
        System.out.println("������� �����������");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        int [][] matrix = new int[x][y];
        for(int i = 0;i<x;i++) {
            for(int j =0;j<y;j++) {
                matrix[i][j]=random.nextInt(50);
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0;i<x;i++) {
            Arrays.sort(matrix[i]);
        }
        System.out.println("///////////////    �� �����������");
        for(int i = 0;i<x;i++) {
            for(int j =0;j<y;j++) {
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }
        boolean checker =true;
        int temp;
        while (checker) {
            checker = false;
            for (int k = 0; k < matrix.length ; k++) {
                for(int p = 0; p < matrix.length-1; p++) {
                    if (matrix[k][p] < matrix[k][p+1]) {
                        temp = matrix[k][p];
                        matrix[k][p] = matrix[k][p+1];
                        matrix[k][p+1] = temp;
                        checker = true;
                    }
                }
            }
        }
        System.out.println("///////////////    �� ��������");
        for(int i = 0;i<x;i++) {
            for(int j =0;j<y;j++) {
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }

    }}
