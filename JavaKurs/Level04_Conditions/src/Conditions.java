import java.time.LocalDateTime;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        // ========================
        // 1) Vergleichsoperatoren
        // ========================

        int a = 5;
        int b = 8;

        System.out.println("a == b: " + (a == b));  // Ist a genau gleich b?
        System.out.println("a != b: " + (a != b));  // Ist a ungleich b?
        System.out.println("a > b: " + (a > b));  // Ist a größer b?
        System.out.println("a >= b: " + (a >= b));  // Ist a größer ODER gleich b?
        System.out.println("a < b: " + (a < b));  // Ist a kleiner b?
        System.out.println("a <= b: " + (a <= b));  // Ist a kleiner ODER gleich b?

        // =========================
        // 2) If / else / else if
        // =========================
        /*
         * If-Bedingungen werden verwendet, um Entscheidungen im Code zu treffen.
         * Der Code prüft eine Bedingung (true oder false).
         * - if: wird ausgeführt, wenn die Bedingung wahr ist
         * - else if: prüft weitere Bedingungen, falls vorherige false waren
         * - else: wird ausgeführt, wenn keine der Bedingungen zutrifft
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gib dein Alter ein: ");
        int alter = scanner.nextInt();

        if (alter >= 18){               // Wenn alter größer oder gleich 18 ist, dann führe den Code innerhalb der geschweiften Klammern aus
            System.out.println("Du bist volljährig!");
        } else {                        // In JEDEM anderen Fall, führe diesen Code aus
            System.out.println("Du bist nicht volljährig!");
        }

        System.out.print("Bitte gib eine Note (1-6) ein: ");
        int note = scanner.nextInt();

        if (note == 1){
            System.out.println("Sehr gut!");
        } else if (note == 2) {
            System.out.println("Gut!");
        } else if (note == 3) {
            System.out.println("Befriedigend!");
        } else if (note == 4) {
            System.out.println("Ausreichend!");
        } else if (note == 5) {
            System.out.println("Mangelhaft!");
        } else {
            System.out.println("Ungenügend!");
        }

        int x = 8;
        int y = 8;

        // Auch möglich aber seltener genutzt (LZK Frage)
        // If Bedingung OHNE Klammern, wenn nur ein Statement/Befehl in einer Zeile ausgeführt werden soll
        if (x == y) System.out.println("x ist genau gleich y");

        // =========================
        // 3) Logische Operatoren
        // =========================

        boolean hatFuehrerschein = false;
        boolean besitztFahrzeug = true;

        // Logische UND Verknüpfung
        if (hatFuehrerschein && besitztFahrzeug){
            System.out.println("Viel Spaß beim Autofahren!");
        }

        // Verneinung/Negation
        if (!hatFuehrerschein){
            System.out.println("Du hast keinen Führerschein!");
        }

        // Logische ODER Verknüpfung
        double temperatur = 23.5;

        if (temperatur < 20 || temperatur > 35){
            System.out.println("Unangenehm");
        } else {
            System.out.println("Angenehm");
        }

        // Mehrere logische Operatoren in Kombination
        // Ziel: Es soll ein perfekter Badetag sein:
        // - Es sonnig ist UND (die Temperatur über 25 Grad liegt ODER es windstill)

        boolean sonnig = false;
        boolean windstill = true;

        if (sonnig && (temperatur > 25 || windstill)){
            System.out.println("Perfekter Tag zum Baden!");
        } else {
            System.out.println("Kein idealer Badetag");
        }

        // =========================
        // 4) Switch / Enhanced Switch
        // =========================

        System.out.println("Bitte gib eine Zahl von 1 bis 3: ");
        int zahl = scanner.nextInt();

        // Switch
        switch (zahl){
            case 1:
                System.out.println("Du hast die 1 gewählt.");
                break;
            case 2:
                System.out.println("Du hast die 2 gewählt.");
                break;
            case 3:
                System.out.println("Du hast die 3 gewählt.");
                break;
            default:
                System.out.println("Ungültige Eingabe");
        }

        // Enhanced Switch
        switch (zahl){
            case 1 -> System.out.println("Du hast die 1 gewählt");
            case 2 -> System.out.println("Du hast die 2 gewählt");
            case 3 -> System.out.println("Du hast die 3 gewählt");
            default -> System.out.println("Ungültige Eingabe");
        }



        int hour = LocalDateTime.now().getHour();
        System.out.println(hour);

        String gruss = switch (hour){
            case 22, 23, 0, 1, 2, 3, 4 -> "Gute Nacht";
            case 5, 6, 7, 8, 9, 10 -> "Gute Morgen";
            case 18, 19, 20, 21 -> "Gute Abend";
            default -> "Guten Tag";
        };

        System.out.println(gruss);

        // =========================
        // 5) Ternary Operator / Ternäre Operator
        // =========================
        // Aufbau: (Bedingung) ? WertWennWahr : WertWennFalsch

        int playerLives = 1;
        String gameStatus = (playerLives <= 0) ? "GAME OVER" : "Spiel läuft...";
        System.out.println(gameStatus);
    }
}
