public class DebuggingAusgabe {
    // Korrigierte Version des fehlerhaften Codes
    public static void main(String[] args) {
        // Fehler 1: Fehlendes Anführungszeichen bei "Hallo"
        System.out.println("Hallo");

        // Fehler 2: %d erwartet int, hier double -> %f
        System.out.printf("Wert: %f %n", 3.14);

        // Fehler 3: Hello World ohne Anführungszeichen -> muss String sein
        System.out.print("Hello World");
    }
}
