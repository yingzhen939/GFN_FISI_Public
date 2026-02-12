import java.util.Scanner;

public class Output {
    public static void main(String[] args) {

        // Beispielvariablen
        int zahl = 12;
        String name = "Lena";
        char buchstabe = 'L';
        double temperatur = 21.1651654;

        // =========================
        // 1) println()
        // =========================
        // Gibt aus und springt danach in die nächste Zeile

        System.out.println("Hello World");      // -> "Hello World" + newline
        System.out.println("Zahl: " + zahl);    // -> String-Konkatenation

        // Wichtig: Reihenfolge bei der String-Konkatenation
        System.out.println(zahl + zahl + " ist das Ergebnis");      // 24 ist das Ergebnis
        System.out.println("Ergebnis: " + zahl + zahl);             // "Ergebnis 1212"
        System.out.println("Ergebnis: " + (zahl + zahl));             // "Ergebnis 24"

        // =========================
        // 1) print()
        // =========================
        // Gibt aus, SPRINGT ABER NICHT IN EINE NEUE ZEILE

        System.out.print("Ohne Zeilenumbruch: ");
        System.out.print(zahl);
        System.out.print(" <-- hier endet die Zeile\n");     // \n manuell für neue Zeile (Escape-Zeichen)

        System.out.println("_______________");

        System.out.print("Hier steht vor vor dem Tabulator\t");     // \t für Tabulator (Einrückung)
        System.out.print("Dieser Text erscheint hinter dem Tabulator\n");
        System.out.println("Hier gehts nach dem Tabulator weiter");

        System.out.println("_______________");

        // =========================
        // 3) printf() — formatierte Ausgabe
        // =========================

        // printf verwendet Format-Placeholders wie:
        // %s -> String
        // %d -> ganze Zahl (int, long etc.)
        // %f -> Fließkommazahl (float, double)
        // %c -> einzelnes Zeichen (char)
        //
        // Wichtig: printf springt NICHT automatisch in die neue Zeile.
        // Verwende %n (plattformunabhängig) oder \n (Unix/Linux/Mac) für Zeilenumbruch.

        // %s wird durch einen String 'name' ersetzt
        System.out.printf("Hallo %s%n", name);

        // %n fügt einen Zeilenumbruch ein (Plattformunabhängig)
        // %d ersetzt eine ganze Zahl
        System.out.printf("Du bist %d Jahre alt.%n", 25);

        // %c ersetzt ein Zeichen
        System.out.printf("Hallo %s Dein Name beginnt mit %c%n", name, buchstabe);

        // %f ersetzt eine Fließkommazahl
        // Standardmäßig werden 6 Nachkommastellen angezeigt
        System.out.printf("Temperatur (voll): %f%n", temperatur);

        // %.3f rundet die Fließkommazahl auf 3 Nachkommastellen
        System.out.printf("Temperatur (gerundet) %.3f%n", temperatur);

        // ====================
        // String.format
        // ====================


        // String.format funktioniert wie printf, liefert aber eine formatierte Zeichenkette,
        // die man z.B. weiterverarbeiten oder speichern kann
        String meldung = String.format("%s: %.1f°C", "Klima", temperatur);
        System.out.println(meldung);

    }
}
