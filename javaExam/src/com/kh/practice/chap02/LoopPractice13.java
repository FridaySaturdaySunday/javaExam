package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice13 {
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
						
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i=1; i<=num; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	
		sc.close();		
	}
}
