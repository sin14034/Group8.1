/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dalwinder
 * @author Dalwinder Singh March 2024
 */


   /**
 * The class that models the Go Fish game.ss
 *
 * @author your name
 * @date March 10, 2024
 */
public class GoFishGame extends Game {

    private ArrayList<GoFishPlayer> players;
    private Deck deck;
    private int turn;

    /**
     * Constructs a new Go Fish game with the given name and number of players.
     *
     * @param name the name of the game
     * @param numPlayers the number of players
     */
    public GoFishGame(String name, int numPlayers) {
        super(name);
        this.players = new ArrayList<GoFishPlayer>();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new GoFishPlayer());
        }
        this.deck = new Deck();
        this.turn = 0;
        this.deck.shuffle();
        dealCards();
    }

    /**
     * Deals cards to each player in the game.
     */
    private void dealCards() {
        for (int i = 0; i < 7; i++) {
            for (Player player : players) {
                Card card = deck.draw();
                if (card == null) {
                    System.out.println("Not enough cards to deal.");
                    return;
                }
                ((GoFishPlayer) player).gotCard(card);
            }
        }
    }

    /**
     * Plays the Go Fish game.
     */
    @Override
    public void play() {
        while (!isEndOfPlay()) {
            GoFishPlayer player = (GoFishPlayer) players.get(turn % players.size());
            Card cardFished = player.fish();
            if (cardFished == null) {
                System.out.println("No cards left to fish.");
                break;
            }
            int result = player.gotCard(cardFished);
            if (result == 0) {
                System.out.println("Player " + player.getName() + " fished a " + cardFished + ".");
                if (!player.endOfPlayCheck()) {
                    break;
                }
            }
            turn++;
            System.out.printf("\nScores: \n%s: %d\n%s: %d\n", players.get(0).getName(), players.get(0).getScore(), players.get(1).getName(), players.get(1).getScore());
            if (players.get(0).getScore() > players.get(1).getScore()) {
                System.out.println(players.get(0).getName() + " won!");
            } else if (players.get(0).getScore() < players.get(1).getScore()) {
                System.out.println(players.get(1).getName() + " won!");
            } else {
                System.out.println("Draw!");
            }
        }
    }

    /**
     * Declares the winner of the Go Fish game.
     */
    @Override
    public void declareWinner() {
        if (players.get(0).getScore() > players.get(1).getScore()) {
            System.out.println(players.get(0).getName() + " won!");
        } else if (players.get(0).getScore() < players.get(1).getScore()) {
            System.out.println(players.get(1).getName() + " won!");
        } else {
            System.out.println("Draw!");
        }
    }

    /**
     * Checks if the game is over.
     *
     * @return true if the game is over, false otherwise
     */
    private boolean isEndOfPlay() {
        if (deck.isEmpty()) {
            return true;
        }
        for (Player player : players) {
            if (!((GoFishPlayer) player).endOfPlayCheck())) {
                return false;
            }
        }
