package exercice;

import java.util.LinkedList;

public class Tache {
    private String description;
    private boolean estComplete;

    public Tache(String description) {
        this.description = description;
        this.estComplete = false;
    }

    public String getDescription() { return description; }
    public boolean estComplete() { return estComplete; }
    public void terminer() { estComplete = true; }

    @Override
    public String toString() {
        return "Tache{" + "description='" + description + '\'' + ", estComplete=" + estComplete + '}';
    }
}
class GestionTaches {
    private LinkedList<Tache> taches = new LinkedList<>();

    public void ajouterTache(Tache tache) {
        taches.add(tache);
    }

    public void terminerPremiereTache() {
        if (!taches.isEmpty()) {
            taches.getFirst().terminer();
        }
    }

    public void afficherTaches() {
        for (Tache t : taches) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        GestionTaches gt = new GestionTaches();
        gt.ajouterTache(new Tache("Faire les devoirs"));
        gt.ajouterTache(new Tache("Préparer la présentation"));
        gt.terminerPremiereTache();
        gt.afficherTaches();
    }
}