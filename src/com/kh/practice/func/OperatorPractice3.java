package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
		sc.close();
	}

}
