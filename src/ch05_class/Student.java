package ch05_class;

public class Student extends Person{
	/*
	 * 슈퍼클래스와 서브클래스간에 같은 이름으로 된 필드가 있으면 우서수위는 서브클래스의 필드가 높음
	 */
	public String toString() {
		return name+" : "+age;
	}
}
