import java.util.Objects;

/**
 * Classe représentant un étudiant avec un nom et un numéro unique.
 * Elle redéfinit les méthodes equals, hashCode et toString pour une
 * meilleure gestion dans les collections et un affichage lisible.
 */
public class Etudiant {
    // Attributs privés pour l'encapsulation
    private String nom;
    private int numero;

    /**
     * Constructeur de la classe Etudiant.
     * @param nom    le nom de l'étudiant
     * @param numero le numéro unique de l'étudiant
     */
    public Etudiant(String nom, int numero) {
        this.nom = nom;
        this.numero = numero;
    }

    // ----- Getters -----

    /** 
     * Retourne le nom de l'étudiant.
     * @return nom de l'étudiant
     */
    public String getNom() { 
        return nom; 
    }

    /** 
     * Retourne le numéro de l'étudiant.
     * @return numéro de l'étudiant
     */
    public int getNumero() { 
        return numero; 
    }

    // ----- Méthodes redéfinies -----

    /**
     * Vérifie l'égalité entre deux objets Etudiant.
     * Deux étudiants sont considérés égaux s'ils ont le même nom et le même numéro.
     * @param o l'objet à comparer
     * @return true si les deux étudiants sont identiques, false sinon
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Même référence
        if (o == null || getClass() != o.getClass()) return false; // Type différent
        Etudiant etudiant = (Etudiant) o;
        return numero == etudiant.numero && nom.equals(etudiant.nom);
    }

    /**
     * Génère un code de hachage cohérent avec equals.
     * @return le code de hachage basé sur le nom et le numéro
     */
    @Override
    public int hashCode() {
        return Objects.hash(nom, numero);
    }

    /**
     * Retourne une représentation textuelle de l'objet Etudiant.
     * @return une chaîne de caractères décrivant l'étudiant
     */
    @Override
    public String toString() {
        return "Etudiant{" + "nom='" + nom + '\'' + ", numero=" + numero + '}';
    }
}
