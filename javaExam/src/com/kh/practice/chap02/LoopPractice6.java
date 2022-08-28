package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice6 {
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1>0 && num2>0) {
			if (num1<num2) {
				for (int i=num1; i<=num2; i++) {
					System.out.print(i+" ");
				}				
			} else {
				for (int i=num2; i<=num1; i++) {
					System.out.print(i+" ");
			}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
				
		sc.close();		
	}
}
