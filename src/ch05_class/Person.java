package ch05_class;

public class Person {
	//필드(특성)
	public String name;
	public int age;
	private String privateNumber;
	
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
