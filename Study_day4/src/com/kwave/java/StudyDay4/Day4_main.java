package com.kwave.java.StudyDay4;

public class Day4_main {
		Pick rock = new Pick("����");
		Pick scissor = new Pick("����");
		Pick paper = new Pick("��");
		
		static Pick userPick, comPick;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		Computer computer = new Computer();
		userPick = user.showPick();
		comPick = computer.showPick();
		
		
		
		int result = Pick.battle(userPick, comPick);		
		switch(result){
		case Pick.DRAW :
			System.out.println("���");
			break;
		case Pick.USER_WIN :
			System.out.println("���");
			break;
		case Pick.COMP_WIN :
			System.out.println("���");
			break;
		}
		
		
		
		
	}

}
