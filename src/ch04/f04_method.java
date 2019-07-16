package ch04;

import ch04_class.Student;

public class f04_method {
	/*
	 * 	메소드(method)
	 * 		문장들을 감싸고 있는 블록
	 * 		기능 별로 작성
	 * 
	 * 	public int sum(int a,int b){
	 * 		return a+b;
	 * 	}
	 */
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static void getName(Student s) {
		System.out.print("student name: ");
		System.out.println(s.name);
	}
	
	public static Student createStudent(String name) {
		return new Student(name,1);
	}
	
	public static void main(String[] args) {
		sum(10,20);
		Student s=new Student("asd",2);
		getName(s);
		Student s2=createStudent("abg");
		System.out.println(s2.name);
	}
}
