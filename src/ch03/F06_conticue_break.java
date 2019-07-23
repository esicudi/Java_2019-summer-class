package ch03;

import java.util.Scanner;

public class F06_conticue_break {
	/*
	 * 	반복문의 흐름 제어
	 * 	break;		반복문 바로 종료(주로 조건문과 함께 사용)
	 * 	continue;	이후의 명령 실행하지 않고 다음 반복으로 넘어감
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int sum=0;
//		while(true) {
//			int n=sc.nextInt();
//			if(n==-1) break;
//			sum+=n;
//		}
//		System.out.println(sum);
		for(int i=0;i<100;i++) {
			if(i%2==1) continue;
			System.out.println(i);
		}
		sc.close();
	}

}
