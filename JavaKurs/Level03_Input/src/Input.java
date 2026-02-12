import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // ==============================
        // 1) Eingabe / Input mit Scanner
        // ==============================
        /*
         * Der Scanner kann Eingaben von der Tastatur lesen
         *  -> Er liest standardmäßig von System.in (der Tastatureingaben)
         *  -> Wir müssen ihn zuerst importieren und ein Objekt erstellen
         */

        Scanner scanner = new Scanner(System.in);   // Scanner-Objekt erzeugen

        // ------------- Eingabe von Text (String) -----------------
        System.out.print("Bitte gib deinen Namen ein: ");
        String name = scanner.next();
        System.out.println("Hallo " + name);

        // ------------- Eingabe von Zeichens (char) -----------------
        System.out.print("Bitte gib einen Buchstaben ein: ");
        char buchstabe = scanner.next().charAt(0);
        System.out.println("Du hast " + buchstabe + " eingegeben");

        // ------------- Eingabe einer ganzen Zahl -----------------
        System.out.print("Bitte gib eine ganze Zahl ein: ");
        int zahl = scanner.nextInt();
        System.out.println("Die Zahl lautet: " + zahl);

        // ------------- Eingabe einer Kommazahl -----------------

        // Hinweis: Variablen vom Typ double werden mit einem Punkt und nicht mit einem Komma initialisiert
        // Über den Scanner werden Kommazahlen jedoch mit einem Komma eingegeben
        System.out.print("Bitte gib eine Kommazahl ein: ");
        double kommaZahl = scanner.nextDouble();
        System.out.println("Deine Kommazahl lautet: " + kommaZahl);

        // ------------- Eingabe eins Wahrheitswertes -----------------
        System.out.print("Bitte gib true oder false ein: ");
        boolean wahrheitswert = scanner.nextBoolean();
        System.out.println("Dein Wert: " + wahrheitswert);

        // ==========================================
        // 2) Wrapper-Klassen
        // ==========================================
        /*
         * Für jeden primitiven Datentyp gibt es eine passende Wrapper-Klasse:
         * byte -> Byte, short -> Short, int -> Integer, long -> Long,
         * float -> Float, double -> Double, char -> Character, boolean -> Boolean
         *
         * -> Wrapper sind Objekte und bieten nützliche Methoden & Konstanten.
         * -> Primitive sind reine Werte (keine Objekte).
         */

        int primitiv = 42;
        Integer wrapper = Integer.valueOf(primitiv);
        System.out.println(wrapper.intValue());

        Integer autoBoxed = primitiv;   // Autoboxing: automatisch von int zu Integer
        int unboxed = autoBoxed;        // Unboxing: automatisch von Integer zu int

        System.out.println("Maximaler Integer-Wert: " + Integer.MAX_VALUE);
        System.out.println("Minimaler Integer-Wert: " + Integer.MIN_VALUE);

        // ==========================================
        // 3) Casting (Typkonvertierung)
        // ==========================================
        /*
         * Casting bedeutet, einen Wert in einen anderen Datentyp umzuwandeln.
         * Dabei wird der Wert ggf. verändert oder abgerundet.
         */

        // Widening
        // von einem kleineren Datentyp in einen größeren Datentyp
        // byte -> short -> char -> int -> long -> float -> double

        int basisZahl = 100;
        double widened = basisZahl;
        System.out.println("Automatische Umwandlung int -> double: " + widened);

        // Narrowing
        // von einem größeren Datentyp in einen kleineren Datentyp
        // double -> float -> long -> int -> char -> short -> byte

        double kommazahl = 9.78;
        int narrowed = (int) kommazahl;
        System.out.println("Automatische Umwandlung double -> int: " + narrowed);

        // Sorgt aber für Probleme, wenn die Werte der größeren Datentypen größer sind, als der Zieldatentyp
        // Die kleineren Datentypen laufen über
        int grosseZahl = 1456161651;
        short kleineZahl = (short) grosseZahl;
        System.out.println(kleineZahl);
        System.out.println(Short.MAX_VALUE);

        // ==========================================
        // 4) Parsing (Text in Datentyp umwandeln)
        // ==========================================
        /*
         * Parsing = Umwandeln von Text (String) in echte Werte.
         * Wichtig, wenn Eingaben als Text vorliegen (z. B. aus Dateien oder Eingabefeldern).
         */

        String textZahl = "123";
        int parsedInt = Integer.parseInt(textZahl);
        System.out.println("String \"123\" -> int: " + parsedInt);  // Mit \" lassen sich innerhalb eines Strings doppelte Anführungszeichen darstellen

        String textDouble = "3.1415";
        double parsedDouble= Double.parseDouble(textDouble);
        System.out.println("String \"3.1415\" -> double: " + parsedDouble);

        String textBool = "true";
        boolean parsedBool = Boolean.parseBoolean(textBool);
        System.out.println("String \"true\" -> boolean: " + parsedBool);

        // ==========================================
        // 5) Nutzereingabe einlesen und passend umwandeln
        // ==========================================
        /*
         * Manchmal möchte man eine Eingabe zuerst als Text (String) einlesen
         * und dann in einen passenden Datentyp umwandeln (casten bzw. "parsen").
         * Das ist nützlich, wenn man z. B. Berechnungen mit eingegebenen Zahlen machen will.
         */

        System.out.print("Bitte gib eine Zahl ein: ");
        String eingabeZahl = scanner.next();    // Eingabe als Text
        int umgewandelteZahl = Integer.parseInt(eingabeZahl);   // Text -> int
        System.out.println("Text als int: " + umgewandelteZahl);

    }
}
