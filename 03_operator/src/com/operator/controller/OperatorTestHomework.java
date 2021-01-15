package com.operator.controller;

import java.util.Scanner;

public class OperatorTestHomework {
		//기본 더하기 계산기 만들기
		//OperatorTest클래스에 ex_calculator()매소드를 만들고 두 개의 값을 입력받아 더하기 연산을 하여 출력하기
		//00+00=00

	//Q. 빼기 매소드
	public void subtraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 빼기 계산기 =====");
		System.out.println("첫번째 값을 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("두번째 값을 입력하시오.");
		int num2 = sc.nextInt();
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		
	}

	//Q. 나누기 매소드
	public void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 나누기 계산기 =====");
		System.out.println("첫번째 값을 입력하시오.");
		double num3 = sc.nextInt();
		System.out.println("두번째 값을 입력하시오.");
		double num4 = sc.nextInt();
		System.out.println(num3+"/"+num4+"="+(num3/num4));
		
	}

	//Q. 나머지 매소드
	public void remainder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 나머지 계산기 =====");
		System.out.println("첫번째 값을 입력하시오.");
		int num5 = sc.nextInt();
		System.out.println("두번째 값을 입력하시오.");
		int num6 = sc.nextInt();
		System.out.println(num5+"%"+num6+"="+(num5%num6));
	}
	
	//Q. 입력받은 값이 20보다 큰지 확인하는 매소드
	public void homeworkq4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하시오.");
		int age = sc.nextInt();
		System.out.println(age>20);
	}
	
	//Q. 입력받은 값이 영문자 대문자인지 확인하는 매소드
	public void homeworkq5() {
		Scanner sc = new Scanner(System.in);
		//유니코드 값으로 해서 소문자 a 값보다 작은 것만 골라내면 됨
		System.out.println("알파벳을 입력하시오 (대문자일 경우 True, 소문자일 경우 False)");
		char alpha2 = sc.next().charAt(0);
		boolean big = (int)alpha2<90;
		System.out.println(big);
		
		
	}
	
}
