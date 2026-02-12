import java.util.ArrayList;
import java.util.Scanner;

public class Warenkorb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> warenkorb = new ArrayList<>();
        int wahl = 0;

        while (wahl != 4) {
            System.out.println("Wähle eine Option:");
            System.out.println("1 - Produkt hinzufügen");
            System.out.println("2 - Produkt entfernen");
            System.out.println("3 - Warenkorb anzeigen");
            System.out.println("4 - Beenden");
            System.out.print("Deine Wahl: ");
            wahl = scanner.nextInt();

            switch (wahl) {
                case 1:
                    System.out.print("Welches Produkt möchtest du hinzufügen? ");
                    String produktAdd = scanner.next();
                    warenkorb.add(produktAdd);
                    System.out.println(produktAdd + " wurde hinzugefügt.");
                    break;
                case 2:
                    System.out.print("Welches Produkt möchtest du entfernen? ");
                    String produktRemove = scanner.next();
                    if (warenkorb.remove(produktRemove)) {
                        System.out.println(produktRemove + " wurde entfernt.");
                    } else {
                        System.out.println("Produkt nicht im Warenkorb.");
                    }
                    break;
                case 3:
                    System.out.println("Aktueller Warenkorb: " + warenkorb);
                    break;
                case 4:
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Option.");
            }
        }
        scanner.close();
    }
}
