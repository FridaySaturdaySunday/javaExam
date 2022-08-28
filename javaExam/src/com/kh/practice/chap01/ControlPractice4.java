package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice4 {
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();

		switch (num) {
			case 3:
			case 4:
			case 5:
				System.out.println(num+"월은 봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(num+"월은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(num+"월은 가을입니다.");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(num+"월은 겨울입니다.");
				break;
			default:
				System.out.println(num+"월은 잘못 입력된 달입니다.");
				break;
		}
				
		sc.close();		
	}

}
