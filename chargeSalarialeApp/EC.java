package chargeSalarialeApp;

public class EC extends Enseignant {
    public EC(String nom, String prenom, int nbHeureAnnee) {
        super(nom, prenom, nbHeureAnnee);
    }

    public int getSalaire() {
        if (this.nbHeureAnnee > MAXHEUREEC) {
            return (this.nbHeureAnnee - MAXHEUREEC) * TARIFHEURESUPP + SALAIREMOIS * 12;
        } else {
            return SALAIREMOIS * 12;
        }
    }
}
