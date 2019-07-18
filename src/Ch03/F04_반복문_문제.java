package Ch03;

import java.util.Scanner;

public class F04_반복문_문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			int temp=a; a=b; b=temp;
		}
		int sum=0;
		for(int i=a;i<=b;sum+=i++) {}
		System.out.println(sum);
		
		sc.close();
	}

}
