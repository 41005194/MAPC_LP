package demo.TDs.TD3;
import demo.TDs.TD2.Card;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hand implements iHand {
    
    public enum GameType {
        POKER,
        BRIDGE;

        public int maxCards() {
            switch (this) {
                case POKER:
                    return 5;
                case BRIDGE:
                    return 13; 
                default:
                    throw new IllegalArgumentException("Unknown game type");
            }
        }
    }

    private Collection<Card> cards;
    private int N;

    public Hand(GameType gameType) {
        this.N = gameType.maxCards();
        this.cards = new ArrayList<>(N);
    }
    
    @Override
    public void addCard(Card card) {
        if (!isFull()) {
            cards.add(card);
        } else {
            throw new IllegalStateException("Hand is full");
        }
    }

    @Override
    public void removeCard(Card card) {
        cards.remove(card);
    }

    @Override
    public boolean contains(Card card) {
        return cards.contains(card);
    }

    @Override
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public int size() {
        return cards.size();
    }

    @Override
    public boolean isFull() {
        return cards.size() == N;
    }

    @Override
    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    @Override
    public Iterator<Card> iterator() {
        List<Card> copy = new ArrayList<>(cards);
        copy.sort((c1, c2) -> c1.getRank().ordinal() - c2.getRank().ordinal());
        return copy.iterator();
    }

    @Override
    public int compareTo(iHand o) {
        return 0;
    }

}
