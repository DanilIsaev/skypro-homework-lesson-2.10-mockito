package com.homework.stream.skypro.homework.lesson25.stream.service;


import com.homework.stream.skypro.homework.lesson25.stream.employee.Employee;

import java.util.List;
import java.util.Map;

public interface DepartamentService {

    Employee findEmployeeWithMaxSalary(int departamentID);

    Employee findEmployeeWithMinSalary(int departamentID);

    List<Employee> findEmployeeList(int departamentID);

    Map<Integer, List<Employee>> findEmployeeListByDepartament();

    Double findAmountSalaryallEmployees(int departamentID);
}
