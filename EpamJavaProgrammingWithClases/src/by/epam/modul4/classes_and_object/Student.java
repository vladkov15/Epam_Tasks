package by.epam.modul4.classes_and_object;

/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость(массив из пяти элементов).
 Создайте масиив из десяти эелементов этого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих
 оценки, равные только 9 или 10.
 */

import java.util.Random;
import java.util.Scanner;

public class Student {
    private String secondName;
    private String initial;
    private int numberOfGroup;
    private  int[] academic_performance;

    public Student(){
        this.secondName="unknown";
        this.initial="unknown";
        this.numberOfGroup=1;
        this.academic_performance= new int[]{0, 0, 0, 0, 0};
    }
    public Student(String  secondName, String initial,int numberOfGroup){
        this.secondName=secondName;
        this.initial=initial;
        this.numberOfGroup=numberOfGroup;
        this.academic_performance=InitAcademicPerfomance();
    }
    public Student(String  secondName, String initial,int numberOfGroup,int v1,int v2,int v3,int v4,int v5){
        this.secondName=secondName;
        this.initial=initial;
        this.numberOfGroup=numberOfGroup;
        this.academic_performance=new int[]{v1,v2,v3,v4,v5};
    }
    public int[] InitAcademicPerfomance(){
        academic_performance = new int [5];

        for (int i = 0; i <academic_performance.length ; i++) {
            academic_performance[i]=new Random().nextInt(10);
        }
        return academic_performance;
    }
     public static void Print(Student[] students){
         for (int i = 0; i < students.length ; i++) {
             for (int j = 0; j <students[i].academic_performance.length ; j++) {
                 if (students[i].academic_performance[j]<9){
                     break;
                 }
                 if (j==students[i].academic_performance.length-1){
                     System.out.println("ФИО "+ students[i].getSecondName()+" "+students[i].getInitial()
                     +"номер группы "+students[i].getNumberOfGroup());
                 }
             }
         }
     }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public int[] getAcademic_performance() {
        return academic_performance;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public static void main(String[] args) {
        Student [] students = new Student[10];
        Student student0 = new Student();
        students[0]=student0;
        Student student1= new Student();
        students[1]=student1;
        Student student2 = new Student();
        students[2]=student2;
        Student student3 = new Student();
        students[3]=student3;
        Student student4 = new Student();
        students[4]=student4;
        Student student5 = new Student("Urgant","Dmitriy",1920);
        students[5]=student5;
        Student student6 = new Student("Govor","Maksim",1920);
        students[6]=student6;
        Student student7 = new Student("Denisemko","Kostya",1920);
        students[7]=student7;
        Student student8 = new Student("Ivanov","Pavel",1920);
        students[8]=student8;
        Student student9 = new Student("Shved","Egor",1920,9,9,9,9,9);
        students[9]=student9;
        Print(students);


    }


}
