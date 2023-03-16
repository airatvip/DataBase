package org.example;

import java.sql.*;

public class Application {


    public static void main(String[] args) throws SQLException {

        final String user = "postgres";
        final String password = "l1271064732";
        final String url = "jdbc:postgresql://localhost:5432/skypro";


        try (final Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/skypro", "postgres", "l1271064732")) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee FULL JOIN city " +
                    "ON employee.city_id = city.city_id WHERE id = (?)");
            {

                statement.setInt(1, 6);
                final ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String gender = resultSet.getString(4);
                    int age = resultSet.getInt(5);
                    String city = resultSet.getString("city_name");


                    System.out.println("Имя: " + firstName);
                    System.out.println("Фамилия: " + lastName);
                    System.out.println("Пол: " + gender);
                    System.out.println("Возраст: " + age + " лет");
                    System.out.println("Город: " + city);

                    EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//                    Employee igor =  new Employee(11, "Igor", "Vlasov", "male", 30, 2);
//                    employeeDAO.add(igor);
//
//                    System.out.println(employeeDAO.getById(3));

//                    System.out.println(employeeDAO.allEmployee());
//                    Employee igorek =  new Employee("Igoreks", "Vlasov", "male", 30, 2);
//                    employeeDAO.updateEmployee(11,igorek);

                    employeeDAO.deleteEmployee(11);

                }
            }
        }
    }

}


