public class KreisRechner {
    // Berechnet Fläche und Umfang eines Kreises mit gegebenem Radius
    public static void main(String[] args) {
        final double PI = 3.1415;
        int r = 5;
        double flaeche = PI * r * r;
        double umfang = 2 * PI * r;

        System.out.println("Fläche: " + flaeche);
        System.out.println("Umfang: " + umfang);
    }
}
