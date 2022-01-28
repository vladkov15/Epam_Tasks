package by.epam.modul1.loop;
/*
8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task8 {
    public static void main(String[] args) {
        int a = 15893;
        int b = 3543;
        char[] charA = String.valueOf(a).toCharArray();
        char[] charB = String.valueOf(b).toCharArray();

        for (int i = 0; i < charA.length; i++) {

            for (int j = 0; j < charB.length; j++) {

                if (charA[i] == charB[j]) {

                    System.out.print(charA[i] + " ");
                    break;
                }
            }
        }
    }
}
