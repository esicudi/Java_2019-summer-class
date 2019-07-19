package ch05;

import ch05_class.Person;
import ch05_class.Researcher;
import ch05_class.Student;
import ch05_class.StudentWorker;

public class F03_캐스팅 {
	/*
	 * 캐스팅(형변환)
	 * 
	 * 자료형 변환
	 * 	가동형변환: 작은자료형->큰자료형
	 * 	강제형변환: 큰자료형->작은자료형
	 * 
	 * 객체 형변환
	 * 	상속관계에서만 가능
	 * 	업 캐스팅: 클래스 타입을 슈퍼클래스 타입으로 변환시킴
	 * 		자동 캐스팅
	 * 	다운 캐스팅: 클래스 타입을 서브클래스 타입으로 변환시킴
	 * 		강제 캐스팅 (서브클래스)객체이름
	 * 		슈퍼클래스의 객체가 업캐스팅이 된 객체여야 함
	 */
//	public static void printInfo(Student s) {
//		System.out.println(s.name+", "+s.age);
//	}
//	public static void printInfo(Researcher s) {
//		System.out.println(s.name+", "+s.age);
//	}
	public static void printInfo(Person s) {
		if (s instanceof Person) {
			System.out.println("Person type");
		}
		if (s instanceof Student) {
			System.out.println("Student type");
			System.out.print("학생: ");
		}
		else if (s instanceof Researcher) {
			System.out.println("Researcher type");
			System.out.print("연구원: ");
		}
		System.out.println(s.name+", "+s.age);
	}
	
	public static void main(String[] args) {
		Student s=new Student("abc",5);
		Person p=s;	//업캐스팅
		printInfo(p);
		p.name="def";
		printInfo(s);
		Student s1=(Student)p;
		
		StudentWorker sw=new StudentWorker("jkl",22);
		printInfo(sw);
		
		Researcher r1=new Researcher("ghi",28);
		printInfo(r1);
	}
}
