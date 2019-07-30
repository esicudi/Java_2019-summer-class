package ch07;

import java.util.Vector;

//class Pos implements Comparable<Pos>{
//	int x;
//	int y;
//	Pos(int x,int y){
//		this.x=x;
//		this.y=y;
//	}
//	
//	@Override
//	public String toString() {
//		return "("+x+", "+y+")";
//	}
//	
//	@Override
//	public boolean equals(Object o) {
//		Pos p=(Pos)o;
//		if(x!=p.x) return false;
//		else if(y!=p.y) return false; 
//		return true;
//	}
//
//	@Override
//	public int compareTo(Pos p) {
//		// TODO Auto-generated method stub
//		//작은값일 경우 음수
//		if(x<=p.x) return x-p.x;
//		return 0;
//	}
//}

public class F03_Vector {
	public static void main(String[] args) {
		Vector<Pos> vec=new Vector<>();
		Pos p1=new Pos(1,2);
		vec.add(p1);
		vec.add(new Pos(3,4));
		System.out.println(vec);
		
		Pos p2=new Pos(3,4);
		System.out.println(vec.contains(p1));
		System.out.println(vec.contains(p2));
		
		Pos p3=vec.get(0);
		System.out.println(p3.toString());
		
		System.out.println(vec.remove(p2));
	}
}
