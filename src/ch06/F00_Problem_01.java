package ch06;

import java.util.Scanner;

public class F00_Problem_01 {
	/*
	 * 숫자를 키보드로 입력해 문자열을 받아옴
	 * 
	 * 이를 정수형태로 바꿔 출력
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int num=Integer.parseInt(str);
		System.out.println("num="+num);
		sc.close();
	}
}
