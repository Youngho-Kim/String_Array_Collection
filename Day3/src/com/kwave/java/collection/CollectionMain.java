package com.kwave.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.kwave.java.collection.dommy.Student;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. List �迭
		// ���������� ���� �ԷµǸ� ���� �Բ� ������ ����ȴ�.
		// .add(��ü) : �� �Է�
		// .get(����) : �� ���
		// .size() : ���� ���
//			ArrayList<Student> list = new ArrayList<>(); // ������ü�迭
//			int a = 33;	
//			list.add(a);	// list�� a(33)�� �Է�
//			list.add(1234); // ���׸��� ������� �ʴ� �÷����� �ԷµǴ� ���� Object�� Casting�Ѵ�.
//			
//			int list_Length = list.size();
			// list.size : arraylist�� ���� ���ϱ�
			
			
//			for(int i=0; i<list_Length;i++)
//			{
//				System.out.println(list.get(i));
//				// list.get : arraylist�� �ش��ϴ� �� ��������
//			}
			
			// substring(begin,end) = string�� begin~end��°���� ���
//		    System.out.println("�ȳ��ϼ���".substring(0, 1));
//			for(int i=0; i<list_Length;i++)
//			for(int item : list)	// ���� for��
//			{
////				System.out.println(string.substring(0, 1));
//				String string = item + "";
//				int number = Integer.parseInt(string);
//				System.out.println(number+3);
//				// list.get : arraylist�� �ش��ϴ� �� ��������
//			}
//			
			
//		ArrayList<Student> list = new ArrayList<>(); // ������ü�迭
//			Student a1 = new Student();
//			a1.name = "ȫ�浿";
//			a1.age = 500;
////			System.out.println(a1.name);
////			System.out.println(a1.age);
//			list.add(a1);
//			Student a2 = new Student();
//			a2.name = "�̼���";
//			a2.age = 1000;
////			System.out.println(a2.name);
////			System.out.println(a2.age);
//			list.add(a2);
//			for(Student item : list)
//			{
//				System.out.println(item.name);
//				System.out.println(item.age);
//			}
		
		
		
		
			ArrayList list = new ArrayList<>(); // ������ü�迭
			Student a1 = new Student();
			a1.name = "ȫ�浿";
			a1.age = 500;
//			System.out.println(a1.name);
//			System.out.println(a1.age);
			list.add(a1);
			Student a2 = new Student();
			a2.name = "�̼���";
			a2.age = 1000;
//			System.out.println(a2.name);
//			System.out.println(a2.age);
			list.add(a2);
			for(Object item : list)
			{
				Student std = (Student) item;
				System.out.println(std.name + " " + std.age);
			}
			
			
		// 2. Map �迭
		// - Ű1 : ��, Ű2 : ��  �� ���·� ����ȴ�.
		// Ű�� Ÿ���� �������� �ʴ� ��� - Object���·� ĳ���� �Ǿ� � ���� �־ �������.	
//		HashMap map = new HashMap<>();
		// Ű�� ���� Ÿ���� ���� ���	
//		HashMap<String, String> map = new HashMap<>();
//		map.put("key1", "ȫ�浿");
//		map.put("key2", "�̼���");
//		
//		System.out.println(map.get("key1"));
//		System.out.println(map.get("key2"));
		
		// Ű�� ���� Ÿ���� �ٸ� ���	
		HashMap<String, Student> map = new HashMap<>();
		map.put("key1", a1);
		map.put("key2", a2);
		
		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));		
		
		
		// 3. Set �迭
		// List�� ���� ����� �����ϳ� �ߺ� ���� ������� ����
		HashSet hset = new HashSet<>();
		
		
		
	}

}
