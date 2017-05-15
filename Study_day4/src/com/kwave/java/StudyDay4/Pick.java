package com.kwave.java.StudyDay4;

import java.util.Scanner;

public class Pick {

	String label;
	int value;
	
	public static final int DRAW = 0;
	public static final int USER_WIN = 1;
	public static final int COMP_WIN = 2;
	
	
	public Pick(String label) {
		this.label = label;
		calValue(label);

	}



	private void calValue(String label)
	{
		switch(label){
		case "가위" :
			value = 1;
			break;
		case "바위" :
			value = 0;
			break;
		case "보" :
			value = 2;
			break;
			default :
				System.out.println("잘못된 선택입니다.");
				Scanner scanner = new Scanner(System.in);
				calValue(scanner.nextLine());
				break;	
		}
	}
	
	public static int battle(Pick userPick,Pick compPick) {	
	int temp = userPick.value - compPick.value;
	if(temp == -1 || temp == 2){
		return USER_WIN;
	}
	else if(temp == 1 || temp == -2){
		return COMP_WIN;
	}
	else
	{
		return DRAW;
	}
	}
}
