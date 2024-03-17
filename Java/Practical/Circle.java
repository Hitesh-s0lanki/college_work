import java.util.Scanner;

public class Circle {

    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double parameter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of the circle : ");
        double r = sc.nextDouble();

        System.out.println("The Area of Circle is : " + area(r));
        System.out.println("The Parameter of Circle is : " + parameter(r));

        sc.close();
    }
}
