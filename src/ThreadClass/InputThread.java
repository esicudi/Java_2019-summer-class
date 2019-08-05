package ThreadClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputThread extends Thread{
	BufferedReader br;
	Timer timer;
	public InputThread(Timer timer) {
		// TODO Auto-generated constructor stub
		this.timer = timer;
	}
	
	//스레드가 작업하는 메소드
	@Override
	public void run() {
		br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(true) {
			try {
				str = br.readLine();
				if(str.equals("finish")) {
					timer.finish();
					return;
				}
				System.out.println("Input : "+str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
