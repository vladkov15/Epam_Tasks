package by.epam.modul2.decomposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
 * 5. C�������� ���������, ������� � ������� A[N] ������� ������ �� �������� �����
 *
 */

public class Task5 {
    public static void main(String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Init(5,list);
        Print(list);
        Finder(list);

    }
    public static ArrayList<Integer> Init(int lenght,ArrayList<Integer>list) {
        Random random =new Random();
        for(int i=0;i<lenght;i++) {
            list.add(random.nextInt(15));
        }

        return list;
    }
    public static void Print(ArrayList<Integer>list) {
        for(int i=0;i<list.size();i++) {
            System.out.print(" "+list.get(i));
        }
        System.out.println();
    }
    public static void Finder(ArrayList<Integer>list){
        Collections.sort(list);
        System.out.print("������ �����"+list.get(list.size()-2));
    }
}
