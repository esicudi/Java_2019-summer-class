package ch03;

import java.util.Scanner;

public class F02_problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//sum=(n/2)*(n/2+1)
		//System.out.println((n/2)*(n/2+1));
		
		int sum=0;
		for(;n>0;n--) {
			if(n%2==0) sum+=n;
		}
		System.out.println(sum);
		
		sc.close();
	}

}
