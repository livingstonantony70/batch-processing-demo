package com.javatechie.spring.batch.utis;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomObjectSort {

    public List<Employee> sortByName(List<Employee> employeeList) {

        Collections.sort(employeeList, new Comparator<Employee>() {

            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }

        });
        return employeeList;
    }

    public List<Employee> sortByDepartment(List<Employee> employeeList) {

        Collections.sort(employeeList, new Comparator<Employee>() {

            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getDepartment().compareTo(employee2.getDepartment());
            }

        });
        return employeeList;
    }

    public List<Employee> sortById(List<Employee> employeeList) {

        Collections.sort(employeeList, new Comparator<Employee>() {

            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getId() - employee2.getId();
            }

        });
        return employeeList;
    }

}