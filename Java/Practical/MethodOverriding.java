class A {
    public void disp() {
        System.out.println("Display method of class A");
    }
}

class B extends A {
    public void disp() {
        System.out.println("Display method of class B");
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        B obj = new B();
        obj.disp();
    }
}
