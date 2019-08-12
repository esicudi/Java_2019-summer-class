package multiChatting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatingServer {
	static final int PORT=7777;
	static final ArrayList<Socket> list=new ArrayList<>();
	public static void main(String[] args) {
		try(ServerSocket server=new ServerSocket(PORT)) {
			while(true) {
				// 클라이언의 접속을 대기
				Socket client=server.accept();
				
				// 접속이 되면 연결된  클라이언트와 통신할 스레드를 실행
				ChattingThread th=new ChattingThread(client);
				th.start();
				
				// 스레드를 실행 시킨 다음에는 스레드를 Vector에 저장.
				// 스레드에 넘기지 않으려면 ArrayList에 저장.
				list.add(client);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static synchronized void sendAll(String msg, ChattingThread th) throws IOException {
		for(Socket cl:list) {
			if(cl==th.client)continue;
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(cl.getOutputStream()));
			bw.append(msg).append("\n").flush();
			bw.close();
		}
	}
}
