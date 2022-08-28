package com.kh.practice.dimension;

public class DimensionPractice3 {
	
	public void practice3() {
		
		int arr[][] = new int[4][4];
		arr = new int[][] {{16,15,14,13},{12,11,10,9},{8,7,6,5},{4,3,2,1}};
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}	
		
		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				arr[i][j] = (4-j)+(4*(3-i));
//				System.out.printf("%2d ", arr[i][j]);
//			}
//			System.out.println();
//		}
	}

}
