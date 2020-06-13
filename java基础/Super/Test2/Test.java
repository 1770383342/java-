package Super.Test2;

/**
 * Test
 */

class A {
    public int i;

    public A() {
        
    }

    public A(int i) {
        this.i = i;
    }
}

class B extends A {
    public int j;

    public B(int i, int j) {
        super(i);   // 只能写在第一句且只能有一个
        this.j = j;
    }
}

public class Test {

    public static void main(String[] args) {
        
    }
}