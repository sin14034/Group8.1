package ca.sheridancollege.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author singh
 */
import java.util.ArrayList;

public class Deck {
    
    private ArrayList<Card> cards;
    private int nCards;
    
    public Deck() {
        cards = new ArrayList<Card>();
        nCards = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                cards.add(new Card(rank, suit) {});
            }
        }
        nCards = 52;
    }
    
    public void shuffle() {
        for (int i = 0; i < nCards; i++) {
            int swapIndex = (int) (Math.random() * nCards);
            Card temp = cards.get(i);
            cards.set(i, cards.get(swapIndex));
            cards.set(swapIndex, temp);
        }
    }
    
    public Card draw() {
        if (nCards == 0) {
            throw new RuntimeException("No more cards in the deck!");
        }
        return cards.remove(--nCards);
    }
}
