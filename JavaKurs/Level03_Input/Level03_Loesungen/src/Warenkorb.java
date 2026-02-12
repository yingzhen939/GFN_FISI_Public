import java.util.Scanner;

public class Warenkorb {
    // Einfacher Warenkorb: fragt Artikelname, Preis und Menge ab und gibt Menge + Gesamtpreis aus
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Artikel eingeben
        System.out.print("Welchen Artikel möchtest du kaufen? -> ");
        String artikel = scanner.next();

        // Preis eingeben
        System.out.print("Wie viel kostet der Artikel? -> ");
        double preis = scanner.nextDouble();

        // Menge eingeben
        System.out.print("Wie viele Stück sollen in den Warenkorb gelegt werden? -> ");
        int menge = scanner.nextInt();

        double gesamt = menge * preis;

        // Ausgabe im gewünschten Format
        System.out.println();
        System.out.println("Du hast " + menge + "x " + artikel + " gekauft.");
        System.out.printf("Der Gesamtpreis ist %.2f €%n", gesamt);
    }
}
