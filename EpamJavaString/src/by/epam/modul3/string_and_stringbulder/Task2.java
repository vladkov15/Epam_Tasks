package by.epam.modul3.string_and_stringbulder;

/*
2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task2 {
    public static void main(String[] args) {
        String test = "Test a string a";
        AddB(test);
    }
    public static void AddB(String str){
        StringBuffer strBuffer = new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                strBuffer.insert(i+1, 'b');
            }
        }
        System.out.println(strBuffer.toString());
    }
}
