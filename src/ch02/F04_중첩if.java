package ch02;

import java.util.Scanner;

public class F04_중첩if {
	/*
	 * 	중첩문
	 * 		제어문 안에 또 다른 제어문을 작성
	 * 
	 * 	중첩 if문
	 * 		if문 안에 if문 작성
	 * 		if(조건){
	 * 			if(조건){
	 * 			}
	 * 		}
	 * 
	 * 정수 3개 입력 -> 2번째로 큰 정수 출력.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 10, b = 20, c = 5;
		if(a > b) {
			if(a > c)
				System.out.println("a");
			else
				System.out.println("c");
		}
		else {
			if(b > c)
				System.out.println("b");
			else
				System.out.println("c");
		}
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x > y) {
			if(x > z) {
				if(y > z)	//xyz
					System.out.println("y " + y);
				else		//xzy
					System.out.println("z " + z);
			}
			else			//zxy
				System.out.println("x " + x);
		}
		else {
			if(y > z) {
				if(x > z)	//yxz
					System.out.println("x " + x);
				else		//yzx
					System.out.println("z " + z);
			}
			else			//zyx
				System.out.println("y " + y);
		}
		
		int max = x>y ? x : y;
		int min = x>y ? y : x;
		max = z>max ? max : (min>z ? min : z);
		System.out.println(max);
		
		sc.close();
	}

}
