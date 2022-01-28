package by.epam.modul3.string_array;

// 2. Заменить в строке все вхождения 'word' на 'letter'

public class Task2 {
	 private static String toChange (String with_word) {
	        String with_letter=with_word.replaceAll("word", "letter");
	       return with_letter;
	    }

	public static void main(String args[]) {
	 	String with_word = "word is a stranger mystery power and the word is your main weapon";
		String with_letter = toChange(with_word);
		
		System.out.println(with_word.toString());
        System.out.println(with_letter.toString());	
	}
}
