package week3.Ex50;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 50");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = sc.nextLine();
        if(name.length()>=3){
            System.out.println("1. character: "+name.charAt(0));
            System.out.println("2. character: "+name.charAt(1));
            System.out.println("3. character: "+name.charAt(2));
        }

    }
}
