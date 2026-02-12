import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Girokonto giro = new Girokonto("G-123", 1000, 500);
        Sparkonto sparkonto = new Sparkonto("S-456", 1000, 1.5);

        List<Konto> konten = new ArrayList<>();
        konten.add(giro);
        konten.add(sparkonto);

        // Direkter Zugriff auf konkrete Getter der Unterklassen
        for (Konto k : konten) {
            System.out.println(k.getKontonummer() + ", Saldo: " + k.getSaldo());
            k.abheben(1200);
            k.einzahlen(500);
        }

        // Unterklassen-spezifische Werte separat ausgeben
        System.out.println("Girokonto Überziehungs-Limit: " + giro.getUeberziehungsLimit());
        System.out.println("Sparkonto Zinssatz: " + sparkonto.getZinssatz() + "%");
    }
}
