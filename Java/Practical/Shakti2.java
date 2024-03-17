abstract class A {
    abstract void d();

    abstract void c();

    abstract void b();

    public void a() {
        System.out.println("a Object of class A");
    }
}

abstract class B extends A {
    public void b() {
        System.out.println("b Object of class B");
    }
}

abstract class C extends B {
    public void c() {
        System.out.println("c Object of class C");
    }
}

class D extends C {
    public void d() {
        System.out.println("d Object of class D");
    }
}

public class Shakti2 {
    public static void main(String args[]) {
        D obj = new D();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }
}