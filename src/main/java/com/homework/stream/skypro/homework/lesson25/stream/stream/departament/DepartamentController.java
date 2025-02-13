package com.homework.stream.skypro.homework.lesson25.stream.stream.departament;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartamentController {

    private final DepartamentService departamentService;

    public DepartamentController(DepartamentService departamentService) {
        this.departamentService = departamentService;
    }

    //возвращает список сотрудников по департаменту
    @GetMapping(path = "/departments/{departmentId}/employees")
    public String findEmployeeList(@PathVariable("departmentId") Integer departmentId) {
        return departamentService.findEmployeeList(departmentId).toString();
    }

    //возвращает сумму зарплат по департаменту
    @GetMapping(path = "/departments/{departmentId}/salary/sum")
    public String findAmountSalaryAllEmployeesDepartament(@PathVariable("departmentId") Integer departmentId) {
        return departamentService.findAmountSalaryallEmployees(departmentId).toString();
    }

    //возвращает максимальную зарплату по департаменту
    @GetMapping(path = "/departments/{departmentId}/salary/max")
    public String maxSalary(@PathVariable("departmentId") Integer departmentId) {
        return departamentService.findEmployeeWithMaxSalary(departmentId).toString();
    }

    //возвращает минимальную зарплату по департаменту
    @GetMapping(path = "/departments/{departmentId}/salary/min")
    public String minSalary(@PathVariable("departmentId") Integer departmentId) {
        return departamentService.findEmployeeWithMinSalary(departmentId).toString();
    }

    //возвращает сотрудников, сгруппированых по отделам
    @GetMapping(path = "/departments/employees")
    public String findEmployeeListByDepartament() {
        return departamentService.findEmployeeListByDepartament().toString();
    }


}
