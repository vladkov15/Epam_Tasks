package by.epam.modul2.decomposition;

/*
 * 2. �������� ����� ��� ��������� ����������� ������ �������� ������� ����������� �����
 */

public class Task2 {
    public static void main(String[]args) {
        long a=6,b=3,c=9,d=15;
        System.out.print(gcd(gcd(a,b),gcd(c,d)));
    }
    static long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }
}
