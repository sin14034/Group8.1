
import ca.sheridancollege.project.Rank;
import ca.sheridancollege.project.Card;
import ca.sheridancollege.project.GroupOfCards;

public abstract class Player {

    private String name;
    private GroupOfCards hand;

    /**
     * Constructs a new player with the given name and an empty hand.
     *
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.hand = new GroupOfCards();
    }

    /**
     * Gets the name of the player.
     *
     * @return the name of the player
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the hand of the player.
     *
     * @return the hand of the player
     */
    public GroupOfCards getHand() {
        return this.hand;
    }

    /**
     * Adds a card to the player's hand.
     *
     * @param card the card to add
     */
    public void addCard(Card card) {
        this.hand.addCard(card);
    }

    /**
     * Checks if the player has a card with the given rank.
     *
     * @param rank the rank to check
     * @return true if the player has a card with the given rank, false otherwise
     */
    public boolean hasCard(Rank rank) {
        for (Card card : this.hand.getCards()) {
            if (card.getRank() == rank) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the card with the given rank from the player's hand.
     *
     * @param rank the rank of the card to get
     * @return the card with the given rank, or null if the player doesn't have a card with that rank
     */
    public Card getCard(Rank rank) {
        for (Card card : this.hand.getCards()) {
            if (card.getRank() == rank) {
                this.hand.removeCard(card);
                return card;
            }
        }
        return null;
    }
}


