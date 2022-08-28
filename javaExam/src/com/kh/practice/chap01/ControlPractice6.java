package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice6 {
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		switch (grade) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		}
		
		sc.close();		
	}

}
