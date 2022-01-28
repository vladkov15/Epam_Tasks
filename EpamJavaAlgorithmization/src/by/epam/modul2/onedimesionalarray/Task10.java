package by.epam.modul2.onedimesionalarray;
/*10. ��� ������������� ������ � ������������ ��������� n. ����� ������, ��������  
 *������ ������ ������� (�������������� ��������� ������). ���������� ���������������
  ������ �� ������������
*/

import java.util.Random;

public class Task10 {
	public static void main(String args[]) {
		int n= 10;
		int nums[]=new int[n];
		
		Random rand = new Random();
		for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(20) - 10;
            System.out.print(nums[i] + ", ");
            
        }
		System.out.println("");
		for(int i = 0; i < nums.length; i++) {
			double j =(double)i;

			if(j%2==1) {
				nums[i]=0;
			}
			 System.out.print(nums[i] + ", ");
		}
		
		
		
		
		
		
	}

}
