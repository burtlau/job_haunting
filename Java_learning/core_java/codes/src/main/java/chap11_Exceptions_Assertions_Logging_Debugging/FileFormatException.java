package chap11_Exceptions_Assertions_Logging_Debugging;

import java.io.IOException;

public class FileFormatException extends IOException
{
    public FileFormatException(){}
    public FileFormatException(String message)
    {
        super(message);
    }
}
