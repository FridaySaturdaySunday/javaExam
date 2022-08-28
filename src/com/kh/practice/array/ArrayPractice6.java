package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice6 {	
Scanner sc = new Scanner(System.in);	

	public void practice6() {
		
		String arr[] = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if (num<0 || num>6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(arr[num]);
		}
		
	}

}
