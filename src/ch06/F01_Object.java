package ch06;

class Pos{
	int x;
	int y;
	Pos(int x,int y){
		this.x=x;
		this.y=y;
	}
	public boolean equals(Pos p) {
		if(this.x==p.x&&this.y==p.y) return true;
		else return false;
	}
}

public class F01_Object {
	public static void main(String[] args) {
		Pos p1=new Pos(1,2);
		Pos p2=new Pos(1,2);
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		//String
		
		if(str1.equals(str2)){
			System.out.println("같은 값이다");
		}
		else {
			System.out.println("다른 값이다");
		}
		
		if(p1.equals(p2)){
			System.out.println("같은 값이다");
		}
		else {
			System.out.println("다른 값이다");
		}
		
		if(p1.hashCode() == p2.hashCode()) {
			System.out.println("같은 값이다.");
		}else {
			System.out.println("다른 값이다.");
		}
	}
}
