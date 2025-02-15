package com.homework.stream.skypro.homework.lesson25.stream.service;

import com.homework.stream.skypro.homework.lesson25.stream.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListTestData {
    public static final List<Employee> EMPLOYEE_LIST_DEFAULT = new ArrayList<Employee>(List.of(
            new Employee("Nat", "Nat", "Nat", 0, 30000.5),
            new Employee("tat", "tat", "tat", 1, 50000),
            new Employee("yat", "yat", "yat", 2, 60000.67),
            new Employee("uat", "uat", "uat", 0, 70000),
            new Employee("iat", "iat", "iat", 1, 80000.56),
            new Employee("oat", "oat", "oat", 2, 90000)
    ));
    public static final List<Employee> EMPLOYEE_LIST_AFTER_ADD = new ArrayList<Employee>(List.of(
            new Employee("Nat", "Nat", "Nat", 0, 30000.5),
            new Employee("tat", "tat", "tat", 1, 50000),
            new Employee("yat", "yat", "yat", 2, 60000.67),
            new Employee("uat", "uat", "uat", 0, 70000),
            new Employee("iat", "iat", "iat", 1, 80000.56),
            new Employee("oat", "oat", "oat", 2, 90000),
            new Employee("ooo", "kkk", "ppp", 2, 60000)
    ));
}
