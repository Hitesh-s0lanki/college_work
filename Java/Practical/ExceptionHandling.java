import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling extends Exception {

    ExceptionHandling(String message) {
        super(message);
    }

    public static void divide() throws ArithmeticException {
        int a = 9;
        int b = 0;
        if (a == 0 || b == 0)
            throw new ArithmeticException("Dividing by zero prohibited");
    }

    public static void readFile() throws IOException {
        FileReader file = new FileReader("file.txt");

        file.close();
        // Additional code to read from the file
    }

    public static void main(String[] args) {

        try {
            throw new ExceptionHandling("This is an custom exception");
        } catch (ExceptionHandling e) {
            System.out.println(e);
        }

        try {
            // Call the method to read data from a file
            readFile();
        } catch (IOException e) {
            // Handle IOException
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }

        try {
            // divide();
            String s = "hitesh";
            Integer.parseInt(s);
            int i = 1 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exceptions : " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Formating number exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
