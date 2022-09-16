package com.kh.practice.list.library.model.vo;

public class Book {

	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {} // 기본생성자
	
	public Book(String title, String author, String category, int price) { // 매개변수 있는 생성자
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() { // 객체의 정보를 리턴하는 메소드
		return "(" + title + "/" + author + "/" + category + "/" + price + ")";
	}

	@Override
	public int hashCode() { // 해시코드를 리턴하는 메소드
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) { // 객체가 같은지 여부를 리턴하는 메소드
		return super.equals(obj);
	}
	
	public int compareTo(Object o) { // 정렬 기준을 가지고 있는 메소드
		int result = 0;
		
		return result;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
