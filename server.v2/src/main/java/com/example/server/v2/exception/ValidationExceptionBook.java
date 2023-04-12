package com.example.server.v2.exception;

import javax.xml.bind.ValidationException;

public class ValidationExceptionBook extends ValidationException {
    public ValidationExceptionBook(String message){
        super(message);
    }
}
