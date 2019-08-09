package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	final static String HOST="127.0.0.1";
	final static int PORT=12345;
	public static void main(String[] args) {
		try {
			//서버에 접속
			Socket client=new Socket(HOST,PORT);
			
			BufferedReader br=new BufferedReader(
					new InputStreamReader(
							client.getInputStream()));
			BufferedWriter bw=new BufferedWriter(
					new OutputStreamWriter(
							client.getOutputStream()));
			BufferedReader input=new BufferedReader(
					new InputStreamReader(
							System.in));
			
			while(true) {
				//키보드로 입력 받아옴
				String msg=input.readLine();
				bw.append(msg).flush();
				if(msg.equals("exit")) break;
				msg=br.readLine();
				System.out.println(msg);
			}
			
			br.close();
			bw.close();
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
