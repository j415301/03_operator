package com.operator.main;
import com.operator.controller.OperatorTestHomework;

public class RunHomework {
	
	public static void main(String[] args) {
		
		//Q. 빼기 매소드
		new OperatorTestHomework().subtraction();//꼭 클래스명 쓰고 매소드 쓰기
		
		//Q. 나누기 매소드
		new OperatorTestHomework().division();
		
		//Q. 나머지 매소드
		new OperatorTestHomework().remainder();
		
		//Q. 입력받은 값이 20보다 큰지 확인하는 매소드
		new OperatorTestHomework().homeworkq4();
		
		//Q. 입력받은 값이 영문자 대문자인지 확인하는 매소드
		new OperatorTestHomework().homeworkq5();
		
	
		
	}

}
