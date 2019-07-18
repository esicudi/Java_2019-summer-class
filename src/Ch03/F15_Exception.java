package Ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class F15_Exception {
	/*
	 * 	예외발생->프로그램 종료
	 * 	예외처리->프로그램 종료할지 계속할지 결정
	 * 
	 * 	1. try-catch-finally(생략가능)
	 * 		try{
	 * 			예외 발생 가능한 코드
	 * 		}
	 * 		catch(ArrayIndexOutOfBoundsException | InputMismathException e){
	 * 			예외 발생시 처리할 코드
	 * 			e.traceTrack();
	 * 		}
	 * 		finally{
	 * 			예외 상관없이 실행하는 코드
	 * 			메소드 예외처리할 때 주로 사용
	 * 			e.traceTrack();
	 * 		}
	 * 	2. throw: 개발자가 인위적으로 예외를 발생시키는 키워드
	 * 		throw new InputMismatchException();
	 * 	3. throws: 발생한 예외를 상위 메소드에 전달
	 * 	4. try-with-resource
	 */
	
	public static void exception() throws ArithmeticException {
		try{
			System.out.println(5/0);
			return;
			}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("표준입력 완료");
		}
	}
	
	public static void bufferReader() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		exception();
		while(true) {
			try{
				exception();
				int n=sc.nextInt();
				for(int i=0;i<n;i++)
					System.out.println(n);
				break;
			}
			catch(InputMismatchException e){
				System.out.println("잘못된 입력 값입니다.");
				System.out.println("정수를 다시 입력하세요.");
				sc.nextLine();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위가 넘어갔습니다.");
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			finally {
				//예외발생여부에 상관없이 실행
				System.out.println("exit");
			}
		}
		System.out.println("종료");
		sc.close();
	}

}
