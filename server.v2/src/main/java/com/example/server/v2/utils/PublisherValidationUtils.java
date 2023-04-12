package com.example.server.v2.utils;

import com.example.server.v2.entity.PublisherEntity;
import com.example.server.v2.exception.ValidationExceptionPublisher;

public class PublisherValidationUtils {
    public static void validationPublisher(PublisherEntity data) throws ValidationExceptionPublisher {
        String  title = data.getPublisher();
        if (title == null || title.isBlank()){
            throw new ValidationExceptionPublisher("Название не дожно быть пустым");
        }
        String city = data.getCity();
        if (city == null || city.isBlank()){
            throw new ValidationExceptionPublisher("Издательство дожно иметь адрес");
        }
    }

}
