package com.bridgeLabz.fundooNotes.exception;

/**
 * This class extends {@link RuntimeException} and creates a custom exception
 * which would be thrown during the user's abnormal activity
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-23
 * @version 1.0
 */
public class UserException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private final int status;

	public UserException(String message, int status) {
		super(message);
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

}