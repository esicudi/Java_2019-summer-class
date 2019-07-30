package ch07;

public class Pos implements Comparable<Pos>{
	int x;
	int y;

	Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x +", " + y + ")";
	}
	
	
	@Override
	public boolean equals(Object o) {
		Pos p = (Pos)o;
		
		if(x != p.x) return false;
		else if(y != p.y)return false; 
		
		return true;
	}

	@Override
	public int compareTo(Pos p) {
		// TODO Auto-generated method stub
		// p1.compareTo(p);
		// 작은 값일 경우 음수
		// 같은 값이면 0
		// 큰 값일 경우 양수
		/*
		 * x값을 오름차순으로 정렬
		 * x값이 같으면 y값은 내림차순으로 정렬
		 */
		//if(x <= p.x) return x - p.x;
		if(this.x!=p.x)
			return this.x-p.x;
		return p.y-this.y;
	}
}
