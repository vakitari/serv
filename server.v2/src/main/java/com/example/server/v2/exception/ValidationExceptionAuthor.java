package com.example.server.v2.exception;

import javax.xml.bind.ValidationException;

public class ValidationExceptionAuthor extends ValidationException {
    public ValidationExceptionAuthor(String message){
        super(message);
    }

}
