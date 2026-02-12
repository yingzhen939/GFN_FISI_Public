/*
 * ABSTRAKTE KLASSEN
 * =================
 * Eine abstrakte Klasse kann nicht direkt instanziiert werden.
 * Das heißt man kann keine Objekte von ihr erstellen.
 * Sie dient als allgemeiner Bauplan für andere Klassen.
 */

public abstract class Tier {
    private String name;

    public Tier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstrakte Methode: Keine Implementierung hier, sie muss jedoch von allen Unterklassen implementiert werden
    public abstract void geraeuschMachen();
}
