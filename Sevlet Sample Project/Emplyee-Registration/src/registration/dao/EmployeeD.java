package registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import registration.model.Employee;

public class EmployeeD {
	public int registerEmployee(Employee emp) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO employee" +
            "  (first_name, last_name, username, password, address, contact) VALUES " +
            " (?, ?, ?, ?, ?,?);";

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false", "root", "YassiKula@1998");

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
//            preparedStatement.setInt(1,1);
            preparedStatement.setString(1, emp.getFirstName());
            preparedStatement.setString(2, emp.getLastName());
            preparedStatement.setString(3, emp.getUsername());
            preparedStatement.setString(4, emp.getPassword());
            preparedStatement.setString(5, emp.getAddress());
            preparedStatement.setString(6, emp.getContact());

            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
           
            e.printStackTrace();
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}
