package ch07;

import java.util.HashMap;
import java.util.Scanner;

public class F07_HashMap {
	public static void main(String[] args) {
		HashMap<String,Person> hash=new HashMap<>();
		hash.put("0000-0000",new Person("kkk",20));
		hash.put("0000-0001",new Person("asd",21));
		hash.put("0000-0002",new Person("aaa",22));
		hash.put("0000-0003",new Person("ghh",23));
		System.out.println(hash);
		
		Scanner sc=new Scanner(System.in);
		String deptNumber=sc.next();
		System.out.println(hash.get(deptNumber));
		sc.close();
	}
}
