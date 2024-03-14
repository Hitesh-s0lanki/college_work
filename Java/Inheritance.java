class Base {

    String name;

    Base(String name) {
        this.name = name;
        System.out.println("Constructor is Called! " + name);
    }

    void name() {
        System.out.println(this.name);
    }

    void greet2() {
        System.out.println("Hello world!!");
    }

    static void greet() {
        System.out.println("Good Morining");
    }
}

public class Inheritance extends Base {

    Inheritance() {
        super("Hitesh");

        display();

        // super.greet2();
    }

    void display() {
        super.name();
    }

    public static void main(String[] args) {

        Inheritance obj = new Inheritance();
        obj.greet2();

        greet();
    }
}
