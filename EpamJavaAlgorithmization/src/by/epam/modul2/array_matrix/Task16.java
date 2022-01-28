package by.epam.modul2.array_matrix;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("������� ����������� n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int array[][] = new int[n][n];
        if (n%2!=0){
            oddMagic(n,array);
        }else if (n%4!=0){
            singleEvenMagic(n,array);
        }else{
            doubleEvenMagic(n,array);
        }
        printSquare(array);
    }

    public static void oddMagic(int n,int array[][]){
        int i = 0;
        int j = n/2;
        for (int k = 1; k <= n*n; k++) {
            array[i][j] = k;
            if (k%n==0) {
                i++;
            }else{
                i--;
                j++;
                if (i<0) i=n-1;
                if (j>n-1) j=0;
            }
        }
    }

    public static void doubleEvenMagic(int n,int array[][]){
        int c1=1,c2=n*n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%4==j%4||(i+j)%4==3){  // ��������� �����������
                    array[i][j] = c2;
                }else{  // �������������� �������� ���
                    array[i][j] = c1;
                }
                c2--;
                c1++;
            }
        }
    }
    public static void singleEvenMagic(int n,int array[][]){
        int c1=1,c2=n*n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%4==j%4||(i+j)%4==3){  // ��������� �����������
                    array[i][j] = c2;
                }else{  // �������������� �������� ���
                    array[i][j] = c1;
                }
                c2--;
                c1++;
            }
        }
    }

    public static void printSquare(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}

