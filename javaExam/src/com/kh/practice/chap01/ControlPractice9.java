package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice9 {
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간 고사 점수 : ");
		double mid = sc.nextDouble();
		System.out.println("기말 고사 점수 : ");
		double fin = sc.nextDouble();
		System.out.println("과제 점수 : ");
		double ass = sc.nextDouble();
		System.out.println("출석 회수 : ");
		int a = sc.nextInt();
		double att = a * 5;

		double total = mid*0.2+fin*0.3+ass*0.3+att*0.2;
		
		System.out.println("================결과================");
		
		if (att <= 70) {
			System.out.println("[Fail] 출석 회수 부족 ("+a+"/"+"20)");
		} else {
			System.out.println("중간 고사 점수(20) : "+mid*0.2);
			System.out.println("기말 고사 점수(30) : "+fin*0.3);
			System.out.println("과제 점수    (30) : "+ass*0.3);
			System.out.println("출석 점수    (20) : "+att*0.2);
			System.out.println("총점 : "+total);
			if (total >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
			
		sc.close();		
	}

}
