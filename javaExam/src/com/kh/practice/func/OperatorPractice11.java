package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice11 {
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("A사원의 연봉 : ");
		int a = sc.nextInt();		
		System.out.println("B사원의 연봉 : ");
		int b = sc.nextInt();		
		System.out.println("C사원의 연봉 : ");
		int c = sc.nextInt();		
		
		double totA = a * 1.4;
		double totB = b;
		double totC = c * 1.15;
		
		String udA = totA >= 3000 ? "3000 이상" : "3000 미만";
		String udB = totB >= 3000 ? "3000 이상" : "3000 미만";
		String udC = totC >= 3000 ? "3000 이상" : "3000 미만";
		
		System.out.printf("A사원 연봉/연봉+a : %d/%.1f \n%s \n", a, totA, udA);
		System.out.printf("B사원 연봉/연봉+a : %d/%.1f \n%s \n", b, totB, udB);
		System.out.printf("C사원 연봉/연봉+a : %d/%.13f \n%s \n", c, totC, udC);
				
		sc.close();
	}

}
