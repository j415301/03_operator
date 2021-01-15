package com.operator.controller;

import java.util.Scanner;

public class OperatorTest {
	
	//단항연산 테스트
	public void singleOp() {
		
		
		//부정연산 !: 진위형을 반전시키는 연산
		boolean flag = true;
		System.out.println(flag);//true
		boolean flag2 = !flag;
		System.out.println(flag2);//false
		System.out.println(!flag);//false
		//부정연산은 비교연산, 논리연산 결과를 부정할 때, 기능(매소드)에서 출력하는 논리값을 부정시킬 때 많이 사용함
		
		
		//증감연산: 자기자신(변수의 값)을 1 증감시키는 연산
		//증감연산은 연산만 하는 게 아닌, 메모리에 있는 값을 연산하여 수정함
		//for문, 누적갯수 등 연산 시 사용
		//증가연산: ++ (산술계산으로, 숫자값을 연산함)
		int num = 10;
		num++;//='num=num+1'
		num++;
		num++;
		num++;
		System.out.println("num: "+num);
		
		//감소연산: --
		num--;
		num--;
		num--;
		num--;
		num--;
		System.out.println("num: "+num);
		
		//증감연산자의 위치는 변수의 앞, 뒤에 다 가능
		int num1 = 100;
		++num1;
		System.out.println(num1);
		
		//앞, 뒤 위치의 차이는? 다른 연산과 같이 실행되면 차이가 남
		//후위연산: 다른 연산 우선 실행 후 연산
		int num2=10;
		int result=num2++;
		System.out.println(result);//10, why? 연산자의 우선순위가 =이 먼저이므로 ++이 되기 전 대입연산 실행됨
		System.out.println(num2);//11, why? result에 10이 들어간 후 num2에 증가연산이 되어 num2는 11이 됨
		
		//전위 연산: 먼저 연산 후 다른 연산 실행
		int num3 = 10;
		int result2 = ++num3;
		System.out.println(result2);//11
		System.out.println(num3);//11		
		
	}
	
	public void Calculator() {
		
		
		//산술연산: +, -, *, /, %
		//+
		int num = 10;
		int num2 = 20;
		System.out.println("리터럴 이용: "+10+20);
		System.out.println("변수 이용: "+num+num2);
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
		System.out.println(num3/num4);//0, why? 출력값이 int이기 때문에 정수형으로 출력됨
		System.out.println((double)num3/num4);
		System.out.println((double)(num3/num4));//0.0 why? 최우선 연산자인 () 안에 나누기부터 실행하므로 0을 double로 형변환해도 그대로 0임
		//이 자료가 가지는 최대의 자료형으로 값을 보관해야 손실값 없이 저장 가능
		
		//%
		System.out.println("나머지 연산: "+num3%num4);
		System.out.println("나머지 연산: "+5%3);
		//수가 3의 배수인지 확인하기
		//수가 짝수인지 홀수인지 확인하기
		
	}
	
	//기본 더하기 계산기 만들기
	//OperatorTest클래스에 ex_calculator()매소드를 만들고 두 개의 값을 입력받아 더하기 연산을 하여 출력하기
	//00+00=00
	
