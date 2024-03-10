/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author singh
 */
import java.util.ArrayList;

public class Hand {
    
    private ArrayList<Card> cards;
    
    public Hand() {
        cards = new ArrayList<Card>();
    }
    
    public void addCard(Card card) {
        cards.add(card);
    }
    
    public Card removeCard(int index) {
        return cards.remove(index);
    }
    
    public Card removeCard(Card card) {
        return cards.remove(cards.indexOf(card));
    }
    
    public int getSize() {
        return cards.size();
    }
    
    public void displayHand() {
        System.out.println("Player hand: ");
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    
    public boolean hasBook(Card card) {
        int count = 0;
        for (Card c : cards) {
            if (c.getRank() == card.getRank()) {
                count++;
            }
        }
        if (count == 4) {
            return true;
        } else {
            return false;
    }
    }
}