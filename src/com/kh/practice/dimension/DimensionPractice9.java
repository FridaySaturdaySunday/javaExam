package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice9 {
	Scanner sc = new Scanner(System.in);
	public void practice9() { 
		
		String arr[] = {"강건강","남나나","도대담","류라라","문미미","박보배",
						"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		int num = 0;
		
		String arr2[][] = new String[3][2];
		String arr3[][] = new String[3][2];
		
		for (int r=0; r<arr2.length; r++) {
			for (int c=0; c<arr2[r].length; c++) {
				arr2[r][c] = arr[num];
				num++;
			}
		}
		for (int r=0; r<arr3.length; r++) {
			for (int c=0; c<arr3[r].length; c++) {
				arr3[r][c] = arr[num];
				num++;
			}
		}
		
		// 출력
		System.out.println("== 1분단 ==");
		for (int r=0; r<arr2.length; r++) {
			for (int c=0; c<arr2[r].length; c++) {
				System.out.print(arr2[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int r=0; r<arr3.length; r++) {
			for (int c=0; c<arr3[r].length; c++) {
				System.out.print(arr3[r][c]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("======================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		for (int r=0; r<arr2.length; r++) {
			for (int c=0; c<arr2[r].length; c++) {
				if (name.equals(arr2[r][c])) {
					System.out.print("검색하신 "+name+" 학생은 1분단 ");
				switch (r) {
					case 0: System.out.print("첫 번째 줄 "); break;
					case 1: System.out.print("두 번째 줄 "); break;
					case 2: System.out.print("세 번째 줄 "); break;
				}
				if (c==0)	System.out.print("왼쪽에 있습니다.");
				else 		System.out.print("오른쪽에 있습니다.");
				}
			}
		}
		
		for (int r=0; r<arr3.length; r++) {
			for (int c=0; c<arr3[r].length; c++) {
				if (name.equals(arr3[r][c])) {
					System.out.print("검색하신 "+name+" 학생은 2분단 ");
					switch (r) {
						case 0: System.out.print("첫 번째 줄 "); break;
						case 1: System.out.print("두 번째 줄 "); break;
						case 2: System.out.print("세 번째 줄 "); break;
					}
					if (c==0)	System.out.print("왼쪽에 있습니다.");
					else 		System.out.print("오른쪽에 있습니다.");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
