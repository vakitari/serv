package com.example.server.v2.exception;

import javax.xml.bind.ValidationException;

public class ValidationExceptionPublisher  extends ValidationException {
    public ValidationExceptionPublisher(String message){
        super(message);
    }
}
