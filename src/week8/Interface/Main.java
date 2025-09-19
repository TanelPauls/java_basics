package week8.Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<SMS> messages = new ArrayList<SMS>();
        messages.add(new SMS("unknown number", "I hid the body."));
        messages.add(new SMS("ope", "Awesome stuff!"));

        for(SMS message: messages){
            System.out.println(messages);
        }*/

        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Split your method into short clear chunks.");
        pages.add("Devide the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        EBook book = new EBook("Programming Hints.", pages);
        for(int count = 1; count <= book.howManyPages(); count++) {
            System.out.println(book.read());
        }
    }
}
