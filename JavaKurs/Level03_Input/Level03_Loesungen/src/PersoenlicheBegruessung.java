import java.util.Scanner;

public class PersoenlicheBegruessung {
    // Liest Name und Alter ein und gibt eine persönliche Begrüßung aus
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie heißt du? -> ");
        String name = scanner.next();

        System.out.print("Wie alt bist du? -> ");
        int alter = scanner.nextInt();

        System.out.println("Hallo " + name + ", du bist " + alter + " Jahre alt!");
    }
}
