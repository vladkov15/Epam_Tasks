package by.epam.modul2.onedimesionalarray;

/*
4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task4 {
	public static void main(String args[]) {
		double min=1;
		double max=1;
		
		double nums[]= {-2.3,1.0,8.9,10.0};
		for(int i= 0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
			if(nums[i]>max) {
				max=nums[i];
			}	
		}
		for(int i= 0;i<nums.length;i++) {
			if(nums[i]==max) {
				nums[i]=min;
			}else if(nums[i]==min) {
				nums[i]=max;	
			}
			
		}
		for(int i= 0;i<nums.length;i++) {
			System.out.print(" "+nums[i]+" ");
		}
		
		
	}

}
