package chargeSalarialeApp;

public class Paiements {
    
    public static void main (String[] args) {
        int masseSalariale = 0;
        Enseignant[] arrEnseignants = new Enseignant[14];
        arrEnseignants[0] = new Doctorant("Nom", "Prenom", 26);
        arrEnseignants[1] = new Doctorant("Nom", "Prenom", 96);
        arrEnseignants[2] = new Doctorant("Nom", "Prenom", 96);
        arrEnseignants[3] = new Doctorant("Nom", "Prenom", 96);
        arrEnseignants[4] = new Doctorant("Nom", "Prenom", 96);
        arrEnseignants[5] = new Vacataire("Nom", "Prenom", 96, "L", "Bac");
        arrEnseignants[6] = new Vacataire("Nom", "Prenom", 96, "L", "Bac");
        arrEnseignants[7] = new Vacataire("Nom", "Prenom", 96, "M", "Bac");
        arrEnseignants[8] = new Vacataire("Nom", "Prenom", 96, "M", "Bac");
        arrEnseignants[9] = new Vacataire("Nom", "Prenom", 96, "M", "Bac");
        arrEnseignants[10] = new EC("Nom", "Prenom", 96);
        arrEnseignants[11] = new EC("Nom", "Prenom", 96);
        arrEnseignants[12] = new EC("Nom", "Prenom", 96);
        arrEnseignants[13] = new EC("Nom", "Prenom", 96);

        for (int i = 0; i < arrEnseignants.length; i ++) {
            masseSalariale += arrEnseignants[i].getSalaire();
        }
        System.out.println(masseSalariale);
    }
}
