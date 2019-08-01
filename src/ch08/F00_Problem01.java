package ch08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class F00_Problem01 {
	/*
	 * 정수 5개를 입력을 받아 출력
	 * 정수 하나당 한 줄
	 */
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<5;i++) {
//			sb.append(br.readLine()+"\n");
//		}
//		System.out.println(sb);
		try {
			ArrayList<Integer> list=new ArrayList<>();
			for(int i=0;i<5;i++){
				int num=Integer.valueOf(br.readLine());
				list.add(num);
			}
			for(int n : list) 
				System.out.println(n);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
