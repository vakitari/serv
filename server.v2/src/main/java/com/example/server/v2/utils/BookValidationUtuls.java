package com.example.server.v2.utils;

import com.example.server.v2.entity.BookEntity;
import com.example.server.v2.exception.ValidationExceptionBook;

import javax.xml.bind.ValidationException;

public class BookValidationUtuls {                          //запомнить что тут не так v
    public static void bookValidationUtils(BookEntity book) throws ValidationExceptionBook {
        String title = book.getTitle();
        if (title == null || title.isBlank()){
            throw new ValidationExceptionBook("Поле название не должно быть пустым");
        }
        if (book.getAuthor() == null){
            throw new ValidationExceptionBook("нужно выбрать автора");
        }
        if (book.getPublishing() == null){
            throw new ValidationExceptionBook("нужно выбрать Издательство");
        }


    }
}
