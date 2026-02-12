public class VariablenUndDatentypen {
    public static void main(String[] args) {

        // =========================================
        // 1) Kommentare
        // =========================================

        // Kommentare sind Erklärungen für den Menschen (Programmierer)
        // Der Computer ignoriert sie vollständig
        // -> Kommentare helfen Code verständlich zu machen

        // Einzeiliger Kommentar

        /* Mehrzeiliger
         (gehört auch zum mehrzeiligen Kommentar)
         Kommentar */



        // =========================================
        // 1) Variablen & Datentypen
        // =========================================

        /*
         * In Java müssen Variablen immer einen Datentyp haben.
         * Beispiel: int zahl = 5;
         *
         * Der Typ legt fest, welche Art von Daten gespeichert werden können.
         * Unterschied zu Python: Dort reicht "zahl = 5" ohne Typangabe.
         *
         * Variablennamen werden in camelCase geschrieben,
         * z. B. int meineErsteVariable;
         */

        // ----------------------
        // 2.1 Ganzzahlen (Integer)
        // ----------------------

        byte kleineZahl = 95;        //  8 bit   -128 bis 127
        short mittlereZahl = 1992;  // 16 bit   -32768 bis 32767
        int zahl = 123456789;       // 32 bit   -2147483648 bis 2147483647  Standard-Typ
        long grosseZahl = 48646684616465L;  // 64 bit -> L am Ende notwendig

        System.out.println("byte: " + kleineZahl);
        System.out.println("short: " + mittlereZahl);
        System.out.println("int: " + zahl);
        System.out.println("long: " + grosseZahl);

        // ----------------------
        // 2.1 Gleitkommazahlen
        // ----------------------

        float kommaZahl = 5.1234f;      // 32 bit -> f am Ende notwendig
        double temperatur = 21.4158686; // 64 bit (Standard für Kommazahlen)

        System.out.println("Float: " + kommaZahl);
        System.out.println("Double: " + temperatur);

        // ----------------------
        // 2.1 Boolean
        // ----------------------

        boolean isGameRunning = true;
        boolean isAlive = false;

        System.out.println("Wahr: " + isGameRunning);
        System.out.println("Falsch: " + isAlive);

        // -------------------------
        // 2.4 Zeichen (char)
        // -------------------------

        char buchstabe = 'M';       // genau ein Zeichen
        char integerValue = 77;     // interne Zahl -> 'M'

        System.out.println(buchstabe);
        System.out.println(integerValue);

        // -------------------------
        // 2.5 Strings (Text)
        // -------------------------

        // String ist eine Klasse, kein primitiver Datentyp!
        // Strings sind Folgen von Zeichen/Chars ('M','a','x')
        String name = "Max";
        System.out.println("Mein Name ist: " + name);

        // -------------------------
        // 2.5 Konstanten
        // -------------------------

        // Namenskonvention für Konstanten: nur Großbuchstaben
        final float PI = 3.1415f;
        System.out.println(PI);

        // Kann nicht überschrieben werden
        // PI = 5.4;

        // =========================================================
        // 3) Deklaration vs. Initialisierung
        // =========================================================

        int number;             // Deklaration: nur Typ + name
        number = 5;             // Initialisierung: Variable bekommt einen Wert zugewiesen

        int andereZahl = 7;     // Deklaration + Initialisierung gleichzeitig

        System.out.println(number + andereZahl);

        // =========================================================
        // 4) Arithmetische Operatoren
        // =========================================================

        /*
         * Operatoren sind Rechenzeichen
         * Beispiele: +, -, *, /, %
         * ++ und -- erhöhen oder verringern eine Zahl um 1
         */

        // -------------------------
        // 4.1 Grundrechenarten
        // -------------------------

        int x = 7;
        int y = 5;

        System.out.println("Addition: " + (x + y));     // 12
        System.out.println("Subtraktion: " + (x - y));     // 2
        System.out.println("Multiplikation: " + (x * y));     // 35
        System.out.println("Division: " + (x / y));     // 1 (Rest fällt weg)
        System.out.println("Modulo: " + (x % y));     // 2 (nur Rest wird zurückgegeben)

        // -------------------------
        // 4.2 Kurzschreibweisen
        // -------------------------

        int zusatz = 15;
        int z = 8;
        System.out.println(z);

        //  8 + 15
        z = z + zusatz;
        System.out.println(z);

        // Kurzform
        z += zusatz;
        System.out.println(z);

        // -------------------------
        // 4.3 Inkrement & Dekrement
        // -------------------------

        int wert = 10;
        System.out.println("Postinkrement wert++: " + wert++);  // erst Ausgabe, dann +1
        System.out.println("Nach wert++ " + wert);              // aktueller Wert 11

        System.out.println("Präinkrement ++wert: " + (++wert));  // erst +1, dann Ausgabe
        System.out.println("Nach ++wert " + wert);

        // wert ist aktuell 12
        System.out.println("Postdekrement wert--: " + wert--);
        System.out.println("wert aktuell: " + wert);
        System.out.println("Prädekrement --wert: " + (--wert));

        // -------------------------
        // 4.4 Operatorenpräzedenz
        // -------------------------

        // Reihenfolge der Ausführung: (Klammern), Potenzen, *, /, + zuletzt
        int result = 3 + 4 * (7 - 5) / 2;
        System.out.println(result);

        // -------------------------
        // 4.5 Rechnen mit double
        // -------------------------

        double da = 7.5;
        double db = 5.0;

        System.out.println("double-Division: " + (da / db));
        System.out.println("double-Modulo: " + (da % db));

        double durchscnnitt = 9 / 3.0;
        System.out.println(durchscnnitt);

        // -------------------------
        // 4.6 Rechnen mit char
        // -------------------------

        char a = 'A';
        char b = 'A' + 1;
        System.out.println(a);
        System.out.println(b);

        char letter = 'C';
        letter++;   // nächster Buchstabe
        System.out.println("Inkrement mit char: " + letter);    // aus 'C' wird 'D'

        // -------------------------
        // 4.7 String-Verkettung
        // -------------------------

        String vorname = "Max";
        String nachname = "Mustermann";
        String vollerName = vorname + " " + nachname;

        System.out.println("Verkettung: " + vorname + " " + nachname);
        System.out.println("Verkettung: " + vollerName);

    }
}
