import java.util.Scanner;

public class GeradeOderUngerade {
    // Prüft, ob eine eingegebene Zahl gerade oder ungerade ist
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte eine ganze Zahl eingeben: ");

        int zahl = sc.nextInt();

        if (zahl % 2 == 0) {
            System.out.println("gerade Zahl");
        } else {
            System.out.println("ungerade Zahl");
        }
    }
}
