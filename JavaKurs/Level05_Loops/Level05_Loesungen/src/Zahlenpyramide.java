import java.util.Scanner;

public class Zahlenpyramide {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die Höhe der Pyramide ein:");
        int hoehe = scanner.nextInt();

        // Äußere Schleife: Zeilen
        for (int i = 1; i <= hoehe; i++) {

            // Innere Schleife: Zahlen in jeder Zeile
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // Zeilenumbruch
        }

        scanner.close();
    }
}
