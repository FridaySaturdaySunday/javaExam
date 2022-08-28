package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice3 {	
Scanner sc = new Scanner(System.in);
	
	public void practice3() {
		
		System.out.println("양의 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
	}

}
