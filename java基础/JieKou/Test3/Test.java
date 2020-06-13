package JieKou.Test3;

/**
 * Test
 */

// 接口可以继承接口

interface It1 {

}

interface It2 {

}

interface It3 extends It1, It2 {

}

interface It4 {
    int i = 20;
}

class A {
    public void f() {
        System.out.println("哈哈");
    }
}

// 一个类可以在继承一个父类的同时继承一个或多个接口
class T extends A implements It4, It3 {
    
}

public class Test {

    public static void main(String[] args) {
        T tt = new T();
        tt.f();
    }
}