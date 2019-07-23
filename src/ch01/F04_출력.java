package ch01;

import java.util.Scanner;

public class F04_Ãâ·Â {

	public static void main(String[] args) {
		int num = 2;
		String ani = new String("cat");
		System.out.println(ani + " " + num);
		
		Scanner sc = new Scanner(System.in);
		String ani1=sc.next();
		int num1=sc.nextInt();
		System.out.println(ani1 + " " + num1);
		sc.close();
	}

}
