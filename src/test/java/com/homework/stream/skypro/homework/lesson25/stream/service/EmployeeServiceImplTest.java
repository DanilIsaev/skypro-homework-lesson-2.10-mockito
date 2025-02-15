package com.homework.stream.skypro.homework.lesson25.stream.service;

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
    void remove() {
        employeeService.remove("oatoat");
        assertEquals(EMPLOYEE_LIST_AFTER_REMOVE, employeeService.findAll());
    }

    @Test
    void find() {
        assertEquals(RESULT_FIND_EMPLOYEE, employeeService.find("NatNat"));
    }

    @Test
    void findAll() {
        assertEquals(EMPLOYEE_LIST_DEFAULT, employeeService.findAll());
    }
}