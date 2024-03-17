import java.util.Random;

public class Pract8 {

    public static int getMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;

        for (int i : arr) {
            maxi = Math.max(maxi, i);
        }

        return maxi;
    }

    public static int getMin(int[] arr) {
        int mini = Integer.MAX_VALUE;

        for (int i : arr) {
            mini = Math.min(mini, i);
        }

        return mini;
    }

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
        int arr[] = generateRandomArray(5);

        printArr(arr);

        System.out.println("The max value in the array is : " + getMax(arr));
        System.out.println("The min value in the array is : " + getMin(arr));
    }
}
