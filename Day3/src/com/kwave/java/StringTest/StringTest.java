package com.kwave.java.StringTest;

public class StringTest {

	public void numberFind(int n, int m){
		int count = 0;
		for(int i=0; i<n;i++){
			String a = ""+i;
				
			int change=Integer.parseInt(a);
			if(i<10 && (change == m)){
					count++;
			}
			else if(i>=10&&i<100){
				int data_ten = change/10;
				int data = change%10;
				if(data == m)
				{
					count++;
					
				
				}
				if(data_ten == m)
				{
					count++;
					
				}
				
			}
			else if(i>=100&&i<1000){
				int data_hundred = change/100;
				int data_ten = (change/10)%10;
				int data = (change%100)%10;
				if(data == m)
				{
					count++;
				}
				if(data_ten == m)
				{
					count++;
				}
				if(data_hundred == m)
				{
					count++;
				}
			}
			else if(i>=1000&&i<10000){
				int data_thousand = change/1000;
				int data_hundred = change/100%10;
				int data_ten = ((change%1000)%100)/10;
				int data = ((change%1000)%100)%10;
				if(data == m)
				{
					count++;
				}
				if(data_ten == m)
				{
					count++;
				}
				if(data_hundred == m)
				{
					count++;
				}
				if(data_thousand == m)
				{
					count++;
				}
			}
		}
		System.out.println(count);

		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
