package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	
	public void exec() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 : ");
		String str = sc.nextLine();
		sc.close();
		
		char ch = str.charAt(0);
		int unicode = ch;
		
		System.out.println(ch+" unicode : "+unicode);
	}

}
