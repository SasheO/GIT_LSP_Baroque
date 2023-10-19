package org.howard.edu.lsp.midterm.problem1;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Testing constructor with String title 'To Kill a MockingBird', String author 'Harper Lee', String year: '1960' as book1:");
	    Book book1 = new Book("To Kill a MockingBird", "Harper Lee", "1960");
		
		System.out.println("Testing book1.toString():\n" + book1.toString());
		
		System.out.println("\nTesting alternate constructor with String title 'To Kill a MockingBird', String author 'Harper Lee', int year: 1960 as book2:");
	    Book book2 = new Book("To Kill a MockingBird", "Harper Lee", 1960);
		System.out.println("book2.toString():\n" + book2.toString());
		
		System.out.println("\nCreating book3 with title '1984', author 'George Orwell' and year '1960'");
		Book book3 = new Book("1984", "George Orwell", "1960");
		System.out.println("book3.toString():\n" + book2.toString());
		
		System.out.println("\nTesting equals method:");
	    System.out.println("book1 equals book2: " + book1.equals(book2));
	    System.out.println("book2 equals book1: " + book2.equals(book1));
	    System.out.println("book1 equals book3: " + book1.equals(book3));
	    
	}

}
