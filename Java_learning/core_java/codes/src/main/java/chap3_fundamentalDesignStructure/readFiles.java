package chap3_fundamentalDesignStructure;

import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class readFiles {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        String filePath = dir + File.separator + "myfile.txt";

        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(filePath))) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                lines.add(line);
                System.out.println(line);
            }

            for (String line:lines){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}