package org.example;

import java.util.List;

public interface EmployeeDAO {
    void add(Employee employee);

    Employee getById(int id);

    List<Employee> allEmployee();

    void updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);
}
