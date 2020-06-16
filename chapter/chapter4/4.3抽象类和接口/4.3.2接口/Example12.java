
/**
 * 定义动物接口
 */
interface Animal2 {
    // 定义全局变量，其默认修饰为public static final
    String ANIMAL_BEHAVIOR = "动物的行为";

    // 定义抽象类方法，其默认修饰为public abstract
    void breathe();

    void run();
}

/**
 * LandAnima接口
 */
interface LandAnima extends Animal2 {
    void liveOnland();
}

/**
 * dog类实现Animal接口
 */
class Dog2 implements Animal2 {
    // 实现方法
    public void breathe() {
        System.out.println(ANIMAL_BEHAVIOR + "：" + "狗在呼吸");
    }

    public void run() {
        System.out.println(ANIMAL_BEHAVIOR + "：" + "狗在奔跑");
    }

    public void liveOnland() {
        System.out.println("狗是陆地上的动物");
    }
}

public class Example12 {

    public static void main(String[] args) {

        Dog2 dog = new Dog2();
        dog.breathe();
        dog.run();
        dog.liveOnland();
    }

}