package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice16 {	
	Scanner sc = new Scanner(System.in);

	public void practice16() {

		String arr[] = new String[99999];
		
		while (true) {
			System.out.print("배열의 크기를 입력하세요 : ");
			int num = sc.nextInt();
			
			
			
		// TODO
			
			
			for (int i=0; i<num; i++) {
				System.out.print((i+1)+"번째 문자열 : ");
				arr[i] = sc.nextLine();
			}
		}

	}

}
