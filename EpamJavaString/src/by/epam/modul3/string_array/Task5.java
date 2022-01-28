package by.epam.modul3.string_array;
/*
5. Удалить в строке все лишние пробелы, т.е серии подрят идущих пробелов заменить на одиночные пробелы. Крайние пробелы
в строке удалить.
 */
public class Task5 {
    public static void main(String[] args) {
        String txt = " Удалить                                                             " +
                " в    строке    все    лишние    пробелы    т.е   серии   подрят   идущих   пробелов   заменить   на  одиночные   пробелы";
        Replace(txt);
    }
    static void Replace(String t) {
        t=t.replaceAll("\\s{2,}", " ").trim();
        System.out.println(t);
    }
}
