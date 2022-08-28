package com.kh.practice.dimension;

public class DimensionPractice8 {
	
	public void practice8() { 
		
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
	}

}
