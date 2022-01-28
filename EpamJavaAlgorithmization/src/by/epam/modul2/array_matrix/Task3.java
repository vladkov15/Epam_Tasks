package by.epam.modul2.array_matrix;

import java.util.Random;
import java.util.Scanner;

/*���� �������. ������� �-�� ������ � �-� ������� �������.
 *
 */

public class Task3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("������� ���-�� �����");
        int k = scanner.nextInt();
        System.out.println("������� ���-�� ��������");
        int p = scanner.nextInt();
        int [][] matrix = new int[k][p];
        for(int i=0;i<k;i++) {
            for(int j =0;j<p;j++) {
                matrix[i][j]=random.nextInt(10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("����� ������ � ������� ������ �������?");
        int k1 = scanner.nextInt();
        int p1 = scanner.nextInt();
        for(int i=0;i<k;i++) {
            for(int j =0;j<p;j++) {
                if(k1==i) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println(k1+"*  ������");
        for(int i=0;i<k;i++) {
            for(int j =0;j<p;j++) {
                if(p1==j) {
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.print(p1+"*  ������� ");
        scanner.close();
    }
}
