package ch07;

import java.util.ArrayList;
import java.util.Collections;

public class F04_Collections {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			list.add((int)(Math.random()*100+1));
		}
		System.out.println(list);
		
		System.out.println("max= "+Collections.max(list));
		System.out.println("min= "+Collections.min(list));
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
