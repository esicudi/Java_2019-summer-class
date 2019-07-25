package ch06;

import java.util.Scanner;

public class F00_Problem_03 {
	/*
	 * 공백 없는 문자열 입력받아
	 * 입력받은 문자열의 알파벳 갯수 출력
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char charArray[]=str.toCharArray();
		int count[]=new int[26];
		for(int i=0;i<str.length();i++) {
			count[charArray[i]-97]++;
		}
		for(int i=0;i<26;i++) {
			String s=String.format("%c : %d", 'a'+i,count[i]);
			System.out.println(s);
		}
		sc.close();
	}
}
