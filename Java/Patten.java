/*
 * 2.Write a Java program to display the following pattern.
        *****
        ****
        ***
        **
        *
 */

public class Patten {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.err.println();
        }
    }
}
