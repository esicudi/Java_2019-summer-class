package ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class F00_Problem03 {
	/*
	 * 	./work/info.txt/ 파일 읽어들여
	 * 	자신의 정보 출력
	 */
	public static void main(String[] args) {
		// File 객체 생성
		// → ./work/info.txt 를 지정한 객체 생성
		File file=new File("./work/info.txt");
		Scanner sc=new Scanner(System.in);
		try {
			// 파일 입력 스트림
			BufferedReader br=new BufferedReader(
					new InputStreamReader(
							new FileInputStream(file),"UTF-8"));
			String str;
			// br.readLine()의값을 str에 저장해
			// null인지 검사->null 아니면 출력 및 입력을 받음
			String name = null;
			String age = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
				if(str.contains("name"))
					name=sc.next();
				else
					age=sc.next();
			}
			// 파일 출력 스트림
			BufferedWriter bw=new BufferedWriter(
					new OutputStreamWriter(
							new FileOutputStream(file),"UTF-8"));
			bw.append("My name : ").append(name);
			bw.newLine();
			bw.append("My age : ").append(age);
			
			br.close();
			bw.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			System.err.println(e);
		}
		sc.close();
	}
}
