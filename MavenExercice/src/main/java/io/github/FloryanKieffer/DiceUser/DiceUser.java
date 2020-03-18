package io.github.FloryanKieffer.DiceUser;

import io.github.FloryanKieffer.TripletOfDice.TripletOfDice;

public class DiceUser {

	private TripletOfDice threeDice;
	
	public DiceUser() {
		this.threeDice = new TripletOfDice(6,6,6);
		this.threeDice.rollAllDice();
	}
	
	public static void main(String[] args) {
		DiceUser troisDes = new DiceUser();
		troisDes.threeDice.roll(1);
		troisDes.threeDice.roll(2);
		troisDes.threeDice.roll(3);
		
		System.out.println(troisDes.threeDice.getFirstDice());
		System.out.println(troisDes.threeDice.getSecondDice());
		System.out.println(troisDes.threeDice.getThirdDice());
		
		
			

	}

}
