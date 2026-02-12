import java.util.ArrayList;

public class SummeArrayList {
    public static void main(String[] args) {
        ArrayList<Double> zahlen = new ArrayList<>();
        zahlen.add(3.5);
        zahlen.add(7.0);
        zahlen.add(2.5);
        zahlen.add(5.0);
        zahlen.add(6.5);

        double summe = 0;
        for (double zahl : zahlen) {
            summe += zahl;
        }

        System.out.println("Die Summe aller Zahlen beträgt: " + summe);
    }
}