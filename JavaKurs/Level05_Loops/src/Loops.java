import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Python: for i range(1:10:2)

        // =========================
        // 1) For-Schleife
        //
        //      * Aufbau: for(Startwert; Bedingung; Iteration) { ... }
        //      *
        //      * Beispiel: for (int i = 1; i <= 5; i++)
        //      * -> int i = 1    : Startwert – die Schleife beginnt mit i = 1
        //      * -> i <= 5       : Bedingung – die Schleife läuft, solange i <= 5
        //      * -> i++          : Iteration – nach jedem Durchlauf wird i um 1 erhöht
        //
        // =========================

        System.out.println("For Schleife von 1 bis 5:");
        for (int i = 1; i <= 5; i++){
            System.out.println("i = " + i);
        }

        System.out.println("For Schleife von 5 bis 1:");
        for (int i = 5; i > 0; i--){
            System.out.println("i = " + i);
        }

        String name = "Maximilian";
        System.out.println("For-Schleife über einen String");
        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }

        // =========================
        // 2) While-Schleife
        //
        //      * Aufbau:
        //      * while(Bedingung) {
        //      *     // Code, der wiederholt wird solange Bedingung = True
        //      * }
        //
        // =========================

        int counter = 1;
        System.out.println("While-Schleife mit 3 Durchläufen");
        while (counter <= 3){
            System.out.println("counter = " + counter);
            counter++;
        }

        // =========================
        // 3) Do-While-Schleife
        //
        //      * do {
        //      *     // Code, der mindestens einmal ausgeführt wird
        //      * } while (Bedingung);
        //
        // =========================

        Scanner scanner = new Scanner(System.in);
        int eingabe;

        do {
            System.out.print("Gib eine Zahl ein (0 zum Beenden): ");
            eingabe = scanner.nextInt();
            System.out.println("Du hast " + eingabe + " eingegeben");
        } while (eingabe != 0);

        // =========================
        // 4) Break & Continue
        //
        //      * break -> beendet die Schleife sofort, auch wenn die Bedingung noch true ist
        //      * continue -> überspringt den Rest des aktuellen Durchlaufs und springt zur nächsten Runde
        //
        // =========================

        System.out.println("For Schleife mit break und continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5){
                continue;
            }
            if (i == 8){
                break;
            }
            System.out.println(i);
        }

        while (true){           // Endlosschleife
            System.out.println("Zahl eingeben: ");
            int zahl = scanner.nextInt();

            if (zahl < 0){
                System.out.println("Negative Zahl erkannt, Schleife wird beendet.");
                break;      // Schleife wird sofort beendet
            }
            System.out.println("Du hast " + zahl + " eingegeben");
        }
    }
}
