package com.kwave.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.kwave.java.collection.dommy.Student;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. List 계열
		// 내부적으로 값이 입력되면 값과 함께 순서가 저장된다.
		// .add(객체) : 값 입력
		// .get(순서) : 값 출력
		// .size() : 길이 출력
//			ArrayList<Student> list = new ArrayList<>(); // 동적계체배열
//			int a = 33;	
//			list.add(a);	// list에 a(33)를 입력
//			list.add(1234); // 제네릭을 사용하지 않는 컬렉션은 입력되는 값을 Object로 Casting한다.
//			
//			int list_Length = list.size();
			// list.size : arraylist의 길이 구하기
			
			
//			for(int i=0; i<list_Length;i++)
//			{
//				System.out.println(list.get(i));
//				// list.get : arraylist에 해당하는 값 가져오기
//			}
			
			// substring(begin,end) = string의 begin~end번째까지 출력
//		    System.out.println("안녕하세요".substring(0, 1));
//			for(int i=0; i<list_Length;i++)
//			for(int item : list)	// 향상된 for문
//			{
////				System.out.println(string.substring(0, 1));
//				String string = item + "";
//				int number = Integer.parseInt(string);
//				System.out.println(number+3);
//				// list.get : arraylist에 해당하는 값 가져오기
//			}
//			
			
//		ArrayList<Student> list = new ArrayList<>(); // 동적계체배열
//			Student a1 = new Student();
//			a1.name = "홍길동";
//			a1.age = 500;
////			System.out.println(a1.name);
////			System.out.println(a1.age);
//			list.add(a1);
//			Student a2 = new Student();
//			a2.name = "이순신";
//			a2.age = 1000;
////			System.out.println(a2.name);
////			System.out.println(a2.age);
//			list.add(a2);
//			for(Student item : list)
//			{
//				System.out.println(item.name);
//				System.out.println(item.age);
//			}
		
		
		
		
			ArrayList list = new ArrayList<>(); // 동적계체배열
			Student a1 = new Student();
			a1.name = "홍길동";
			a1.age = 500;
//			System.out.println(a1.name);
//			System.out.println(a1.age);
			list.add(a1);
			Student a2 = new Student();
			a2.name = "이순신";
			a2.age = 1000;
//			System.out.println(a2.name);
//			System.out.println(a2.age);
			list.add(a2);
			for(Object item : list)
			{
				Student std = (Student) item;
				System.out.println(std.name + " " + std.age);
			}
			
			
		// 2. Map 계열
		// - 키1 : 값, 키2 : 값  의 형태로 저장된다.
		// 키와 타입이 지정되지 않는 경우 - Object형태로 캐스팅 되어 어떤 것을 넣어도 상관없다.	
//		HashMap map = new HashMap<>();
		// 키와 값의 타입이 같은 경우	
//		HashMap<String, String> map = new HashMap<>();
//		map.put("key1", "홍길동");
//		map.put("key2", "이순신");
//		
//		System.out.println(map.get("key1"));
//		System.out.println(map.get("key2"));
		
		// 키와 값의 타입이 다른 경우	
		HashMap<String, Student> map = new HashMap<>();
		map.put("key1", a1);
		map.put("key2", a2);
		
		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));		
		
		
		// 3. Set 계열
		// List와 동작 방식이 유사하나 중복 값을 허용하지 않음
		HashSet hset = new HashSet<>();
		
		
		
	}

}
