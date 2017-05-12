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
	
	
	
	
	// 1. �Է¹��� ���� �Ѱ��� ���� ������ �����ؼ� ����Ͻÿ�
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
	
	
	
	
	// 2. �Է¹��� ���ڷ� �ﰢ�� �����
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
	
	
	
	// 3. �Է¹��� ���ڷ� �ﰢ�� �����
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
	
	
	// 4. �Է¹��� ���ڷ� �ﰢ�� �����
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
	
	
	// 5. �Է¹��� ���ڷ� �ﰢ�� �����
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
	
	// 6. �Է¹��� ���ڷ� �ﰢ�� �����
	//    A
	//   AAA
	//  AAAAA
	// AAAAAAA
	//AAAAAAAAA
		
	public void drawRect6(String mark, int count){
		for(int i=0;i<count;i++){
			// ������� �ݺ���
			for(int j=0;j<(count-1)-i;j++){	// ������ ��ü ī��Ʈ���� �� Ȧ���� �� ���� ����Ѵ�.
					System.out.print(" ");
			}
			// ��ũ��� �ݺ���	
			for(int k=0;k<=i*2;k++)	// ��ũ�� �� ���� ���ڸ�ŭ ����Ѵ�.
			{
				System.out.print(mark);
			}
			System.out.println(" ");
		}
	}
	
	
	
	// 7. �Է¹��� ���ڷ� �ﰢ�� �����
	//    A
	//   A A
	//  A   A
	// A     A
	//A       A
		
	public void drawRect7(String mark, int count){
		for(int i=0;i<count;i++){
//			// ������� �ݺ���
//			for(int j=0;j<(count-1)-i;j++){	// ������ ��ü ī��Ʈ���� �� Ȧ���� �� ���� ����Ѵ�.
//					System.out.print(" ");
//			}
			// ��ũ��� �ݺ���	
			for(int k=0;k<=count*2;k++)	// ��ũ�� �� ���� ���ڸ�ŭ ����Ѵ�.
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


	// 7. �Է¹��� ���ڷ� �ﰢ�� �����
	//    A
	//   A A
	//  A   A
	// A     A
	//AAAAAAAAA
		
	public void drawRect8(String mark, int count){
		for(int i=0;i<count-1;i++){
//			// ������� �ݺ���
//			for(int j=0;j<(count-1)-i;j++){	// ������ ��ü ī��Ʈ���� �� Ȧ���� �� ���� ����Ѵ�.
//					System.out.print(" ");
//			}
			// ��ũ��� �ݺ���	
			for(int k=0;k<=count*2;k++)	// ��ũ�� �� ���� ���ڸ�ŭ ����Ѵ�.
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
	
	// 9. �Է¹��� ���ڷ� �ﰢ�� �����
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
			// ������� �ݺ���
			for(int j=0;j<(count-1)-i;j++){	// ������ ��ü ī��Ʈ���� �� Ȧ���� �� ���� ����Ѵ�.
					System.out.print(" ");
			}
			// ��ũ��� �ݺ���	
			for(int k=0;k<=i*2;k++)	// ��ũ�� �� ���� ���ڸ�ŭ ����Ѵ�.
			{
				System.out.print(mark);
			}
			System.out.println(" ");
		}
		for(int i=1;i<count;i++){
			// ������� �ݺ���
			for(int j=0;j<i;j++){	// ������ ��ü ī��Ʈ���� �� Ȧ���� �� ���� ����Ѵ�.
					System.out.print(" ");
			}
			// ��ũ��� �ݺ���	
			for(int k=0;k<((count*2)-1)-(i*2);k++)	// ��ũ�� �� ���� ���ڸ�ŭ ����Ѵ�.
			{
				System.out.print(mark);
			}
			System.out.println(" ");
		}
		
	}

	// 6. �Է¹��� ���ڷ� �ﰢ�� �����
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
		// �� �ﰢ��
		for(int i=0;i<count;i++){
			// ������� �ݺ���
			for(int j=0;j<(count-1)-i;j++){	// ������ ��ü ī��Ʈ���� �� Ȧ���� �� ���� ����Ѵ�.
					System.out.print(" ");
			}
			// ��ũ��� �ݺ���	
			for(int k=0;k<=i*2;k++)	// ��ũ�� �� ���� ���ڸ�ŭ ����Ѵ�.
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
		// �Ʒ� �ﰢ��
		for(int i=1;i<count;i++){
			// ������� �ݺ���
			for(int j=0;j<i;j++){	// ������ ��ü ī��Ʈ���� �� Ȧ���� �� ���� ����Ѵ�.
					System.out.print(" ");
			}
			// ��ũ��� �ݺ���	
			for(int k=0;k<((count*2)-1)-(i*2);k++)	// ��ũ�� �� ���� ���ڸ�ŭ ����Ѵ�.
			{
				System.out.print(mark);
			}
			System.out.println(" ");
		}
	}
	
	
	// 11. �Է¹��� ���ڷ� �ﰢ�� �����
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
		// �� �ﰢ��
		for(int i=0;i<count;i++){
//			// ������� �ݺ���
//			for(int j=0;j<(count-1)-i;j++){	// ������ ��ü ī��Ʈ���� �� Ȧ���� �� ���� ����Ѵ�.
//					System.out.print(" ");
//			}
			// ��ũ��� �ݺ���	
			for(int k=0;k<=count*2;k++)	// ��ũ�� �� ���� ���ڸ�ŭ ����Ѵ�.
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
		
		// �Ʒ� �ﰢ��
		for(int i=count;i>=0;i--){
//			// ������� �ݺ���
//			for(int j=0;j<(count-1)-i;j++){	// ������ ��ü ī��Ʈ���� �� Ȧ���� �� ���� ����Ѵ�.
//					System.out.print(" ");
//			}
			// ��ũ��� �ݺ���	
			for(int k=0;k<=count*2;k++)	// ��ũ�� �� ���� ���ڸ�ŭ ����Ѵ�.
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
