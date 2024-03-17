public class MergeSort {

    public static void merge(int[] arr, int start, int mid, int end, boolean desc) {
        // get the length of Both the array
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // copy element in temp array
        int[] temp1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            temp1[i] = arr[start + i];
        }

        int[] temp2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            temp2[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if ((!desc && temp1[i] <= temp2[j]) || (desc && temp1[i] >= temp2[j])) {
                arr[start] = temp1[i];
                i++;
            } else {
                arr[start] = temp2[j];
                j++;
            }
            start++;
        }

        while (i < n1) {
            arr[start] = temp1[i++];
            start++;
        }

        while (j < n2) {
            arr[start] = temp2[j++];
            start++;
        }

    }

    public static void asce(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            asce(arr, start, mid);
            asce(arr, mid + 1, end);

            merge(arr, start, mid, end, false);
        }
    }

    public static void desc(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            desc(arr, start, mid);
            desc(arr, mid + 1, end);

            merge(arr, start, mid, end, true);
        }
    }
}
