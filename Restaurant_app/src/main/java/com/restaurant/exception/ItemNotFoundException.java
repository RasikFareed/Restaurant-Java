package com.restaurant.exception;

public class ItemNotFoundException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public ItemNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ItemNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
