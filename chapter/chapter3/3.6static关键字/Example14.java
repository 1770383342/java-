
/**
 * 静态代码块
 */

public class Example14 {

    static {
        System.out.println("测试类的静态代码块执行了");
    }

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();
        
    }

}

class Test {
    //下面是一个静态代码块
    static {
        System.out.println("Test类的静态代码块执行了");
    }
}