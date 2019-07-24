package ch06;

import java.util.Scanner;

public class F02_Wrapper {
	/*
	 * Wrapper 클래스
	 *  8개의 기본 자료형을 각각 클래스로 만들어 놓은 클래스들의 집합
	 *  - Wrapper 클래스는 실제로 존재하진 않음.
	 *  
	 *  문자열 -> 자료형
	 *  자료형 -> 문자열
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String intStr="1234";
		String doubleStr="123.25";
		int num=Integer.parseInt(intStr);
		System.out.println(num+10000);
		double f1=Double.parseDouble(doubleStr);
		System.out.println(f1);
		
		intStr=sc.next();
		num=Integer.parseInt(intStr);
		
		//Wrapper 클래스의 객체
		//JAVA 5
		//박싱
		Integer objInt=new Integer(10);
		objInt=Integer.valueOf(10);
		sc.close();
		
		//언박싱
		num=objInt.intValue();
		
		//JAVA 5 이후
		objInt=10;	//자동박싱
		num=objInt;	//자동언박싱
		
		String str = "Kimna/15/2/11/2/";
		str.split("/"); // -> 정수 부분은 Wrapper 클래스로 변환 후 사용
	}
}
