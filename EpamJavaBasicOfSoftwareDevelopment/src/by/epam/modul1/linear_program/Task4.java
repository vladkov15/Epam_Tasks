package by.epam.modul1.linear_program;
/*
4. Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях).
 Поменять местами дробную и целую части числа и вывести полученное значенияя числа.
 */

public class Task4 {
    public static void main(String[] args) {
        double x = 987.654;
        double y = (x * 1000) % 1000;
        y += (int) x / 1000.0;
        System.out.println(y);
    }
}
