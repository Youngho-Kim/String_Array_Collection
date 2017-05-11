package com.kwave.java.Fibonacci;

import java.util.ArrayList;

public class Fibonacci {
	
	
	public static void main (String[] agrs)
	{

		Fibonacci fib = new Fibonacci();
		
		fib.process(15);
		
		ArrayList<Integer> array = fib.process(15);
	for( int number : array)
	{
		System.out.println(number);
	}
	}
	
	
	// 반환 타입이 없는 함수 구현
	public void functionNoReturn()
	{
		
	}
	// 반환 타입이 있는 함수 구현
	public int functionWithReturn()
	{
		int result = 0;
		
		return result;
	}
	
	
//	public int[] process(int n)
//	{
//		int a = 0;
//		System.out.println(a);
//		int b = 1;
//		System.out.println(b);
//
//		while((a+b) <= n)
//		{
//			int c = a+b;
//			System.out.println(c);
//			a = b;
//			b = c;
//
//		}
//		
//		return result;
//		
//	}	
	
	
//	// 배열 사용으로 변경 - 정적 배열
//	public int[] process(int n)
//	{
////		int result[] = null;	// 배열 초기화시 초기값을 모른다면 Null을 사용한다.
//		int result[] = new int[100];
//		
//		int a = 0;
//		result[0] = a;
////		System.out.println(a);
//		int b = 1;
//		result[1] = b;
////		System.out.println(b);
//		int result_index = 2;
//
//		while((a+b) <= n)
//		{
//			int c = a+b;
////			System.out.println(c);
//			result[result_index] = c;
//			result_index = result_index+1;
//			a = b;
//			b = c;
//
//		}
//		
//		return result;
//		
//	}
	// 배열 사용으로 변경 - 동적 배열
	public ArrayList<Integer> process(int n)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int a = 0;
		result.add(a);
		int b = 1;
		result.add(b);	
		
		while((a+b) <= n)
		{
			int c = a+b;
//			System.out.println(c);
			result.add(c);
			a = b;
			b = c;
		}
		return result;
	}
//	
//	public int fibo(int n)
//	{
//		if(n==1||n==2)
//		{
//			return 1;	
//			
//		}
//		else
//		{
//			return fibo(n-2)+fibo(n-1);
//		}
//		
//				
//	}

	
	
	
	
	

}
