package by.epam.modul2.array_matrix;

import java.util.Random;



/*1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
 * больше последнего.
 */

public class Task1 {
    public static void main(String args[]) {
        int [][] matrix = new int [3][4];
        Random rand = new Random();
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
        System.out.println("исходная матрица");
        System.out.println();
        for(int i =0;i<matrix.length;i++) {
            for(int j =0; j<matrix[i].length;j++) {
                if((j+1)%2==0 && matrix[0][j]>matrix[matrix.length-1][j]) {

                    System.out.print(matrix[i][j]+"   ");
                }
            }
            System.out.println();
        }
        System.out.println("финальная матрица");
    }

}

