package week7.Ex7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        System.out.println(dictionary.amountOfWords());

        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }*/


        /*Scanner reader = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();*/

        String input = "add\n"  + "cheese\n" + "juusto\n" +
                "add\n"  + "bier\n" + "olut\n" +
                "add\n"  + "book\n" + "kirja\n" +
                "add\n"  + "computer\n" + "tietokone\n" +
                "add\n"  + "auto\n" + "car\n" +
                "translate\n" + "cheese\n" +
                "quit\n";

        Scanner reader = new Scanner(input);
        Dictionary dictionary = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
