package by.epam.modul1.linear_program;
/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
длительности в часах, минутах и секундах в след. форме: ННч ММмин SSсек.
 */

public class Task5 {
    public static void main(String[] args) {
        int sec = 10000;
        System.out.println(sec/3600+"ч"+sec/60%60+"мин"+sec%60+"сек");
    }
}
