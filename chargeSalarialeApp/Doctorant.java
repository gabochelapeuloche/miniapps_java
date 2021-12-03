package chargeSalarialeApp;

public class Doctorant extends Enseignant {
    // CONSTRUCTEUR
    public Doctorant(String nom, String prenom, int nbHeureAnnee) {
        super(nom, prenom, nbHeureAnnee);
    }

    public int getSalaire() {
        if (this.nbHeureAnnee > 96) {
            return 96 * TARIFHEURESUPP;
        } else {
            return this.nbHeureAnnee * TARIFHEURESUPP;
        }
    }
}
