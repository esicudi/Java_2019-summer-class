package ch07;

import java.util.Vector;

public class F02_Vector {
	/*
	 * Vector<E>
	 */
	public static void main(String[] args) {
		//Integer 타입 객체가 저장되는 컬렉션
		Vector<Integer> vector=new Vector<Integer>();
		//데이터 추가
		vector.add(10);
		vector.add(11);
		vector.add(12);
		System.out.println(vector);
		//원하는 위치에 데이터 추가
		vector.add(0, 9);
		System.out.println(vector);
		//크기 및 요소의 갯수
		System.out.println("백터의 크기: "+vector.capacity());
		System.out.println("백터 요소의 수: "+vector.size());
		//컬렉션 내부의 객체 찾기
		System.out.println(vector.contains(10));
		System.out.println(vector.contains(15));
		//객체의 인덱스: 객체가 없으면 -1 반환
		System.out.println(vector.indexOf(10));
		//컬렉션에서 데이터 반환
		System.out.println(vector.get(1));
		System.out.println(vector.elementAt(1));
		//객체 삭제
		System.out.println(vector.remove(Integer.valueOf(10)));	//bool
		System.out.println(vector.remove(1));	//Object
		System.out.println(vector);
		//컬렉션을 배열로: 100만개부터는 배열이 더 빠름
		Object arr[]=vector.toArray();
		int num=(Integer)arr[0];
		System.out.println(num);
	}
}
