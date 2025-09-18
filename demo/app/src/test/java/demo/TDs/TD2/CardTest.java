package demo.TDs.TD2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    @Test
    void testCardTypeToString() {
        Card card = new Card(Card.CardType.ACE_CLUBS);
        assertEquals("ACE of CLUBS", card.toString());
    }

    @Test
    void testGetSuit() {
        Card card = new Card(Card.CardType.KING_DIAMONDS);
        assertEquals("DIAMONDS", card.getSuit());
    }

    @Test
    void testGetRank() {
        Card card = new Card(Card.CardType.TEN_SPADES);
        assertEquals("10", card.getRank());
    }

    @Test
    void testNullCardTypeThrows() {
        assertThrows(AssertionError.class, () -> new Card(null));
    }
}
