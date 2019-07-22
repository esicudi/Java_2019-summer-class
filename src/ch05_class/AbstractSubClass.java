package ch05_class;
/*
 * 	AbstractClass에 추상 메소드 있음
 * 	서브 클래스는 추상메소드를 반드시 구현해야함
 * 	구현해주지 않으면 서브클래스를 추상 클래스로 선언해줘야함
 */
public class AbstractSubClass extends AbstractClass{

	@Override
	public void point() {
		System.out.println("추상 메소드에서 오버라이딩한 메소드");
	}
	
}
