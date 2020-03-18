package io.github.FloryanKieffer.TripletOfDice;
import java.util.*;

public class TripletOfDice {
	
	private int des1;
	private int des2;
	private int des3;
	
	public TripletOfDice(int des1, int des2, int des3) {
		this.des1=des1;
		this.des2=des2;
		this.des3=des3;
	}
	
	public void rollAllDice(){
		
		this.des1=(int)(Math.random()*6) + 1;
		this.des2=(int)(Math.random()*6) + 1;
		this.des3=(int)(Math.random()*6) + 1;
	}
	
	public void roll(int des) {
		if(des==1) {
			this.des1=(int)(Math.random()*6) + 1;
		}
		if(des==2) {
			this.des2=(int)(Math.random()*6) + 1;
		}
		if(des==3) {
			this.des3=(int)(Math.random()*6) + 1;
		}
	}
	
	public int getFirstDice() {
		return this.des1;
	}
	public int getSecondDice() {
		return this.des2;
	}
	public int getThirdDice() {
		return this.des3;
	}
	

	public static void main(String[] args) {
		

	}

}
