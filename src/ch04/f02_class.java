package ch04;
/*
 * 	생성자
 * 		객체 초기화 해주는 역할
 * 		객체를 생성할 때 단 한번만 호출이 되어짐
 * 		new 생성자();
 * 
 * 		클래스에 생성자가 없으면 컴파일러 기본생성자를 생성
 * 		이름은 반드시 클래스 이름과 동일
 * 		리턴타입이 없다
 * 		생성자를 여러 개 만들 수 있다
 * 			다수의 생서아 작성시 주의점
 * 				매개변수의 타입,숫자가 달라야 한다
 * 		생성자에서 다른 생성자 호출: this();
 * 			반드시 첫줄에 작성이 되어야 함
 */
import ch04_class.Animal;

public class f02_class {
	public static void main(String[] args) {
		//자동 import: ctrl+shift+o
		String kind="고양이";
		String name="나비";
		Animal a=new Animal(kind,name);
		Animal cat=new Animal("강아지","호야");
		Animal dog=new Animal(kind,name,0);
		a.eat(20);
	}
}
