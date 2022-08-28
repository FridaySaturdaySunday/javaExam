package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice10 {
	Scanner sc = new Scanner(System.in);
	
	public void practice10() {
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("선택 : ");		
		int num = sc.nextInt();
		
		switch (num) { //TODO
			case 1: new ControlPractice1().practice1(); break;
			case 2: new ControlPractice2().practice2(); break;
			case 3: new ControlPractice3().practice3(); break;
			case 4: new ControlPractice4().practice4(); break;
			case 5: new ControlPractice5().practice5(); break;
			case 6: new ControlPractice6().practice6(); break;
			case 7: new ControlPractice7().practice7(); break;
			case 8: new ControlPractice8().practice8(); break;
			case 9: new ControlPractice9().practice9(); break;			
		}
		
	}

}

// Stack - method(function) 관련
// 지역변수 - 메소드 호출되면 생성 - 리턴 - 소멸
// 메소드 호출됨을 기록에 남김 - 콜스택



