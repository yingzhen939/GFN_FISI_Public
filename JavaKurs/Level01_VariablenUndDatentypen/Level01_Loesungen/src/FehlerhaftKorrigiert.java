public class FehlerhaftKorrigiert {
    // Korrigierte Version mit Kommentaren zu den Fehlern
    public static void main(String[] args) {
        double zahl = 3.5;               // int kann keine Nachkommastellen speichern
        long big = 123456789012345L;    // long-Literal benötigt ein 'L' am Ende
        float pi = 3.1415f;             // float benötigt ein 'f' am Ende
        char c = 'A';                    // char wird mit einfachen Anführungszeichen angegeben
        final int MAX = 10;             // final-Variable darf nicht verändert werden
        // MAX = 5; // entfernt, da final-Werte konstant bleiben müssen

        System.out.println(zahl + big + pi + c + MAX);
    }
}
