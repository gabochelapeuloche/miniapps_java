package ferryApp;

public class Camion extends Vehicule {
    // charge bus = poids vide + poids chargement

    // Propriétés

    private int poidsChargement;

    // Constructeur

    public Camion(String immatriculation, double hauteur, int poids, int poidsChargement) {
        super(immatriculation, hauteur, poids);
        this.poidsChargement = poidsChargement;
    }

    // Getter

    public int getNbPersonne() {
        return this.poidsChargement;
    }
    public double getCharge(){
        return this.getPoidsVide() + this.poidsChargement;
    }

    // Setter

    public void setNbPersonne(int poids) {
        this.poidsChargement = poids;
    }
}
