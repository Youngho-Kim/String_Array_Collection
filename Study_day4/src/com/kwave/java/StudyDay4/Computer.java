package com.kwave.java.StudyDay4;

public class Computer extends Player {

	@Override
	public Pick showPick() {
		// TODO Auto-generated method stub
		int numPick = (int) (Math.random()*3);
		
		if(numPick == 0){
			pick = new Pick("����");
		}
		else if(numPick == 1){
			pick = new Pick("����");
		}
		else if(numPick == 2){
			pick = new Pick("��");
		}
		

		return pick;
	}

	
	
}
