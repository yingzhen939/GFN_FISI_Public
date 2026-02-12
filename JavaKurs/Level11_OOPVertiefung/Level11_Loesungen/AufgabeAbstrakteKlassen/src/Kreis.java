public class Kreis extends Form {
    private double radius;

    public Kreis(double radius) {
        super("Kreis");
        this.radius = radius;
    }

    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}