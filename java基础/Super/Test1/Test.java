package Super.Test1;

/**
 * Test
 */

class A {
    public int i;
    public int j;

    public A() {

    }

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class B extends A {
    public int k;

    public B() {

    }

    public B(int i, int j, int k) {
        // this.i = i;
        // this.j = j;
        super(i, j);   //调用父类i，j的构造方法
        this.k = k;
    }
}

public class Test {

    public static void main(String[] args) {
        B bb = new B(1,2,3);
        System.out.printf("%d %d %d",bb.i,bb.j,bb.k);
    }
}