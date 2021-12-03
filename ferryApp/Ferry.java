package ferryApp;

public class Ferry {
    public static void main(String[] args) {
        /*----- Déclaration et instanciation -----*/
        Vehicule[] ferry = new Vehicule[5];
        ferry[0] = new Bus("Bus 01", 3.5, 5000, 50, 1000);
        ferry[1] = new Voiture("Voiture 02", 1.7, 1000, 3);
        ferry[2] = new Voiture("Voiture 03", 1.9, 1000 ,1);
        ferry[3] = new Camion("Camion 04", 3.0, 6000, 10000);
        ferry[4] = new Bus("Bus 02", 3, 4000, 55, 2000);
        
        /*----- Calcul de la charge totale -----*/
        double chargeTotale = 0;

        for (int i = 0; i < ferry.length; i++) {
            chargeTotale += ferry[i].getCharge();
        }

        System.out.println("Charge totale : " + chargeTotale);
    }
}