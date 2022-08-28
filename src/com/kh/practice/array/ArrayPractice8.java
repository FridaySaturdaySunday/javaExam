package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice8 {	
Scanner sc = new Scanner(System.in);	

	public void practice8() {

		while (true) {
			System.out.println("정수 : ");
			int num = sc.nextInt();
			
			if (num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요");
			} else {
				int arr[] = new int[num];
				for (int i=0; i<=num/2; i++) {
					arr[i] = i+1;
				}
				for (int i=num-1; i>num/2; i--) {
					arr[i] = num-i;
				}
				for (int i=0; i<num; i++) {
					System.out.print(arr[i]);
					if (i<num-1) {
						System.out.print(", ");
					}
				}
				break;
			}
		
		}
	}

}
