package by.epam.modul3.string_array;

/*
 * 3. В строке найти количкство цифр
 */

public class Task3 {
public static void main(String args[]) {
	String str = "ds54f1dcsddv23rfrre4";
	int count = 0;
	for (int i = 0; i < str.length(); i++) {
	    if (Character.isDigit(str.charAt(i))) {
	        count++;
	    }
	}
	System.out.print("кол-во цифр в строке ="+count);
}
}
