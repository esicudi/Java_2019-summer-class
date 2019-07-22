package ch05;

import ch05_class.Monster;
import ch05_class.PlayerCharactor;

public class F04_Ä³½ºÆÃ {
	public static void main(String[] args) {
		PlayerCharactor player1=new PlayerCharactor("abc",100,10);
		PlayerCharactor player2=new PlayerCharactor("def",100,15);
		Monster slime=new Monster("slime",50,10);
		
		player1.attack(player2);
		player1.attack(slime);
	}
}
