public class BankkontoTest {
    public static void main(String[] args) {
        Bankkonto konto = new Bankkonto("Max", "Mustermann", "DE123456", 500);

        konto.einzahlen(200);
        konto.auszahlen(600);

        System.out.println(konto);
        System.out.println("Aktueller Kontostand: " + konto.getKontostand() + " €");
    }
}
