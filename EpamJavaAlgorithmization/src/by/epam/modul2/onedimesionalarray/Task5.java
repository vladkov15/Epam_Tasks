package by.epam.modul2.onedimesionalarray;

/*
5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task5 {
	public static void main(String args[]) {
		int a []= {-10,2,3,5,4,1,8};
		for(int i=0;i<a.length;i++) {
			int j = i + 1;
			if( a[i] > j ) {
				System.out.print(" "+a[i]+" ");
				
			}
		}
		
	}

}
