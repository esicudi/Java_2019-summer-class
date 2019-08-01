package ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class F01_Stream {
	/*
	 * 	스트림: 데이터의 흐름
	 * 		프로그램과 대상이 있으면 그 사이에 흐르는데이터의 통로
	 * 	스트림 입출력
	 * 		버퍼를 통해 순차적으로 이루어지는 입출력
	 * 	자바에서의 표준 입출력
	 * 		입력: System.in
	 * 			입력장치로부터 자바프로그램으로 데이터 전달
	 * 		출력: System.out
	 * 			출력장치로 데이터 전달
	 * 	스트림은 단방향.
	 * 		입/출력 스트림 따로 관리
	 * 	입출력 스트림의 기본 단위
	 * 		바이트 스트림: 바이트(이미지,영상 등)
	 * 			문자도 가능하지만 문자가 깨질 수 있음
	 * 		문자 스트림: 문자(1문자당 2바이트)
	 * 	바이트 스트림과 문자 스트림
	 * 		바이트 스트림
	 * 			입출력되는 데이터를 단순 데이터로 처리
	 * 			이미지, 영상, 바이너리, 문자 등을 처리
	 * 			문자같은 경우 깨질 수 있음
	 * 		문자 스트림
	 * 			문자만 입출력이 되는 스트림
	 * 
	 * 	문자 스트림 입출력
	 * 		스트림끼리 결합 가능
	 * 		InputStreamReader isr=new InputStreamReader(System.in);
	 * 		int c=isr.read();	한글자씩 int형으로 읽어옴
	 * 		BufferedReader br=new BufferedReader(isr);
	 * 		String str=br.readLine();
	 * 
	 * 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 * 
	 * 		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	 */
	public static void main(String[] args) throws IOException {
		// 문자 스트림 객체 생성
		// 문자 입력 스트림
		// 문자열만 입력을 받을 수 있음.
		// 한줄 씩 입력을 받아옴.
		// 공백단위로 나누거나, 다른 타입으로 자료형을 바꿀 때는
		// 추가적으로 구현을 해줘야 함.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(str);
		
		//입력받은 문자열을 공백단위로 분할
		StringTokenizer st=new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {	//토큰이 없을때까지 반복
			str=st.nextToken();
			System.out.println(str);
		}
		
		//입력받은 문자열을 기본 자료형으로 변환
		int n=Integer.parseInt(br.readLine());
		System.out.println(n);
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("BufferedWriter Object");
		bw.newLine();
		bw.write("Endline");
		bw.flush();	//쌓인 버퍼를 전송후 비움
	}
}
