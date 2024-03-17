import java.util.Scanner;

public class BinaryDecimal {

    public static String reverse(String s) {
        int n = s.length();

        String ans = new String();

        for (int i = n - 1; i >= 0; i--) {
            char a = s.charAt(i);
            ans += a;
        }

        return ans;
    }

    public static String convertToBinary(int n) {

        if (n == 0)
            return "0";

        String ans = "";

        int rem = 0;

        while (n >= 1) {
            rem = n % 2;
            char ch = rem == 1 ? '1' : '0';
            ans += ch;

            n = n / 2;
        }

        return reverse(ans);
    }

    public static double convertToDecimal(String s) {
        if (s.length() == 0)
            return 0;

        int flag = s.charAt(0) == '1' ? 1 : 0;
        int n = s.length();
        double ans = 0 + flag;

        for (int i = n - 1; i >= 1; i--) {
            ans += (s.charAt(i) - '0') * Math.pow(2, i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number to be converted : ");
        int num1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the Binary number to be converted : ");
        String num2 = sc.nextLine();

        // Manual Function
        // System.out.println("Convert the number to Binary : " +
        // convertToBinary(num1));
        // System.out.println("Convert the number to decimal : " +
        // convertToDecimal(num2));

        // Predefine function
        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.parseInt(num2, 2));

        sc.close();
    }
}
