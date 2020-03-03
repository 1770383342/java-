package ChouXiangLei.test2;

/**
 * test
 */

abstract class A {
    abstract public void f();
}

class B extends A {
    public void f() {
        System.out.println("BBBB");
    }
}

public class test {

    public static void main(String[] args) {
        // A aa = new A();      // error
        B bb = new B();
        bb.f();

        A aa; // 可以定义一个抽象类的引用，但是不可以定义一个抽象类的对象
        aa = bb;
        aa.f();
    }
}