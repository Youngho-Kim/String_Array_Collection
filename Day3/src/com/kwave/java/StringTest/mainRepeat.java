package com.kwave.java.StringTest;


public class mainRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringTest stringtest = new StringTest();
//		stringtest.numberFind(10000, 8);
//		
		mainRepeat main_1 = new mainRepeat();
		System.out.println("10,000까지의 8의 개수는 = " + main_1.count(10000,8));
		
	}

	
//	public  int count(int limit, int target)
//	{
//		int result = 0;
//		String unit = target + "";	//8
//		
//		for(int i = 0; i<=limit; i++)	//1828
//		{
//			String temp = i + "";		//1828
//			int temp_length = temp.length();	//4
//			for(int j = 0; j<temp_length; j++){	//4바퀴
//				
//				String one = temp.charAt(j)+"";	// j=0일 경우 one = "1"
//												// j=1일 경우 one = "8"
//				if(unit.equals(one)){		
//					result +=1;
//				}
//			}	
//		}
//		return result; 
//	}
//	
	
	
	
	public  int count(int limit, int target)
	{
		int result = 0;
		String unit = target + "";
		
		for(int i = 0; i<=limit; i++)	
		{
			String temp = i + "";		
			String array[] = temp.split("");	
			// 공백문자로 split을 하면 한글자 단위로 분해해서 반환한다.
			for(String item : array){	
				if(item.equals(unit)){		
					result +=1;
				}
			}	
		}
		return result; 
	}
}
