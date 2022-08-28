package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice5 {
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("학년(숫자만) : ");
		int grade = sc.nextInt();		
		System.out.println("반(숫자만) : ");
		int room = sc.nextInt();		
		System.out.println("번호(숫자만) : ");
		int num = sc.nextInt();		
		System.out.println("성별(M/F) : ");
		char a = sc.next().charAt(0); 			//
		String gender = (a=='M') ? "남" : "여"; 	//
		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		float score = sc.nextFloat();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", 
							grade, room, num, name, gender, score);		
		sc.close();
	}
}
