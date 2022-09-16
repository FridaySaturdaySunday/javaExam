package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);

	private BookController bc = new BookController();

	public void mainMenu() { // 사용자가 직접 메인 메뉴를 선택할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동.
		// 메뉴 화면 반복 실행 처리
		// 잘못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		System.out.println("===== Welcome KH Library =====");
		while (true) {
			System.out.println();
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");

			int num = sc.nextInt(); // nextInt() -> 사용 후 버퍼 비우기!
			if (num < 1 || (num > 5 && num < 9) || num > 9) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			switch (num) {
				case 1: insertBook(); break;
				case 2: selectList(); break;
				case 3: searchBook(); break;
				case 4: deleteBook(); break;
				case 5: ascBook(); break;
				case 9: System.out.println("프로그램을 종료합니다."); return;
				default: break;
			}
			sc.nextLine(); // 버퍼비우기
		}
		
	}

	// 1. 새 도서 추가용 view 메소드
	public void insertBook() { // 도서 추가를 위해 정보를 받는 메소드
		sc.nextLine();
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : "); 
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int num = sc.nextInt();
		String category = null;
		switch (num) {
			case 1: category = "인문"; break;
			case 2: category = "과학"; break;
			case 3: category = "외국어"; break;
			case 4: category = "기타"; break;
			default: break;
		}
		System.out.print("가격 : ");
		int price = sc.nextInt();

		Book book = new Book(title, author, category, price); // 매개변수 생성자를 이용하여 Book 객체 생성
		bc.insertBook(book); // bc(BookController)의 insertBook으로 위의 Book 객체 전달
	}

	// 2. 도서 전체용 view 메소드
	public void selectList() { // 전체 도서 목록 출력 성공을 알리는 메소드
		System.out.println("===== 도서 전체 조회 =====");
		// bc(BookController)의 selectList() 메소드를 호출 -> 결과 값을 임의의 리스트(ArrayList<Book> bookList)에 대입
		ArrayList<Book> bookList = bc.selectList();

		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book b : bookList) {
				System.out.println(b);
			}
		}
	}

	// 3. 도서 검색용 view 메소드
	public void searchBook() { // 특정 도서 검색 결과를 보여주는 메소드
		sc.nextLine();
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		// bc(BookController)의 searchBook() 메소드로 위의 keyword 값 전달 -> 결과 값을 임의의 리스트(ArrayList<Book> searchList)에 대입
		ArrayList<Book> searchList = bc.searchBook(keyword);

		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Book bk : searchList) {
				System.out.println(bk);
			}
		}
	}

	// 4. 도서 삭제용 view 메소드
	public void deleteBook() { // 특정 도서 삭제 성공을 알리는 메소드 //TODO 오류남!!!!!!!!!!!!!!!!!
		sc.nextLine();
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		// bc(BookConroller)의 deleteBook() 메소드로 위의 title, author 값 전달 -> 결과 값을 임의의 Book(Book remove)에 대입
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}

	// 5. 도서 명 오름차순 정렬용 view 메소드
	public void ascBook() { // 책 명 오름차순 정렬 성공을 알리는 메소드
		sc.nextLine();

		//bc(BookController)의 ascBook() 메소드 값에 따라 성공시, 실패시 각각 출력
		if(bc.ascBook() == 1) { 
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}