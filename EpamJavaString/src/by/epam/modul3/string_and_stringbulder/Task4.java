package by.epam.modul3.string_and_stringbulder;

/*
4. С помощью функции копирования и операции конкатенации составить из частей слово "информатика" слово "торт".
 */

public class Task4 {
    public static void main(String[] args) {
     StringBuilder inform = new StringBuilder("информатика");
        MadeTortik(inform);

    }
    public static void MadeTortik(StringBuilder str){
        StringBuilder tort = new StringBuilder();
        tort.append(str.charAt(7));
        for (int i = 0; i <str.length() ; i++) {
            if (i==3 || i==4 || i==7){
                tort.append(str.charAt(i));
            }
        }
        System.out.println(tort.toString());
    }

}
