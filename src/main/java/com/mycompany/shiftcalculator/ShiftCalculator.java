package com.mycompany.shiftcalculator;

public class ShiftCalculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Collects inputed data and converts it from string to double
        System.out.println("Enter hours worked:");
        double hours = scanner.nextDouble();

        System.out.println("Please enter hourly rate:");
        double rate = scanner.nextDouble();

        // Formula to calculate the weekly pay
        double totalPay = hours * rate;

        // Display of the final result
        System.out.println("You have worked for " + hours + " hours at the rate of R" + rate + " per hour.");
        System.out.println("Total pay: R" + totalPay);

        scanner.close();
    }
}
