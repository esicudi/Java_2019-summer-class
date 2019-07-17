package ch04;

import ch04_class.OutterClass;

class InnerClass{
	public int num1;
	protected int num2;
	int num3;
	private int num4;
	public int getNum4() {
		return num4;
	}
	public void setNum4(int num4) {
		this.num4=num4;
	}
}

class ProtectedClass extends OutterClass{
	void printNum() {
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(num3);
		//System.out.println(num4);
	}
}

public class f07_접근지정자 {
	public static void main(String[] args) {
		InnerClass ic=new InnerClass();
		ic.num1=10;
		ic.num2=20;
		ic.num3=30;
		ic.setNum4(40);
		
		OutterClass oc=new OutterClass();
		oc.num1=10;
		
	}
}
