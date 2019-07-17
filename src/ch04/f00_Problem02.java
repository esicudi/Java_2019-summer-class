package ch04;

import ch04_class.Calculator;

public class f00_Problem02 {
	/*
	 * 2개의 피연산자, 3개의 피연산자를 계산할 수 있는
	 * 계산기 클래스 작성후 main에서 실행할 수 있도록 작성
	 */
	public static void main(String[] args) {
		Calculator ca=new Calculator();
		System.out.println(ca.sum(1,2,3,4,5,6));
		System.out.println(ca.sum(1,2,3));
		System.out.println(ca.sum(1,2,3,4,5,6,7,8));
		System.out.println(ca.sum(1,2,3,4,5));
	}
}
