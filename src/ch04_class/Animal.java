package ch04_class;
//javadoc
/**
 * 
 * @author Administrator
 * 동물의 정보를 저장하는 클래스
 */
public class Animal {
	public String kind;
	public String name;
	public int age=0;
	
	//생성자
	public Animal() {System.out.println("기본 생성자");}
	public Animal(String kind, String name, int age) {
		this(kind,name);
		this.age = age;
	}
	public Animal(String kind) {
		this.kind = kind;
	}
	public Animal(String kind,String name) {
		this.kind=kind;
		this.name=name;
	}
	
	public int eat(int food) {
		System.out.println(name+": 밥 먹기");
		food-=10;
		return food;
	}
	
	public void eat() {
		System.out.println("I'm starving.");
	}
}
