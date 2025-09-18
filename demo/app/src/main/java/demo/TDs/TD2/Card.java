package demo.TDs.TD2;

public class Card {
    public enum CardType {
        ACE_CLUBS, TWO_CLUBS, THREE_CLUBS, FOUR_CLUBS, FIVE_CLUBS, SIX_CLUBS, SEVEN_CLUBS, EIGHT_CLUBS, NINE_CLUBS, TEN_CLUBS, JACK_CLUBS, QUEEN_CLUBS, KING_CLUBS,
        ACE_DIAMONDS, TWO_DIAMONDS, THREE_DIAMONDS, FOUR_DIAMONDS, FIVE_DIAMONDS, SIX_DIAMONDS, SEVEN_DIAMONDS, EIGHT_DIAMONDS, NINE_DIAMONDS, TEN_DIAMONDS, JACK_DIAMONDS, QUEEN_DIAMONDS, KING_DIAMONDS,
        ACE_HEARTS, TWO_HEARTS, THREE_HEARTS, FOUR_HEARTS, FIVE_HEARTS, SIX_HEARTS, SEVEN_HEARTS, EIGHT_HEARTS, NINE_HEARTS, TEN_HEARTS, JACK_HEARTS, QUEEN_HEARTS, KING_HEARTS,
        ACE_SPADES, TWO_SPADES, THREE_SPADES, FOUR_SPADES, FIVE_SPADES, SIX_SPADES, SEVEN_SPADES, EIGHT_SPADES, NINE_SPADES, TEN_SPADES, JACK_SPADES, QUEEN_SPADES, KING_SPADES
    }

    private CardType cardType;

    /**
     * Creates a new card.
     * @param cardType
     * @pre cardType != null
     */
    public Card(CardType cardType) {
        assert cardType != null;
        this.cardType = cardType;
    }

    /**
     * Suit of a card.
     * @return the suit of the card.
     */
    public String getSuit() {
        if (cardType.ordinal() < 13) {
            return "CLUBS";
        } else if (cardType.ordinal() < 26) {
            return "DIAMONDS";
        } else if (cardType.ordinal() < 39) {
            return "HEARTS";
        } else {
            return "SPADES";
        }
    }

    /**
     * Rank of a card.
     * @return the rank of the card.
     */
    public String getRank() {
        if (cardType.ordinal() % 13 == 0) {
            return "ACE";
        } else if (cardType.ordinal() % 13 == 10) {
            return "JACK";
        } else if (cardType.ordinal() % 13 == 11) {
            return "QUEEN";
        } else if (cardType.ordinal() % 13 == 12) {
            return "KING";
        } else {
            return String.valueOf((cardType.ordinal() % 13) + 1);
        }
    }

    /**
     * Returns a string representation of this card.
     */
    @Override
    public String toString() {
        return getRank() + " of " + getSuit();
    }
}
