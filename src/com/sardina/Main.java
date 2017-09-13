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


        System.out.println("Just text");
    }

}
