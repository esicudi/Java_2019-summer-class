package ch04_class;

public class StaticClass {
	public static int count=0;
	public int num=0;
	public StaticClass() {
		count++;
		num++;
	}
	
	public static void print() {
		System.out.println(count);
	}
}
