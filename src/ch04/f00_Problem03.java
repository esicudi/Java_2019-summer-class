package ch04;

import java.util.Scanner;

public class f00_Problem03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
		int count=0;
		if(b<c)
			count=a/(c-b)+1;
		else
			count=-2;
		System.out.println(count+1);
	}
}