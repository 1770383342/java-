package JiCheng.JiChengQuanXian;

/**
 * Test
 */

// 1.子类内部可以访问分类非私有的成员
//   私有成员无法被子类方法访问
// 2.通过子类对象只能访问从父类继承过来的非私有成员变量
// 总结：
//   私有不能被继承
//   私有物理上已经被继承过来，只不过逻辑生程序员不能去访问它
//   因此继承必须慎重，否则只会浪费内存

class A {
    public int i;
    protected int j;
/*     private int k; */

    public void g() {

    }

/*     private void s() {

    } */

    protected void b() {

    }
}

// B继承A
class B extends A {
    public void f() {
        i = 20;
        j = 30;
        // k = 40;  // error 私有的属性不能被继承

        g();
        b();
        // s();     // error 私有的方法不能被继承
    }

/*     private void m() {
        i = 20;
        j = 30;
        // k = 40;  // error 私有的属性不能被继承

        g();
        b();
        // s();     // error 私有的方法不能被继承
    } */
}

public class Test {

    public static void main(String[] args) {
        B bb = new B();
        bb.i = 20;
        bb.j = 30;
        // bb.k = 22;  // error
        bb.b();
        bb.g();
        // bb.s();     // error
    }
}