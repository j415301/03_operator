package com.operator.controller;

import java.util.Scanner;

public class OperatorTestHomework {
		//�⺻ ���ϱ� ���� �����
		//OperatorTestŬ������ ex_calculator()�żҵ带 ����� �� ���� ���� �Է¹޾� ���ϱ� ������ �Ͽ� ����ϱ�
		//00+00=00

	//Q. ���� �żҵ�
	public void subtraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� ���� =====");
		System.out.println("ù��° ���� �Է��Ͻÿ�.");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�.");
		int num2 = sc.nextInt();
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		
	}

	//Q. ������ �żҵ�
	public void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ������ ���� =====");
		System.out.println("ù��° ���� �Է��Ͻÿ�.");
		double num3 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�.");
		double num4 = sc.nextInt();
		System.out.println(num3+"/"+num4+"="+(num3/num4));
		
	}

	//Q. ������ �żҵ�
	public void remainder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ������ ���� =====");
		System.out.println("ù��° ���� �Է��Ͻÿ�.");
		int num5 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�.");
		int num6 = sc.nextInt();
		System.out.println(num5+"%"+num6+"="+(num5%num6));
	}
	
	//Q. �Է¹��� ���� 20���� ū�� Ȯ���ϴ� �żҵ�
	public void homeworkq4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�.");
		int age = sc.nextInt();
		System.out.println(age>20);
	}
	
	//Q. �Է¹��� ���� ������ �빮������ Ȯ���ϴ� �żҵ�
	public void homeworkq5() {
		Scanner sc = new Scanner(System.in);
		//�����ڵ� ������ �ؼ� �ҹ��� a ������ ���� �͸� ��󳻸� ��
		System.out.println("���ĺ��� �Է��Ͻÿ� (�빮���� ��� True, �ҹ����� ��� False)");
		char alpha2 = sc.next().charAt(0);
		boolean big = (int)alpha2<90;
		System.out.println(big);
		
		
	}
	
}
