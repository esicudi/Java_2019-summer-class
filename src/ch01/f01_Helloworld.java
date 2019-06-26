package ch01;

/*
 * JAVA
 * 	1. 객체지향 프로그램
 * 		객체: 특성, 행동(기능)이 있는 실체
 * 		코드 중복성 거의 없고, 유지보수가 편함
 * 	2. 플랫폼의 독립성
 * 		C/C++: window 코드 -> 리눅스, MAC 등 다른 운영체제에서 사용 불가
 * 		Java: OS, 하드웨어에 상관없이 어디서나 동일하게 실행
 * 			프로그램 처리, 실행: JVM(Java varture Machine)이 대신 처리/실행
 * 
 * 	프로그래밍 표기/작성
 * 		1. 문장, 블록
 * 			문장: 프로그램의 처리 또는 데이터 값을 처리
 * 				마지막에 세미콜론(;)
 * 			블록: 여러 문장을 둘러싸서 실행하는 묶음
 * 				중괄호(  { 문장;문장;문장;문장;... }  )
 * 				메소드, 클래스가 블록 사용
 * 					메소드: 문장들을 둘러싼 블록(~~함수)
 * 					클래스: 메소드들을 둘러산 블록
 * 				블록 안에 또 다른 블록이 들어갈 수 있다.
 * 				블록의 중괄호는 항상 짝이 맞아야 하기에 수시로 확인 해 주어야 한다.
 * 					ctrl+a: 전체선택
 * 					ctrl+i: 코드 줄 정렬. 들여쓰기 정리
 * 					ctrl+space: 자동완성
 * 		2. 주석
 * 			//: 한줄만 주석			단축키: 설정&해제: ctrl+/
 * 			/*  * /: 여러 줄 주석	단축키: 설정: ctrl+shift+/ 해제: ctrl+shift+\
 * 		3. 데이터 타입. 자료형: 프로그램에서 다루는 데이터의 종류
 * 			정수, 실수, 문자, boolean(true/false) -> 변수를 통해 저장하고 사용
 * 			종류
 * 				boolean	: 논리형(true/false)
 * 				char	: 하나의 문자(유니코드) 'a'
 * 				byte	: 정수형, 1byte -128~127
 * 				short	: 정수형, 2byte
 * 				int		: 정수형, 4byte -21억~21억, 대표적인 정수 타입
 * 				long	: 정수형, 8byte
 * 				float	: 실수형, 4byte 소수점 39자리까지
 * 				double	: 실수형, 8byte 소수점 305자리까지, 대표적인 실수 타입
 * 
 */

public class f01_Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");

	}

}
