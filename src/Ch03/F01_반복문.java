package Ch03;

import java.util.Scanner;

public class F01_반복문 {
	/*
	 * 	반복문: if와 같은 제어문 장 하나
	 * 	for, while, do-while, for-each
	 * 
	 * 	반복적 기능 수행할 때 사용
	 * 
	 * 	for(초기식;조건식;반복 후 작업){
	 * 		반복 수행할 작업
	 * 	}
	 * 	초기식: for문을 사용하기 위한 변수 선언 및 초기화
	 * 	조건식: 반복 수행할 조건이 되는지 검사하는 식
	 * 	반복 후 작업: 반복작업 완료 이후 수행하는 작업
	 * 	초기-조건true-반복작업-반복후작업-조건true-반복작업-반복후작업-...-조건false-끝
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+". Hello World!");
		}
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		int sum=0;
		for(int i=1;i<=10;sum+=i++) {}
		System.out.println("Sum of 1~10: "+sum);
		
		sc.close();
	}

}
