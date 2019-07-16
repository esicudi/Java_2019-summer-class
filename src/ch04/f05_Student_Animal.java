package ch04;

import ch04_class.Animal;
import ch04_class.Student;

public class f05_Student_Animal {
	public static void main(String[] args) {
		Student s1=new Student("abc",1);
		Animal a1=new Animal("cat","nabi");
		int feed=20;
		
		s1.feedAnimal(feed, a1.name);
		feed=a1.eat(feed);
		System.out.println("³²Àº ¹ä: "+feed);
		
		feed=30;
		feed=s1.feedAnimal(feed, a1);
		System.out.println("³²Àº ¹ä: "+feed);
	}
}
