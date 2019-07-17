package ch04_class;

import java.util.ArrayList;

public class Calculator {
	public int sum(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
	public int sum(int... integers) {
		int sum=0;
		for(int num:integers)
			sum+=num;
		return sum;
	}
	public int sum(ArrayList integers) {
		int sum=0;
		System.out.println(integers.size());
		return sum;
	}
}
