package by.epam.modul2.sort;

/*                    ���������� �������. ����������
 *
 * 1. ������ ��� ������� � ������ ����������� ��������� � ����������� ����� k.
 *  ���������� �� � 1 ������, ������� ������ ������ ����� k-� � (k+1)-� ����������
 *  �������, ��� ���� �� ��������� ��������������� ������.
 */

public class Task1 {
    public static void main(String args[]){
        int k=3;
        int count = 0;
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{6, 7, 8, 9};
        int[] c = new int[(a.length+b.length)];
        for (int i = 0; i < c.length; i++) {
            if ((k) > i){
                c[i] = a[i];
            }else if (count < k) {
                c[i] = b[count];
                count++;
            }else
                c[i] = a[i-k-1];
        }
        for (int iter : c){
            System.out.print(iter+" ");
        }

    }
}

