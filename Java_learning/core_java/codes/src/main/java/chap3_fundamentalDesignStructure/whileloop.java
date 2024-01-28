package chap3_fundamentalDesignStructure;

import java.util.*;

public class whileloop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("how much money you need for retirement?");
        double goal = in.nextDouble();

        System.out.println("how much money you contribue every year?");
        double yearly = in.nextDouble();

        System.out.println("interest rate in %:");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += yearly;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("you can retire in "+ years + " years");
    }
}