package com.homework.stream.skypro.homework.lesson25.stream.service;

import com.homework.stream.skypro.homework.lesson25.stream.exception.EmployeeExistsException;
import com.homework.stream.skypro.homework.lesson25.stream.exception.EmployeeNotFoundException;
import org.junit.jupiter.api.Test;

import static com.homework.stream.skypro.homework.lesson25.stream.service.EmployeeListTestData.*;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {

    EmployeeService employeeService = new EmployeeServiceImpl();

    @Test
    void add() {
        employeeService.add("kkk", "ooo", "ppp", 2, 60000);
        assertEquals(EMPLOYEE_LIST_AFTER_ADD, employeeService.findAll());
    }

    @Test
    void addEmployeeExistsException() {
        assertThrows(EmployeeExistsException.class, () -> employeeService.add("oat", "oat", "oat", 2, 90000));
    }

    @Test
    void remove() {
        employeeService.remove("oatoat");
        assertEquals(EMPLOYEE_LIST_AFTER_REMOVE, employeeService.findAll());
    }

    @Test
    void removeEmployeeNotFoundException() {
        assertThrows(EmployeeNotFoundException.class, () -> employeeService.remove("xzczxc"));
    }

    @Test
    void find() {
        assertEquals(RESULT_FIND_EMPLOYEE, employeeService.find("NatNat"));
    }

    @Test
    void findEmployeeNotFoundException() {
        assertThrows(EmployeeNotFoundException.class, () -> employeeService.find(EMPLOYEE_NOT_FOUND));
    }

    @Test
    void findAll() {
        assertEquals(EMPLOYEE_LIST_DEFAULT, employeeService.findAll());
    }

}