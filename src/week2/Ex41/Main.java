package week2.Ex41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = randomNumber.chooseBetweenInclusive(0, 100);
        System.out.println("Exercise 41");
        System.out.println();
        System.out.println("HINT: correct answer: "+number);
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int x;
        int counter=1;
        do {
            System.out.print("Guess a number: ");
            x = sc.nextInt();

            if (x > number) {
                System.out.println("The number is lesser, guesses made: "+counter);
                counter++;
            } else if (x < number) {
                System.out.println("The number is greater, guesses made: "+counter);
                counter++;
            } else {
                System.out.println("Congratulations, your guess is correct!");
            }
        } while (x != number);

        sc.close();
    }
}
