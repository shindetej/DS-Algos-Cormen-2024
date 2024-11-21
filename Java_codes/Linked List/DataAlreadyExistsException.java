package com.tms.dsa.linkedlist;

public class DataAlreadyExistsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    public DataAlreadyExistsException(String message) {
        super(message);
    }
}
