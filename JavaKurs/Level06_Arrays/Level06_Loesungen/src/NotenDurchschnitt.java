import java.util.Scanner;

public class NotenDurchschnitt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] noten = new double[5];

        System.out.println("Bitte gib 5 Noten ein (z.B. 1.5):");
        for (int i = 0; i < noten.length; i++) {
            System.out.print("Note " + (i+1) + ": ");
            noten[i] = scanner.nextDouble();
        }

        double summe = 0.0;
        for (double d : noten) {
            summe += d;
        }

        double durchschnitt = summe / noten.length;
        System.out.printf("Der Durchschnitt ist: %.2f%n", durchschnitt);

        String bewertung;
        if (durchschnitt < 2.0) {
            bewertung = "Sehr gut";
        } else if (durchschnitt < 3.0) {
            bewertung = "Gut";
        } else if (durchschnitt < 4.0) {
            bewertung = "Befriedigend";
        } else {
            bewertung = "Verbesserungsbedarf";
        }
        System.out.println("Bewertung: " + bewertung);

        scanner.close();
    }
}
