package ch04;

import ch04_class.*;

public class f00_Problem01 {
	/*
	 * animal 객체 5개 저장할배열 생성후 객체 5개 만들기
	 */
	public static void main(String[] args) {
		Animal animals[]=new Animal[5];
		Student students[]=new Student[30];
		Student students2[][]=new Student[5][30];
		
		for(int i=0;i<5;i++)
			animals[i]=new Animal();
		for(int i=0;i<30;i++)
			students[i]=new Student("st"+i,2);
		
		System.out.println("학생들의 이름 출력");
		for(Student s:students)
			System.out.println(s.name);
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<30;j++)
				students2[i][j]=new Student("st"+i,2);
		}
	}
}
