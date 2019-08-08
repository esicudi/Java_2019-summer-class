package ch13;

class PrintString implements Runnable{
	String str;
	PrintString(String str){
		this.str=str;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(str);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class F02_Runnable {
	/*
	 * Runnable 인터페이스를 통한스레드 구현
	 * 	클래스의 단점인 다른상속을 해결
	 * 	만약 다른 클래스를 상속받고 있다면
	 * 	Runnable 인터페이스를 상속받아 구현
	 */
	public static void main(String[] args) {
		PrintString s1=new PrintString("Hello");
		PrintString s2=new PrintString("World!");
		// 인터페이스를 상속받아구현한 스레드는 바로 실행을 못함
		// Thread 클래스의 객체에 인터페이스 구현한 객체 생성자로 넣고
		// Thread 객체로 start 메소드 실행
		Thread th1=new Thread(s1);
		Thread th2=new Thread(s2);
		Thread th3=new Thread(new Runnable() {
			@Override
			public void run() {
				int time=0;
				while(time<10) {
					System.out.println("second: "+(time++));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		th1.start();
		th2.start();
		th3.start();
	}
}
