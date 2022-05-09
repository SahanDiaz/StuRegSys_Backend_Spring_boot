package com.stu.stu.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String s) {
            super(s);
    }
}
