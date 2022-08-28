package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice8 {
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("주민번호를 입력하세요(-포함) : ");
		String num = sc.nextLine();		
		
		if (num.charAt(7) == '1') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
				
		sc.close();
	}

}
