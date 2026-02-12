import java.util.Scanner;

public class RechteckSymbole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.println("Gib die Anzahl der Zeilen ein: ");
        rows = scanner.nextInt();

        System.out.println("Gib die Anzahl der Spalten ein: ");
        columns = scanner.nextInt();

        System.out.println("Welches Symbol soll verwendet werden: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i< rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
