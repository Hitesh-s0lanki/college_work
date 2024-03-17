public class HeapSort {

    public static void swap(int[] arr, int i, int j) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapify(int[] arr, int n, int i, boolean desc) {

        int index = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;

        // for max heap
        if (leftIndex < n && ((!desc && arr[leftIndex] > arr[index]) || (desc && arr[leftIndex] < arr[index]))) {
            index = leftIndex;
        }
        if (rightIndex < n && ((!desc && arr[rightIndex] > arr[index]) || (desc && arr[rightIndex] < arr[index]))) {
            index = rightIndex;
        }

        if (index != i) {
            swap(arr, index, i);
            heapify(arr, n, index, desc);
        }

        return;
    }

    public static void sort(int[] arr, int n, boolean desc) {
        // step:1 creating of heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i, desc);
        }

        // step:2 sort
        int i = n - 1;
        while (i > 0) {
            swap(arr, 0, i);

            heapify(arr, i, 0, desc);

            i--;
        }
    }

}
