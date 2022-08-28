package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public void exec() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine(); // next() -> 구분자(띄어쓰기) 이전의 토큰만 가져옴(사과 바나나 복숭아 -> 사과)
		
		System.out.println("성별을 입력하세요(남/여) : ");
		String gender = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기 (22 160 이런 식으로 입력할걸 대비해서)
		
		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		sc.close();
		
		System.out.println("키 "+height+"cm인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다^^");
		System.out.printf("키 %.2fcm인 %-3d살 %s자 %s님 반갑습니다^^\n", height, age, gender, name);
		
		System.out.println("============\t\t===\n===\'==\"==\\==============");
	}

}
