package com.kwave.java.String;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "안녕하세요.";
		
		// 1. 글자 자르기
		//	beginIndex~EndIndex까지의 글자 출력
		// substring(beginIndex, endIndex)
		String secondWord = name.substring(1,2);
		System.out.println(secondWord);
				
		// 문자열 길이 출력
		// 변수명이나 클래스명을 한글로는 가능하나 안쓰는 것이 좋음
		int 문자열길이	= name.length();
		System.out.println(문자열길이);
		
		// charAt의 숫자 번째에 해당하는 한 글자를 출력
		char 한글자 = name.charAt(3);
		System.out.println(한글자);
		
		// indexOf에 오는 값이 몇번째에 있는지 출력
		// indexOf는 주로 String과 int를 받는 것만 사용함
		int 몇번째 = name.indexOf("하세");
		System.out.println(몇번째);
		
		// split을 기준으로 문자를 쪼개서 사용
		String 두덩이[] = name.split("하");
		System.out.println(두덩이[0]);
		System.out.println(두덩이[1]);
		
		// 첫번째에 해당하는 글자를 두번째에 해당하는 글자로 바꿔줌
		String 바뀐글 = name.replaceAll("하", "랄라라");
		System.out.println(바뀐글);
		
	}
	
	
	
	

}
