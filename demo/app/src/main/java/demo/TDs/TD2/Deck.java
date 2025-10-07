package demo.TDs.TD2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deck {
    
    private List<Card> cards = new ArrayList<>();

    /**
     * Creates a deck of cards (one for each CardType) and shuffles it.
     */
    public Deck() {
        for (Card.CardType cardType : Card.CardType.values()) {
            cards.add(new Card(cardType));
        }
        Collections.shuffle(cards);
    }

    /**
     * Creates a deck of cards from another one.
     * Performs a copy.
     * @param deck
     */
    public Deck(Deck deck) {
        this.cards = new ArrayList<>(deck.cards);
    }

    /**
     * Draws a card from the deck.
     * An alternative could be to return an Optional<Card> and remove the assert.
     * @return the drawn card
     * @pre size() != 0 (Optional to be used in a future version)
     */
    public Card draw() {
        assert size() > 0;
        return cards.remove(0);
    }

    /**
     * Returns the number of cards in the deck.
     * A question is if this is needed or just an isEmpty method.
     * @return the number of cards in the deck
     */
    public int size() {
        return cards.size();
    }

    /**
     * Returns the card at a given index.
     * A question is if this is needed or if one should just use isEmpty + draw.
     * @param index the index of the card to return
     * @return the card at the given index
     * @pre index >= 0 && index < size() (Optional to be used in a future version)
     */
    public Card cardAt(int index) {
        assert index >= 0 && index < size();
        return cards.get(index);
    }

    /**
     * Returns a list of all the cards in the deck.
     * A copy is done to prevent the deck from being modified.
     * A question is whether such an operation should be provided or not.
     * @return a list of all the cards in the deck
     */
    public List<Card> cards() {
        return new ArrayList<>(cards);
    }

    // remarque :
    // la méthode toString ne doit pas révéler ce qu'on est (un Deck) et le fait de
    // revéler les cartes
    // peut être un problème si on ne souhaite pas que l'API permette de toutes les
    // connaître (sans les tirer une par une).
    // Pour l'instant c'est OK mais dans la suite on supprimera cette méthode pour
    // cette raison.

    /**
     * Returns a string representation of the deck.
     */
    @Override
    public String toString() {
        return "[" + cards.stream().map(Card::toString).collect(Collectors.joining(", ")) + "]";
    }
}