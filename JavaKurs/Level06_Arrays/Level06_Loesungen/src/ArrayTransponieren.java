public class ArrayTransponieren {
    public static void main(String[] args) {
        int[][] zahlen = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Durch die Reihen iterieren
        for (int i = 0; i < zahlen.length; i++) {
            // Durch die Spalten iterieren
            for (int j = 0; j < zahlen[i].length; j++) {
                System.out.print(zahlen[j][i] + " ");
            }
            System.out.println(); // Neue Zeile nach jeder transponierten Zeile
        }
    }
}