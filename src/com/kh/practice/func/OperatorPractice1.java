package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice1 {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
		
		sc.close();
	}

}
