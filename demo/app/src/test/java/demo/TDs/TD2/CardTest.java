package demo.TDs.TD2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void testCardTypeToString() {
        Card card = new Card(Card.CardType.ACE_CLUBS);
        assertEquals("ACE of CLUBS", card.toString());
    }

    @Test
    void testGetSuit() {
        Card card = new Card(Card.CardType.KING_DIAMONDS);
        assertEquals(Card.Suit.DIAMONDS, card.getSuit());
    }

    @Test
    void testGetRank() {
        Card card = new Card(Card.CardType.TEN_SPADES);
        assertEquals(Card.Rank.TEN, card.getRank());
    }

    @Test
    void testNullCardTypeThrows() {
        assertThrows(AssertionError.class, () -> new Card(null));
    }

    @Test
    void testGetColor() {
        Card card1 = new Card(Card.CardType.ACE_CLUBS);
        assertEquals(Card.Color.BLACK, card1.getSuit().color());
        Card card2 = new Card(Card.CardType.KING_DIAMONDS);
        assertEquals(Card.Color.RED, card2.getSuit().color());
        Card card3 = new Card(Card.CardType.TEN_SPADES);
        assertEquals(Card.Color.BLACK, card3.getSuit().color());
        Card card4 = new Card(Card.CardType.QUEEN_HEARTS);
        assertEquals(Card.Color.RED, card4.getSuit().color());
    }
}
