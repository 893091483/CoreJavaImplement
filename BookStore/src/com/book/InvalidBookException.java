package com.book;



class InvalidBookException extends RuntimeException{
	
	private String errorMessage;
	
	public InvalidBookException (String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
}
