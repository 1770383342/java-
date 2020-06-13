package GouZaohanshu.Test2;

/**
 * Test2
 */

class A {
    public int i;

    public A(int j) {
        i = j;
    }
}

public class Test2 {

    public static void main(String[] args) {
        //A aa = new A();     //构造函数定义有参过后就不会有默认无参的构造函数了
        A aa = new A(1);
        System.out.println(aa.i);
    }
}