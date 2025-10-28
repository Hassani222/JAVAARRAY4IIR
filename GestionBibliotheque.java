package exercice;

import java.util.ArrayList;

class GestionBibliotheque {
    private ArrayList<Livre> livres;

    public GestionBibliotheque() {
        livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void afficherLivres() {
        for(Livre l : livres) {
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        GestionBibliotheque gb = new GestionBibliotheque();
        gb.ajouterLivre(new Livre("L'Étranger", "Albert Camus", 1942));
        gb.ajouterLivre(new Livre("1984", "George Orwell", 1949));
        gb.afficherLivres();
    }
}