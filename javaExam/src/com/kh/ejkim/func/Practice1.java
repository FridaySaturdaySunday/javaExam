package com.kh.ejkim.func;

import java.util.Scanner;

public class Practice1 {

	private Scanner sc = new Scanner(System.in);

	// 숫자 입력받아 짝수입니다/홀수입니다/0입니다
	// 총 10회 반복해주세요.
	public void practice1_1() {
		
//		// 35값을 갖는 변수 a를 만드시오.
//		int a = 35;
//		// 문자 A를 변수 c에 넣어주세요.
//		char c = 'A';
//		// 문자열 "java"를 변수 java에 담아주세요
//		String java = "java";
		
		
		for (int i=0; i<10; i++) {
			System.out.println("숫자를 입력해주세요: ");
			int inputValue = sc.nextInt();
			if (inputValue == 0) {
				System.out.println("0입니다.");
			} else if (inputValue % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			} 
		}
		
		System.out.println("끝!");
		
	}
	
	
	
	// 숫자 입력받아 1~10 사이의 정수이면 누적합을 구함
	// 1~10 사이의 정수가 아니라면 "1~10사이 정수를 입력해주세요" 출력
	// 총 10회 반복
	public void practice1_2() {
		
		int sum = 0;
		
		// for문
		for (int i=0; i<3; i++) {
			System.out.println("1~10 사이의 정수를 입력해주세요: ");
			int inputValue = sc.nextInt();
			
			if (inputValue>0 && inputValue<11) {
				sum += inputValue;
			} else {
				System.out.println("1~10사이 정수를 입력해주세요");
			}
		}
		System.out.println(sum);
		System.out.println("끝!");
		
		// while문
		int i = 0;
		while (i < 3) {
			System.out.println("1~10 사이의 정수를 입력해주세요: ");
			int inputValue = sc.nextInt();
			if (inputValue>0 && inputValue<11) {
				sum += inputValue;
			} else {
				System.out.println("1~10사이 정수를 입력해주세요");
			}
			i++;
		}
						
		System.out.println(sum);
		System.out.println("끝!");
		
	}
	
	
	
	// 문자를 입력받아 문자의 길이를 구해주세요.
	// 입력받은 문자 중 영어 모음의 글자수는 몇개?
	// a e i o u
	public void practice1_3() {
			
		String inputValue = sc.nextLine();
		int inputValueLength = inputValue.length(); // .length() 문자열의 길이를 구하는 메소드
		System.out.println(inputValue + "의 길이는 "+ inputValueLength + "입니다.");
		
		
		// while문
		int i = 0; // index에 사용될것이므로 0부터 시작
		int count = 0;
		while (i < inputValueLength) {
			char c1 = inputValue.charAt(i); // .charAt(i) 문자열에서 i번째 위치에있는 문자 추출
			System.out.println(c1);
			if (c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
				System.out.println(c1+"은 모음입니다.");
				count++;
			}
			// TODO switch문으로 바꾸기
//			switch (c1) {
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//				System.out.println(c1+"은 모음입니다.");
//				count++;
//				break;
//			default:
//				break;
//			}	
			i++;
		}
		System.out.println(count);
			
		
		
		
		// for문
//		int count = 0;
//		for (int i=0 ; i<inputValueLength; i++) {
//			char c1 = inputValue.charAt(i); // .charAt(i) 문자열에서 i번째 위치에있는 문자 추출
//			System.out.println(c1);
//			if (c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
//				System.out.println(c1+"은 모음입니다.");
//				count++;
//			}
//		}
//		System.out.println(count);
		
	}	
		
		
	
	
	// 숫자 입력받아 1~ 해당 숫자까지 총합계, 짝수합계, 홀수합계를 구하시오
	// 99 입력할때까지 반복
	public void practice1_4() {		
		
		while (true) { // 무한반복
			System.out.println("숫자를 입력해주세요: ");
			int inputValue = sc.nextInt();
			if (inputValue == 99) {
				break; // while문 빠져나옴
			}
			
			int sumTotal = 0;
			int sumOdd = 0;
			int sumEven = 0;
			
			for (int i=1; i<=inputValue; i++) {
				if (i % 2 == 0) {
					sumEven += i;
				} else {
					sumOdd += i;
				} 
				sumTotal += i;
			}
			System.out.println(sumTotal);
			System.out.println(sumOdd);
			System.out.println(sumEven);
		}
		System.out.println("끝!");
		
		
	}
	
	
	
	
	// String 비교
	public void practice1_5() {		
	
		String a = "aaa"; // 같은 주소 번지 
		String b = "aaa";
		String c = new String("aaa"); // new로 각각 다른 주소 번지에 생성
		String d = new String("aaa");

		if(a == b) System.out.println("a==b");
		if(a == c) System.out.println("a==c");
		if(a == d) System.out.println("a==d");
		if(b == c) System.out.println("b==c");
		if(b == d) System.out.println("b==d");
		if(c == d) System.out.println("c==d");
		
		if(a.equals(b)) System.out.println("a equals b");
		if(a.equals(c)) System.out.println("a equals c");
		if(a.equals(d)) System.out.println("a equals d");
		if(b.equals(c)) System.out.println("b equals c");
		if(b.equals(d)) System.out.println("b equals d");
		if(c.equals(d)) System.out.println("c equals d");
	
	}
	
			
}
