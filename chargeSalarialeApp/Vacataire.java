package chargeSalarialeApp;

public class Vacataire extends Enseignant {
    String niveau = "";
    String dernierDiplome = "";

    // CONSTRUCTEUR

    public Vacataire(String nom, String prenom, int nbHeureAnnee, String niveau, String diplome) {
        super(nom, prenom, nbHeureAnnee);
        this.niveau = niveau;
        this.dernierDiplome = diplome;
    }

    public int getSalaire() {
        return this.nbHeureAnnee * TARIFHEURESUPP;
    }
}
