package by.epam.modul2.onedimesionalarray;

/*
3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
*/
public class Task3 {
	public static void main(String args[]) {
	 double nums[]= {1.0,4.0,-3.0,-2.0,0.1,0};
		int a=0,b=0,c=0;
		for (int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				c++;
			}else if(nums[i]>0) {
				a++;
			}else if(nums[i]<0)
			b++;
		}
		System.out.printf("положительных элементов= %d отрицателььных элементов= %d равных нулю= %d",a,b,c);
	}

}
