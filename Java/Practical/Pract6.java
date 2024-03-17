import java.util.Scanner;

public class Pract6 {

    public static void info(String s) {
        s = s.toLowerCase();

        int space = 0, letter = 0, special_char = 0, number = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                space++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                letter++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                number++;
            } else {
                special_char++;
            }
        }

        System.out.println("The letter in this string is : " + letter);
        System.out.println("The space in this string is : " + space);
        System.out.println("The number in this string is : " + number);
        System.out.println("The special char in this string is : " + special_char);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String string = sc.nextLine();

        info(string);

        sc.close();
    }
}
