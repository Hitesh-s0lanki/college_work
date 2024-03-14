import java.util.Scanner;

// Cannot have constructor
// use in abstraction

interface Library {

    int sum(int a, int b);

    private void greet() {
        System.out.println("Hello Boss");
    }

    default void greet2() {
        greet();
        System.out.println("Hello world");
    }

    static void print() {
        System.out.println("Hello world");
    }
}

public class Interface_tut implements Library {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        Interface_tut obj = new Interface_tut();
        obj.greet2();
        Library.print();

        System.out.print("Enter the first value : ");
        a = sc.nextInt();

        System.out.print("Enter the second value : ");
        b = sc.nextInt();

        System.out.println("The Sum of the : " + obj.sum(a, b));

        sc.close();
    }
}
