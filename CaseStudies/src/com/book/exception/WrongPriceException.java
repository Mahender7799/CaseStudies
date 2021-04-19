package com.book.exception;

public class WrongPriceException extends Exception {
	public WrongPriceException() {
	}

	public WrongPriceException(String s) {
		super(s);
	}
}