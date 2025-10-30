package tpcours1;

public class gestionprojet{

}
//❌ Mauvais package : on ne peut pas faire "package java.util.HashSet"
//✅ On importe simplement les classes nécessaires
import java.util.HashMap;
import java.util.Map;

public class GestionProjet {

 // Déclaration d’une HashMap qui associe un Employe à un Projet
 private HashMap<Employe, Projet> mapEmployeProjet = new HashMap<>();

 // Méthode pour associer un employé à un projet
 public void associer(Employe e, Projet p) {
     mapEmployeProjet.put(e, p);
 }

 // Méthode pour afficher toutes les associations Employé-Projet
 public void afficherAssociations() {
     for (Map.Entry<Employe, Projet> entry : mapEmployeProjet.entrySet()) {
         System.out.println(entry.getKey() + " travaille sur " + entry.getValue());
     }
 }

 // Méthode principale pour tester la classe
 public static void main(String[] args) {
     GestionProjet gp = new GestionProjet();

     // Création d’objets Employe et Projet
     Employe e1 = new Employe("Ahmed", 1);
     Employe e2 = new Employe("Fatima", 2);
     Projet p1 = new Projet("Projet A");
     Projet p2 = new Projet("Projet B");

     // Association des employés aux projets
     gp.associer(e1, p1);
     gp.associer(e2, p2);

     // Affichage des associations
     gp.afficherAssociations();
 }
}
