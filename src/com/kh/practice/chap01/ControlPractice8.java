package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice8 {
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("연산자를 입력 : ");
		char op = sc.next().charAt(0);		//

		switch (op) {
			case '+':
				System.out.printf("%d %c %d = %d", num1, op, num2, num1+num2);
				break;
			case '-':
				System.out.printf("%d %c %d = %d", num1, op, num2, num1-num2);
				break;
			case '*':
				System.out.printf("%d %c %d = %d", num1, op, num2, num1*num2);
				break;
			case '/':
				System.out.printf("%d %c %d = %.6f", num1, op, num2, (double)num1/num2);
				break;
			case '%':
				System.out.printf("%d %c %d = %d", num1, op, num2, num1%num2);
				break;		
		}

		sc.close();		
	}

}
