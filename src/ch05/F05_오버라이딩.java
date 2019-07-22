package ch05;

import ch05_class.Person;
import ch05_class.Researcher;
import ch05_class.Student;
import ch05_class.StudentWorker;

public class F05_오버라이딩 {
	/*
	 * 	오버라이딩: 객체지향의 다형성 중 하나	cf)오버로딩
	 * 	슈퍼클래스에서 정의된 메소드를 서브클래스에서 재정의
	 * 
	 * 	조건
	 * 		이름, 매개변수(타입,순서), 리턴타입 동일
	 * 		접근지정자가 슈퍼클래스에 지정된 것보다 범위가 작으면 안됨
	 * 
	 * 	슈퍼클래스에서 정의된 메소드는 실행되지 않고, 서브클래스에서 재정의된 메소드가 호출
	 * 		(동적 바인딩)
	 */
	public static void main(String[] args) {
		Student s1=new Student();
		Researcher r1=new Researcher("abc",40);
		StudentWorker sw1=new StudentWorker("def",27);
		
		s1.sleep();
		r1.sleep();
		sw1.sleep();
		
		Person p1=s1;
		p1.sleep();
		
		p1=r1;
		p1.sleep();
	}
}
