package StanticGuanJianCi.Test1;

/**
 * Test1
 */

class A {
    public static int i = 10;
    
    public void show() {
        System.out.printf("%d\n",i);
    }
}

public class Test1 {

    public static void main(String[] args) {
        // A aa1 = new A();
        // A aa2 = new A();
    
        // aa1.i=20;
        // aa2.show();
    }
}
//  20
//A类的多个对象共用一个static属性