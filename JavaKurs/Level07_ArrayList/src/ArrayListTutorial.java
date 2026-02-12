import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListTutorial {
    public static void main(String[] args) {

        /*
         * LISTEN (ArrayList)
         * ==================
         * Eine ArrayList ist eine dynamische Liste, die Elemente aufnehmen und entfernen kann.
         * -> Man kann Elemente hinzufügen, löschen, lesen.
         *
         * Syntax: ArrayList<Datentyp> liste = new ArrayList<>();
         * WICHTIG: Bei ArrayLists müssen wir Wrapper-Klassen verwenden (z.B. Integer statt int).
         */

        // 1. Eine Liste von Strings erstellen
        ArrayList<String> einkaufliste = new ArrayList<>();

        // 2. Elemente hinzufügen
        einkaufliste.add("Milch");
        einkaufliste.add("Brot");
        einkaufliste.add("Eier");

        // 3. Zugriff auf Element per Index
        System.out.println("Erste Element in der Liste: " + einkaufliste.get(0));

        // 4. Größe einer Liste
        System.out.println("Größe der Einkaufsliste: " + einkaufliste.size());

        // 5. Durchlaufen mit Schleife
        System.out.println("Einkaufliste: ");
        for (int i = 0; i < einkaufliste.size(); i++) {
            System.out.println((i + 1) + " Element: " + einkaufliste.get(i));
        }

        // for-each Variante
        for (String produkt : einkaufliste){
            System.out.println(produkt);
        }

        // 6. Ein Element ändern
        einkaufliste.set(1, "Vollkornbrot");
        System.out.println("Zweites Element geändert: " + einkaufliste.get(1));

        // 7. Ein Element entfernen
        einkaufliste.remove("Milch");
        System.out.println("Aktualisiert Einkaufliste: " + einkaufliste);

        // 8. Prüfen, ob ein Element in der Liste enthalten ist
        if(einkaufliste.contains("Eier")){
            System.out.println("Eier stehen schon auf der Liste!");
        } else {
            System.out.println("Die Eier fehlen noch!");
        }

        // 9. Index eines Elements ermitteln
        int index = einkaufliste.indexOf("Vollkornbrot");
        System.out.println("Index von Vollkornbrot: " + index);

        // 10. Prüfen, ob Liste leer ist
        System.out.println("Ist die Einkaufliste leer? " + einkaufliste.isEmpty());

        // 11. Liste komplett leeren
        einkaufliste.clear();
        System.out.println("Nach clear(): " + einkaufliste);

        /*
         * Beispiel mit primitiven Datentypen:
         * ===================================
         * Primitive Datentypen (z.B. int, double, boolean) können NICHT direkt in einer ArrayList gespeichert werden.
         * Stattdessen verwendet man ihre sogenannten Wrapper-Klassen (z.B. Integer, Double, Boolean).
         *
         * -> int  -> Integer
         * -> double -> Double
         * -> boolean -> Boolean
         *
         * Der Grund: ArrayLists können nur Objekte speichern, keine primitiven Werte.
         * Die Autoboxing-Funktion in Java wandelt primitive Werte automatisch in ihre Wrapper-Objekte um.
         */


        // Beispiel: Eine Liste mit Integer-Werten
        ArrayList<Integer> zahlenListe = new ArrayList<>();

        // Elemente hinzufügen (Autoboxing int -> Integer)
        zahlenListe.add(30);
        zahlenListe.add(20);
        zahlenListe.add(10);

        // Element an bestimmter Position einfügen
        System.out.println("Zahlenliste aktuell: " + zahlenListe);
        zahlenListe.add(1, 15);
        System.out.println("Zahlenliste nach Einfügen: " + zahlenListe);

        // Liste sortieren
        ArrayList<Integer> kopierteListe = zahlenListe;
        Collections.sort(zahlenListe);
        System.out.println("Sortierte Zahlenliste (aufsteigend): " + zahlenListe);

        // Liste absteigend sortieren
        Collections.sort(zahlenListe, Comparator.reverseOrder());
        // Collections.reverse(zahlenListe);
        System.out.println("Sortierte Zahlenliste (absteigend): " + zahlenListe);

        /*
         * Wichtige Unterschiede Arrays vs. ArrayLists:
         * - Array: feste Länge, schneller Zugriff, primitive Datentypen möglich
         * - ArrayList: dynamische Größe, einfacher zu erweitern/ändern,
         *              ABER nur mit Objekten (Wrapper-Klassen für int, double, etc.)
         */

        // Eine Liste, die unterschiedliche Objekte enthalten kann
        ArrayList<Object> listOfObjects = new ArrayList();

        listOfObjects.add("Hans Peter");
        listOfObjects.add(55);
        listOfObjects.add('A');

        System.out.println(listOfObjects);

        ArrayList<String> textListe = new ArrayList<>();
        ArrayList<Integer> intListe = new ArrayList<>();
        ArrayList<Character> charListe = new ArrayList<>();

        for (Object ding : listOfObjects){
            if (ding instanceof String text){
                textListe.add(text);
            } else if (ding instanceof Integer zahl){
                intListe.add(zahl);
            } else if (ding instanceof Character c) {
                charListe.add(c);
            }
        }

        System.out.println(textListe);
        System.out.println(intListe);
        System.out.println(charListe);

    }
}
