package chap11_Exceptions_Assertions_Logging_Debugging.CheckedExceptions;

import chap11_Exceptions_Assertions_Logging_Debugging.FileFormatException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
        List<String> fileContent = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
        } catch (FileNotFoundException e)
        {
            System.err.println("File not found: " + filename);
            e.printStackTrace();

        } catch (IOException e)
        {
            System.err.println("An error occuring while reading the file: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
