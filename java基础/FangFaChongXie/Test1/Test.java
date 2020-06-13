package FangFaChongXie.Test1;

/**
 * Test
 */

class A {
    public void f() {
        System.out.println("aaaa");
    }
}

class B extends A {
    public void f() {
        super.f();  //调用从父类继承过来的f方法
        System.out.println("bbbb");
    }
}

public class Test {

    public static void main(String[] args) {
        B bb = new B();
        bb.f();
    }
}