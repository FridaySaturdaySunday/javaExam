package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice9 {
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();		
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();		
		System.out.println("입력 : ");
		int num3 = sc.nextInt();		
		
		if (num3 <= num1 || num3 > num2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
				
		sc.close();
	}

}
