package com.book.casestudy;

public class BookStore {

	Book[] book;
	int index;
	
	public BookStore() {
		book=new Book[10];
		index=0;
	}

	public void addBook(Book b) {
		book[index] = b;
		index++;
	}

	public void searchByTitle(String title) {
		for (int i = 0; i < index; i++) {
			String s = book[i].toString();
			if (s.contains(title)) {
				System.out.println(book[i].toString());
			}
		}
	}

	public void searchByAuthor(String author) {
		for (int i = 0; i < index; i++) {
			String s = book[i].toString();
			if (s.contains(author)) {
				System.out.println(book[i].toString());
			}
		}
	}

	public void display() {
		for (int i = 0; i < index; i++) {
			System.out.println(book[i].toString());
			System.out.println();
		}
	}

}