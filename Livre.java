package exercice;


public class Livre {
    private String titre;
    private String auteur;
    private int annee;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getAnnee() { return annee; }

    @Override
    public String toString() {
        return "Livre{" +
               "titre='" + titre + '\'' +
               ", auteur='" + auteur + '\'' +
               ", annee=" + annee +
               '}';
    }
}
/*
 Ce code implémente une classe `Livre` pour modéliser des livres avec des attributs de titre,
 auteur et année. La classe `GestionBibliotheque` utilise un `ArrayList` pour 
 stocker dynamiquement des objets `Livre`, permettant d'ajouter et d'afficher les livres facilement.
 L'utilisation d'une `ArrayList` facilite la gestion de la collection de livres sans nécessiter de taille prédéfinie.
 */