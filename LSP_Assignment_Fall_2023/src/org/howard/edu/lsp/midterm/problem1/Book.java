package org.howard.edu.lsp.midterm.problem1;

public class Book {
	private String title;
	private String author;
	private Integer year;
	
	public Book(String title, String author, String year) {
		this.title = title;
		this.author = author;
		this.year = Integer.valueOf(year);
	}
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "title: " + this.title + " \nauthor: "+this.author+"\nyear: "+year;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	@Override
	public boolean equals(Object otherBook) {
		if (!(otherBook instanceof Book)) {
			return false;
		}
		
		if (this.title.equals(((Book) otherBook).getTitle()) && this.author.equals(((Book) otherBook).getAuthor())) {
			return true;
		}
		
		return false;
	}

}
