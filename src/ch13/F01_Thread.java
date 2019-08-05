package ch13;

import ThreadClass.InputThread;
import ThreadClass.Timer;

/*
 * Thread
 * 	하나의 작업 단위
 * 
 * 	채팅 프로그램(클라이언트)
 * 	->입력 스레드
 * 	->출력 스레드
 * 	->참가자 출력 스레드
 */
public class F01_Thread {
	public static void main(String[] args) {
		Timer timer=new Timer(0);
		InputThread iThread=new InputThread(timer);
		timer.start();
		iThread.start();
		
		
	}
}
