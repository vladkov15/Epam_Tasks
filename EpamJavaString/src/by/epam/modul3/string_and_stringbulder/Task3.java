package by.epam.modul3.string_and_stringbulder;
/*
3. Проверить, является ли заданное число палиндромом.
 */


public class Task3 {
    public static void main(String[] args) {
        int test1 = 213312;
        int test2 = 1313;
        System.out.println(Palindrom(Integer.toString(test1)));
        System.out.println(Palindrom(Integer.toString(test2)));
    }
    public static boolean Palindrom(String num){
        num = num.replaceAll("[\\s]", "").toLowerCase();
        boolean result = true;
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
