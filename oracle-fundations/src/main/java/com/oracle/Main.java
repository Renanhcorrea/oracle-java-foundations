package com.oracle;

import com.oracle.entity.Department;
import com.oracle.entity.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Employee employeeOne = new Employee(100, "Daiane", 2350.00);
        Employee employeeTwo = new Employee(101, "Renan", 2330.00);

        Department department = new Department("Education");

        department.addEmployee(employeeOne);
        department.addEmployee(employeeTwo);

        Employee[] employees = department.getEmployees();

        for (Employee employee : employees) {
            System.out.println(employee); 
        }

        System.out.println("Total: R$ " + department.getTotalSalary());
        System.out.println("Average: R$ " + department.getAverageSalary());

    }
}