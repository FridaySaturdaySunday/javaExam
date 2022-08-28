package com.kh.practice.array;

import java.util.Random;

public class ArrayPractice12 {	

	public void practice12() {

		// random
		Random random = new Random();
		
		int arr[] = new int[10];
		
		for (int i=0; i<arr.length; i++) {
//			arr[i] = random.nextInt(10);	// 0~9 사이의 값
			arr[i] = random.nextInt(10)+1;	// 1~10 사이의 값
			System.out.print(arr[i]+" ");
		}
		
		
		// 최대값, 최소값 구하기
		int max = 1;
		int min = 10;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}
