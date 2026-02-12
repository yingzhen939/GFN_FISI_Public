public class Sparkonto extends Konto {
    private double zinssatz;

    public Sparkonto(String kontonummer, double saldo, double zinssatz) {
        super(kontonummer, saldo);
        this.zinssatz = zinssatz;
    }

    @Override
    public void abheben(double betrag) {
        if (saldo >= betrag) {
            saldo -= betrag;
            System.out.println(kontonummer + " (Sparkonto): " + betrag + " Euro abgehoben. Neuer Saldo: " + saldo);
        } else {
            System.out.println(kontonummer + " (Sparkonto): Nicht genügend Guthaben!");
        }
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public String getKontoTyp() {
        return "Sparkonto";
    }
}