package by.epam.modul3.string_array;

/*
 * 1. Дан массив переменных в camelCase. Преобразовать названия в snake_case
 */
public class Task1 {
	 public static String [] toSnakeCase (String [] camelCase) {
	        String [] snakeCase = new String[camelCase.length];
	        for (int i = 0; i < snakeCase.length; i++) {
	            StringBuilder strBuilder = new StringBuilder();
	            for (int j = 0; j < camelCase[i].length(); j++) {
	                char letter = camelCase[i].toCharArray()[j];
	                if (Character.isLowerCase(letter)) {
	                    strBuilder.append(letter);
	                } else {
	                    strBuilder.append("_");
	                    strBuilder.append(Character.toLowerCase(letter));
	                }
	            }
	            snakeCase[i] = strBuilder.toString();
	        }
	        return snakeCase;
	    }

	    public static void main(String[] args) {
	        String [] camelCase = {"getChars", "equalsIgnoreCase", "toLowerCase"};
	        String [] snakeCase = toSnakeCase(camelCase);

	        System.out.println(String.join(", ", camelCase));
	        System.out.println(String.join(", ", snakeCase));
	    }

}
