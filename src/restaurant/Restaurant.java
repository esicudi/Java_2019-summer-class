package restaurant;

public class Restaurant {
	public static void main(String[] args) {
		//손님 스레드와 직원 스레드
		Casher cash=new Casher();
		cash.start();
		Customer cs=new Customer(cash);
		cs.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(cs) {
			cs.notify();
		}
	}
}
