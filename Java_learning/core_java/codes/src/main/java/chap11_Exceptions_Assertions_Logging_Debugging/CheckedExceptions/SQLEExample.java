package chap11_Exceptions_Assertions_Logging_Debugging.CheckedExceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLEExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/nonexistentdb";
        String username = "user";
        String password = "password";

        try
        {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();
            statement.execute("SLECT * FROM nonexistenttable");

        } catch (SQLException e)
        {
            System.err.println("SQL Exception: " + e.getMessage());
        }
    }
}
