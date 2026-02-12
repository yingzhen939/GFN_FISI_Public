/*
 * VERERBUNG
 * ========================================================
 * Oft haben Klassen Gemeinsamkeiten, die man "vererben" kann.
 * Beispiel: Auto, Motorrad, LKW -> alle sind "Fahrzeuge".
 *
 * Dafür gibt es in Java die Vererbung.
 * Die Basisklasse nennt man Elternklasse (Superklasse),
 * die abgeleitete Klasse heißt Kindklasse (Subklasse).
 */

public class Fahrzeug {
    // Attribute, die alle Fahrzeuge gemeinsam haben
    private int geschwindigkeit;
    private String marke;
    private int baujahr;

    public Fahrzeug(String marke, int baujahr) {
        this.geschwindigkeit = 0;
        this.marke = marke;
        this.baujahr = baujahr;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public String getMarke() {
        return marke;
    }

    public int getBaujahr() {
        return baujahr;
    }

    // Methode, die in Unterklassen überschrieben werden kann (Polymorphie)
    public void starten(){
        System.out.println("Das Fahrzeug startet.");
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "geschwindigkeit=" + geschwindigkeit +
                ", marke='" + marke + '\'' +
                ", baujahr=" + baujahr +
                '}';
    }
}
