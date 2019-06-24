package com.softserve.HOMEWORK.Exception.n2;

public class NotInRangeException extends Exception {

    public NotInRangeException(String message) {
        super(message);
    }

    public NotInRangeException() {
        super("the number is out of range");
    }
}

