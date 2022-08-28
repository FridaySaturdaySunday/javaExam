package com.kh.practice.dimension;

public class DimensionPractice1 {
	
	public void practice1() {
		
		String arr[][] = new String[3][3];
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print("("+i+", "+j+")");
			}
			System.out.println();
		}
	}

}
