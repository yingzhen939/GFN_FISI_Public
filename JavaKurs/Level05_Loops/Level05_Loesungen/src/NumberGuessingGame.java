import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Zufallszahl zwischen 1 und 100 erzeugen
        Random rand = new Random();
        int zufallsZahl = rand.nextInt(101); // 1 bis 100

        Scanner scanner = new Scanner(System.in);
        int tipp = 0;

        System.out.println("Willkommen zum Zahlenraten! Errate die Zahl zwischen 1 und 100.");

        // Solange der Tipp nicht korrekt ist
        while (tipp != zufallsZahl) {
            System.out.print("Tipp: ");
            tipp = scanner.nextInt();

            if (tipp < zufallsZahl) {
                System.out.println("Zu klein");
            } else if (tipp > zufallsZahl) {
                System.out.println("Zu groß");
            } else {
                System.out.println("Richtig! Du hast die Zahl erraten.");
            }
        }

        scanner.close();
    }
}