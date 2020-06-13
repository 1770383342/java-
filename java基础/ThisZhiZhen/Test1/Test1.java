package ThisZhiZhen.Test1;

/**
 * Test1
 */

class A {
    public int i;

    public A(int j) {
        i = j;
    }

    public void show() {
        System.out.printf("i = %d\n",this.i);   //this可以省略
    }
}

public class Test1 {

    public static void main(String[] args) {
        A aa1 = new A(10);
        A aa2 = new A(20);
        aa1.show();
        aa2.show();
    }
}