package com.operator.controller;

import java.util.Scanner;

public class OperatorTest {
	
	//���׿��� �׽�Ʈ
	public void singleOp() {
		
		
		//�������� !: �������� ������Ű�� ����
		boolean flag = true;
		System.out.println(flag);//true
		boolean flag2 = !flag;
		System.out.println(flag2);//false
		System.out.println(!flag);//false
		//���������� �񱳿���, ������ ����� ������ ��, ���(�żҵ�)���� ����ϴ� ������ ������ų �� ���� �����
		
		
		//��������: �ڱ��ڽ�(������ ��)�� 1 ������Ű�� ����
		//���������� ���길 �ϴ� �� �ƴ�, �޸𸮿� �ִ� ���� �����Ͽ� ������
		//for��, �������� �� ���� �� ���
		//��������: ++ (����������, ���ڰ��� ������)
		int num = 10;
		num++;//='num=num+1'
		num++;
		num++;
		num++;
		System.out.println("num: "+num);
		
		//���ҿ���: --
		num--;
		num--;
		num--;
		num--;
		num--;
		System.out.println("num: "+num);
		
		//������������ ��ġ�� ������ ��, �ڿ� �� ����
		int num1 = 100;
		++num1;
		System.out.println(num1);
		
		//��, �� ��ġ�� ���̴�? �ٸ� ����� ���� ����Ǹ� ���̰� ��
		//��������: �ٸ� ���� �켱 ���� �� ����
		int num2=10;
		int result=num2++;
		System.out.println(result);//10, why? �������� �켱������ =�� �����̹Ƿ� ++�� �Ǳ� �� ���Կ��� �����
		System.out.println(num2);//11, why? result�� 10�� �� �� num2�� ���������� �Ǿ� num2�� 11�� ��
		
		//���� ����: ���� ���� �� �ٸ� ���� ����
		int num3 = 10;
		int result2 = ++num3;
		System.out.println(result2);//11
		System.out.println(num3);//11		
		
	}
	
	public void Calculator() {
		
		
		//�������: +, -, *, /, %
		//+
		int num = 10;
		int num2 = 20;
		System.out.println("���ͷ� �̿�: "+10+20);
		System.out.println("���� �̿�: "+num+num2);
		int result = num+num2;
		System.out.println(num+"+"+num2+"="+result);
		
		//-
		result=num-num2;
		System.out.println(num+"-"+num2+"="+result);
		
		//*
		result=num*num2;
		System.out.println(num+"*"+num2+"="+result);
		
		///	
		int num3=5;
		int num4=9;
		System.out.println(num3/num4);//0, why? ��°��� int�̱� ������ ���������� ��µ�
		System.out.println((double)num3/num4);
		System.out.println((double)(num3/num4));//0.0 why? �ֿ켱 �������� () �ȿ� ��������� �����ϹǷ� 0�� double�� ����ȯ�ص� �״�� 0��
		//�� �ڷᰡ ������ �ִ��� �ڷ������� ���� �����ؾ� �սǰ� ���� ���� ����
		
		//%
		System.out.println("������ ����: "+num3%num4);
		System.out.println("������ ����: "+5%3);
		//���� 3�� ������� Ȯ���ϱ�
		//���� ¦������ Ȧ������ Ȯ���ϱ�
		
	}
	
	//�⺻ ���ϱ� ���� �����
	//OperatorTestŬ������ ex_calculator()�żҵ带 ����� �� ���� ���� �Է¹޾� ���ϱ� ������ �Ͽ� ����ϱ�
	//00+00=00
	
	public void Ex_calculator() {
		Scanner sc = new Scanner (System.in);
		System.out.println("num1���� �Է��Ͻÿ�.");
		int num1 = sc.nextInt();
		System.out.println("num2���� �Է��Ͻÿ�.");
		int num2 = sc.nextInt();
		int result = num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		
	}
	
