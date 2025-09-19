package week8.Ex15;

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cardsInHand = new ArrayList<Card>(); //this one initializes new array, no nullpointerexception
    /*private ArrayList<Card> cards;*/

    public void add(Card card){
        this.cardsInHand.add(card);
    }
    public void print(){
        for (Card card : cardsInHand) {
            System.out.println(card.toString());
        }
    }
    public void sort(){
        Collections.sort(cardsInHand);
    }

    @Override
    public int compareTo(Hand hand) {
        int valueHand1 = 0;
        int valueHand2 = 0;

        for (Card card : this.cardsInHand) {
            valueHand1 +=card.getCardFace();
        }
        for (Card card : hand.cardsInHand) {
            valueHand2 +=card.getCardFace();
        }
        return valueHand1-valueHand2;
    }

    public void sortAgainstSuit() {
        Collections.sort(cardsInHand, new SortAgainstSuitAndValue());
    }
}
