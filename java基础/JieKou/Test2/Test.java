package JieKou.Test2;

/**
 * Test
 */

interface It {
    public static final int i = 20;

    public abstract void f();
}

interface It2 {
    int i = 20;

    void f();
}

// class A extends It2 {

// }
// 类可以继承类,但类不能继承接口

class A implements It2 {
    public void f() {
        System.out.println("i = " + i);
    }
}

public class Test {

    public static void main(String[] args) {
        A aa = new A();
        aa.f();
    }
}