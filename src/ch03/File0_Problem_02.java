package ch03;

import java.util.Scanner;

/*
 * 김지민은 N명이 참가하는 스타 토너먼트에 진출했다. 토너먼트는 다음과 같이 진행된다. 
 * 일단 N명의 참가자는 번호가 1번부터 N번까지 배정받는다. 
 * 그러고 난 후에 서로 인접한 번호끼리 스타를 한다. 이긴 사람은 다음 라운드에 진출하고, 
 * 진 사람은 그 라운드에서 떨어진다. 만약 그 라운드의 참가자가 홀수명이라면, 
 * 마지막 번호를 가진 참가자는 다음 라운드로 자동 진출한다. 
 * 다음 라운드에선 다시 참가자의 번호를 1번부터 매긴다. 
 * 이때, 번호를 매기는 순서는 처음 번호의 순서를 유지하면서 1번부터 매긴다. 
 * 이 말은 1번과 2번이 스타를 해서 1번이 진출하고, 3번과 4번이 스타를 해서 4번이 진출했다면, 
 * 4번은 다음 라운드에서 번호 2번을 배정받는다. 
 * 번호를 다시 배정받은 후에 한 명만 남을 때까지 라운드를 계속 한다.
 * 
 * 마침 이 스타 대회에 임한수도 참가했다. 김지민은 갑자기 스타 대회에서 우승하는 욕심은 없어지고, 
 * 몇 라운드에서 임한수와 대결하는지 궁금해졌다. 
 * 일단 김지민과 임한수는 서로 대결하기 전까지 항상 이긴다고 가정한다. 
 * 1 라운드에서 김지민의 번호와 임한수의 번호가 주어질 때, 
 * 과연 김지민과 임한수가 몇 라운드에서 대결하는지 출력하는 프로그램을 작성하시오.
 */
public class File0_Problem_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pirintTutorial(n);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		a--;b--;
		int m = 0;
		while(a!=b) {
			m++;
			a /= 2; b /= 2;
		}
		System.out.println(m);
		
		sc.close();
	}

	//참가 인원이 N명일 때 대진표를 출력하기 위한 메소드
	
	static void pirintTutorial(int N) {

		int r = 0;

		int n = N; 

		int roundNum[] = new int[20];//최대 9라운드라고 가정 round[0] 사용 X



		for(int i=1,m=n;i<20;i++) {

			roundNum[i] = m;

			m=(m+1)/2;

			r++;



			if(roundNum[i]==roundNum[i-1]) break;

		}



		System.out.println(r);

		r--;

		int bit = (1<<(r))-1;



		for(int i=0;i<r;i++) {

			System.out.print("round " + (r-i) + " : ");



			for(int space = bit>>(i); space>0;space--) {

				System.out.print(" ");

			}

			for(int j=0;j<roundNum[r-i];j++) {

				System.out.printf("%02d",j+1);

				for(int space = bit>>i;space>0;space--)

					System.out.print("  ");

			}

			System.out.println();

		}
	}
}
