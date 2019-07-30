package ch07;

import java.util.HashMap;
import java.util.Scanner;

public class F00_Problem03 {
	/*
	 * 	HashMap
	 * 		K: key, Áßº¹x
	 * 		V: value
	 */
	public static void main(String[] args) {
		HashMap<String,Integer> hash=new HashMap<>();
		hash.put("Seoul", 5654254);
		hash.put("Busan", 2611694);
		hash.put("Inchon", 4923156);
		hash.put("Gwangju", 4845802);
		hash.put("Daegu", 6454821);
		Scanner sc=new Scanner(System.in);
		while(true) {
			String search=sc.next();
			if(search.equals("exit")) break;
			System.out.println(hash.get(search));
		}
		sc.close();
	}
}
