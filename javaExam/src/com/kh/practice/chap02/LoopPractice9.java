package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice9 {
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		if (num<=9) {
			for (int i=num; i<=9; i++) {
				System.out.println("===== "+i+"단 =====");	
				for (int j=1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
		sc.close();		
	}
}
