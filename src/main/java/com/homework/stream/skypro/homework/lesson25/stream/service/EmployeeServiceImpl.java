package com.homework.stream.skypro.homework.lesson25.stream.service;

import com.homework.stream.skypro.homework.lesson25.stream.employee.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList = new ArrayList<Employee>(List.of(
            new Employee("Nat", "Nat", "Nat", 0, 30000.5),
            new Employee("tat", "tat", "tat", 1, 50000),
            new Employee("yat", "yat", "yat", 2, 60000.67),
            new Employee("uat", "uat", "uat", 0, 70000),
            new Employee("iat", "iat", "iat", 1, 80000.56),
            new Employee("oat", "oat", "oat", 2, 90000)
    ));

    @Override
    public Employee add(String nameEmployee, String surnameEmployee, String lastnameEmployee, int departmentEmployee, double salaryEmployee) {
        Employee employee = new Employee(surnameEmployee, nameEmployee, lastnameEmployee, departmentEmployee, salaryEmployee);
        if (employeeList.contains(employee))
            throw new RuntimeException("Работник уже существует");
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String idEmployee) {
        Employee employee = employeeList
                .stream()
                .filter(e -> e.getIdEmployee().equals(idEmployee))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        employeeList.remove(employee);
        return employee;
    }

    @Override
    public Employee find(String idEmployee) {
        return employeeList
                .stream()
                .filter(e -> e.getIdEmployee().equals(idEmployee))
                .findFirst()
                .orElseThrow(NullPointerException::new);

    }

    @Override
    public List<Employee> findAll() {
        return Collections.unmodifiableList(employeeList);
    }
}
