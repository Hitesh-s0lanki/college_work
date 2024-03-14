class A {
    private int x = 10;
    protected int y = 20;
    public int z = 30;

    void printValueOfX() {
        System.out.println(this.x);
    }
}

class B extends A {
    void print() {
        // System.out.println(this.x); // this will give an error as private
        System.out.println("The Value of y : " + this.y);
        System.out.println("The Value of z : " + this.z);
    }
}

public class Access extends B {
    public static void main(String[] args) {

        Access obj = new Access();
        System.out.println(obj.y);

        B A_obj = new B();

        System.out.println(A_obj.y);

    }
}
