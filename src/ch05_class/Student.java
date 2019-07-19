package ch05_class;

public class Student extends Person{
	/*
	 * 슈퍼클래스와 서브클래스간에 같은 이름으로 된 필드가 있으면 우서수위는 서브클래스의 필드가 높음
	 */
	
	//생성자
	public Student() {
		System.out.println("Student: 기본 생성자");
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("Student: 매개변수가 있는 생성자");
	}
	public Student(String name,int age,String privateNumber) {
		super(name,age,privateNumber);
//		this.name=name;
//		this.age=age;
		System.out.println("Student: 매개변수가 있는 생성자");
	}
	
	
	public String toString() {
		return name+" : "+age;
	}
}
