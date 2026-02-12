public class Rechteck extends Form {
    private double breite;
    private double hoehe;

    public Rechteck(double breite, double hoehe) {
        super("Rechteck");
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    public double berechneFlaeche() {
        return breite * hoehe;
    }
}
