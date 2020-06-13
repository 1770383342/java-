package GouZaohanshu.Test1;

/**
 * Test
 */

class A {

    private int i;  //私有的，不能再外部直接调用，可以再类里面调用
    private int j;

    //构造函数
    //函数命和类名相同
    //构造函数没有返回值
    public A(int a, int b) {
        i = a;
        j = b;
        System.out.printf("有参构造函数被调用了\n");
    }

    public A() {
        System.out.println("无参构造函数被调用了\n");
    }

    public void show() {
        System.out.printf("i=%d,j=%d\n",i,j);
    }
}

public class Test {

    public static void main(String[] args) {
        //A aa = new A(1, 2);
        //A aa = new A();
        //aa.show();
    }
}