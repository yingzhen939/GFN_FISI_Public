public class ArraySumme {
    public static void main(String[] args) {
        int[] zahlen = {2, 4, 6, 8, 10};
        int summe = 0;

        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }

        System.out.println("Summe: " + summe);
    }
}
