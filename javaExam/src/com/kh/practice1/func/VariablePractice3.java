package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void exec() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 : ");
		double d1  = sc.nextDouble();
		System.out.println("세로 : ");
		double d2 = sc.nextDouble();
		sc.close();
		
		System.out.println("면적 : "+(d1*d2));
		System.out.println("둘레 : "+(d1+d2)*2);

	}

}
