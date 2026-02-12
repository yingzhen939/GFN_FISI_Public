public class Konkatenationsfallen {
    public static void main(String[] args) {
        int zahl = 55;

        // Erstes Ergebnis: "5555"
        // Erklärung: Zahlen werden nach String-Verkettung zu Strings und zusammengefügt
        System.out.println("Erst Ausgabe: " + zahl + zahl);

        // Zweites Ergebnis: "110"
        // Erklärung: Klammern sorgen dafür, dass zuerst addiert wird, dann zu String konvertiert
        System.out.println("MZweite Ausgabet: " + (zahl + zahl));
    }
}
