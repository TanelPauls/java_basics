package week8.Ex15;

import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {

        if (card1.getCardSuit() == card2.getCardSuit()) {

            return card1.getCardFace() - card2.getCardFace();
        }
        return card1.getCardSuit() - card2.getCardSuit();
    }
}
