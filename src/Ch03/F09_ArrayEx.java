package Ch03;

import java.util.Scanner;

public class F09_ArrayEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int intArr[]=new int [10];
		for(int i=0;i<10;i++)
			intArr[i]=sc.nextInt();
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<10;i++) {
//			if(max<intArr[i])
//				max=intArr[i];
//		}
//		System.out.println(max);
		
		int max=0;
		for(int i=1;i<10;i++) {
			if(intArr[max]<intArr[i])
				max=i;
		}
		System.out.println(max+1);
		sc.close();
	}

}
