package ch05_class2;

import java.util.ArrayList;

//인터페이스 추가
//클래스가 아니기에 extends 사용 x
//구현을 해야하기에 implements
public class Phone implements MP3,Call,SMS{

	@Override
	public void sendSMS(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recive(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String printSMS() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printUserInformation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<String> getSongList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
