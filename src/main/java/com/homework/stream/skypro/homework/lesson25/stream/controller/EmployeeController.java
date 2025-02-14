package com.homework.stream.skypro.homework.lesson25.stream.controller;

import com.homework.stream.skypro.homework.lesson25.stream.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String pageWelcome() {
        return "Welcome";
    }

    //localhost:8080/employee/add?name=wee&surname=try&lastname=fgh&departamentId=1&salary=150000
    @GetMapping(path = "/employee/add")
    public String addEmployeeList(@RequestParam("name") String nameEmployee, @RequestParam("surname") String surnameEmployee, @RequestParam("lastname") String lastnameEmployee, @RequestParam("departamentId") int departmentEmployee, @RequestParam("salary") double salaryEmployee) {
        return employeeService.add(nameEmployee, surnameEmployee, lastnameEmployee, departmentEmployee, salaryEmployee).toString();
    }

}
