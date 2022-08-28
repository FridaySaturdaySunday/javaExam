package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice6 {
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("나이 : ");
		int age = sc.nextInt();		
		
		if (age <= 13) {
			System.out.println("어린이");
		} else if (age > 13 && age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
		
		sc.close();
	}

}
