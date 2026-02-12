public class Girokonto extends Konto {
    private double ueberziehungsLimit;

    public Girokonto(String kontonummer, double saldo, double ueberziehungsLimit) {
        super(kontonummer, saldo);
        this.ueberziehungsLimit = ueberziehungsLimit;
    }

    @Override
    public void abheben(double betrag) {
        if (saldo - betrag >= -ueberziehungsLimit) {
            saldo -= betrag;
            System.out.println(kontonummer + " (Girokonto): " + betrag + " Euro abgehoben. Neuer Saldo: " + saldo);
        } else {
            System.out.println(kontonummer + " (Girokonto): Überziehungs-Limit erreicht!");
        }
    }

    public double getUeberziehungsLimit() {
        return ueberziehungsLimit;
    }

    public String getKontoTyp() {
        return "Girokonto";
    }
}