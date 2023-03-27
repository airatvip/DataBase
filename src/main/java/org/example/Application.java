package org.example;

import java.sql.*;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args)  {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();
//        Employee vladimir = new Employee("Vladimir", "Sukhih", "male", 72, 7);
//        employeeDAO.add(vladimir);

//        System.out.println(employeeDAO.getById(1));

//        System.out.println(employeeDAO.allEmployee());
//
//        Employee igor2 = new Employee(1, "Igor",  "Ivanov", "male", 50 , 1);
//        employeeDAO.updateEmployee(igor2);

        City orenburg = new City(8,"Orenburger");
        cityDAO.add(orenburg);

        System.out.println(cityDAO.getById(1));
        System.out.println(cityDAO.allCity());

        cityDAO.updateCity(orenburg);
        cityDAO.deleteCity(orenburg);
    }

}


