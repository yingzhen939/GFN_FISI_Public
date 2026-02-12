import java.util.Arrays;
import java.util.Collections;

public class ArraysTutorial {
    public static void main(String[] args) {

        /*
         * ARRAYS
         * ======
         * In Java gibt es Arrays, um mehrere Werte desselben Datentyps
         * in einer festen Reihenfolge zu speichern.
         * -> Ein Array hat IMMER eine feste Länge, die nicht verändert werden kann.
         * -> Alle Elemente im Array haben denselben Datentyp.
         * -> Man greift mit einem Index (Position) auf die Elemente zu, beginnend bei 0.
         *
         * Syntax: Datentyp[] name = new Datentyp[groesse];
         * Beispiel: int[] zahlen = new int[5];  // Array mit 5 int-Werten (alle starten mit 0)
         */

        // 1. Array erstellen und Werte zuweisen
        int[] zahlen = new int[5];  // Array mit 5 Elementen
        zahlen[0] = 10;
        zahlen[1] = 20;
        zahlen[2] = 30;
        zahlen[3] = 40;
        zahlen[4] = 50;

        // 2. Array direkt mit Werten (kürzere Schreibweise)
        String[] namen = {"Max", "Anna", "Tom"};
        int[] zahlenArray = {8, 25, 3, 14, 1};

        // 3. Zugriff auf Elemente
        System.out.println("Erstes Element im Zahlen-Array: " + zahlenArray[0]);
        System.out.println("Erstes Element im Namen-Array: " + namen[1]);

        // 4. Länge eines Arrays herausfinden
        System.out.println("Länge des Arrays 'zahlenArray': " + zahlenArray.length);

        // 5. Arrays mit Schleifen durchlaufen
        for (int i = 0; i < zahlenArray.length; i++) {
            System.out.println("Index " + i + ": " + zahlenArray[i]);
            //zahlenArray[i] = 5;
        }

        // 6. Erweiterte For-Schleife (for-each)
        for (int zahl : zahlenArray){
            System.out.println(zahl);
        }

        System.out.println("Alle Namen im Array: ");
        for (String name : namen){
            System.out.println(name);
        }

        // 7. Array mit toString() Methode ausgeben
        System.out.println(Arrays.toString(zahlenArray));

        // 8. Werte im Array sortieren
        Arrays.sort(zahlenArray);
        System.out.println("Sortiert: " + Arrays.toString(zahlenArray));
//        Arrays.sort(zahlenArray, Collections.reverseOrder());
//        System.out.println("Sortiert: " + Arrays.toString(zahlenArray));

        // Array absteigend ausgeben
        for (int i = zahlenArray.length - 1; i >= 0; i--) {
            System.out.println(zahlenArray[i]);
        }

        // 9. Kopie eines Arrays erzeugen
        int[] erweitert = Arrays.copyOf(zahlenArray, zahlenArray.length + 3);
        System.out.println("Erweitert: " + Arrays.toString(erweitert));

        /*
         * MULTIDIMENSIONALE ARRAYS
         * =======================
         * Mehrdimensionale Arrays sind Arrays, deren Elemente selbst wieder Arrays sind.
         * Am gebräuchlichsten sind 2D-Arrays (z.B. Tabellen/Raster).
         *
         * Syntax (2D-Array): Datentyp[][] name = new Datentyp[zeilen][spalten];
         * Beispiel: int[][] matrix = new int[3][4]; // 3 Zeilen, 4 Spalten
         *
         * Zugriff: matrix[row][col]
         */

        // 2D-Array erstellen (Matrix 3x3) und Werte zuweisen
        int[][] matrix = new int[3][3];

        // Erste Reihe befüllt
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        // Erste Reihe befüllt
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        // Erste Reihe befüllt
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // 2D-Array direkt initialisieren (kürzere Schreibweise)
        int[][] tabelle = {{10,11,12},{20,21,22},{30,31,32}};

        //              | Spalte 0 | Spalte 1 | Spalte 2 |
        //      -----------------------------------------
        //      Reihe 0 |    1     |    2     |    3     |
        //      Reihe 1 |    4     |    5     |    6     |
        //      Reihe 2 |    7     |    8     |    9     |

        // Ausgabe der Matrix mit verschachtelten Schleifen
        // Die verschachtelte Schleife durchläuft:
        // 1. Jede Zeile (row)
        //          2. Jede Spalte innerhalb der Zeile (col)

        System.out.println("Matrix (3x3) Ausgabe:");
        for (int row = 0; row < matrix.length; row++) {         // matrix.length -> Anzahl Zeilen
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col]);
            }
            System.out.println();
        }

        // Einfache Ausgabe der Matrix
        System.out.println(Arrays.deepToString(matrix));

        // Beispiel: Zugriff auf ein bestimmtes Element
        System.out.println("Element in Zeile 2, Spalte 3 der 'tabelle': " + matrix[1][2]);

        int[][] copyMatrix = Arrays.copyOf(matrix, matrix.length + 1);

        System.out.println(Arrays.deepToString(copyMatrix));

        copyMatrix[3] = new int[3];
        copyMatrix[3][0] = 1;
        System.out.println(Arrays.deepToString(copyMatrix));

    }
}
