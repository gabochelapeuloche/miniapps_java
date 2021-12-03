package ferryApp;

public abstract class Vehicule {

    // Propriétés
    
    private String numeroImmatriculation;
    private double hauteur;
    private int poidsVide;
    private double charge = poidsVide;
    final double poidsMoyenPassager = 60.00;

    // Constructeur

    public Vehicule(String immatriculation, double hauteur, int poids) {
        this.numeroImmatriculation = immatriculation;
        this.hauteur = hauteur;
        this.poidsVide = poids;
    }

    // Getter

    public String getImmatriculation() {
        return this.numeroImmatriculation;
    }
    public double getHauteur() {
        return this.hauteur;
    }
    public int getPoidsVide() {
        return this.poidsVide;
    }
    public double getPoidsPassager() {
        return this.poidsMoyenPassager;
    }
    public abstract double getCharge();

    // Setter

    public void setImmatriculation(String immatriculation) {
        this.numeroImmatriculation = immatriculation;
    }
    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
    public void setPoidsVide(int poids) {
        this.poidsVide = poids;
    }
    public void setCharge(double charge) {
        this.charge = charge;
    };

    // Comportements
}
