package ch03;

import java.util.Scanner;

public class F03_while {
	/*
	 * 	while: for문과 같은 반복문
	 * 
	 * 	while(조건식){
	 * 	}
	 * 
	 * 	for(int i=0;i<n;i++){		|	int i=0;
	 * 		sum+=i;					|	while(i<100){
	 * 	}							|		sum+=i++;
	 * 								|	}
	 * 	반복함수, 배열과 같은		|	특정 조건에 종시를 둘 때 주로 사용
	 * 	순차탐색 기능에 주로 사용	|
	 * 
	 * 	do-while
	 * 	while문처럼 조건식에 중점을 두는데
	 * 	while문과 차이점은 do while 최소 1번 실행
	 * 
	 * 	do{
	 * 	}while(조건식);
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			sum+=n;
			n=sc.nextInt();
		}
		
		int m,s=0;
		do {
			m=sc.nextInt();
			s+=m;
		}while(m!=0);
		
		sc.close();
	}

}