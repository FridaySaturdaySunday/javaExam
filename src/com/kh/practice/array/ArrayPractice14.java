package com.kh.practice.array;

import java.util.Random;

public class ArrayPractice14 {	

	public void practice14() {

		// random
		Random random = new Random();
		
		int arr[] = new int[6];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt(45)+1;	// 1~45
			for (int j=0; j<i; j++) {		// 중복된 값이 없게
				if (arr[i] == arr[j]) {		
					i--;
					break;
				}
			}
		}
		
		// 오름차순 정렬 (버블정렬)
		for (int i=0; i<arr.length-1; i++) {
			for (int j=0; j<arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
