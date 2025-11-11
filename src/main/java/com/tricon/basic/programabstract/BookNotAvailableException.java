package com.tricon.basic.programabstract;

public class BookNotAvailableException extends RuntimeException {
    public BookNotAvailableException(String message)
    {
        super(message);
    }
}
