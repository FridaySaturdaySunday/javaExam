package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice7 {
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("국어 : ");
		int korean = sc.nextInt();				
		System.out.println("영어 : ");
		int english = sc.nextInt();				
		System.out.println("수학 : ");
		int math = sc.nextInt();		
		
		int total = korean + english + math;
		System.out.println("합계 : "+total);
		
		double average = (korean + english + math) / 3;
		System.out.printf("평균 : %.1f\n",average);
		
		if (korean>=40 && english>=40 && math>=40 && average>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
				
		sc.close();
	}
}
