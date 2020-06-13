package DuoTai.Test2;

/**
 * Test
 */

class A {
    public void f() {
        System.out.println("AAAA");
    }
}

class B extends A {
    public void f() {   //重写方法的权限不能低于被重写方法的权限
        System.out.println("BBBB");
    }
}

public class Test {

    public static void main(String[] args) {
        B bb = new B();
        bb.f();
        A aa = new A();
        aa = bb;
        aa.f();
    }
}