	//�񱳿����� Ȯ���ϱ�
	public void compareOp() {
		//��Һ� ������: ���� ũ�⸦ ���ϴ� ������
		int age = 19;
		int age2 = 27;
		int age3=27;
		//����||���ͷ� < ����||���ͷ�
		boolean result = age<age2;//age�� age2���� �۴�?
		System.out.println(result);
		result=age>age2;
		System.out.println(result);
		result=age2>age3;
		System.out.println(result);
		result=age2>=age3;
		System.out.println(result);
		
		//����(char)�� ���� ��Һ�
		//���ڴ� ��� �����ڵ�� �Ǿ��ֱ� ������ ��Һ񱳰� �����ϴ�
		System.out.println('a'>'b');
		char ch1='A';
		char ch2='C';
		System.out.println(ch1<ch2);
		System.out.println((int)ch1);
		
		//���̸� �Է¹ް� 19�� �ʰ����� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��Ͻÿ�.");
		int age1 = sc.nextInt();
		System.out.println(age1>19);
		
		//����� ������: ����, ������ ��ġ ���� �Ǵ�! ���ڿ���???
		System.out.println("======= ����� =======");
		int num =20;
		System.out.println(num==10);
		System.out.println(num==20);
		System.out.println(num==age1);
		System.out.println(ch1=='A');
		
		System.out.println("======= ���ڿ��� ���ϴ� ����? =======");
		String msg="���� ���� �������";
		String msg2="���� ���� �������";
		System.out.println(msg==msg2);//msg, msg2�� ���� �ּҿ� ���ڿ��� �����ǹǷ� ����� �� true�� ����
		
		String msg3 = new String("���� ���� �������");
		System.out.println(msg);
		System.out.println(msg3);
		System.out.println(msg==msg3);//msg3�� �ٸ� �ּҿ� ���ڿ��� �����ǹǷ� false�� ����
		//���ڿ��� �⺻ �ڷ����� �ƴ� ������ Ŭ����!! ���� ���� �� ���� ��ü�� �ƴ� ���ڿ��� �ּҰ��� ���ϰ� ��
		//���ڿ��� ����� ���: ���ڿ�.equals(�񱳹���);
		System.out.println(msg.equals(msg3));//true
		System.out.println(msg2.equals(msg3));//true
		
		System.out.println("���̵�");
		String id = sc.next();
		System.out.println(id.equals("admin"));
		
		//���ڿ� ����� �����ϱ� -> ��ġ���� �ʴ�
		System.out.println("����� ����");
		System.out.println(!id.equals("admin"));
		
		//���ڿ�(��ü)�� ������ ����񱳺���(��ġ���� ����?): !=
		int num1=20;
		int num2=30;
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
	
	}
	public void logiccompare() {
		//�Ϲ� ������
		//AND(a&&b): a, b�� ��� true�� �� true
		//OR(||): a �Ǵ� b�� true�� �� true
		
		//��� ���� �����̰� �̸��� �������� ���
		String name = "������";
		String address = "�����";
		String name2="����ä";
		String address2 ="�����";
		System.out.println(name.equals("������")&&address.equals("�����"));//true
		System.out.println(name2.equals("������")&&address2.equals("�����"));//false
		
		//���̰� 20���� ����� ���Ͻÿ�
		//20<=age<=29
		int age = 28;
		System.out.println(20<=age&&age<=29);
		
//		if(20<=age&&age<=29) {
//			System.out.println("20���Դϴ�! ȣȪ!");
//		}
		
		//���̵� admin�̰� password�� 1234�̸� id, password �Է¹޾� ó��
		Scanner sc = new Scanner(System.in);
		System.out.println("id: ");
		String id = sc.next();
		System.out.println("password: ");
		String password = sc.next();
		if(id.equals("admin")&&password.equals("1234")) {
			System.out.println("id: "+id+"\t password: "+password);
			
		}
		
		//����� ���̰� 10���̸鼭 ������ ������ ���
		//����, ����(char)
		System.out.println("===================");
		System.out.println("����: ");
		int age1 = sc.nextInt();
		System.out.println("����: ");
		char gender = sc.next().charAt(0);
		System.out.println(10<=age1&&age1<=19&&gender=='��');
		
		//�Է¹��� �ּ����� ��⵵�� �������� ���
		System.out.println("================");
		System.out.println("�ּ���: ");
		String addr = sc.next();
		System.out.println(addr.equals("��⵵")||addr.equals("������"));
		
		//��� ���� ���ֳ� �����̰� ���̰� 30���̸鼭 ������ ���
		System.out.println("=================");
		System.out.println("�ּ���: ");
		String addr2 = sc.next();
		System.out.println("����: ");
		int age2 = sc.nextInt();
		System.out.println("����: ");
		char gender2 = sc.next().charAt(0);
		System.out.println((addr2.equals("����")||addr2.equals("����"))&&(30<=age2&&age2<40)&&gender2=='��');
		// ||�� &&���� ������ �켱������ �����Ƿ� �׻� �����ؼ� ����ؾ� ��!!!
		
	}
	
