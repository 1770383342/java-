package ThisZhiZhen.Test2;

/**
 * Test2
 */

class A {
    public int i = 99;

    public A(int i) {
        this.i = i;     //this表示当前时刻正在创建的对象
        System.out.printf("%d\n", i);
    }
    
    public void show() {
        System.out.printf("%d",this.i);     //this表示正在调用show的对象
    }
}

public class Test2 {

    public static void main(String[] args) {
        A aa = new A(2);
        //System.out.printf("%d\n",aa.i);
        aa.show();
    }
}