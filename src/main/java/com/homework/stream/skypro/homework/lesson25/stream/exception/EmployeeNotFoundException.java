package com.homework.stream.skypro.homework.lesson25.stream.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException() {
        super("Пользователя не существует");
    }
}
