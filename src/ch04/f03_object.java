package ch04;

import ch04_class.Student;

public class f03_object {
	/*
	 * 객체(object)
	 * 
	 * 객체 = 레퍼런스 변수, 주소값(해시값)을 저장하는 변수
	 * 
	 * 객체 배열: 객체들을 모아놓은 형태(배열)->레퍼런스 변수들
	 */
	public static void main(String[] args) {
		Student s1=new Student("홍길동",2);
		Student s2=new Student("홀길동",2);
		Student s3;
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		s3=s1;
		System.out.println("s3="+s3);
		System.out.println("s3 name="+s3.name);
		
		System.out.println("수정 전1:"+s1.grade);
		System.out.println("수정 전3:"+s3.grade);
		s3.grade=3;
		System.out.println("수정 후1:"+s1.grade);
		System.out.println("수정 후3:"+s3.grade);
		
		
		Student students[]=new Student[30];
		for(int i=0;i<30;i++) {
			students[i]=new Student();
		}
	}

}
