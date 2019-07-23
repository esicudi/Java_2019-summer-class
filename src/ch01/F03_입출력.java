package ch01;

import java.util.Scanner;	//외부 클래스를 해당 소스코드에 추가. 자동완성: ctrl+shift+o

/*
 *  입력, 출력
 *  입력: 프로그램 외부에서 데이터 들어옴
 *  	키보드, 음성, 마우스 등
 *  출력: 프로그램 내부->외부 데이터가 나감
 *  	모니터, 스피커, 프린터 등
 */

public class F03_입출력 {

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
		 * 
		 * 	입력
		 * 		Scanner 클래스 이용해 키보드로부터 입력
		 * 			.nextLine()		문자열. 한 줄 입력
		 * 			.next()			문자열. 한 단어 입력(공백, 탭, 개행 기준)
		 * 			.nextInt()		정수형. 공백, 탭, 개행 기준 입력
		 * 			.nextDouble()	실수형. 공백, 탭, 개행 기준 입력
		 * 			.nextBoolean()	논리형. 공백, 탭, 개행 기준 입력
		 * 			.intByte() .intShort() 존재하지만 잘 사용하지 않음
		 * 			**다른 타입의 입력함수로 받은 경우 오류 발생
		 * 			**.nextLine()과 혼용해 사용할 경우 입력이 제대로 안될 수도 있다.
		 * 				직전 입력할 때 입력버퍼에 공백, 탭, 개행이 남아있다.
		 * 				->직전 입력이 개행 기준 입력이 아닌 경우 .nextLine()으로 개행을 먼저 지워주고 다시 입력을 받는다.
		 * 		마지막에 .close() 으로 System.in 닫아주기
		 * 		.hasNextInt(): 버퍼에 정수형으로 더 입력받은 것이 있는지
		 */
		System.out.println();
		System.out.print("Hello ");
		System.out.print(123);
		System.out.print(" World");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력해주세요: ");
		String str = sc.nextLine();	//입력한 한 줄을 읽어옴
		System.out.println("입력한 값: " + str);
		
		int num = sc.nextInt();
		System.out.println("num: " + num);
		int num2 = sc.nextInt();
		System.out.println("num2: " + num2);
		int num3 = sc.nextInt();
		System.out.println("num3: " + num3);
		
		sc.nextLine();
		String str1 = sc.nextLine();
		System.out.println("str1: " + str1);
		
		System.out.println("re");
		String str2 = sc.nextLine();
		System.out.println(str2.getBytes());
		
		sc.close();
	}

}
