public class QuickSort {
    static void qs(int[] a, int l, int h) {
        if (l < h) {
            int p = part(a, l, h);
            qs(a, l, p - 1);
            qs(a, p + 1, h);
        }
    }

    static int part(int[] a, int l, int h) {
        int p = a[h], i = l - 1;
        for (int j = l; j < h; j++)
            if (a[j] < p) {
                i++;
                int t = a[i]; a[i] = a[j]; a[j] = t;
            }
        int t = a[i + 1]; a[i + 1] = a[h]; a[h] = t;
        return i + 1;
    }

    public static void main(String[] a) {
        int[] n = {6000, 8000, 10000};
        for (int s : n) {
            int[] x = new int[s];
            for (int i = 0; i < s; i++)
                x[i] = (int)(Math.random() * s);
            long t = System.nanoTime();
            qs(x, 0, s - 1);
            System.out.println(s + " " + (System.nanoTime() - t));
        }
    }
}
