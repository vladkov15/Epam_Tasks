package by.epam.modul2.array_matrix;

import java.util.Scanner;
/*
 * 4. ������������ ���������� ������� ������� n �� ��������� �������(n-������).
 */

public class Task4 {
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
            for(int j=0;j<n;j++) {
                if((i)%2==0) {
                    matrix[i][j]=j+1;
                }if((i+1)%2==0) {
                    matrix[i][0]=n;
                    matrix[i][j]=n-j;
                }
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

    }

}