	public void complexOp() {
		//���� ���� ������: ������ �ִ� ���� Ư�� ������ �� �� �ٽ� �����ϴ� ������
		
		int su = 100;
		//su++;//su=su+1
		//+=: ����+=�� -> ����=����+��
		su+=200;
		System.out.println(su);//300
		su+=100;
		su+=300;
		System.out.println(su);//700
		
		//�����հ� ��� ����
		int total=0;//�ܰ� �����
		total+=100000;
		total+=200000;
		System.out.println("�ܰ�: "+total);//300000
		
		//12:10~18
		//���ڿ� ��������: ���ڿ�+���ڿ� -> ���տ���
		String msg ="";
		msg+="�ȳ��ϼ���";//msg=msg+"�ȳ��ϼ���";
		msg+="<html>";
		msg+="<body>";
		msg+="<h1>�ȳ��ϼ���</h1>";
		System.out.println(msg);//�ȳ��ϼ���<html><body><h1>�ȳ��ϼ���</h1>
		
		//����ڿ��� 5�� �Է��� �ް� �Է¹��� ��� ���� �� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�޼����Է�: ");
		String message=sc.nextLine();
		System.out.println("�޼����Է�: ");
		message+=sc.nextLine();
		System.out.println("�޼����Է�: ");
		message+=sc.nextLine();
		System.out.println("�޼����Է�: ");
		message+=sc.nextLine();
		System.out.println("�޼����Է�: ");
		message+=sc.nextLine();
		System.out.println(message);
		
	}

	//���׿����� �ǽ�
	public void thirdOp() {
		//���׿�����: ���ǽĿ� ���� ����Ǵ� ������ �����ϴ� ����
		//���� ���: ���ǹ�? true�� �� ����� ���� : false�� �� ����� ����
		//�ܵ����� ��� �Ұ�, ������ �޾��ְų� sysout ������ ���� �� �ؾ� �� �� ����
		int su = 10;
		
		//su�� 10�̸� 10�̰� ���, su�� 10�� �ƴϸ� 10�� �ƴϴ� ���
		String msg = su == 10? "10�̴�." : "10�� �ƴϴ�.";
		System.out.println(msg);
		//=System.out.println(su==10? "10�̴�." : "10�� �ƴϴ�");
		
		//���ڸ� �Է¹޾� 100���� ū ���� ��� ũ�� ��� �ƴϸ� ���� �۴� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("���ڸ� �Է����ּ���.");
		int num = sc.nextInt();
		System.out.println(num>=100?"��� ũ��":"���� �۴�");
		
		//���̸� �Է¹޾� �̼����̸� �����ϼ���, �ƴϸ� ��������
		System.out.println("===================");
		System.out.println("����: ");
		int age = sc.nextInt();
		System.out.println(age<20?"�����ϼ���":"��������");
		
		//�л����θ� �Է¹޾� kh�л��̸� �ڵ��ϼ���, �ƴϸ� ����ϼ���
		System.out.println("================");
		System.out.println("kh�л��ΰ���? Y/N");
		char answer = sc.next().charAt(0);
		System.out.println(answer=='Y'?"�ڵ��ϼ���":"����ϼ���");
		
		//���׿����� �ȿ� ���׿����� �� �ۼ� ����
		//�̼������� Ȯ���ϰ�, �̼����� �ƴϰ� ���ڸ� �������� ������, �ƴϸ� ���������� ������
		//�̼����̸� ���� �� �԰� ��
		System.out.println("================");
		System.out.println("�̼������Դϱ�? Y/N");
		char minor = sc.next().charAt(0);
		System.out.println("����: (M/F)");
		char gender = sc.next().charAt(0);
		System.out.println(minor=='Y'?"���� �� �԰� ��":gender=='M'?"�������� ������":"���������� ������");
		
	}
	
	//��Ʈ���� �ǽ�
	public void bitOp() {
		//��Ʈ���� �����ϱ�
		//����ҿ� �ִ� ��Ʈ������ ������ �ǹ���
		// A&B: AND
		// A|B: OR
		// A^B(XOR): �� ���� �ٸ��� 1, ������ 0
		// ~A: ��Ʈ ����
		int a=10, b=22;
		String basic="";
		//�żҵ� ���� �ȿ� �ִ� ������ ���� ������� �ϰ�, ������ ������� ���� ���� �� ������ �Է��� �ʱ�ȭ���־�� ��
		for(int i=0;i<32;i++) {
			basic+="0";
		}
		String bit=basic+Integer.toBinaryString(a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": a ��Ʈ��");
		
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": b ��Ʈ��");
		
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": a&b����");
		
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": a|b ��Ʈ��");
		
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": a^b ��Ʈ��");
		
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": ~a ��Ʈ��");
		
		
		
	}
	
}
