import java.util.ArrayList;
import java.util.Scanner;

public class EinzigartigeNamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namenListe = new ArrayList<>();
        String eingabe;

        while (true) {
            System.out.print("Gib einen Namen ein (\"stop\" zum Beenden): ");
            eingabe = scanner.nextLine();
            if (eingabe.equals("stop")) {
                break;
            }
            if (!namenListe.contains(eingabe)) {
                namenListe.add(eingabe);
            } else {
                System.out.println("Dieser Name ist bereits vorhanden.");
            }
        }

        System.out.println("Liste aller Namen: " + namenListe);
        scanner.close();
    }
}