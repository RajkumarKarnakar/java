import java.util.Arrays;

public class Main {
    static int[] aux;

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 25, 12, 8, 7, 6, 11, 50};
        System.out.println(Arrays.toString(arr));
        System.out.println("------after sorting--------");
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        aux = new int[arr.length];
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            aux[k] = arr[k];
        }
        for (int k = low; k <= high; k++) {
            if (i > mid) arr[k] = aux[j++];
            else if (j > high) {
                arr[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                arr[k] = aux[j++];
            } else arr[k] = aux[i++];
        }

    }
}