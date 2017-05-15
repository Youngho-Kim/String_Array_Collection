package com.kwave.java.StudyDay4;

import java.util.Scanner;

public class User extends Player {

//	@Override
//	public Pick showPick() {
//		// TODO Auto-generated method stub
//		return super.showPick();
//	}

	public Pick showPick(){
		Scanner scanner = new Scanner(System.in);
		String strPick = scanner.nextLine();
		pick = new Pick(strPick);
		
		return pick;
		
	}
	
	
}
