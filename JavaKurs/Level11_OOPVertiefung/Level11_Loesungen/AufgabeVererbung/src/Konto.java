public class Konto {
    String kontonummer;
    double saldo;

    public Konto(String kontonummer, double saldo) {
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public void einzahlen(double betrag) {
        saldo += betrag;
        System.out.println(kontonummer + ": " + betrag + " Euro eingezahlt. Neuer Saldo: " + saldo);
    }

    public void abheben(double betrag) {
        if (saldo >= betrag) {
            saldo -= betrag;
            System.out.println(kontonummer + ": " + betrag + " Euro abgehoben. Neuer Saldo: " + saldo);
        } else {
            System.out.println(kontonummer + ": Nicht genügend Guthaben!");
        }
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getSaldo() {
        return saldo;
    }
}