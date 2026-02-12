public class FormatiereMitPrintf {
    public static void main(String[] args) {
        String name = "Anna";
        int alter = 25;
        double groesse = 1.68;

        // Ausgabe mit printf und formatierter Zeile
        System.out.printf("Name: %s, Alter: %d Jahre, Größe: %.2f m%n", name, alter, groesse);
    }
}
