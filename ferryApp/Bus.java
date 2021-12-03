package ferryApp;

public class Bus extends Vehicule {
    // charge bus = poids vide + poids total passager + poids bagae

    // Propriétés

    private int nbPassage;
    private int poidsBagage;

    // Constructeur

    public Bus(String immatriculation, double hauteur, int poids, int nbPassage, int poidsBagage) {
        super(immatriculation, hauteur, poids);
        this.nbPassage = nbPassage;
        this.poidsBagage = poidsBagage;
    }

    // Getter

    public double getCharge(){
        return this.getPoidsVide() + this.nbPassage * this.poidsMoyenPassager + this.poidsBagage;
    };

    // Setter

    public void setNbPersonne(int nbPersonne) {
        this.nbPassage = nbPersonne;
    }
    public void setNbBagage(int poids) {
        this.poidsBagage = poids;
    }
}
