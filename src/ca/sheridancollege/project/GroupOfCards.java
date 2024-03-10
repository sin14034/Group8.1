/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author Dalwinder
 * @author Dalwinder Singh  March 2024
 */
public class GroupOfCards {

    private ArrayList<Card> cards;

    /**
     * Constructs a new group of cards.
     */
    public GroupOfCards() {
        this.cards = new ArrayList<Card>();
    }

    /**
     * Adds a card to the group.
     *
     * @param card the card to add
     */
    public void addCard(Card card) {
        this.cards.add(card);
    }

    /**
     * Removes a card from the group.
     *
     * @param card the card to remove
     * @return the removed card
     */
    public boolean removeCard(Card card) {
        return this.cards.remove(card);
    }

    /**
     * Returns the number of cards in the group.
     *
     * @return the number of cards
     */
    public int size() {
        return this.cards.size();
    }

    /**
     * Returns a string representation of the group.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : this.cards) {
            sb.append(card);
            sb.append(" ");
        }
        return sb.toString();
    }

    public Iterable<Card> getCards() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
