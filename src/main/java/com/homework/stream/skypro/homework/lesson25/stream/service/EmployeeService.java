package com.homework.stream.skypro.homework.lesson25.stream.service;

import com.homework.stream.skypro.homework.lesson25.stream.employee.Employee;

import java.util.List;

public interface EmployeeService {

    Employee add(String nameEmployee,
                 String surnameEmployee,
                 String lastnameEmployee,
                 int departmentEmployee,
                 double salaryEmployee);

    Employee remove(String idEmployee);

    Employee find(String idEmployee);

    List<Employee> findAll();

}
