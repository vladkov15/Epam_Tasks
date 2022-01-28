package by.epam.modul2.onedimesionalarray;
import java.util.Random;
/*
 * 9. � ������� ����� ����� � ����������� ��������� n ����� ����� �������������
 * ����� . ���� ����� ����� ���������, �� ���������� ���������� �� ���.
 */

public class Task9 {
	public static void main(String args[]) {
		int n= 10;
		int nums[]=new int[n];
		
		Random rand = new Random();
		for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(20) - 10;
            System.out.print(nums[i] + ", ");
        }
		int nums2[]=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			for(int j =0; j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					nums2[i]++;
				}
			}
		}
	    int valResult = nums[0];
        int popResult = nums2[0];
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] > popResult) {
                popResult = nums2[i];
                valResult = nums[i];
            }
            if ((popResult == nums2[i]) && (nums[i] < valResult)) {
                valResult = nums[i];
            }
        }
		System.out.print("//////"+valResult);
		
		
		
		
		
	}

}
