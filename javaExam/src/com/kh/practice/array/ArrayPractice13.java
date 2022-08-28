package com.kh.practice.array;

import java.util.Random;

public class ArrayPractice13 {	

	public void practice13() {

		// random
		Random random = new Random();
		
		int arr[] = new int[10];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(10)+1;	// 1~10 사이의 값
			for (int j=0; j<i; j++) {		// 중복된 값이 없게
				if (arr[i] == arr[j]) {		
					i--;
					break;
				}
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
