package com.havryliuk.springrestfulapp.rest;

import com.havryliuk.springrestfulapp.models.ErrorResponse;

public class ExceptionStudentNotFound extends RuntimeException {
    public ExceptionStudentNotFound(String message) {
        super(message);
    }

    public ExceptionStudentNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionStudentNotFound(Throwable cause) {
        super(cause);
    }
}
