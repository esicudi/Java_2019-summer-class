package ThreadClass;

import java.time.LocalTime;

public class Timer extends Thread{
	int second=0;
	boolean flag=false;
	public Timer(int sec) {
		second=sec;
	}
	
	public void finish() {
		flag=true;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(second);
			second++;
			sleep();
			
			if(flag) return;
		}
	}
	
	void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
