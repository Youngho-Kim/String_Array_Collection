package com.kwave.java.String;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "�ȳ��ϼ���.";
		
		// 1. ���� �ڸ���
		//	beginIndex~EndIndex������ ���� ���
		// substring(beginIndex, endIndex)
		String secondWord = name.substring(1,2);
		System.out.println(secondWord);
				
		// ���ڿ� ���� ���
		// �������̳� Ŭ�������� �ѱ۷δ� �����ϳ� �Ⱦ��� ���� ����
		int ���ڿ�����	= name.length();
		System.out.println(���ڿ�����);
		
		// charAt�� ���� ��°�� �ش��ϴ� �� ���ڸ� ���
		char �ѱ��� = name.charAt(3);
		System.out.println(�ѱ���);
		
		// indexOf�� ���� ���� ���°�� �ִ��� ���
		// indexOf�� �ַ� String�� int�� �޴� �͸� �����
		int ���° = name.indexOf("�ϼ�");
		System.out.println(���°);
		
		// split�� �������� ���ڸ� �ɰ��� ���
		String �ε���[] = name.split("��");
		System.out.println(�ε���[0]);
		System.out.println(�ε���[1]);
		
		// ù��°�� �ش��ϴ� ���ڸ� �ι�°�� �ش��ϴ� ���ڷ� �ٲ���
		String �ٲ�� = name.replaceAll("��", "�����");
		System.out.println(�ٲ��);
		
	}
	
	
	
	

}
