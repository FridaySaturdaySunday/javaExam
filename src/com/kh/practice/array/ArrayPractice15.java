package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice15 {	
	Scanner sc = new Scanner(System.in);

	public void practice15() {

		System.out.println("문자열 : ");
		String str = sc.nextLine();
		
		char ch[] = new char[str.length()];
		int count = 0;
		
		// 저장 TODO
		for (int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			for (int j=0; j<str.length(); j++) {
				if (ch[j] == str.charAt(i)) {
					ch[j] = ' ';
					break;
				}
				count++;
			}
		}
		
		
		// 출력
		for (int i=0; i<str.length(); i++) {
			System.out.print(ch[i]);
			if (i<str.length()-1) {
				System.out.print(", ");
			}
		}
		System.out.println("\n문자 개수 : "+count);
		
	}

}
