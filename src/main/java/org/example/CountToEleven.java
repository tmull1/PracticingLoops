package org.example;
import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number less than 11:");
        number = scanner.nextInt();

        if (number < 11) {
            for (int i = number; i <= 11; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("The number must be less than 11.");
        }

        scanner.close();
    }
}
