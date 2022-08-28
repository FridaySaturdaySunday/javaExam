package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice5 {	
Scanner sc = new Scanner(System.in);	

	public void practice5() {
		
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		System.out.println("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : ");
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.print(i+" ");
				count++;
			
			}
		}
		System.out.println();
		System.out.println("i 개수 : "+count);
		
	}

}
