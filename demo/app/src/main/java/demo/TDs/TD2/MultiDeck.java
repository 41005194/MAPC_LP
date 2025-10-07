package demo.TDs.TD2;

import java.util.ArrayList;
import java.util.List;

public class MultiDeck {
    private List<Deck> decks;

    public MultiDeck(int numberOfDecks) {
        decks = new ArrayList<>();
        for (int i = 0; i < numberOfDecks; i++) {
            decks.add(new Deck());
        }
    }

    public java.util.List<Deck> getDecks() {
        return decks;
    }

}
