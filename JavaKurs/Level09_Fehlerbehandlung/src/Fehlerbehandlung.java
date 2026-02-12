import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fehlerbehandlung {
    public static void main(String[] args) {

        /*
         * FEHLERBEHANDLUNG IN JAVA
         * ========================
         * In Java gibt es zwei wichtige Arten von Exceptions:
         *
         * 1) Unchecked Exceptions (Runtime Exceptions)
         *    - treten zur Laufzeit auf
         *    - Compiler zwingt NICHT zur Behandlung
         *
         * 2) Checked Exceptions
         *    - werden vom Compiler geprüft
         *    - MÜSSEN behandelt werden
         */

        // ============================
        // Beispiel 1: Unchecked Exception (Division durch 0)
        // ============================

        int a = 10;
        int b = 5;

        try{
            int c = a / b;
            System.out.println("Ergebnis: " + c);
        } catch (ArithmeticException e){
            System.out.println("Fehler: Division durch 0 nicht erlaubt! " + e);
        } finally {
            System.out.println("finally: Dieser Block wird immer ausgeführt");
        }

        // ============================
        // Beispiel 2: Checked Exception (Datei mit Scanner einlesen)
        // ============================

        // - Wir wollen eine Textdatei lesen
        // - Die Datei könnte aber fehlen
        // - Deshalb zwingt uns Java zur Fehlerbehandlung

        Scanner fileScanner = null;

        String name = "";

        try {
            fileScanner = new Scanner(new File("daten.txt"));
            System.out.println("Datei erfolgreich geöffnet");
        } catch (FileNotFoundException e) {
            System.out.println("Fehler: Datei nicht gefunden!");
        } finally {
            fileScanner.close();
        }

    }
}
