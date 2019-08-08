package ch13;

//공유 데이터에 10씩 더하는 스레드
class AddClass extends Thread{
	static int num=0;
	String name;
	AddClass(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			add(10);
			System.out.println(name+":"+num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized void add(int a) {
		num+=a;
	}
}

public class F03_동기화 {
	/*
	 * 동기화
	 * 키워드: synchronized	=> 한 스레드만 사용할 수 있음.
	 * 메소드: wait, notify	=> wait() : 기다리다가 누가 notify또는 아무도 사용안할 경우엔 해제
	 * 						=> notify() : 자원을 사용하지 않겠다. 다음에 누가 써라!
	 * 클래스: semaphore	=> 접근 허용의 수를 제한할 수 있음.
	 * 
	 * synchronized 을 이용한동기화
	 * synchronized 블록이나 메소드에 사용하며
	 * 해당 블록에는 하나의스레드만 접근 허용
	 * 블록이끝나면 다른 스레드가 접근
	 * 아래의 메소드는 하나의 스레드만 접근
	 * 스레드가 사용을 다하고 메소드가 종료하면
	 * 다른 스레드가 메소드에 접근해서 사용
	 * 	public synchronized int add(int a){
	 * 		num+=a;
	 * 		System.out.println(name+":"+num);
	 * 	}
	 */
	public static void main(String[] args) {
		AddClass a1=new AddClass("A");
		AddClass a2=new AddClass("B");
		AddClass a3=new AddClass("C");
		a1.start();
		a2.start();
		a3.start();
		try {
			a1.join();
			a2.join();
			a3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("AddClass Num is " + AddClass.num);
	}
}
