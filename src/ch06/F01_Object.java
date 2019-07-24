package ch06;

import java.util.Objects;

class Pos{
	int x;
	int y;
	Pos(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o.getClass()!=this.getClass())
			return false;
		Pos p=(Pos)o;
		if(this.x==p.x&&this.y==p.y)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.x,this.y);
	}
}

public class F01_Object {
	/*
	 * Object
	 * equals	: 같은 객체인지 객체의 해시값으로 비교
	 * hashCode	: 객체를해시형태로 표시
	 * toString	: 클래스의 정보와 객체의 해시값을 출력
	 * 
	 * 오버라이딩해서 사용시
	 * equals	: 객체끼리의 값을 비교해 같은지 비교할 때 사용
	 * hashCode	: 객체의 필드를 해시값으로 변환하여 반환
	 * 			: 중복 검사하는 데 빠름
	 */
	public static void main(String[] args) {
		Pos p1=new Pos(1,2);
		Pos p2=new Pos(1,2);
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		//String
		
		if(str1.equals(str2)){
			System.out.println("같은 값이다");
		}
		else {
			System.out.println("다른 값이다");
		}
		
		if(p1.equals(p2)){
			System.out.println("같은 값이다");
		}
		else {
			System.out.println("다른 값이다");
		}
		
		if(p1.hashCode() == p2.hashCode()) {
			System.out.println("같은 값이다.");
		}else {
			System.out.println("다른 값이다.");
		}
	}
}
