package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void exec() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		double korean = sc.nextDouble();
		System.out.println("영어 : ");
		double english = sc.nextDouble();
		System.out.println("수학 : ");
		double math = sc.nextDouble();
		sc.close();
		
		int total = (int)(korean+english+math);
		int avg = (int)((korean+english+math)/3);
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
	}

}
