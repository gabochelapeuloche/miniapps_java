package ferryApp;

public class Voiture extends Vehicule {
    // charge = poids à vide + poids passager

    // Propriétés

    private int nbPersonne;

    // Constructeur

    public Voiture(String immatriculation, double hauteur, int poids, int nbPersonne) {
        super(immatriculation, hauteur, poids);
        this.nbPersonne = nbPersonne;
    }

    // Getter

    public int getNbPersonne() {
        return this.nbPersonne;
    }
    public double getCharge(){
        return this.getPoidsVide() + this.nbPersonne * this.poidsMoyenPassager;
    };

    // Setter

    public void setNbPersonne(int nbPersonne) {
        this.nbPersonne = nbPersonne;
    }
}
