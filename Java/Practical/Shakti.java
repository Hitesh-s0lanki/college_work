import java.util.Scanner;

class CharAdd {

    public static long calc() {
        Scanner sc = new Scanner(System.in);
        long sum = 0L;
        long x = 0L;
        int ip;
        System.out.print("Enter the limit = ");
        ip = sc.nextInt();
        char c[] = new char[ip];
        for (int i = 0; i < c.length; i++) {
            System.out.println("Enter the " + i + " th Element= ");
            c[i] = sc.next().charAt(0);
        }
        for (int j = c.length - 1; j >= 0; j--) {
            x = c[j] - '0';
            sum = sum + x;
        }

        sc.close();

        return sum;
    }
}

class Shakti {
    public static void main(String args[]) {
        long s = CharAdd.calc();
        System.out.println("Sum of all character vales = " + s);
    }
}
