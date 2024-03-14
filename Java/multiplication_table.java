
/**
 1.Write a Java program that takes a number as input and prints its multiplication table up to 10. 
 */
import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }

        sc.close();
    }
}