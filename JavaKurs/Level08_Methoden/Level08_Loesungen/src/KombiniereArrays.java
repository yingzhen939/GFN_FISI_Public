public class KombiniereArrays {

    public static int[] kombiniereArrays(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            result[a.length + j] = b[j];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        int[] komb = kombiniereArrays(a, b);
        System.out.println("Kombiniert: " + java.util.Arrays.toString(komb)); // [1,2,3,4,5]
    }
}
