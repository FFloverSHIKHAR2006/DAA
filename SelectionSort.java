public class SelectionSort {
    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min]) min = j;
            int t = a[min]; a[min] = a[i]; a[i] = t;
        }
    }

    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        sort(a);
        for (int x : a) System.out.print(x + " ");
    }
}