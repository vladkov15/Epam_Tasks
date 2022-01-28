package by.epam.modul2.array_matrix;

import java.util.Scanner;

/*
 * 6. ������������ ���������� ������� ������� n �� ��������� �������(n-������).
 */

public class Task6 {
    public static void main(String args[]) {
        int n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("������� ����� n: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if(n > 1){
                    if(n % 2 == 0)
                        break;
                    else System.out.print("�������� �����, �� �������� �� �������!  ");
                }else{
                    System.out.print("����� ������������� ��� ������ 2, ��������� ����!  ");
                }
            }else{
                System.out.print("������������ ��������, ��������� ����!  ");
            }

        }
        scanner.close();

        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=i;j<n-i;j++) {
                matrix[n-1-i][j]=1;
                matrix[i][n-1-j]=1;
            }}
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
