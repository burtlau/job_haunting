package chap11_Exceptions_Assertions_Logging_Debugging;

import javax.servlet.ServletException;
import java.sql.SQLException;


public class ExceptionChaining {
    public static void main(String[] args) {
        try
        {
            simulateDatabaseError();
        } catch (ServletException se) {
            Throwable originalCause = se.getCause();
            if (originalCause instanceof SQLException)
            {
                SQLException sqle = (SQLException) originalCause;
                System.out.println("Database error code: " + sqle.getErrorCode());
                System.out.println("SQL State: " + sqle.getSQLState());
                sqle.printStackTrace();
            } else {
                se.printStackTrace();
            }

        }
    }

    public static void simulateDatabaseError() throws ServletException
    {
        try
        {
            throw new SQLException("Database connection error");
        } catch (SQLException e) {
            ServletException se = new ServletException("Database error occured");
            se.initCause(e);
            throw se;
        }
    }
}


