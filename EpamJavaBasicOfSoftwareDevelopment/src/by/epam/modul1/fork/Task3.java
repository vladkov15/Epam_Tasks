package by.epam.modul1.fork;
/*
3. Даны три точки A(x1,y1), B(x2,y2), C(x3,y3). Определить, будут ли они расположенны на одной прямой.
 */

public class Task3 {
    public static void main(String[] args) {
           double x1=0,y1=0,x2=1,y2=1,x3=3,y3=3;
            if((x3-x1)/(x2-x1)==(y3-y1)/(y2-y1)) {
                System.out.println("Расположены на одной прямой");

            }else {
                System.out.println("Не расположены на одной прямой");
            }
            System.out.println();


    }
}
