package chap11_Exceptions_Assertions_Logging_Debugging.CheckedExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ParseExceptionExample {
    public static void main(String[] args) {
        String dateStr = "2022-0130";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            Date parseDate = dateFormat.parse(dateStr);
            System.out.println("Parse data " + parseDate);

        } catch (ParseException e)
        {
            System.err.println("Parse Exception: " + e.getMessage());
        }


    }
}
