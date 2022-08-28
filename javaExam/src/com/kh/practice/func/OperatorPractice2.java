package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice2 {
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수다");
		} else if (num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}
		sc.close();
	}

}
