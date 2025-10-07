package demo.TDs.TD3;
import demo.TDs.TD2.Card;
import java.util.List;

public interface iHand extends Iterable<Card>, Comparable<iHand>{

    public void addCard(Card card);

    public void removeCard(Card card);

    public boolean contains(Card card);

    public boolean isEmpty();

    public int size();

    public boolean isFull();

    public List<Card> getCards();

}
