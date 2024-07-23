package org.example;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        while (number != 0) {
            System.out.println("Enter a number:");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Number must be a positive number");
            } else if (number > 0) {
                System.out.println("Number is " + number);
            }
        }

        scanner.close();
        System.out.println("You entered zero, ending the program.");
    }
}
