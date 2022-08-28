package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice11 {
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.println("공차 : ");
		int gap = sc.nextInt();
		
		for (int i=0; i<=9; i++) {
			System.out.print(num+(gap*i)+" ");
		}
		
		sc.close();		
	}
}
