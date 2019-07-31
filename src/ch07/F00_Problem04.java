package ch07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MySort implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		if(str1.length()!=str2.length())
			return str1.length()-str2.length();
		return str1.compareTo(str2);
	}
	
}

public class F00_Problem04 {
	/*
	 * 문자열을 저장하는 ArrayList 객체를 생성하고
	 * ArrayList에 소문자로 이뤄진 문자열을 저장을 합니다.
	 * 
	 * 그리고 글자 수가 적은 순으로 정렬을 하고
	 * 글자 수가 같으면 사전순으로 정렬을 한 후
	 * 출력을 하세요.
	 * 
	 * 자바에서 제공하는 클래스의 객체를 내가 원하는 정렬 방식으로 정렬을 하거나
	 * 임의의 클래스의 객체를 때에 따라서 정렬방식이 바뀔 때 사용하는 방식.
	 */
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("hi");
		list.add("is");
		list.add("hello");
		list.add("world!");
		list.add("javaprogram");
		
		//사전순으로 정렬
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,new MySort());
		System.out.println(list);
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return 0;
//			}
//			
//		});
	}
}
