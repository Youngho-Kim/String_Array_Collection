package com.kwave.java.DrawPoly;

public class DrawMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrawMain main = new DrawMain();
		
//		main.drawRect("A", 5);	//1
//		main.drawRect2("A", 5);	//2
//		main.drawRect3("A", 5);	//3
//		main.drawRect4("A", 5);	//4
//		main.drawRect5("A", 5);	//5
//		main.drawRect6("A", 5);	//6
//		main.drawRect7("A", 5);	//7
//		main.drawRect8("A", 5);	//8
//		main.drawRect9("A", 5);	//9
//		main.drawRect10("A", 5);//10
		main.drawRect11("A", 5);//10
		
			
	}
	
	
	
	
	// 1. 입력받은 문자 한개를 세로 개수를 지정해서 출력하시오
	// 'A' , 5
	//AAAAA
	//AAAAA
	//AAAAA
	//AAAAA
	//AAAAA
	//AAAAA
	
	public void drawRect(String mark, int count){
		for(int i=0;i<count;i++){
			for(int j=0;j<=count;j++){
				System.out.print(mark);
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	
	
	
	// 2. 입력받은 문자로 삼각형 만들기
	//A
	//AA
	//AAA
	//AAAA
	//AAAAA
		
	public void drawRect2(String mark, int count){
		for(int i=0;i<count;i++){
			for(int j=0;j<=i;j++){
			System.out.print(mark);
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	
	
	// 3. 입력받은 문자로 삼각형 만들기
	//    A
	//   AA
	//  AAA
	// AAAA
	//AAAAA
		
	public void drawRect3(String mark, int count){
		for(int i=count;i>0;i--){
			for(int j=0;j<count;j++){
				
				if(j>=(i-1))	
				{
					System.out.print(mark);
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.println(" ");
		}
	}	
	
	
	// 4. 입력받은 문자로 삼각형 만들기
	//AAAAA
	//AAAA
	//AAA
	//AA
	//A
		
	public void drawRect4(String mark, int count){
		for(int i=count;i>0;i--){
			for(int j=0;j<count;j++){
				
				if(j<=(i-1))	
				{
					System.out.print(mark);
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.println(" ");
		}
	}	
	
	
	// 5. 입력받은 문자로 삼각형 만들기
	//AAAAA
	// AAAA
	//  AAA
	//   AA
	//    A
		
	public void drawRect5(String mark, int count){
		for(int i=0;i<=count;i++){
			for(int j=0;j<=count;j++){
				
				if(j>=(i+1))	
				{
					System.out.print(mark);
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.println(" ");
		}
	}	
	
	// 6. 입력받은 문자로 삼각형 만들기
	//    A
	//   AAA
	//  AAAAA
	// AAAAAAA
	//AAAAAAAAA
		
	public void drawRect6(String mark, int count){
		for(int i=0;i<count;i++){
			// 공백찍는 반복문
			for(int j=0;j<(count-1)-i;j++){	// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
					System.out.print(" ");
			}
			// 마크찍는 반복문	
			for(int k=0;k<=i*2;k++)	// 마크는 각 줄의 숫자만큼 출력한다.
			{
				System.out.print(mark);
			}
			System.out.println(" ");
		}
	}
	
	
	
	// 7. 입력받은 문자로 삼각형 만들기
	//    A
	//   A A
	//  A   A
	// A     A
	//A       A
		
	public void drawRect7(String mark, int count){
		for(int i=0;i<count;i++){
//			// 공백찍는 반복문
//			for(int j=0;j<(count-1)-i;j++){	// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
//					System.out.print(" ");
//			}
			// 마크찍는 반복문	
			for(int k=0;k<=count*2;k++)	// 마크는 각 줄의 숫자만큼 출력한다.
			{
				if((k==(count-i))||(k==(count+i)))
				{
					System.out.print(mark);
				}
				else
				{					
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}	


	// 7. 입력받은 문자로 삼각형 만들기
	//    A
	//   A A
	//  A   A
	// A     A
	//AAAAAAAAA
		
	public void drawRect8(String mark, int count){
		for(int i=0;i<count-1;i++){
//			// 공백찍는 반복문
//			for(int j=0;j<(count-1)-i;j++){	// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
//					System.out.print(" ");
//			}
			// 마크찍는 반복문	
			for(int k=0;k<=count*2;k++)	// 마크는 각 줄의 숫자만큼 출력한다.
			{
				if((k==(count-i))||(k==(count+i)))
				{
					System.out.print(mark);
				}
				else
				{					
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.print(" ");
		
		for(int a=0;a<(count*2-1);a++){
			System.out.print(mark);
		}
	}	
	
	// 9. 입력받은 문자로 삼각형 만들기
	//    A
	//   AAA
	//  AAAAA
	// AAAAAAA
	//AAAAAAAAA
	// AAAAAAA
	//  AAAAA
	//   AAA
	//    A
		
	public void drawRect9(String mark, int count){
		for(int i=0;i<count;i++){
			// 공백찍는 반복문
			for(int j=0;j<(count-1)-i;j++){	// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
					System.out.print(" ");
			}
			// 마크찍는 반복문	
			for(int k=0;k<=i*2;k++)	// 마크는 각 줄의 숫자만큼 출력한다.
			{
				System.out.print(mark);
			}
			System.out.println(" ");
		}
		for(int i=1;i<count;i++){
			// 공백찍는 반복문
			for(int j=0;j<i;j++){	// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
					System.out.print(" ");
			}
			// 마크찍는 반복문	
			for(int k=0;k<((count*2)-1)-(i*2);k++)	// 마크는 각 줄의 숫자만큼 출력한다.
			{
				System.out.print(mark);
			}
			System.out.println(" ");
		}
		
	}

	// 6. 입력받은 문자로 삼각형 만들기
	//    A
	//   A A
	//  A A A
	// A A A A
	//A A A A A
	// AAAAAAA
	//  AAAAA
	//   AAA
	//    A
		
	public void drawRect10(String mark, int count){
		// 위 삼각형
		for(int i=0;i<count;i++){
			// 공백찍는 반복문
			for(int j=0;j<(count-1)-i;j++){	// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
					System.out.print(" ");
			}
			// 마크찍는 반복문	
			for(int k=0;k<=i*2;k++)	// 마크는 각 줄의 숫자만큼 출력한다.
			{
				if(k>0)
				{
					if(k%2==1)
					{
						System.out.print(mark);
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(k==0)
				{
					System.out.print(mark);
					if(k%2==1)
					{
						System.out.print(mark);
					}
					else
					{
						System.out.print(" ");
					}
				}	
					
			}
			System.out.println(" ");
		}
		// 아래 삼각형
		for(int i=1;i<count;i++){
			// 공백찍는 반복문
			for(int j=0;j<i;j++){	// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
					System.out.print(" ");
			}
			// 마크찍는 반복문	
			for(int k=0;k<((count*2)-1)-(i*2);k++)	// 마크는 각 줄의 숫자만큼 출력한다.
			{
				System.out.print(mark);
			}
			System.out.println(" ");
		}
	}
	
	
	// 11. 입력받은 문자로 삼각형 만들기
	//    A
	//   A A
	//  A   A
	// A     A
	//A       A
	// A     A
	//  A   A
	//   A A
	//    A
		
	public void drawRect11(String mark, int count){
		// 위 삼각형
		for(int i=0;i<count;i++){
//			// 공백찍는 반복문
//			for(int j=0;j<(count-1)-i;j++){	// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
//					System.out.print(" ");
//			}
			// 마크찍는 반복문	
			for(int k=0;k<=count*2;k++)	// 마크는 각 줄의 숫자만큼 출력한다.
			{
				if((k==(count-i))||(k==(count+i)))
				{
					System.out.print(mark);
				}
				else
				{					
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		// 아래 삼각형
		for(int i=count;i>=0;i--){
//			// 공백찍는 반복문
//			for(int j=0;j<(count-1)-i;j++){	// 공백은 전체 카운트에서 각 홀수를 뺀 값을 출력한다.
//					System.out.print(" ");
//			}
			// 마크찍는 반복문	
			for(int k=0;k<=count*2;k++)	// 마크는 각 줄의 숫자만큼 출력한다.
			{
				if((k==(count-i))||(k==(count+i)))
				{
					System.out.print(mark);
				}
				else
				{					
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}	
}
