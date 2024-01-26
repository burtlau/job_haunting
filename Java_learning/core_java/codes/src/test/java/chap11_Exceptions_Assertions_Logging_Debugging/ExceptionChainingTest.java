package chap11_Exceptions_Assertions_Logging_Debugging;

import org.junit.Test;

import javax.servlet.ServletException;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class ExceptionChainingTest {
    @Test
    public void simulatorDatabseErrorTest()
    {
        ExceptionChaining ec = new ExceptionChaining();
        ServletException se = assertThrows(ServletException.class, () -> ec.simulateDatabaseError());

        Throwable originalCause = se.getCause();
        assertTrue(originalCause instanceof SQLException);

        SQLException sqle = (SQLException) originalCause;
        assertEquals("Database connection error", sqle.getMessage());
        assertEquals(0, sqle.getErrorCode());
        assertEquals(null, sqle.getSQLState());

    }

}