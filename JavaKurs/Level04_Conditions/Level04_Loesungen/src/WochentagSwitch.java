import java.util.Scanner;

public class WochentagSwitch {
    // Liest Zahl 1-7 ein und gibt passenden Wochentag aus
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Zahl von 1 bis 7 eingeben (1=Montag, 7=Sonntag): ");
        int tag = sc.nextInt();

        String wochentag = switch (tag) {
            case 1 -> wochentag = "Montag";
            case 2 -> wochentag = "Dienstag";
            case 3 -> wochentag = "Mittwoch";
            case 4 -> wochentag = "Donnerstag";
            case 5 -> wochentag = "Freitag";
            case 6 -> wochentag = "Samstag";
            case 7 -> wochentag = "Sonntag";
            default -> wochentag = "Unbekannt";
        };

        System.out.println("Tag " + tag + " = " + wochentag);
    }
}
