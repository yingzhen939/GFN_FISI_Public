public class Auto extends Fahrzeug {
    // Klassenattribut für die Klasse Auto
    private int anzahlTueren;

    // Konstruktor
    public Auto(int anzahlTueren, String marke, int baujahr){
        super(marke, baujahr); // Ruft Konstruktor von Fahrzeug auf
        this.anzahlTueren = anzahlTueren;
    }

    @Override
    public void starten() {
        System.out.println("Das Auto startet mit einem Zündschlüssel");
    }

    @Override
    public String toString() {
        return "Auto{" +
                super.toString() +
                "anzahlTueren=" + anzahlTueren +
                '}';
    }
}
