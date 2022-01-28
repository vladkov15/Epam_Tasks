package by.epam.modul2.onedimesionalarray;

import java.util.Random;
import java.util.Scanner;

/*
Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */
public class Task2 {
	public static void main(String args[]) {
		System.out.println("Введите кол-во чисел в последовательности=");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Введите Z");
		double z = sc.nextDouble();
		double an[]= new double[a];
		initArray(an,z);
		sc.close();
		
		
		
	}
	public static double[] initArray(double[] an,double z) {
		int count=0;
		if(an==null) {
			return null;
		}
		Random rand = new Random();
		
		for(int i = 0;i<an.length;i++) {
			an[i]=rand.nextDouble()*10;
			
			if(an[i]>z) {
				an[i]=z;
				count++;
			}
			System.out.print(" "+ an[i]+" ");
			
		}
		System.out.println("кол-во замен "+count);
		return an;
		}
	
	
}
