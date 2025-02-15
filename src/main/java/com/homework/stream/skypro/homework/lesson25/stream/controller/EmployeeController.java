package com.homework.stream.skypro.homework.lesson25.stream.controller;

import com.homework.stream.skypro.homework.lesson25.stream.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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
    //Добавление сотрудника в лист сотрудников
    @GetMapping(path = "/employee/add")
    public String addEmployeeList(@RequestParam("name") String nameEmployee,
                                  @RequestParam("surname") String surnameEmployee,
                                  @RequestParam("lastname") String lastnameEmployee,
                                  @RequestParam("departamentId") int departmentEmployee,
                                  @RequestParam("salary") double salaryEmployee) {
        return employeeService.add(nameEmployee, surnameEmployee, lastnameEmployee, departmentEmployee, salaryEmployee).toString();
    }

    //localhost:8080/employee/NatNat/remove
    //Удаление сотрудника из листа сотрудников
    @GetMapping(path = "/employee/{idemployee}/remove")
    public String removeEmployeeList(@PathVariable("idemployee") String idemployee) {
        return employeeService.remove(idemployee).toString();
    }

    //localhost:8080/employee/NatNat/find
    //Поиск сотрудника в листе сотрудников
    @GetMapping(path = "/employee/{idemployee}/find")
    public String findEmployeeList(@PathVariable("idemployee") String idemployee) {
        return employeeService.find(idemployee).toString();
    }

}
