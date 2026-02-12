import java.util.Scanner;

public class KinoZutritt {
    // Erlaubt Zutritt, wenn Alter >= 16 UND (elternBegleitung OR jugendschutzAusweis)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Alter der Person (Ganzzahl): ");

        int alter = sc.nextInt();

        System.out.print("Eltern begleiten? (true/false): ");
        boolean elternBegleitung = sc.nextBoolean();

        System.out.print("Erlaubnis der Eltern vorhanden? (true/false): ");
        boolean elternErlaubnis = sc.nextBoolean();

        if (alter >= 16 && (elternBegleitung || elternErlaubnis)) {
            System.out.println("Zutritt erlaubt.");
        } else {
            System.out.println("Zutritt nicht erlaubt.");
        }
    }
}
