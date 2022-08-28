package com.kh.practice.dimension;

import java.util.Random;

public class DimensionPractice4 {
	
	public void practice4() { 
		Random random = new Random();
		
		int arr[][] = new int[4][4];
		int r = 0;
		int c = 0;
		
		// 대입
		for (r=0; r<arr.length-1; r++) {		// 마지막 row에는 대입X
			for (c=0; c<arr[r].length-1; c++) {	// 마지막 column에는 대입X
				arr[r][c] = random.nextInt(10)+1; // 1~10 랜덤
				arr[r][3] += arr[r][c];
				arr[3][c] += arr[r][c];
				arr[3][3] += arr[r][c]*2;
			}
		}
		
		// 출력
		for (r=0; r<arr.length; r++) {
			for (c=0; c<arr[r].length; c++) {
				System.out.printf("%2d ", arr[r][c]); 
			}
			System.out.println();
		}
	}

}
