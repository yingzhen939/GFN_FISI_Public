import java.util.Scanner;

public class IsColdTernary {
    // Liest Temperatur in Celsius ein, setzt isCold per ternärem Operator und gibt aus
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Temperatur in °C (Ganzzahl) eingeben: ");
        int temp = sc.nextInt();

        boolean isCold = (temp < 10) ? true : false;

        System.out.println("Temperatur: " + temp + "°C");
        System.out.println("isCold = " + isCold + " -> " + (isCold ? "Es ist kalt." : "Es ist nicht kalt."));
    }
}
