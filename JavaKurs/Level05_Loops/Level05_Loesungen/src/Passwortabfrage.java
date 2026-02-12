// Aufgabe 4: Passwortabfrage
import java.util.Scanner;

public class Passwortabfrage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwort = "java123";
        String eingabe;

        do {
            System.out.print("Bitte Passwort eingeben: ");
            eingabe = scanner.next();

            if (!eingabe.equals(passwort)) {
                System.out.println("Falsches Passwort, versuche es erneut.");
            }
        } while (!eingabe.equals(passwort));

        System.out.println("Passwort korrekt!");
        scanner.close();
    }
}