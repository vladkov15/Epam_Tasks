package by.epam.modul2.onedimesionalarray;

import java.util.Random;

/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task1 {
	public static void main(String args[]) {
		int n= 10;
		int nums[]= new int[n];
		int k = 2;
		
		initArray(nums);
		printArray(nums);
		int sum = 0;
		
		for(int i=0 ;i < nums.length;i++) {

			if(nums[i]%k==0) {
			  sum = sum +nums[i];
			}
		};
		System.out.print("сумма="+sum);
		
	}
	public static void initArray(int nums[]) {
		if(nums==null) {
			return;
		}
		Random rand = new Random();
		
		for(int i = 0;i<nums.length;i++) {
			nums[i]=rand.nextInt(21);
		}
		
		
	}
	public static void printArray(int nums[]) {
		for(int i = 0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
