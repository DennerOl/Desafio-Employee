package com.devsuperior.demo.service.exceptions;

@SuppressWarnings("serial")
public class DatabaseException extends RuntimeException{

	public DatabaseException(String msg) {
		super(msg);
	}
}
