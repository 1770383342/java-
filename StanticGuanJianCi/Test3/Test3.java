package StanticGuanJianCi.Test3;

/**
 * Test3
 */

class A {
    protected static int i = 10;

    // private static void f() {
    //     System.out.println("11点12分");
    // }
}

public class Test3 {

    public static void main(String[] args) {
        System.out.println(A.i);
        //A.f();
    }
}
// 只有非pricate的static成员才可以通过类名的方式访问
// static只是表面了该成员具有了可以通过类名访问的潜在特征
// 但是否可以通过类名访问，还必须满足一个条件：该成员必须是非pricate 