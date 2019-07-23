package ch02;

import java.util.Scanner;

public class F05_switch_case {
	/*
	 * 	if처럼 조건식에의해 나눠지는 것이 아니라, 변수나 식에 의한 값에 의해 나눠짐
	 * 	논리식이 아닌 일반 산술식이 들어간다
	 * 	switch(){
	 * 	case 값:
	 * 	
	 * 	case 값:
	 * 	
	 * 	default:	//위의 값이 다 맞지 않는 경우 실행
	 * 	
	 * 	}
	 * 
	 * 	*주의: if else와 다르게 한 분기가 끝나면 넘어가지 않고
	 * 		그 다음 분기를 바로 시작한다
	 * 		break; 문으로 멈춰주기
	 * 
	 * 	정수, 문자, 문자열
	 * 	실수 불가(오차범위 발생)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Score: ");
		int score = sc.nextInt();
		switch(score/10) {
		case 10: case 9:
			System.out.println("A");
			break;
		case 8: case 7:
			System.out.println("B");
			break;
		case 6: case 5:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		sc.close();
	}

}
