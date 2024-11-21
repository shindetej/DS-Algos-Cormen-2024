package com.tms.dsa.linkedlist;

public class DataNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
