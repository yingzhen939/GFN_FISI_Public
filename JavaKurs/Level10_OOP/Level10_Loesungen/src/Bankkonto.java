public class Bankkonto {

    // Attribute
    private String vorname;
    private String nachname;
    private String kontonummer;
    private double kontostand;
    private double limit; // Überziehungslimit (negativer Betrag erlaubt)

    // Konstruktor mit Anfangskontostand
    public Bankkonto(String vorname, String nachname, String kontonummer, double kontostand, double limit) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.limit = limit;
    }

    // Alternativer Konstruktor ohne Anfangskontostand (Start bei 0)
    public Bankkonto(String vorname, String nachname, String kontonummer, double limit) {
        this(vorname, nachname, kontonummer, 0.0, limit);
    }

    public void setLimit(double limit){
        if (limit < 0) {
            throw new IllegalArgumentException("Dispolimit darf nicht negativ sein");
        }
        this.limit = limit;
    }

    // Einzahlung
    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand += betrag;
        } else {
            System.out.println("Einzahlungsbetrag muss positiv sein.");
        }
    }

    // Auszahlung
    public boolean auszahlen(double betrag) {
        if (betrag <= 0) {
            System.out.println("Auszahlungsbetrag muss positiv sein.");
            return false;
        }

        if (kontostand - betrag >= -limit) {
            kontostand -= betrag;
            return true;
        } else {
            System.out.println("Auszahlung nicht möglich: Überziehungslimit überschritten.");
            return false;
        }
    }

    // Abfrage des Kontostandes
    public double getKontostand() {
        return kontostand;
    }

    // Ausgabe der Kontodaten
    @Override
    public String toString() {
        return "Kontoinhaber: " + vorname + " " + nachname +
                "\nKontonummer: " + kontonummer +
                "\nKontostand: " + kontostand + " €" +
                "\nÜberziehungslimit: " + limit + " €";
    }
}
