package Ch03;

import java.util.Scanner;

/*
 * 두 자연수를 입력 받아 곱한 수의 결과 값을 구합니다.
 * 
 * 그 결과 값의 숫자가 각각 몇개인지 출력해주세요
 * 
 * 0개인 수는 0개로 출력
 * 
 * 
 * 
 */
public class File0_Problem_03 {

	public static void main(String[] args) {
		int n[]=new int[10];
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt();
		while(a!=0) {
			n[a%10]++;
			a/=10;
		}
		for(int i=0;i<10;i++)
			System.out.println(n[i]);
		sc.close();
	}

}
