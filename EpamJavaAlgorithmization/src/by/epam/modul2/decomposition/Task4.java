package by.epam.modul2.decomposition;

import java.util.Random;
import java.util.Scanner;

/*
 * 4. �� ��������� ������ ������ ����������� n �����. �������� ������, ������������,
 * ����� ������ �� ��� ����� ����� ������� ���������� (��������� ����� ������� � ������).
 */

public class Task4  {
    public double x;
    public double y;
    public Task4(double x,double y) {
        this.x=x;
        this.y=y;
    }
    public static void main(String [] args) {
   /* Task4 [] point=new Task4[3];
	point[0]=new Task4(3,5);
	point[1]=new Task4(1,2);
	point[2]=new Task4(0,-3);
	*/
        Task4[] point=Init();
        Print(point);
        Search(point);
    }
    public static Task4[] Init() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("������� ��-�� �����=");
        int n = scanner.nextInt();
        Task4 [] point=new Task4[n];
        for(int i =0;i<n;i++) {
            point[i]= new Task4(random.nextInt(50),random.nextInt(50));
        }
        scanner.close();
        return point;
    }

    public static void Print(Task4 []point) {
        for(int i =0;i<point.length;i++) {
            System.out.print("x="+point[i].x+" "+"y="+point[i].y+" ");
            System.out.println();
        }

    }
    public static void Search(Task4[]point) {
        double max=0;
        int par1 = 0;
        int par2 = 0;
        for(int i=0;i<point.length;i++) {
            for(int j=0;j<point.length;j++) {
                if(i==j) {}else {
                    double temp=Formula(point[i],point[j]);
                    if(temp>max) {
                        max=temp;
                        par1=i;
                        par2=j;
                    }
                }
            }}
        System.out.println("������������ "+max+"  ");
        System.out.println("���� "+"x="+point[par1].x+"  y="+point[par1].y+" ");
        System.out.println("     "+"x="+point[par2].x+"  y="+point[par2].y+" ");
    }
    public static double Formula(Task4 point1,Task4 point2) {
        double rez=Math.sqrt(Math.pow((point2.x-point1.x),2)+Math.pow((point2.y-point1.y),2));
        return rez;
    }

}











