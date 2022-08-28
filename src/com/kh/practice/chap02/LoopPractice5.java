package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice5 {
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
			
		for (int i=1; i<=num-1; i++) {
			System.out.print(i+" + ");
			sum += i;
		}
		System.out.printf(num+" = "+(sum+num));
				
		sc.close();		
	}
}
