package Ch02;

import java.util.Scanner;

public class F03_ifelse_ex {

	public static void main(String[] args) {
		//적습니다 100 중간입니다 300 많습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수업 일수를 입력하세요: ");
		int day = sc.nextInt();
		if(day <= 100)
			System.out.println("적습니다.");
		else if(day < 300)
			System.out.println("중간입니다.");
		else
			System.out.println("많습니다.");
		
		sc.close();
		
	}

}
