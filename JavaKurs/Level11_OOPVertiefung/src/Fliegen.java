/*
 * INTERFACES
 * ----------
 * Ein Interface ist wie ein Vertrag: Es legt Methoden fest, die implementierende Klassen bereitstellen MÜSSEN.
 * Interfaces erlauben, dass eine Klasse mehrere "Verträge" gleichzeitig erfüllt (implements ...).
 *
 * Hier: Fliegen definiert eine Methode fliegen(int meter).
 * Default-Methoden (seit Java 8) erlauben eine Standard-Implementierung im Interface.
 */

public interface Fliegen {

    // Jede Klasse, die Fliegen implementiert, muss diese Methode bereitstellen
    // es muss kein Zugriffsmodifikator angegeben werden bei Interfaces
    void fliegen(int meter);

    // Default-Methode:
    default void stoppen(){
        System.out.println("Das Objekt stoppt seine Bewegung");
    }
}
