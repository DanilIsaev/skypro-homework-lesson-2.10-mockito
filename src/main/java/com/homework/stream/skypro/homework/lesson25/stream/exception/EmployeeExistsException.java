package com.homework.stream.skypro.homework.lesson25.stream.exception;

public class EmployeeExistsException extends RuntimeException {
    public EmployeeExistsException() {
        super("Работник уже существует");
    }
}
