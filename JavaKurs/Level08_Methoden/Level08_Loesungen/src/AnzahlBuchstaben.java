public class AnzahlBuchstaben {

    public static int anzahlBuchstaben(String text, char buchstabe) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == buchstabe) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Anzahl 'a' in Banane: " + anzahlBuchstaben("Banane", 'a')); // 3
        System.out.println("Anzahl 'n' in Banane: " + anzahlBuchstaben("Banane", 'n')); // 2
    }
}
