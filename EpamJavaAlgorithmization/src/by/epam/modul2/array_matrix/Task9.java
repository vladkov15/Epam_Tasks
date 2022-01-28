package by.epam.modul2.array_matrix;

import java.util.Random;

/*
 * 9. ������ ������� ��������������� �����. ��������� ����� ��������� � ������
 * �������. ���������� ����� ������� ����� ������������ �����.
 */

public class Task9 {
    public static void main(String args[]) {
        Random random = new Random();
        int [][] matrix= new int [3][3];
        for(int i =0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                matrix[i][j]=random.nextInt(10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        int [] max = new int[3];
        System.out.println("//////////");
        for(int i =0;i<matrix.length;i++) {
            sum=0;
            for(int j=0;j<matrix[i].length;j++) {
                sum+=matrix[j][i];
            }
            max[i]=sum;
            System.out.print(sum+" ");
        }
        System.out.println();
        int count= 0;
        System.out.println("//////////");
        for(int i=0;i<max.length;i++) {
            if(sum<max[i]) {
                sum=max[i];
                count++;
            }
        }
        System.out.print(" "+sum+"  ������������ �������� � ������� "+count);

    }

}
