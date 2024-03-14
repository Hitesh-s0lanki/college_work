interface A {
    public void disp();
}

interface D {
    public void disp2();
}

class B implements A {
    public void disp() {
        System.err.println("interface function A");
    }

    public void disp1() {
        System.err.println("Display funtion of class B");
    }
}

class C extends B implements D {
    public void disp2() {
        System.err.println("interface function D");
    }

    public void disp3() {
        System.err.println("Display function of class C");
    }
}

public class Multiple {
    public static void main(String[] args) {
        C obj = new C();

        obj.disp();
        obj.disp1();
        obj.disp2();
        obj.disp3();

    }
}
