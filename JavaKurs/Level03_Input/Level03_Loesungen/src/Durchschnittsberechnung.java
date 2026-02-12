import java.util.Scanner;

public class Durchschnittsberechnung {
    // Liest drei Gleitkommazahlen ein, berechnet den Durchschnitt und gibt ihn formatiert aus
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib drei Noten ein:");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        double durchschnitt = (n1 + n2 + n3) / 3.0;
        System.out.printf("Der Durchschnitt ist: %.2f%n", durchschnitt);
    }
}
