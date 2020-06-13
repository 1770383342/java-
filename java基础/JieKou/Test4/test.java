package JieKou.Test4;

/**
 * test
 */

interface It {
    void f();
}

class A implements It {
    public void f() {
        System.out.println("AAAA");
    }
}

public class test {

    public static void main(String[] args) {
        //不可以new接口对象，但可以定义一个接口引用类型的变量将其指向实现接口的对象，达到多态的目的
        It it1;
        it1 = new A();
        it1.f();
        // It it2=new It(); //error
    }
}