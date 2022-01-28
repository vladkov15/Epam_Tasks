package by.epam.modul2.decomposition;


/*
 * 3. ��������� ������� ����������� �������������� �� �������� �, ���������
 * ����� ���������� ������� ������������
 */

public class Task3 {
    public static void main(String [] args) {
        double a =3;
        System.out.println(Square(a));
    }
    static double Square(double a) {
        double s=a*a*Math.sqrt(3)/4;
        s*=6;
        return s;
    }
}
