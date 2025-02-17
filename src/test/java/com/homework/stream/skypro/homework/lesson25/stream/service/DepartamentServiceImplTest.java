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
import static org.mockito.Mockito.*;

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
        verify(employeeService,times(1)).findAll();
    }

    @Test
    void findEmployeeWithMaxSalaryEmptyList() {
        when(employeeService.findAll()).thenReturn(emptyList());
        assertThrows(EmployeeNotFoundException.class, () -> out.findEmployeeWithMaxSalary(TEST_DEPARTAMENT_ID));
        verify(employeeService,times(1)).findAll();
    }

    @Test
    void findEmployeeWithMaxSalaryBadDepartament() {
        when(employeeService.findAll()).thenReturn(EMPLOYEE_LIST_DEFAULT);
        assertThrows(EmployeeNotFoundException.class, () -> out.findEmployeeWithMaxSalary(BAD_TEST_DEPARTAMENT_ID));
        verify(employeeService,times(1)).findAll();
    }

    @Test
    void findEmployeeWithMinSalary() {
        when(employeeService.findAll()).thenReturn(EMPLOYEE_LIST_DEFAULT);
        assertEquals(MIN_SALARY_EMPLOYEE, out.findEmployeeWithMinSalary(TEST_DEPARTAMENT_ID));
        verify(employeeService,times(1)).findAll();
    }

    @Test
    void findEmployeeWithMinSalaryEmptyList() {
        when(employeeService.findAll()).thenReturn(emptyList());
        assertThrows(EmployeeNotFoundException.class, () -> out.findEmployeeWithMinSalary(TEST_DEPARTAMENT_ID));
        verify(employeeService,times(1)).findAll();
    }

    @Test
    void findEmployeeWithMinSalaryBadDepartament() {
        when(employeeService.findAll()).thenReturn(EMPLOYEE_LIST_DEFAULT);
        assertThrows(EmployeeNotFoundException.class, () -> out.findEmployeeWithMinSalary(BAD_TEST_DEPARTAMENT_ID));
        verify(employeeService,times(1)).findAll();
    }

    @Test
    void findEmployeeList() {
        when(employeeService.findAll()).thenReturn(EMPLOYEE_LIST_DEFAULT);
        assertEquals(EMPLOYEE_LIST_DEPARTAMENT_ID, out.findEmployeeList(TEST_DEPARTAMENT_ID));
        verify(employeeService,times(1)).findAll();
    }

    @Test
    void findEmployeeListByDepartament() {
        when(employeeService.findAll()).thenReturn(EMPLOYEE_LIST_DEFAULT);
        assertEquals(EMPLOYEE_MAP_DEPARTAMENT_ID, out.findEmployeeListByDepartament());
        verify(employeeService,times(1)).findAll();
    }

    @Test
    void findAmountSalaryAllEmployees() {
        when(employeeService.findAll()).thenReturn(EMPLOYEE_LIST_DEFAULT);
        assertEquals(AMOUNT_SALARY_DEPARTAMENT_ID_0, out.findAmountSalaryallEmployees(TEST_DEPARTAMENT_ID));
        verify(employeeService,times(1)).findAll();
    }

}