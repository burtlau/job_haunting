import java.util.Scanner;
import java.util.InputMismatchException;

public class breakTest{
    public static int readData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***input a number >=0:");
        try{
            int readData = scanner.nextInt();
            return readData;

        } catch (InputMismatchException e){
            throw e;
        }
    }
    public static void main(String[] args){
        int data;
        do{
             try{
                 data = readData();
                 if (data <= 0 ){
                     System.out.println("***the numer < 0");
                     break;
                 }
             } catch (InputMismatchException e){
                 System.out.println("invalid input");
             }
        } while (true);
    }
}