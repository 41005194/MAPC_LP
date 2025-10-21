package demo.Cours.C3;

public class Card {
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum Suit {
        CLUBS, DIAMONDS, SPADES, HEARTS
    }

    private Rank rank;
    private Suit suit;

    /**
     * Creates a new card.
     * @param rank
     * @param suit
     * @pre rank != null && suit != null
     */
    public Card(Rank rank, Suit suit) {
        assert rank != null;
        assert suit != null;
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Suit of a card.
     * @return the suit of the card.
     */
    public Suit suit() {
        return suit;
    }

    /**
     * Rank of a card.
     * @return the rank of the card.
     */
    public Rank rank() {
        return rank;
    }

    /**
     * Returns a string representation of this card.
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
