public class Polynomial {
    int[] w1;
    int[] w2;

    public static int[] sumpoly(int[] w1, int[] w2) {
        int[] suma = new int[Math.max(w1.length, w2.length)];
        for (int i = 0; i < suma.length; i++) {
            suma[i] = w1[i] + w2[i];
        }
        return suma;
    }

    public static int[] minpoly(int[] w1, int[] w2) {
        int[] roznica = new int[Math.max(w1.length, w2.length)];
        for (int i = 0; i < roznica.length; i++) {
            roznica[i] = w1[i] - w2[i];
        }
        return roznica;

    }
}
