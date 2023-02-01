package com.book;
import Model.Book;

import java.util.Scanner;



public class BookStore implements BookDao{
	
	Book [] books = new Book[3];
	Scanner sc=new Scanner(System.in);
	String [] validCategory = { "Science", "Fiction", "Technology", "Others"};
	//implement function for add book to books array;
	@Override
	public void addBook() {
		System.out.println("Enter 3 books you want to store?");
		for(int i=0;i<3;i++) {
			Book book =new Book();
			System.out.println("Please enter "+ (i+1) +" book ID:");
			String id=sc.next();		
			
			System.out.println("Please enter "+ (i+1) +" book title:");
			String title=sc.next();
			
			System.out.println("Please enter "+ (i+1) +" book author ");
			String author=sc.next();
			
			System.out.println("Please enter "+ (i+1) +" category");
			String category=sc.next();
			
			System.out.println("Please enter "+ (i+1) +" book price ");
			float price=sc.nextFloat();
			
			book.setBookID(id);
			book.setTitle(title);
			book.setAuthor(author);
			book.setCategory(category);
			book.setPrice(price);
			validInput(book);
			books[i] = book;
			
		}
	}
	
	public void validInput(Book book) {
		if(!checkCategory(book)) {
			throw new InvalidBookException("Invalid category");
		}
		if(book.getPrice() < 0.0) {
			throw new InvalidBookException("Price cannot be negative");
		}
		if(!checkBookId(book)) {
			throw new InvalidBookException("bookID must start with B and must be of length 4 characters");
		}
	}
	
	public boolean checkCategory(Book book) {
		
		for (String validName : validCategory) {
			if(book.getCategory().compareToIgnoreCase(validName) == 0)
				return true;
		}
		return false;
	}
	public boolean checkBookId(Book book) {
		
		if(book.getBookID().charAt(0) != 'B' || book.getBookID().length() != 4)
			return false;
		else
			return true;
	}

	@Override
	public void searchByTitle() {
		
		System.out.println("Please enter book title:");
		String title=sc.next();
		boolean flag = false;
		for (Book book : books) {
			if ( title == book.getTitle()) {
				flag = true;
				System.out.println("Book found !");
				book.toString();
			} 
			
		}
		if(!flag)
			System.out.println("Sorry, book not found !");
		
		
	}

	@Override
	public void searchByAuthor() {
		System.out.println("Please enter book author ");
		String author=sc.next();
		boolean flag = false;
		for (Book book : books) {
			if ( author == book.getAuthor()) {
				flag = true;
				System.out.println("Book found !");
				book.toString();
			} 
			
		}
		if(!flag)
			System.out.println("Sorry, book not found !");
	}

	@Override
	public void displayAll() {
		
		System.out.println("Display all books");
		for (Book book : books) {
			
			book.toString();
			
		}
	}

}
