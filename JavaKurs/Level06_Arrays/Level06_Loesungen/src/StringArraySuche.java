import java.util.Scanner;

public class StringArraySuche {
    public static void main(String[] args) {
        String[] namen = {"Anna", "Max", "Tom", "Lisa"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welchen Namen suchst du? -> ");
        String gesuchterName = scanner.next();

        boolean nameGefunden = false;
        for (String name : namen) {
            if (name.equals(gesuchterName)) {
                nameGefunden = true;
                break;
            }
        }

        if (nameGefunden) {
            System.out.println(gesuchterName + " wurde im Array gefunden.");
        } else {
            System.out.println("Name nicht gefunden.");
        }

        scanner.close();
    }
}
