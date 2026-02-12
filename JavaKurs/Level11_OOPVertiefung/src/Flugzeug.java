public class Flugzeug extends Fahrzeug implements Fliegen {
    private int anzahlPassagiere;

    public Flugzeug(String marke, int baujahr, int anzahlPassagiere) {
        super(marke, baujahr);
        this.anzahlPassagiere = anzahlPassagiere;
    }

    @Override
    public void fliegen(int meter) {
        System.out.println("Das Flugzeug fliegt " + meter + " Meter weit zum Flughafen");
    }

    @Override
    public void stoppen() {
        Fliegen.super.stoppen();
    }
}
