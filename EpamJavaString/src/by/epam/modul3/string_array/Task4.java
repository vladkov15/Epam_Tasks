package by.epam.modul3.string_array;

/*
 * 4. В строке найти кол-во чисел.
 */

public class Task4 {
	public static void main(String args[]) {
		String str = "13fjnfn3fcnr3432fjcm";
		int count = 0;
		for (int i = 0, len = str.length(); i < len; i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("кол-во чисел ="+count);
	}
}
