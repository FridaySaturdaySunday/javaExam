package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice7 {	
Scanner sc = new Scanner(System.in);	

	public void practice7() {
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		int sum = 0;

		for (int i=0; i<arr.length; i++) {
			System.out.println("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
	}

}
