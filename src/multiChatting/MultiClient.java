package multiChatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MultiClient {
	static final String HOST="127.0.0.1";
	static final int PORT=7777;
	public static void main(String[] args) {
		try(Socket client=new Socket(HOST,PORT);
				BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				BufferedReader input=new BufferedReader(new InputStreamReader(System.in))){
			// br = 서버에서 받는 스트림 객체
			// bw = 서버로 보내는 스트림 객체
			// input = 표준 입출력 문자 스트림 객체


			// 클라이언트가 서버와 통신할 무한 루프
			while(true) {
				String msg=input.readLine();
				bw.append(msg).append("\n").flush();
				msg=br.readLine();
				System.out.println(msg);
			}
		}catch(IOException e) {

		}
	}
}
