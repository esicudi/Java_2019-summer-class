package restaurant;

public class Casher extends Thread{
	Customer ct;
	
	@Override
	public void run() {
		while(true) {
			try {
				synchronized(this) {
					print("손님 기다림");
					wait();			//직원 대기, 손님이 와서 결제하면서 풀림
				}
				synchronized(ct) {
					print("손님이 옴");
					Thread.sleep(500);
					print("결제 완료");
					ct.notify();	//대기하고 있던 손님 활성화
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void print(String str) {
		System.out.print("직원: ");
		System.out.println(str);
	}
	
	public void payment(Customer ct) {
		this.ct=ct;
	}
}
