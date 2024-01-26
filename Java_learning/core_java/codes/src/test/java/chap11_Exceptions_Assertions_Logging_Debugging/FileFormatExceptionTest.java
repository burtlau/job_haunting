package chap11_Exceptions_Assertions_Logging_Debugging;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileFormatExceptionTest {
    /**
     * test FileFormatException with message as input.
     */
    @Test
    public void testFileFormatExceptionWithMessage()
    {
        String errorMessage = "Invalid file format";
        assertThrows(FileFormatException.class, () -> {
            throw new FileFormatException(errorMessage);
        });

        try
        {
            throw new FileFormatException(errorMessage);
        } catch (FileFormatException e)
        {
            assertEquals(errorMessage, e.getMessage());
        }
    }

    /**
     * test FileFormatException without sending message.
     */
    @Test
    public void testFileFormatExceptionWithoutMessage()
    {
        assertThrows(FileFormatException.class, () -> {
            throw new FileFormatException();
        });

        try {
            throw new FileFormatException();
        } catch (FileFormatException e) {
            assertEquals(null, e.getMessage());
        }
    }

}