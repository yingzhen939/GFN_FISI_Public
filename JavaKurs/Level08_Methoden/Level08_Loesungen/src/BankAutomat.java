import java.util.Scanner;

public class BankAutomat {

    // =========================
    // Methoden
    // =========================
    static void showBalance(double balance) {
        System.out.println("Hier ist ihr aktueller Kontostand: ");
        System.out.println("# # # # # # # # # #");
        System.out.printf("#     %.2f €     #\n", balance);
        System.out.println("# # # # # # # # # #");
    }

    static double deposit(Scanner scanner) {
        double amount;
        System.out.print("Wie viel Cash zahlst du ein?: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Weniger als Null fällt aus...");
            return 0;
        } else {
            System.out.printf("Du hast %.2f € eingezahlt.\n", amount);
            return amount;
        }
    }

    static double withdraw(Scanner scanner, double balance) {
        double amount;
        System.out.print("Wie viel Cash willst du auszahlen lassen?: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Glaube nicht dass du so viel hast..");
            return 0;
        } else {
            System.out.printf("Du bekommst %.2f € ausgezahlt.\n", amount);
            return amount;
        }
    }

    // =========================
    // Hauptprogramm
    // =========================
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 10.0;
        boolean isRunning = true;
        int userChoice;

        while (isRunning) {
            System.out.println("# # # # # # # # # #");
            System.out.println("#   BANK AUTOMAT  #");
            System.out.println("# # # # # # # # # #");
            System.out.println();
            System.out.println("1. Kontostand anzeigen");
            System.out.println("2. Einzahlung");
            System.out.println("3. Auszahlung");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Was möchten Sie tun?: ");
            userChoice = scanner.nextInt();
            System.out.println();

            switch (userChoice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit(scanner);
                case 3 -> balance -= withdraw(scanner, balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Ungültige Auswahl, bitte 1–4 wählen.");
            }
            System.out.println();
        }

        System.out.println("Tschüss");
        scanner.close();
    }
}
