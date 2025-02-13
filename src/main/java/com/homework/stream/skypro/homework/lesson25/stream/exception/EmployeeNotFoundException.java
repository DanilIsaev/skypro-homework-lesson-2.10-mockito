package com.homework.stream.skypro.homework.lesson25.stream.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super("Пользователя не существует");
    }
}
