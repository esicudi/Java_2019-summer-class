package ch13;

class Pos extends Thread implements Comparable<Pos>{
	int x;
	Pos des;
	String name;
	Pos(){}
	Pos(int x,Pos des,String name){
		this.x=x;
		this.des=des;
		this.name=name;
	}
	@Override
	public int compareTo(Pos p) {
		if(this.x<p.x)
			return -1;
		else if(this.x>p.x)
			return 1;
		else
			return 0;
	}
	@Override
	public void run() {
		int s=compareTo(des);
		int time=0;
		while(s==compareTo(des)) {
			x-=s;
			time++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+x);
		}
		System.out.println(name+"위치: "+x);
	}
}

public class F00_Problem02 {
	/*
	 * 	수평선에 놓여진 두 점이 있을 때
	 * 	두 점이 서로 1초에 1씩 가까워짐
	 * 	만날 때 까지의위치, 만났을때의 위치 출력
	 */
	public static void main(String[] args) {
		Pos p1=new Pos();
		Pos p2=new Pos(4,p1,"p1:");
		p1=new Pos(0,p2,"p2:");
		p1.start();
		p2.start();
	}
}
