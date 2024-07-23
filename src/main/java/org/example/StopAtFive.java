package org.example;
import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number != 5) {
            System.out.println("Please enter a number:");
            number = scanner.nextInt();
        }

        scanner.close();
    }
}

