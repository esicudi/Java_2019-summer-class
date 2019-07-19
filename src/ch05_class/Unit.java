package ch05_class;

public class Unit {
	public String name;
	public int hp;
	public int damage;
	
	public Unit() {
	}
	public Unit(String name) {
		this.name = name;
	}
	public Unit(int hp,int damage) {
		this.hp=hp;
		this.damage=damage;
	}
	public Unit(String name, int hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
}
