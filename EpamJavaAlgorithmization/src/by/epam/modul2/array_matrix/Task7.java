package by.epam.modul2.array_matrix;

import java.util.Scanner;

/*
 * 7. ������������ ���������� ������� ������ N �� �������.
 *  A[I,J]=sin((I^2-J^2)/N)
 *  � ���������� ���-�� ������������� ��������� � ���.
 *
 */
public class Task7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� n ");
        int n = scanner.nextInt();
        scanner.close();
        int count=0;
        double[][] matrix= new double[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                double i1=i;
                double j1=j;
                double n1=n;
                i1=Math.pow(i1, 2);
                j1=Math.pow(j1, 2);
                matrix[i][j]=Math.sin((i1-j1)/n1);
                if(matrix[i][j]<=0) {
                    count++;
                }
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("���-�� ������������� ���������="+count);
    }
}
