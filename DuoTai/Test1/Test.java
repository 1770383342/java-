package DuoTai.Test1;

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

public class Test {

    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        
        aa.f();
        bb.f();

        aa = bb;    // 把bb当aa看   把狗当动物看    把子类当父类看
        // bb = aa; // 把aa当bb看
        aa.f();
        // 多态就是多种形态，对不同的条件返回不同的形态
    }
}