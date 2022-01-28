package by.epam.modul2.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 8. ���� ����� ....(pi,qi-�����������). ��������� ���������, ������� ��������
 * ��� ����� � ������ ����������� � ������������� �� � ������� �����������.
 */


public class Task8 {
    public static void main(String[] args) {
        List<Fraction> fs = new ArrayList<>(Arrays.asList(new Fraction(9, 12), new Fraction(1, 2),
                new Fraction(3, 4), new Fraction(6, 7), new Fraction(1, 5), new Fraction(7, 8),
                new Fraction(9, 10), new Fraction(1, 2), new Fraction(5, 12), new Fraction(3, 8)));

//        List<Fraction> fs = new ArrayList<>();
//        for (int i = 0; i < 10_000; i++) {
//            int n = randBetween(1, 10);
//            fs.add(new Fraction(n,n + randBetween(1, 20)));
//        }

        long start = System.currentTimeMillis();

        long lcd = fs.stream().mapToLong(f -> f.d).reduce(1, (d1, d2) -> d1 * d2 / gcd(d1, d2));
        fs.stream().map(f -> f.setLCD(lcd)).sorted(Fraction::sort).forEach(System.out::println);

        System.out.println((System.currentTimeMillis() - start) * 0.001 + " sec");
    }

    static long gcd(long a, long b) {
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static class Fraction {
        long n, d; // numerator, denominator

        public Fraction(long n, long d) {
            this.n = n;
            this.d = d;
        }

        public Fraction setLCD(long lcd) {
            n *= (lcd / d);
            d = lcd;
            return this;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", n, d);
        }

        public static int sort(Fraction f1, Fraction f2) {
            return Long.compare(f1.n, f2.n);
        }
    }

    private static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}