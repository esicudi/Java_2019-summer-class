package ch04;

import java.util.Scanner;

/*
 * 사각형에 임의의 좌표값이 주어지면 사각형의 변과 가까운 거리를 구하는 프로그램 작성
 */
public class F00_Problem05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt();
		int w=sc.nextInt(),h=sc.nextInt();
		int mx,my;
		mx=(w>2*x)?x:w-x;
		my=(h>2*y)?y:h-y;
		if(mx>my) System.out.println(my);
		else System.out.println(mx);
		sc.close();
	}
}
