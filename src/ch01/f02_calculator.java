package ch01;

import java.util.Scanner;

public class f02_calculator {
	
	static void add(int num1, int num2){
		int res = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + res);
	}
	static void sub(int num1, int num2){
		int res = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + res);
	}
	static void mul(int num1, int num2){
		int res = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + res);
	}
	static void div(int num1, int num2){
		double res = (double)num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + res);
	}
	static void npo(int num1, int num2) {
		int res = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		npo(num1, num2);
		
		sc.close();
	}

}
