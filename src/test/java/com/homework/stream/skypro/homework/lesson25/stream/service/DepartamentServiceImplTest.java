package com.homework.stream.skypro.homework.lesson25.stream.service;

import com.homework.stream.skypro.homework.lesson25.stream.exception.EmployeeNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.homework.stream.skypro.homework.lesson25.stream.service.EmployeeListTestData.*;
import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DepartamentServiceImplTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private DepartamentServiceImpl out;

    @Test
    void findEmployeeWithMaxSalary() {
        when(employeeService.findAll()).thenReturn(EMPLOYEE_LIST_DEFAULT);
        assertEquals(MAX_SALARY_EMPLOYEE, out.findEmployeeWithMaxSalary(TEST_DEPARTAMENT_ID));
    }

    @Test
    void findEmployeeWithMaxSalaryEmptyList() {
        when(employeeService.findAll()).thenReturn(emptyList());
        assertThrows(EmployeeNotFoundException.class,() -> out.findEmployeeWithMaxSalary(TEST_DEPARTAMENT_ID));
    }

    @Test
    void findEmployeeWithMinSalary() {
        when(employeeService.findAll()).thenReturn(EMPLOYEE_LIST_DEFAULT);
        assertEquals(MIN_SALARY_EMPLOYEE, out.findEmployeeWithMinSalary(TEST_DEPARTAMENT_ID));
    }

    @Test
    void findEmployeeWithMinSalaryEmptyList() {
        when(employeeService.findAll()).thenReturn(emptyList());
        assertThrows(EmployeeNotFoundException.class,() -> out.findEmployeeWithMinSalary(TEST_DEPARTAMENT_ID));
    }

    @Test
    void findEmployeeList() {
    }

    @Test
    void findEmployeeListByDepartament() {
    }

    @Test
    void findAmountSalaryallEmployees() {
    }

}