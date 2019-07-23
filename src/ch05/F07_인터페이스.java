package ch05;

import ch05_class2.MP3;
import ch05_class2.Phone;

public class F07_인터페이스 {
	/*
	 * 	인터페이스(Interface)
	 * 		추상클래스의 극단화
	 * 
	 * 	옛날 JAVA에서
	 * 		인터페이스에 상수의 추상메소드만 존재
	 * 		필드, 일반메소드 없었다
	 * 	현재
	 * 		상수와 추상메소드 그대로 존재
	 * 		일반메소드 작성 가능, static 가능
	 * 
	 * 	구현보다는 설계에서 의미가 큼
	 * 	한 인터페이스에서 표준화가 가능
	 * 
	 * 	참조변수
	 * 		배열
	 * 		객체
	 * 		인터페이스 객체
	 * 			new를 통해 객체생성 불가
	 * 			레퍼런스 변수 만들 수 있음
	 */
	public static void main(String[] args) {
		//레퍼런스 변수는 만들 수 있으나
		//메모리에 할당받는 객체는 만들 수 없음
		Phone phone1=new Phone();
		MP3 mp=phone1;
		mp.play();
		mp.stop();
	}
}
