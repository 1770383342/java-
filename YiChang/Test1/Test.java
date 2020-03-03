package YiChang.Test1;

/**
 * Test
 */

class A {
    int divide(int a, int b) {
        int m;
        m = a / b;
        return m;
    }
}

public class Test {

    public static void main(String[] args) {
        A aa = new A();
        // aa.divide(6, 0);

        try {
            aa.divide(6, 0);
        } catch (Exception e) {
            e.printStackTrace();    //捕获try里面的异常并输出
            System.out.println("被除数不能为0");
        }
    }
}