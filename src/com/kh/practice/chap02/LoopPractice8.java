package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice8 {
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		System.out.println("===== "+num+"단 =====");	
		
		for (int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
		sc.close();		
	}
}
