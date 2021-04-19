package com.book.casestudy;

import com.book.exception.IlligalBookIdException;
import com.book.exception.InvalidCategoryException;
import com.book.exception.WrongPriceException;

public class Book {
	private String bookID;
	private String bookTitle;
	private String author;
	private String category;
	private float price;

	public Book(String bookID, String bookTitle, String author, String category, float price) throws IlligalBookIdException, InvalidCategoryException, WrongPriceException  {
		String s = "" + bookID.charAt(0);
		if (s.equals("B") && bookID.length() == 4)
			this.bookID = bookID;
		else
			throw new IlligalBookIdException("Please Enter Valid Book ID : Starts with B && Its Length Should Be 4");
		this.bookTitle = bookTitle;
		this.author = author;
		if (category.equalsIgnoreCase("Science") || category.equalsIgnoreCase("Fiction")
				|| category.equalsIgnoreCase("Technology") || category.equalsIgnoreCase("Others")) {
			this.category = category;
		} else
			throw new InvalidCategoryException("Please Inter those category that in list");
		if (price >= 0)
			this.price = price;
		else
			throw new WrongPriceException("Price cant't be lessThan equal to 0");
	}

	@Override
	public String toString() {
		return "bookID : " + bookID + "\n bookTitle : " + bookTitle + "\nauthor : " + author + "\ncategory : "
				+ category + "\nprice=" + price;
	}

}