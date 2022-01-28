package by.epam.modul2.onedimesionalarray;
import java.util.Random;
/*
 *8.���� ������������������ ����� ����� a1,a2 , ... ,an . ���������� ����� ������������������, �������� �� 
 * �������� �� �����, ������� ����� min(a1,a2 , ... ,an ) .  
 */

public class Task8 {
	public static void main(String[] args) {
        int n = 10;
        Random rand = new Random();
        int[] nums = new int[n];
 
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(15) - 10;
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        int min = 0;
        for (int i : nums) min = Math.min(min, i);
        int countMin = 0;
        for (int i : nums)
            if (i == min) countMin++;
 
        int[] nums2 = new int[n - countMin];
        int indexNewArray = 0;
        for (int i : nums)
            if (i != min) {
                nums2[indexNewArray++] = i;
                System.out.print(i + ", ");
            }
    }
}
