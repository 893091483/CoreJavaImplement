package Controller;


import java.util.Scanner;

import com.book.BookStore;



public class BookController {
	BookStore bs;
	Scanner sc = new Scanner(System.in);

	public BookController() {
		bs = new BookStore();
	}

	public void accpeptChoice(int choice) {
		switch (choice) {
		case 1:
			bs.addBook();
			break;
		case 2:
			bs.searchByTitle();
			break;
		case 3:
		
			bs.searchByAuthor();
			break;
		case 4:
			
			bs.displayAll();
			break;

		case 5:
			System.exit(choice);
			break;
		}
	}
}
