package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice4 {
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
				
		while (true) {
			System.out.println("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			} else {	
				for (int i=num; i>=1; i--) {
					System.out.print(i+" ");
				}				
				break;
			}			
		}
		
		sc.close();		
	}
}
