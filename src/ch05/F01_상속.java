package ch05;

import ch05_class.*;

public class F01_상속 {
	/*
	 * 슬라임 클래스
	 * 여우 클래스
	 * 늑대 클래스
	 * 고블린 클래스
	 * 
	 * 공통적 특성
	 * 	hp
	 * 	damage
	 * 
	 * 공통적 행동
	 * 	attack
	 */
	public static void main(String[] args) {
		Person p1=new Person();
		Student s1=new Student();
		StudentWorker st1=new StudentWorker();
		
		System.out.println("Person Class");
		p1.eat();
		p1.sleep();
		p1.walk();
		p1.speak();
		p1.name="abc";
		
		System.out.println("Student Class");
		s1.eat();
		s1.sleep();
		s1.walk();
		s1.speak();
		s1.name="def";
		s1.age=20;
		System.out.println(s1.toString());
	}
}
