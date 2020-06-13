package StanticGuanJianCi.LiZi2;

/**
 * Test
 */

//  只能生成一个对象

class A {
    public int i = 20;
    private static A aa=new A();

    private A() {

    }

    public static A getA() {    // static 一定不能省略
        return aa;
    }
}

public class Test {

    public static void main(String[] args) {
        // A aa1 = new A();    // error 
        A aa1 = A.getA();
        A aa2 = A.getA();

        aa1.i = 99;
        System.out.println(aa2.i);

        if (aa1 == aa2) {
            System.out.println("aa1的值和aa2相同");
        }
        else {
            System.out.println("aa1的值和aa2不相同");
        }
    }
}