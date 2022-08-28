package com.kh.practice.dimension;

public class DimensionPractice6 {
	
	public void practice6() { 
		
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
											{"차", "지", "습", "으", "냅"}, 
											{"원", "열", "니", "로", "시"}, 
											{"배", "심", "다", "좀", "다"}, 
											{"열", "히", "! ", "더", "!! "}};

		for (int c=0; c<strArr.length; c++) {
			for (int r=0; r<strArr[c].length; r++) {
				System.out.print(strArr[r][c]+" ");
			}
			System.out.println();
		}
											
											
	}

}
