package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice10 {
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();		
		System.out.println("입력2 : ");
		int num2 = sc.nextInt();		
		System.out.println("입력3 : ");
		int num3 = sc.nextInt();		
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
				
		sc.close();
	}

}
