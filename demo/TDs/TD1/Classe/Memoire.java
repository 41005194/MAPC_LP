package demo.TDs.TD1.Classe;

import java.util.List;
import java.util.ArrayList;

public class Memoire implements Document {

    private String titre;
    private List<Chapitre> cs; // mieux : Document (on reverra ça avec Composite)

    public Memoire(String titre, List<Chapitre> cs) {
        this.titre = titre;
        this.cs = new ArrayList<>(cs); // recopie
    }

    @Override
    public String titre() {
        return this.titre;
    }

    @Override
    public int taille() {
        return cs.stream().mapToInt(Chapitre::taille).sum();
    }
    
}
