package week8.Ex15;

import java.util.Comparator;

public class SortAgainstSuit implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        return card1.getCardSuit()-card2.getCardSuit();
    }
}
