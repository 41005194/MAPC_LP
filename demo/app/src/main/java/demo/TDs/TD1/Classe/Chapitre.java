package demo.TDs.TD1.Classe;

public class Chapitre implements Document{

    //Attributs
    private String titre;
    private String[] pages;

    //Constructeur
    public Chapitre(String titre, String[] pages) {
        this.titre = titre;
        this.pages = pages;
    }

    //Méthodes
    public String titre(){
        return titre;
    }

    public int taille(){
        return pages.length;
    }
}
