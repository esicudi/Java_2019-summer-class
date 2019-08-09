package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server=new ServerSocket(12345);
			Socket client=null;
			while(true) {
				System.out.println("Server: 클라이언트 접속 대기");
				client=server.accept();
				System.out.println("Server: 클라이언트 접속");
				
				BufferedReader br=new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));
				BufferedWriter bw=new BufferedWriter(
						new OutputStreamWriter(
								client.getOutputStream()));
				
				//echo 서버
				while(true) {
					String msg=br.readLine();
					if(msg.equals("exit")) break;
					System.out.println("msg: "+msg);
					bw.append("echo: ").append(msg).append("\n").flush();
				}
				br.close();
				bw.close();
				client.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
