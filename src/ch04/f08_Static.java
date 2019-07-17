package ch04;

import ch04_class.StaticClass;
/*
 * 	static
 * 		생성시기: 프로그램 실행후 클래스를 읽을 때 메모리에 만들어짐
 * 		c.f. non-static멤버: 객체 생성할 때 메모리에 만들어짐
 * 		메모리에 객체 생성과 상관없이 적재됨
 * 		객체 없이도 접근 가능. 클래스명.static멤버
 * 
 * 	필드: 객체간, 또는 객체의 클래스간의 공용 필드
 * 	메소드: 객체를 생성하지 않아도 실행할수 있는 기능
 * 
 * 	주의사항
 * 		static 메소드: 프로그램 실행시 만들어짐
 * 		static 메소드안에 non-static 멤버 사용할 때 문제 발생 가능(생성 시간이 다르기 때문에 오류발생)
 * 		static 메소드 안에는 static멤버, 지역변수만 사용 가능
 */
public class f08_Static {
	public static void main(String[] args) {
		StaticClass sc=new StaticClass();
		System.out.println("count: "+sc.count);
		System.out.println("num: "+sc.num);
		StaticClass sc2=new StaticClass();
		System.out.println("count: "+sc2.count);
		System.out.println("num: "+sc2.num);
		StaticClass sc3=new StaticClass();
		System.out.println("count: "+sc3.count);
		System.out.println("num: "+sc3.num);
		
		System.out.println("StaticClass.count: "+StaticClass.count);
	}
}
