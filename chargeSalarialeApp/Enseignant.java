package chargeSalarialeApp;

public abstract class Enseignant {

    // Proprietes

    protected String nom;
    protected String prenom;
    protected int nbHeureAnnee;
    public static final int TARIFHEURESUPP = 40;
    public static final int MAXHEUREDOC = 96;
    public static final int MAXHEUREEC = 192;
    public static final int SALAIREMOIS = 2000;

    // Constructeur

    public Enseignant (String nom, String prenom, int nbHeureAnnee) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbHeureAnnee = nbHeureAnnee;
    }

    // Getter

    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public int getNbHeureAnnee() {
        return this.nbHeureAnnee;
    }
    public int getTarrifheuresup() {
        return TARIFHEURESUPP;
    }
    public int getSalaireMois() {
        return SALAIREMOIS;
    }
    public int getMaxHeureDoc() {
        return MAXHEUREDOC;
    }
    public int getMaxHeureEc() {
        return MAXHEUREEC;
    }
    public abstract int getSalaire();

    // Setter

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNbHeureAnnee(int nbHeure) {
        this.nbHeureAnnee = nbHeure;
    }
}
