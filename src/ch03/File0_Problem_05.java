package ch03;

import java.util.Scanner;

/*
 * 2920 
 * 1에서 8까지 중복되지 않게 수를 다 입력받은 후
 * 입력 받은 수가 오름차순 인지 내림차순인지 또는 둘 다 아닌지
 * 판별하는 프로그램을 작성
 */
public class File0_Problem_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		for(int i=0;i<8;i++)
			a[i]=sc.nextInt();
		int j=0;
	    for(int i=1;i<8;i++) {
	    	if(a[i-1]<a[i]) j++;
	    	else j--;
	    }
	    switch(j){
	        case 7: System.out.println("ascending");break;
	        case -7: System.out.println("descending");break;
	        default: System.out.println("mixed");
	    }
		sc.close();
	}
}
