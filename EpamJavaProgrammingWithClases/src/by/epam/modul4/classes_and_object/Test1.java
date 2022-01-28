package by.epam.modul4.classes_and_object;

/*
1. Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы ихменения этих переменных.
  Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение этих
  двух переменных.
 */

public class Test1 {
    private int variable1;
    private int variable2;

    public void Print(){
        System.out.println("первая переменная ="+getVariable1()+" вторая переменная = "+ getVariable2());
    }
    public void Sum(){
        System.out.println("Сумма переменных = "+ (getVariable1()+getVariable2()));
    }
    public void MaxVariable(){
        if (variable1>variable2){
            System.out.println("первое значение больше");
        }else{
            System.out.println("второе значение больше");
        }
    }

    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setVariable1(5);
        test1.setVariable2(10);
        test1.Print();
        test1.Sum();
        test1.MaxVariable();
    }
}
