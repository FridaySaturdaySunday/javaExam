package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice9 {	
Scanner sc = new Scanner(System.in);	

	public void practice9() {

		String arr[] = {"후라이드","양념","간장"};
		
		System.out.println("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String name2 = "";
		for (int i=0; i<arr.length; i++) {
			if (name.equals(arr[i])) {
				name2 = name;
				break;
			}
		}

		if (name2.equals(name)) {
			System.out.println(name+"치킨 배달 가능");
		} else {
			System.out.println(name+"치킨은 없는 메뉴입니다.");
		}
	}

}
