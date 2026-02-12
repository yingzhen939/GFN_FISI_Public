import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Auto auto = new Auto();
//
//        auto.marke = "BMW";
//        auto.modell = "M3";
//        auto.baujahr = 2022;
//        auto.farbe = "Schwarz";
//        auto.geschwindigkeit = 0;

        Auto auto = new Auto("BMW", "M3", 2022, "Schwarz");
        Auto auto2 = new Auto("Mercedes", "E", 2026);

        // Getter nutzen
        System.out.println(auto.getMarke());
        System.out.println(auto.getModell());
        System.out.println(auto.getBaujahr());
        System.out.println(auto.getFarbe());
        System.out.println(auto.getGeschwindigkeit());

        // Farbe ändern
        System.out.println(auto2.getFarbe());
        auto2.setFarbe("Blau");
        System.out.println(auto2.getFarbe());

        // Methodenaufrufe
        System.out.println(auto.getGeschwindigkeit());
        auto.beschleunigen(30);
        System.out.println(auto.getGeschwindigkeit());
        auto.beschleunigen(20);
        System.out.println(auto.getGeschwindigkeit());

        auto.bremsen(25);
        System.out.println(auto.getGeschwindigkeit());
        auto.bremsen(100);
        System.out.println(auto.getGeschwindigkeit());

        // toString() - schöne Ausgabe des Objekts
        System.out.println(auto);

        Auto.getAnzahlErstellterAutos();


//        System.out.println(auto.marke);
//        System.out.println(auto.modell);
//        System.out.println(auto.baujahr);
//        System.out.println(auto.farbe);
//        System.out.println(auto.geschwindigkeit);
//
//        System.out.println("___________");
//
//        System.out.println(auto2.marke);
//        System.out.println(auto2.modell);
//        System.out.println(auto2.baujahr);
//        System.out.println(auto2.farbe);
//        System.out.println(auto2.geschwindigkeit);
//
//        auto.marke = "Volvo";


    }
}
