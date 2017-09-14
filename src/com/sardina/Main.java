package com.sardina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        String number1 = scanner.nextLine();

        System.out.println("Please enter a second number.");
        String number2 = scanner.nextLine();

        double operand1 = Double.parseDouble(number1);
        double operand2 = Double.parseDouble(number2);

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

        String results[] = showResults(sum, difference, division, multiplication, remainder);

        for(String result: results) System.out.println(result);
    }

    public static String[] showResults(double sum,
                                       double difference,
                                       double division,
                                       double multiplication,
                                       double remainder) {

        String sumResult = "The sum of your two numbers is " + sum + ".";
        String differenceResult = "The difference between your two numbers is " + difference + ".";
        String divisionResult = "Your quotient of your two numbers is " + division + ".";
        String multiplicationResult = "The product of your two numbers is " + multiplication + ".";
        String moduloResult = "The remainder (modulo) when your two numbers are divided is " + remainder + ".";

        return new String[] {sumResult, differenceResult, divisionResult, multiplicationResult, moduloResult};
    }
}
