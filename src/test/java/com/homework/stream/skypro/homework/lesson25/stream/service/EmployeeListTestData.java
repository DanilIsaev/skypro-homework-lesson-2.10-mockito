package com.homework.stream.skypro.homework.lesson25.stream.service;

import com.homework.stream.skypro.homework.lesson25.stream.employee.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Константы JUnit тестов для класса EmployeeService
public class EmployeeListTestData {
    public static final List<Employee> EMPLOYEE_LIST_DEFAULT = new ArrayList<Employee>(List.of(
            new Employee("Nat", "Nat", "Nat", 0, 30000),
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
    public static final List<Employee> EMPLOYEE_LIST_AFTER_REMOVE = new ArrayList<Employee>(List.of(
            new Employee("Nat", "Nat", "Nat", 0, 30000.5),
            new Employee("tat", "tat", "tat", 1, 50000),
            new Employee("yat", "yat", "yat", 2, 60000.67),
            new Employee("uat", "uat", "uat", 0, 70000),
            new Employee("iat", "iat", "iat", 1, 80000.56)
            /*new Employee("oat", "oat", "oat", 2, 90000)*/
    ));

    public static final String DATA_FOR_FIND = "NatNat";

    public static final Employee RESULT_FIND_EMPLOYEE = new Employee("Nat", "Nat", "Nat", 0, 30000.5);

    public static final String EMPLOYEE_NOT_FOUND = "ZXCZXC";

    public static final int TEST_DEPARTAMENT_ID = 0;

    public static final int BAD_TEST_DEPARTAMENT_ID = 100;

    public static final Employee MAX_SALARY_EMPLOYEE = new Employee("uat", "uat", "uat", 0, 70000);

    public static final Employee MIN_SALARY_EMPLOYEE = new Employee("Nat", "Nat", "Nat", 0, 30000);

    public static final Double AMOUNT_SALARY_DEPARTAMENT_ID_0 = 100000D;

    public static final List<Employee> EMPLOYEE_LIST_DEPARTAMENT_ID = new ArrayList<>(List.of(MIN_SALARY_EMPLOYEE, MAX_SALARY_EMPLOYEE));

    public static final Map<Integer, List<Employee>> EMPLOYEE_MAP_DEPARTAMENT_ID = new HashMap<>();

    static {
        EMPLOYEE_MAP_DEPARTAMENT_ID.put(
                0, List.of(
                        new Employee("Nat", "Nat", "Nat", 0, 30000.5),
                        new Employee("uat", "uat", "uat", 0, 70000)
                )
        );
        EMPLOYEE_MAP_DEPARTAMENT_ID.put(
                1, List.of(
                        new Employee("tat", "tat", "tat", 1, 50000),
                        new Employee("iat", "iat", "iat", 1, 80000.56)
                )
        );
        EMPLOYEE_MAP_DEPARTAMENT_ID.put(
                2, List.of(
                        new Employee("yat", "yat", "yat", 2, 60000.67),
                        new Employee("oat", "oat", "oat", 2, 90000)
                )
        );
    }

}
