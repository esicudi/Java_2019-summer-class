package ch01;

import java.util.Scanner;	//외부 클래스를 해당 소스코드에 추가. 자동완성: ctrl+shift+o

/*
 *  입력, 출력
 *  입력: 프로그램 외부에서 데이터 들어옴
 *  	키보드, 음성, 마우스 등
 *  출력: 프로그램 내부->외부 데이터가 나감
 *  	모니터, 스피커, 프린터 등
 */

public class f03_입출력 {

	public static void main(String[] args) {
		/*
		 * 	모니터에 출력
		 * 		System.out.println();
		 * 			데이터 출력 후 개행
		 * 			자동완성: sout->ctrl+space
		 * 		System.out.print();
		 * 			데이터 출력 후 개행되지 않음
		 * 			소괄호 안에 무조건 값이 존재해야함.
		 * 		System.out.printf(format,arg);
		 * 	입력
		 * 		Scanner 클래스 이용해 키보드로부터 입력
		 */
		System.out.println();
		System.out.print("Hello ");
		System.out.print(123);
		System.out.print(" World");
		
		Scanner sc = new Scanner(System.in);
	}

}
