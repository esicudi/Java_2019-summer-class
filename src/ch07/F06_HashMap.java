package ch07;

import java.util.HashMap;
import java.util.Scanner;

public class F06_HashMap {
	public static void main(String[] args) {
		HashMap<String,String> hash=new HashMap<>();
		//영한사전
		//key: 영어
		//value: 한국어
		hash.put("apple","사과");
		hash.put("banana","바나나");
		hash.put("love","사랑");
		System.out.println(hash);
		
		hash.put("apple","포도");
		hash.replace("apple","사과");
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			String search=sc.next();
			if(search.equals("exit"))
				break;
			System.out.println(hash.get(search));
		}
		sc.close();
	}
}
