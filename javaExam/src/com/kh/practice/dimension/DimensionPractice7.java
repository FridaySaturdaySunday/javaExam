package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice7 {
	Scanner sc = new Scanner(System.in);
	
	public void practice7() { 
		
		int abc = 0;
		
		System.out.println("행의 크기 : ");
		int row = sc.nextInt();
		char arr[][] = new char[row][];
		
		for (int r=0; r<arr.length; r++) {
			System.out.println(r+"행의 열 크기 : ");
			int column = sc.nextInt();
			arr[r] = new char[column];
			
			for (int c=0; c<arr[r].length; c++) {
				arr[r][c] = (char)(abc+97); // char형은 숫자를 더해 문자를 표현 가능. a=97
				abc++;
			}
		}
		
		// 출력
		for (int r=0; r<arr.length; r++) {
			for (int c=0; c<arr[r].length; c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
	}

}
