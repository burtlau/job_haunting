package chap11_Exceptions_Assertions_Logging_Debugging;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try{
            readFile("Nonesense.txt");

        } catch (IOException e)
        {
            System.out.println("FileNotFoundException occured: " + e.getMessage());
        }
    }

    public static void readFile(String filename) throws FileNotFoundException
    {
        throw new FileNotFoundException("File not found :" + filename);
    }
}
