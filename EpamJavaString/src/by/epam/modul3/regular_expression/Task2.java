package by.epam.modul3.regular_expression;

/*
2. Дана строка содержащий, содержащий следующий текст(xml документ)

<notes>
<note id = "1">
<to>Вася</to>
<from>Света</from>
<heading>Напоминание</heading>
<body>Позвони мне завтра!</body>
</note>
<note id = "2">
<to>Петя</to>
<from>Маша</from>
<heading>Важное напоминание</heading>
<body/>
</note>
</notes>
  Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип
  (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML
  для решения данной задачи нельзя.
 */

public class Task2 {
    public static void main(String[] args) {
        String xml="<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";
    }

    public static void Parser(String xml){

    }
}
