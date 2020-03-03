package StanticGuanJianCi.LiZi1;

/**
 * Test
 */

//  求生成对象的个数

class A {
    // private int i;
    private static int cnt = 0;

    public A() {
        ++cnt;
    }

    public A(int i) {
        // this.i = i;
        ++cnt;
    }

    public static int getCnt() {
        return cnt;
        // return 返回的是A对象的个数
    }
}
 
public class Test {

    public static void main(String[] args) {
        // System.out.printf("当前是的A对象的个数是：%d\n", A.getCnt());
        // A aa1 = new A();
        // System.out.printf("当前是的A对象的个数是：%d\n", A.getCnt());
        // A aa2 = new A();
        // System.out.printf("当前是的A对象的个数是：%d\n", A.getCnt());
    }
}