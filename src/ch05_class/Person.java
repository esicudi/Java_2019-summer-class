package ch05_class;

public class Person {
	//필드(특성)
	public String name;
	public int age;
	private String privateNumber;
	
	//생성자
	public Person() {
		System.out.println("Person: 기본 생성자");
	}
	public Person(String privateNumber) {
		this.privateNumber=privateNumber;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String privateNumber) {
		this.name = name;
		this.age = age;
		this.privateNumber = privateNumber;
		System.out.println("Person: 매개변수가 세개인 생성자");
	}
	
	//메소드(행동)
	public void speak() {
		System.out.println("말하기");
	}
	public void eat() {
		System.out.println("먹기");
	}
	public void walk() {
		System.out.println("걷기");
	}
	public void sleep() {
		System.out.println("잠자기");
	}
}
