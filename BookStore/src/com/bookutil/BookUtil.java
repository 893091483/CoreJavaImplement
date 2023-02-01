package com.bookutil;

import java.util.Scanner;

import Controller.BookController;

public class BookUtil {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		BookController bc=new BookController();
		System.out.println("Welcome to Customer Management Application");
		do {
			
			System.out.println("1-Add books");
			System.out.println("2-Find book by title");
			System.out.println("3-Find book by author");
			System.out.println("4-Show all books");
			
			System.out.println("5-Exit");
			System.out.println("Please enter your choice...");
			choice=sc.nextInt();
			//Accept choice from user to operation
			bc.accpeptChoice(choice);
			
		}while(choice!=5);
		sc.close();
	}
}
