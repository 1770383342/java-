package JieKou.Test;

/**
 * Test1
 */

interface It {
    // public static final int i = 20;
    // 接口中定义的属性必须是 public static final的
    int i = 20;

    // public abstract void f();
    // 定义的方法必须是 public abstract的
    public void f();    // 默认自动添加
}

abstract class B {
    public void f() {
        
    }
}

public class Test1 {

    public static void main(String[] args) {
        
    }
}