package com.kh.practice.array;

import java.util.Random;

public class ArrayPractice11 {	

	public void practice11() {

		// random
		Random random = new Random();
		
		int arr[] = new int[10];
		
		for (int i=0; i<arr.length; i++) {
//			arr[i] = random.nextInt(10);	// 0~9 사이의 값
			arr[i] = random.nextInt(10)+1;	// 1~10 사이의 값
			System.out.print(arr[i]+" ");
		}
		
	}

}
