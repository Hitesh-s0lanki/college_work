import java.util.Random;

public class Pract9 {

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generates random integers between 0 and 99
        }
        return array;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray(10);
        printArr(arr);

        MergeSort.asce(arr, 0, arr.length - 1);
        System.out.println("The Array after Sort : ");
        printArr(arr);

        MergeSort.desc(arr, 0, arr.length - 1);
        System.out.println("The Array after Desc Sort : ");
        printArr(arr);

        System.out.println("The Array after Sort : ");
        HeapSort.sort(arr, arr.length, false);
        printArr(arr);

        System.out.println("The Array after desc Sort : ");
        HeapSort.sort(arr, arr.length, true);
        printArr(arr);
    }
}
