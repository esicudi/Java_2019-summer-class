package ch02;

import java.util.Scanner;

/*
 * 	제어문 => 조건문, 반복문
 * 	프로그램을 제어하는 명령어
 * 
 * 	사용법
 * 	if(조건식){
 * 		여러 명령어
 * 	}
 * 	else if(조건식){
 * 	}
 * 	else{
 * 	}
 */

public class f01_If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = 70;
		if(score >= 80) {
			System.out.println("축하합니다!");
			System.out.println("합격하셨습니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		System.out.println("수고하셨습니다.");
		
		System.out.println();
		
		int x = 20;
		int y = 38;
		if(x > 20 && x < 30) {
			if(y > 20 && y < 40)
				System.out.println("Inside of the range.");
		}
		else {
			System.out.println("Out of the range.");
		}
		
		sc.close();
	}

}
