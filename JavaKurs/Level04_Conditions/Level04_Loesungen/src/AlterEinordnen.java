import java.util.Scanner;

public class AlterEinordnen {
    // Liest ein Alter (int) ein und ordnet: Minderjährig, Volljährig, Rentner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Alter eingeben (Ganzzahl): ");

        int alter = sc.nextInt();

        if (alter < 18) {
            System.out.println("Minderjährig");
        } else if (alter < 65) {
            System.out.println("Volljährig");
        } else {
            System.out.println("Rentner");
        }
    }
}
