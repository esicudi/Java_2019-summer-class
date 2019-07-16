package ch04_class;
/*
 * 특성
 * 	이름
 * 	학년
 * 	점수
 * 메소드
 * 	공부
 * 	밥
 * 	잠
 * 생성자
 * 	매개변수 없는 생성자
 * 	이름저장
 * 	이름,학년저장
 */
public class Student {
	public String name;
	public int grade;
	public int score;
	
	public Student() {}
	public Student(String name) {
		this.name=name;
	}
	public Student(String name,int grade) {
		this(name);
		this.grade=grade;
	}
	
	public void study() {
		System.out.println(name+"("+grade+") study");
	}
	public void eat() {
		System.out.println(name+"("+grade+") eat");
	}
	public void sleep() {
		System.out.println(name+"("+grade+") sleep");
	}
	public void feedAnimal(int feed,String name) {
		System.out.println(name+"동물에게 "+feed+"만큼 먹이를 줌");
	}
	public int feedAnimal(int feed,Animal a1) {
		System.out.println(a1.name+"한테 "+feed+"만큼 먹이를 줌");
		return a1.eat(feed);
	}
}
