/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dalwinder
 */
public abstract class Card {
   private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }
public void setSuit(int suit) {
        this.suit = suit;
    }
@Override
public String toString() {
    return rank + " of " + suit;
}

public boolean equals(Card card) {
    if (card == null) {
        return false;
    }
       return false;
}
}
