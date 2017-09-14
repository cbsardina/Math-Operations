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

        for (String result: results) {
            System.out.println(result);
        }
    }
    public static String[] showResults(double add,
                                       double diff,
                                       double div,
                                       double multi,
                                       double remain) {

        String sumResult = "The sum of your two numbers is " + add + ".";
        String differenceResult = "The difference between your two numbers is " + diff + ".";
        String divisionResult = "Your quotient of your two numbers is " + div + ".";
        String multiplicationResult = "The product of your two numbers is " + multi + ".";
        String moduloResult = "The remainder (modulo) when your two numbers are divided is " + remain + ".";

        return new String[] {sumResult, differenceResult, divisionResult, multiplicationResult, moduloResult};
    }
}
