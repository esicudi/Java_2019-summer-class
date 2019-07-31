package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class F02_BufferedReader {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long start=System.nanoTime();
		for(int i=0;i<1000;i++) {
			int num=sc.nextInt();
			System.out.println(num);
		}
		long case1=System.nanoTime()-start;
		System.out.println("case1: "+case1);
		
		start=System.nanoTime();
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<1000;i++) {
//			int num=Integer.parseInt(st.nextToken());
//			System.out.println(num);
			sb.append(Integer.parseInt(st.nextToken())).append("\n");
		}
		System.out.println(sb);
		
		System.out.println("case1: "+case1);
		System.out.println("case2: "+(System.nanoTime()-start));
		
		
		sc.close();
	}
}
