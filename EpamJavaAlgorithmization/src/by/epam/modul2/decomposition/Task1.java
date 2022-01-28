package by.epam.modul2.decomposition;

/*
 * 1. �������� �����(������)��� ���������� ����������� ������ �������� �
 * ����������� ������ �������� ���� ����������� �����.
 */

public class Task1 {
    public static void main(String [] args) {
        long a=5,b=15;
        long c;
        c=gcd(a,b);
        System.out.println(c);
        c=lcm(a,b);
        System.out.print(c);


    }
    static long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }
    static long lcm(long a,long b){
        return a / gcd(a,b) * b;
    }
}
