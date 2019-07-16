package ch04;

public class f06_overloading {
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	
	public static void main(String[] args) {
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
	}
}
