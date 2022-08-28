package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice1 {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (int i=1; i<=num; i++) {
				System.out.print(i+" ");
			}
		}
		
		sc.close();		
	}
}
