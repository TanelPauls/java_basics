package week2.Ex41;

import java.util.Random;

public class randomNumber {
    public static int chooseBetweenInclusive(int x, int y) {
        Random rand = new Random();
        return rand.nextInt(y - x + 1) + x;
    }
}