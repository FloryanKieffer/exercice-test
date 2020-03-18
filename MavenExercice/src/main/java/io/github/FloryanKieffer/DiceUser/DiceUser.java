package io.github.FloryanKieffer.DiceUser;

import io.github.FloryanKieffer.TripletOfDice.TripletOfDice;

public class DiceUser {

	private TripletOfDice threeDice;
	
	public TripletOfDice DiceUser() {
		this.threeDice = new TripletOfDice(6,6,6);
		this.threeDice.rollAllDice();
		return this.threeDice;
	}
	
	public static void main(String[] args) {
		DiceUser troisDes = new DiceUser();
		troisDes.threeDice.getFirstDice()
			

	}

}
