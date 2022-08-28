package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice3 {
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수 : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		double avg = (kor + eng + math) / 3.0;
		
		if (kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("국어점수 : "+kor);
			System.out.println("영어점수 : "+eng);
			System.out.println("수학점수 : "+math);
			System.out.println("합계 : "+total);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
				
		sc.close();
		
	}

}
