package by.epam.modul2.array_matrix;

import java.util.Random;

/*
 * 11. ������� 10X20 ��������� ���������� ������� �� 0 �� 15.
 * ������� �� ����� ���� ������� � ������ �����, � ������� ����� 5
 * ����������� ��� � ����� ���
 */
public class Task11 {
    public static void main(String args[]) {
        Random random = new Random();
        int [][] matrix = new int[10][20];
        int [] row = new int[10];
        int count;
        for(int i = 0;i<10;i++) {
            count=0;
            for(int j =0;j<20;j++) {
                matrix[i][j]=random.nextInt(15);
                if(matrix[i][j]==5) {
                    count++;
                    if(count>=3) {

                        row[i]=i+1;
                    }
                }
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i= 0;i<10;i++) {
            if(row[i]==0) {

            }else {
                System.out.println(" ������ ���������� �� ������� "+row[i]+" ");
            }
        }
    }
}
