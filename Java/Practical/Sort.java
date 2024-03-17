public class Sort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void solve(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    // asecinding ke liye >
                    // descending ke liye <
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] val = { 3, 21, 45, 67, 2, 1 };

        // Solve for asce
        solve(val);

        // print the array
        print(val);
    }
}
