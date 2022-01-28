package by.epam.modul1.linear_program;
/*
2. Вычислить значение выражения по формуле(все переменные принимают действительные значения):
 */

public class Task2 {
    public static void main(String[] args) {
        double a=5,b=2,c=1;
        double z= b+Math.abs(Math.pow(b,2)+(4*a*c));
        z=z/(2*a);
        z=z-(Math.pow(a,3)*c)+Math.pow(b,-2);
        System.out.println(z);
    }
}
