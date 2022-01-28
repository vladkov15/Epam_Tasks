package by.epam.modul2.array_matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * 14. ������������ ��������� ������� x*y, ��������� �� 0 � 1, ������ � ������
 * ������� ����� ������ ����� ������ �������.
 */

public class Task14 {
    public static void main(String[] args) {
        int x = 4 ;
        int y = 4;
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j>=i) matrix[i][j] = 1;
                else matrix[i][j] = 0;
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                arrayList.add(matrix[j][i]);
            }
            Collections.shuffle(arrayList);
            for (int j = 0; j < x; j++) {
                matrix[j][i] = arrayList.get(j);
            }
            arrayList.clear();
        }
        System.out.println();
        for (int[] each : matrix) {
            System.out.println(Arrays.toString(each));
        }
    }
}

