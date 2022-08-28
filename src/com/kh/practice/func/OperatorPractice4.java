package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice4 {
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수 : ");
		int people = sc.nextInt();

		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+candy/people);
		System.out.println("남는 사탕 개수 : "+candy%people);
		
		
		sc.close();
	}

}
