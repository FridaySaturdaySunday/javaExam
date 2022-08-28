package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice5 {
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pw = "myPassword12";
		
		System.out.println("아이디 : ");
		String checkId = sc.nextLine();
		System.out.println("비밀번호 : ");
		String checkPw = sc.nextLine();

		if (checkId.equals(id) && checkPw.equals(pw)) {
			System.out.println("로그인 성공");
		} else if (!checkId.equals(id) && checkPw.equals(pw)) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (checkId.equals(id) && !checkPw.equals(pw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
		sc.close();		
	}

}
