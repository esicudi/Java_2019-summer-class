package ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class F00_Problem_05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		while(t-->0){
			StringTokenizer st=new StringTokenizer(sc.nextLine());
			int r=Integer.parseInt(st.nextToken());
			char s[]=st.nextToken().toCharArray();
			for(int i=0;i<s.length;i++) {
				for(int j=0;j<r;j++)
					sb.append(s[i]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
		sc.close();
	}
}
