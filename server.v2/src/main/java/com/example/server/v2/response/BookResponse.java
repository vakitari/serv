package com.example.server.v2.response;

import com.example.server.v2.entity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookResponse extends BaseResponse{
    public BookResponse(boolean success, String message, BookEntity book){
        super(success, message);
        this.book = book;
    }
    public BookResponse(BookEntity book){super(true,"Book data");}
    private BookEntity book;
}
