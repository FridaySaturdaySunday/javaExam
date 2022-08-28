package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice10 {	
Scanner sc = new Scanner(System.in);	

	public void practice10() {

		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		char arr[] = new char[14];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = num.charAt(i);
		}

		char arr2[] = Arrays.copyOf(arr, 14);
		
		for (int i=8; i<arr2.length; i++) {
			arr2[i] = '*';
		}
		
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
	}

}
