package restaurant;

public class Customer extends Thread{
	Casher cash;
	public Customer(Casher cash) {
		this.cash=cash;
	}
	@Override
	public void run() {
		try {
			synchronized(this) {
				wait();			//식당 오픈 전이므로 대기
				print("오픈");
				print("입장");
			}
			
			//직원 부를 때 순서가 중요
			//payment 실행 후 직원 깨워줌
			synchronized(cash) {
				cash.payment(this);
				cash.notify();	//직원 깨움
				print("결제 중");
			}
			synchronized(this) {
				wait();
				print("결제 완료");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print(String str) {
		System.out.print("손님: ");
		System.out.println(str);
	}
}
