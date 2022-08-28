package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice14 {
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
						
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i=num; i>=1; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print("*");
			}
		System.out.println();
		}
	
		sc.close();		
	}
}
