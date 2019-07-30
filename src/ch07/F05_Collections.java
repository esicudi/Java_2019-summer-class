package ch07;

import java.util.ArrayList;
import java.util.Collections;

public class F05_Collections {
	/*
	 * Collections : 컬렉션의 기능을 가지고 있는 클래스
	 * 
	 *  정렬, 역순 배치, 2진탐색
	 *  
	 *  Collections에 있는 정렬(sort)도 CompareTo 메소드의 값을 통해 정렬 이뤄짐
	 *  
	 *  임의로 작성한 클래스를 정렬하려면
	 *  Compareable<T> 인터페이스를 상속받아
	 *  compareTo 메소드 구현
	 *  	리턴값	음수	: 작은
	 *  			0		: 같은
	 *  			양수	: 큰
	 */
	public static void main(String[] args) {
		ArrayList<Pos> list=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			int x=(int)(Math.random()*21);
			int y=(int)(Math.random()*21);
			list.add(new Pos(x,y));
		}
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}