package by.epam.modul4.classes_and_object;

/*
2. Создайте класс Test2 с двумя пременными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
инициализирующий член класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Test2 {
    private String name;
    private String secondName;
    public Test2(){
        this.name="unknown";
        this.secondName="unknown";
    }

    public Test2(String name,String secondName){
        this.name=name;
        this.secondName=secondName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

}
