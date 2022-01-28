package by.epam.modul2.onedimesionalarray;
/*
6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */

import java.util.Random;
import java.util.Scanner;

public class Task6 {
 public static void main(String args[]) {
	 System.out.println("введите кол-во элементов");
	 double[] mass = new double[new Scanner(System.in).nextInt()];
	 Random random = new Random();
	 for (int i = 0; i <mass.length ; i++) {
		 mass[i]=random.nextDouble()*10;
	 }
     double sum=0;
	 for (int n = 0; n < mass.length ; n++) {
		 int i =2;
		 int j =0;
		 while (true) {
			 if (i * i <= n && j != 1) {
				 if (n % i == 0) {
					 j = 1;
					 i++;
				 } else {
					 i++;
				 }
			 } else if (j == 1) {
				 break;
			 } else {
				 System.out.println(n + " простое число");
				 sum+=mass[n];
				 break;
			 }
		 }
	 }
	 System.out.printf("Сумма равна %.2f",sum);
 }
}
