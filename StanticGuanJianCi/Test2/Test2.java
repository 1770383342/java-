package StanticGuanJianCi.Test2;

/**
 * Test2
 */

class A {
    public static int i = 10;

    public static void f() {
        System.out.println("11点12分");
    }
}

public class Test2 {

    public static void main(String[] args) {
        System.out.println(A.i);
        A.f();
    }
}
//static属性i是属于类本身，没有对象我们可以之恶通过类名+属性直接访问
//方法同理