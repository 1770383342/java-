package DuoTai.Test3;

/**
 * Test
 */

class A {
    public void f() {
        System.out.println("AAAA");
    }
}

class B extends A {
    public void f() {
        System.out.println("BBBB");
    }
}

class C extends B {
    public void f() {
        System.out.println("CCCC");
    }
}

public class Test {

    public static void g(A aa) {
        aa.f();
    }

    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        C cc = new C();

        g(aa);
        g(bb);  // bb -> aa aa.f()
        g(cc);  // cc -> aa
    }
}