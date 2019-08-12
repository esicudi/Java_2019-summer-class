package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//서버와 클라이언트간의 1 : 1 통신
public class ChattingServer {
	static final int PORT=7777;
	static ServerSocket server=null;
	// 네트워크 통신을 위한 스트림
	static BufferedReader recive=null;
	static BufferedWriter send=null;
	// 표준입력 스트림
	static BufferedReader input=null;
	ArrayList<Thread> list = new ArrayList<>();
	public static void main(String[] args) {
		try {
			serverOpen();
			Socket client=null;
			while(true) {
				client=server.accept();
				createStream(client);
				while(true) {
					String msg=reciveMsg();
					if(msg.equals("exit")) break;
					System.out.println("client: "+msg);
					sendMsg("echo "+msg);
				}
				closeStream(client);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void closeStream(Socket client) throws IOException {
		send.close();
		recive.close();
		client.close();
	}
	
	private static void createStream(Socket client) throws IOException {
		send=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		recive=new BufferedReader(new InputStreamReader(client.getInputStream()));
	}
	
	static void serverOpen() throws IOException{
		server = new ServerSocket(PORT);
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
