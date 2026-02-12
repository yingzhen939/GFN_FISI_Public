public class FindeMax {

    public static int findeMax(int[] zahlen) {
        int max = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] zahlen = {5, 17, 9, -1, 17};
        System.out.println("Max: " + findeMax(zahlen)); // 17
        System.out.println("Max leeres Array: " + findeMax(new int[0])); // Integer.MIN_VALUE
    }
}