	public void Ex_calculator() {
		Scanner sc = new Scanner (System.in);
		System.out.println("num1값을 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("num2값을 입력하시오.");
		int num2 = sc.nextInt();
		int result = num1+num2;
		System.out.println(num1+"+"+num2+"="+result);
		
	}
	
	//비교연산자 확인하기
	public void compareOp() {
		//대소비교 연산자: 수의 크기를 비교하는 연산자
		int age = 19;
		int age2 = 27;
		int age3=27;
		//변수||리터럴 < 변수||리터럴
		boolean result = age<age2;//age가 age2보다 작니?
		System.out.println(result);
		result=age>age2;
		System.out.println(result);
		result=age2>age3;
		System.out.println(result);
		result=age2>=age3;
		System.out.println(result);
		
		//문자(char)에 대한 대소비교
		//문자는 모두 유니코드로 되어있기 때문에 대소비교가 가능하다
		System.out.println('a'>'b');
		char ch1='A';
		char ch2='C';
		System.out.println(ch1<ch2);
		System.out.println((int)ch1);
		
		//나이를 입력받고 19세 초과인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하시오.");
		int age1 = sc.nextInt();
		System.out.println(age1>19);
		
		//동등비교 연산자: 숫자, 문자의 일치 여부 판단! 문자열은???
		System.out.println("======= 동등비교 =======");
		int num =20;
		System.out.println(num==10);
		System.out.println(num==20);
		System.out.println(num==age1);
		System.out.println(ch1=='A');
		
		System.out.println("======= 문자열을 비교하는 것은? =======");
		String msg="오늘 수업 여기까지";
		String msg2="오늘 수업 여기까지";
		System.out.println(msg==msg2);//msg, msg2은 같은 주소에 문자열이 생성되므로 동등비교 시 true가 나옴
		
		String msg3 = new String("오늘 수업 여기까지");
		System.out.println(msg);
		System.out.println(msg3);
		System.out.println(msg==msg3);//msg3은 다른 주소에 문자열이 생성되므로 false가 나옴
		//문자열은 기본 자료형이 아닌 참조형 클래스!! 따라서 비교할 때 문자 자체가 아닌 문자열의 주소값을 비교하게 됨
		//문자열의 동등비교 방법: 문자열.equals(비교문자);
		System.out.println(msg.equals(msg3));//true
		System.out.println(msg2.equals(msg3));//true
		
		System.out.println("아이디");
		String id = sc.next();
		System.out.println(id.equals("admin"));
		
		//문자열 동등비교 부정하기 -> 일치하지 않니
		System.out.println("동등비교 부정");
		System.out.println(!id.equals("admin"));
		
		//문자열(객체)를 제외한 동등비교부정(일치하지 않지?): !=
		int num1=20;
		int num2=30;
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
	
	}
	public void logiccompare() {
		//일반 논리연산
		//AND(a&&b): a, b가 모두 true일 때 true
		//OR(||): a 또는 b가 true일 때 true
		
		//사는 곳이 시흥이고 이름이 유병승인 사람
		String name = "유병승";
		String address = "시흥시";
		String name2="정인채";
		String address2 ="시흥시";
		System.out.println(name.equals("유병승")&&address.equals("시흥시"));//true
		System.out.println(name2.equals("유병승")&&address2.equals("시흥시"));//false
		
		//나이가 20대인 사람을 구하시오
		//20<=age<=29
		int age = 28;
		System.out.println(20<=age&&age<=29);
		
//		if(20<=age&&age<=29) {
//			System.out.println("20대입니다! 호홋!");
//		}
		
		//아이디가 admin이고 password가 1234이면 id, password 입력받아 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("id: ");
		String id = sc.next();
		System.out.println("password: ");
		String password = sc.next();
		if(id.equals("admin")&&password.equals("1234")) {
			System.out.println("id: "+id+"\t password: "+password);
			
		}
		
		//당신의 나이가 10대이면서 성별이 여자인 사람
		//나이, 성별(char)
		System.out.println("===================");
		System.out.println("나이: ");
		int age1 = sc.nextInt();
		System.out.println("성별: ");
		char gender = sc.next().charAt(0);
		System.out.println(10<=age1&&age1<=19&&gender=='여');
		
		//입력받은 주소지가 경기도나 강원도인 사람
		System.out.println("================");
		System.out.println("주소지: ");
		String addr = sc.next();
		System.out.println(addr.equals("경기도")||addr.equals("강원도"));
		
		//사는 곳이 광주나 서울이고 나이가 30대이면서 남자인 사랑
		System.out.println("=================");
		System.out.println("주소지: ");
		String addr2 = sc.next();
		System.out.println("나이: ");
		int age2 = sc.nextInt();
		System.out.println("성별: ");
		char gender2 = sc.next().charAt(0);
		System.out.println((addr2.equals("광주")||addr2.equals("서울"))&&(30<=age2&&age2<40)&&gender2=='남');
		// ||은 &&보다 연산자 우선순위가 낮으므로 항상 주의해서 사용해야 함!!!
		
	}
	
	public void complexOp() {
		//복합 대입 연산자: 변수에 있는 값에 특정 연산을 한 후 다시 대입하는 연산자
		
		int su = 100;
		//su++;//su=su+1
		//+=: 변수+=수 -> 변수=변수+수
		su+=200;
		System.out.println(su);//300
		su+=100;
		su+=300;
		System.out.println(su);//700
		
		//누적합계 계산 가능
		int total=0;//잔고 저장소
		total+=100000;
		total+=200000;
		System.out.println("잔고: "+total);//300000
		
		//12:10~18
		//문자열 누적연산: 문자열+문자열 -> 결합연산
		String msg ="";
		msg+="안녕하세요";//msg=msg+"안녕하세요";
		msg+="<html>";
		msg+="<body>";
		msg+="<h1>안녕하세요</h1>";
		System.out.println(msg);//안녕하세요<html><body><h1>안녕하세요</h1>
		
		//사용자에게 5번 입력을 받고 입력받은 모든 값을 한 번에 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지입력: ");
		String message=sc.nextLine();
		System.out.println("메세지입력: ");
		message+=sc.nextLine();
		System.out.println("메세지입력: ");
		message+=sc.nextLine();
		System.out.println("메세지입력: ");
		message+=sc.nextLine();
		System.out.println("메세지입력: ");
		message+=sc.nextLine();
		System.out.println(message);
		
	}

	//삼항연산자 실습
	public void thirdOp() {
		//삼항연산자: 조건식에 의해 실행되는 구문을 결정하는 연산
		//실행 방법: 조건문? true일 때 실행될 구문 : false일 때 실행될 구문
		//단독으로 사용 불가, 변수가 받아주거나 sysout 구문에 들어가는 등 해야 쓸 수 있음
		int su = 10;
		
		//su가 10이면 10이가 출력, su가 10이 아니면 10이 아니다 출력
		String msg = su == 10? "10이다." : "10이 아니다.";
		System.out.println(msg);
		//=System.out.println(su==10? "10이다." : "10이 아니다");
		
		//숫자를 입력받아 100보다 큰 수면 우와 크다 출력 아니면 에이 작다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("=================");
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		System.out.println(num>=100?"우와 크다":"에이 작다");
		
		//나이를 입력받아 미성년이면 공부하세요, 아니면 돈버세요
		System.out.println("===================");
		System.out.println("나이: ");
		int age = sc.nextInt();
		System.out.println(age<20?"공부하세요":"돈버세요");
		
		//학생여부를 입력받아 kh학생이면 코딩하세요, 아니면 취업하세요
		System.out.println("================");
		System.out.println("kh학생인가요? Y/N");
		char answer = sc.next().charAt(0);
		System.out.println(answer=='Y'?"코딩하세요":"취업하세요");
		
		//삼항연산자 안에 삼항연산자 또 작성 가능
		//미성년인지 확인하고, 미성년이 아니고 남자면 왼쪽으로 가세요, 아니면 오른쪽으로 가세요
		//미성년이면 나이 더 먹고 와
		System.out.println("================");
		System.out.println("미성년자입니까? Y/N");
		char minor = sc.next().charAt(0);
		System.out.println("성별: (M/F)");
		char gender = sc.next().charAt(0);
		System.out.println(minor=='Y'?"나이 더 먹고 와":gender=='M'?"왼쪽으로 가세요":"오른쪽으로 가세요");
		
	}
	
	//비트연산 실습
	public void bitOp() {
		//비트연산 실행하기
		//저장소에 있는 비트끼리의 연산을 의미함
		// A&B: AND
		// A|B: OR
		// A^B(XOR): 두 개가 다를때 1, 같으면 0
		// ~A: 비트 반전
		int a=10, b=22;
		String basic="";
		//매소드 영역 안에 있는 변수를 지역 변수라고 하고, 변수를 사용하지 않을 때는 꼭 공값을 입력해 초기화해주어야 함
		for(int i=0;i<32;i++) {
			basic+="0";
		}
		String bit=basic+Integer.toBinaryString(a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": a 비트값");
		
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": b 비트값");
		
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": a&b연산");
		
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": a|b 비트값");
		
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": a^b 비트값");
		
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit+": ~a 비트값");
		
		
		
	}
	
}
