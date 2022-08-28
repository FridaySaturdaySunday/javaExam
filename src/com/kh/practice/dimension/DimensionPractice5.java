package com.kh.practice.dimension;

import java.util.Random;
import java.util.Scanner;

public class DimensionPractice5 {
	Scanner sc = new Scanner(System.in);
	
	public void practice5() { 
		Random random = new Random();
		
		char arr[][] = new char[0][0];
		
		while (true) {
			System.out.println("행 크기 : ");
			int row = sc.nextInt();
			System.out.println("열 크기 : ");
			int column = sc.nextInt();
			if (row>=1 && row<=10 && column>=1 && column<=10) {
				arr = new char[row][column];
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
		
		for (int r=0; r<arr.length; r++) {
			for (int c=0; c<arr[r].length; c++) {
				arr[r][c] = (char)(random.nextInt(26)+65); // 알파벳 26개, 65=A
				// char형은 숫자를 더해서 문자를 표현할 수 있음. 65(A)부터 26개의 알파벳 랜덤 대입

				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}

	}

}
