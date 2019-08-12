package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient {
	static final String HOST="127.0.0.1";
	static final int PORT=7777;
	static ServerSocket server=null;
	// 네트워크 통신을 위한 스트림
	static BufferedReader recive=null;
	static BufferedWriter send=null;
	public static void main(String[] args) {
		try(Socket client=new Socket(HOST,PORT);BufferedReader input=new BufferedReader(new InputStreamReader(System.in))) {
			createStream(client);
			while(true) {
				String msg = input.readLine();
				sendMsg(msg);
				if(msg.contentEquals("exit"))break;
				
				msg = reciveMsg();
				System.out.println(msg);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				closeStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void closeStream() throws IOException {
		send.close();
		recive.close();
	}
	
	private static void createStream(Socket client) throws IOException {
		send=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		recive=new BufferedReader(new InputStreamReader(client.getInputStream()));
	}

	// 메세지를 전달(전송)하는 메소드
	static void sendMsg(String msg) throws IOException {
		send.append(msg).append("\n").flush();
	}

	// 메세지를 전달 받아서 반환하는 메소드
	static String reciveMsg() throws IOException{
		return recive.readLine();
	}
}
