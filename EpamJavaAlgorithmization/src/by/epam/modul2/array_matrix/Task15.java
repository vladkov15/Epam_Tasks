package by.epam.modul2.array_matrix;

import java.util.Random;

/*
 * 15. ����� ���������� ������� ������� � �������� ��� �������� ��������� �� ����.
 */

public class Task15 {
    public static void main(String args[]) {
        int x =3;
        int y =4;
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Random random = new Random();
                matrix[i][j]=random.nextInt(50);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                if(matrix[0][0]<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("���������� ����� "+ max);
        System.out.println("///////////");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(matrix[i][j]%2==0) {
                    matrix[i][j]=max;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }




    }

}
