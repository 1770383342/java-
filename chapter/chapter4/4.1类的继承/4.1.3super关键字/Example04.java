
/**
 * 动物类
 */
class Animla2 {

    /**
     * 定义Animal类有参的构造方法
     * @param name
     */
    public Animla2(String name) {
        System.out.println("我是一只" + name);
    }
}

/**
 * 定义dog类继承animal类
 */
class Dog3 extends Animla2 {
    
    public Dog3() {
        super("沙皮狗");//调用父类有参的构造方法
    }
}

public class Example04 {

    public static void main(String[] args) {
     
        Dog3 dog1 = new Dog3();//实例化dog对象
    }
}