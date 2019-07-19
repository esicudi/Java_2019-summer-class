package ch05;

import ch05_class.Student;

public class F02_생성자 {
	/*
	 * 상속관계에서의 생성자 호출 및 실행
	 * 
	 * 생성자: 객체를 생성할 때 초기화 해주는 메소드
	 * 
	 * 호출: 서브 클래스부터 호출->바로 슈퍼클래스의 생성자를 호출
	 * 		슈퍼클래스의 생성자를 호출할 때 기본 생성자 호출
	 * 		슈퍼클래스의 매개변수 있는 생성자를 호출할 때 super() 사용
	 * 실행: 슈퍼클래스부터 실행->서브클래스의 생성자
	 * 
	 * 슈퍼클래스의 매개변수 있는 생성자
	 * 	직접 지정 해 줘야 한다.
	 * 	super()
	 */
	public static void main(String[] args) {
		Student st=new Student();
		Student st2=new Student("abc",3);
		Student st3=new Student("def",45,"2544672423456");
	}
}
