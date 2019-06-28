package ch01;

import java.util.Scanner;

public class f02_calculator {
	
	static void add(int num1, int num2){
		int res = num1 + num2;
		System.out.println(res);
	}
	static void sub(int num1, int num2){
		int res = num1 - num2;
		System.out.println(res);
	}
	static void mul(int num1, int num2){
		int res = num1 * num2;
		System.out.println(res);
	}
	static void div(int num1, int num2){
		double res = (double)num1 / num2;
		System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = sc.next();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		switch(op) {
		case "+":
			add(num1,num2);
		case "-":
			sub(num1,num2);
		case "*":
			mul(num1,num2);
		case "/":
			div(num1,num2);
		}
		
//		add(num1, num2);
		
		sc.close();
	}

}
