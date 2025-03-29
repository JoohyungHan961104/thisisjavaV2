package org.example.ch04;

import java.util.Random;
import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1; // 1~100 랜덤 숫자 생성
            int userGuess = 0;

            System.out.println("=====================");
            System.out.println("  [ Game Start ]");
            System.out.println("=====================");

            while (userGuess != targetNumber) {
                System.out.print(">> ");
                userGuess = scanner.nextInt();

                if (userGuess > targetNumber) {
                    System.out.println("Lower");
                } else if (userGuess < targetNumber) {
                    System.out.println("Higher");
                } else {
                    System.out.println("Correct.");
                }
            }

            System.out.print("End this game? (y/n) >> ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }

        System.out.println("=====================");
        System.out.println("  [ Game End ]");
        System.out.println("=====================");
        scanner.close();
    }
}

