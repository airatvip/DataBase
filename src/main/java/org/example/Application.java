package org.example;

import java.sql.*;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args)  {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//        Employee vladimir = new Employee("Vladimir", "Sukhorukov", "male", 42, 2);
//        employeeDAO.add(vladimir);

//        System.out.println(employeeDAO.getById(1));

//        System.out.println(employeeDAO.allEmployee());
//
        Employee igor2 = new Employee(1, "Igor",  "Ivanov", "male", 50 , 1);
        employeeDAO.updateEmployee(igor2);





    }

}


