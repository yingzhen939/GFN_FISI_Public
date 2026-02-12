public class TabellePrintf {
    public static void main(String[] args) {
        // Kopfzeile
        System.out.printf("%-10s %5s %8s%n", "Name", "Alter", "Note");

        // Datenzeilen
        System.out.printf("%-10s %5d %8.2f%n", "Anna", 23, 1.70);
        System.out.printf("%-10s %5d %8.2f%n", "Ben", 30, 2.50);
        System.out.printf("%-10s %5d %8.2f%n", "Clara", 19, 1.30);


        // Alternative Lösung mit vordefiniertem String für den printf() Befehl

        String spaltennamen = "%-10s %5s %8s%n";
        String datenformatierung = "│%-10s│ %5d│ %8.2f│%n";
        System.out.printf(spaltennamen, "Name", "Alter", "Note");
        System.out.println("─────────────────────────────");
        System.out.printf(datenformatierung, "Anna", 23, 1.70);
        System.out.printf(datenformatierung, "Ben", 30, 2.50);
        System.out.printf(datenformatierung, "Clara", 19, 1.30);
        System.out.println("─────────────────────────────");

    }
}
