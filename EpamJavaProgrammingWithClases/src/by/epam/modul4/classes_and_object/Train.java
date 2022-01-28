package by.epam.modul4.classes_and_object;
/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
данные в массив из пяти элементов типа Train, добавьте возможность сортировки массива по номерам поездов. Добавьте
возможность вывода информациии о поезде, номер которого введен пользователем. Добавьте возможность сортировки массива
по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Train {
    private String name;
    private int trainNumber;
    private String time;
    public Train(String name, int trainNumber, String time){
        this.name=name;
        this.trainNumber=trainNumber;
        this.time=time;
    }
    public static void Menu(Train [] trains){
        boolean flag=true;
        while (flag) {
            System.out.print("Нажмите *1* для сортировки поездов по номерам \n"+
                            "Нажмите *2* для поиска информации по номеру поезда \n"+
                            "Нажмите *3* для сортировки по пункту назначения \n"+
                             "Нажмите *0* для выхода \n");
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    SortByNumber(trains);
                   break;
                case 2:
                    System.out.println("Введите номер поезда для поиска");
                    PrintByNumber(trains,new Scanner(System.in).nextInt());
                    break;
                case 3:
                    SortByName(trains);
                    break;
                case 0:
                    flag=false;
                    break;
            }
        }
    }
    public static void SortByNumber(Train [] trains){
        boolean flag = true;
        while (flag){
            flag=false;
            for (int i = 1; i <trains.length ; i++) {
                if (trains[i].getTrainNumber()<trains[i-1].getTrainNumber()){
                   Train[]temp=new Train[1];
                   temp[0]=trains[i];
                   trains[i]=trains[i-1];
                   trains[i-1]=temp[0];
                    flag=true;
                }
            }
        }
        for (int i = 0; i < trains.length; i++) {
            System.out.println("Название рейса "+trains[i].getName()+
                    " | Номер поезда "+trains[i].getTrainNumber()+
                    " | Время отбытия "+trains[i].getTime()+" |");
        }
    }

    public static void PrintByNumber(Train [] trains,int choice){
        System.out.println("Поиск по номеру "+choice);
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getTrainNumber() == choice) {
                System.out.println("Название рейса " + trains[i].getName() +
                        " | Номер поезда " + trains[i].getTrainNumber() +
                        " | Время отбытия " + trains[i].getTime() + " |");
            }
        }
    }
    public static void SortByName(Train [] trains) {
        String[] nameArray = new String[trains.length];
        for (int i = 0; i < trains.length; i++) {
            nameArray[i] = trains[i].getName();
        }
        Arrays.sort(nameArray);
        Train[]trains1=new Train[trains.length];
        int count=0;
        for (int i = 0; i < nameArray.length; i++) {
            for (int j = 0; j < trains.length; j++) {
                if (i>0){
                    if(nameArray[i].equals(nameArray[i-1])){
                        break;
                    }
                }
                if (nameArray[i].equals(trains[j].getName())) {
                   trains1[count]=trains[j];
                   count++;
                }
            }
        }
        String[] str_i1 = new String[2];
        String[] str_i2 = new String[2];
        for (int i = 1; i <trains1.length ; i++) {
            if (trains1[i].getName().equals(trains1[i-1].getName())){
                 str_i1 = trains1[i].getTime().split(":");
                 str_i2= trains1[i-1].getTime().split(":");
            }

        }
        for (int i = 0; i <str_i1.length ; i++) {
            System.out.println(str_i1[i]+" "+str_i2[i]);
        }
        /*for (int i = 0; i < trains1.length; i++) {
            if (trains1[i]==null) {

            }else{
                System.out.println("Название рейса " + trains1[i].getName() +
                        " | Номер поезда " + trains1[i].getTrainNumber() +
                        " | Время отбытия " + trains1[i].getTime() + " |");
            }

        }*/

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public static void main(String[] args) {
        Train train1= new Train("Москва",12,"12:26");
        Train train2= new Train("Брест",18,"15:06");
        Train train3= new Train("Санкт-Петербург",5,"10:00");
        Train train4= new Train("Москва",2,"19:14");
        Train train5= new Train("Витебск",10,"9:26");
        Train train6 = new Train("Москва",1,"00:00");
        Train[]trains={train1,train2,train3,train4,train5,train6};
        Menu(trains);

    }
}

