package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice12 {
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("연산자(+, -, *, /, %) : ");
			String op = sc.next();		
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;														//여기 break는 반복문 빠져나옴
			}
						
			System.out.println("정수1 : ");
			int num1 = sc.nextInt();
			System.out.println("정수2 : ");
			int num2 = sc.nextInt();
			
			switch (op) {
				case "+":
					System.out.println(num1+" + "+num2+" = "+(num1+num2));
					break;													//여기 break는 switch문 문법 -> switch문 빠져나옴
				case "-":
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
					break;
				case "*":
					System.out.println(num1+" * "+num2+" = "+(num1*num2));
					break;
				case "/":
					if(num2==0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요."); 
						break;
					}
					System.out.println(num1+" / "+num2+" = "+(num1/num2));
					break;
				case "%":
					System.out.println(num1+" % "+num2+" = "+(num1%num2));
					break;
				default:
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
					break;
			}

		}
		sc.close();		
	}
}
