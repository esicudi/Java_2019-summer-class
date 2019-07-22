package ch05_class;

public abstract class AbstractClass {
	String name;
	int age;
	
	public abstract void point();
	
	public String toString() {
		return name+", "+age;
	}
}
