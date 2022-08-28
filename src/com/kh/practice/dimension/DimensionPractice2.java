package com.kh.practice.dimension;

public class DimensionPractice2 {
	
	public void practice2() {
		
		int arr[][] = new int[4][4];
		arr = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}	
		
		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				arr[i][j] = (j+1)+(4*i);
//				System.out.printf("%2d ", arr[i][j]);
//			}
//			System.out.println();
//		}
	}

}
