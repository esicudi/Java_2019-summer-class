package ch05_class;
/*
 * 특성,메소드 몬스터와 동일
 */
public class PlayerCharactor extends Unit{
	public PlayerCharactor() {}
	public PlayerCharactor(String name,int hp,int damage) {
		super(name,hp,damage);
	}
	
	public void attack(Unit u) {
		u.setHP(damage,this);
		System.out.println(this.name+"이 "+u.name+"을(를) 공격했습니다");
	}
	@Override
	public void setHP(int damage,Unit u) {
		super.setHP(damage,u);
		if(hp<=0) {
			if(u instanceof Monster) {
				System.out.println("경험치 삭감");
			}
			else if(u instanceof PlayerCharactor) {
				System.out.println("아이템 강탈");
			}
		}
		else {
			System.out.println("위험");
		}
	}
	public void setXP(int xp) {
		
	}
	
}
