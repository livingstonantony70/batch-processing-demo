package com.javatechie.spring.batch;

import com.javatechie.spring.batch.utis.CustomObjectSort;
import com.javatechie.spring.batch.utis.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BatchProcessingDemoApplication {

    public static void main(String[] args) {

        /*
         * Create 10 Employee Object
         */
        Employee emp1 = new Employee(1, "Nayan", "IT");
        Employee emp2 = new Employee(2, "Siddarth", "CP");
        Employee emp3 = new Employee(3, "Samarth", "AE");
        Employee emp4 = new Employee(4, "Bhavesh", "CV");
        Employee emp5 = new Employee(5, "Sam", "FT");
        Employee emp6 = new Employee(6, "Keyur", "IT");
        Employee emp7 = new Employee(7, "Bala", "ME");
        Employee emp8 = new Employee(8, "Mitul", "ME");
        Employee emp9 = new Employee(9, "Kamlesh", "EE");
        Employee emp10 = new Employee(10, "Piyush", "EE");

        /*
         * List of Employee Object
         */
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        employeeList.add(emp8);
        employeeList.add(emp9);
        employeeList.add(emp10);

        CustomObjectSort customObjectSort = new CustomObjectSort();
        List<Employee> sortByDepartment = customObjectSort.sortByDepartment(employeeList);

        /*
         * Sorted By Department
         */
        for (Employee employee : sortByDepartment) {
            System.out.println(employee);
        }

        /*
         * Sorted By Name
         */
        List<Employee> sortByName = customObjectSort.sortByName(employeeList);

        for (Employee employee : sortByName) {
            System.out.println(employee);
        }

        /*
         * Sorted By Id
         */
        List<Employee> sortById = customObjectSort.sortById(employeeList);

        for (Employee employee : sortById) {
            System.out.println(employee);
        }


        SpringApplication.run(BatchProcessingDemoApplication.class, args);
    }

}
