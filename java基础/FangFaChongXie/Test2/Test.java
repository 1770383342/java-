package FangFaChongXie.Test2;

/**
 * Test
 */

// 方法重写是指在子类中重新定义父类已有的方法
// 重写方法必须和被重写的方法具有相同的方法名称、餐宿列表和返回值类型
// 子类中不允许出现与父类同名同参但不同返回类型的方法，如果出现了，编译时会报错
// 覆盖方法时,不能使用比父类中被覆盖的方法跟严格的访问权限

class A {
    protected void f() {
        System.out.println("aaaa");
    }
}

class B extends A {
    public void f() {
        System.out.println("bbbb");
    }
}

public class Test {

    public static void main(String[] args) {
        B bb = new B();
        bb.f();
    }
}