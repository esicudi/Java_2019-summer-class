package multiChatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChattingThread extends Thread {
	Socket client;
	ChattingThread(Socket client){
		this.client=client;
	}
	
	@Override
	public void run() {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))){
			while(true) {
				String msg=reciveMsg(br);
				System.out.println(msg);
				sendMsg("echo "+msg, bw);
			}
		}catch(IOException e) {
			
		}finally {
			try {
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void sendMsg(String msg, BufferedWriter bw) throws IOException{
		bw.append(msg).append("\n").flush();
	}
	
	public String reciveMsg(BufferedReader br) throws IOException {
		return br.readLine();
	}
}
