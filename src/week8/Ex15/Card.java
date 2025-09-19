package week8.Ex15;

public class Card implements Comparable<Card> {
    public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;

    private int cardFace;
    private int cardSuit;

    public Card(int cardFace, int cardSuit) {
        this.cardFace = cardFace;
        this.cardSuit = cardSuit;
    }

    public int getCardFace() {
        return cardFace;
    }

    public int getCardSuit() {
        return cardSuit;
    }

    private String cardFaceToString(int cardFace) {
        if (cardFace <= 10) {
            return String.valueOf(cardFace);
        }
        if (cardFace == 11) return "J";
        if (cardFace == 12) return "Q";
        if (cardFace == 13) return "K";
        if (cardFace == 14) return "A";

        return "Invalid";
    }

    private String cardSuitToString(int cardSuit) {
        if (cardSuit == 0) return "Spades";
        if (cardSuit == 1) return "Diamonds";
        if (cardSuit == 2) return "Hearts";
        if (cardSuit == 3) return "Clubs";

        return "Invalid";
    }


    @Override
    public String toString() {
        return cardFaceToString(this.cardFace)+" of "+cardSuitToString(this.cardSuit);
    }

    @Override
    public int compareTo(Card card) {

        if (this.cardFace == card.cardFace) {
            if(this.cardSuit == card.cardSuit) {
                return 0;
            } else {
                if (this.cardSuit > card.cardSuit) {
                    return 1;
                } else {
                    return -1;
                }
            }

        } else {
            if (this.cardFace > card.cardFace) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
