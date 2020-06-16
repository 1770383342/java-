
/**
 * 定义动物接口
 */
interface Animal1 {
    //定义全局变量，其默认修饰为public static final
    String ANIMAL_BEHAVIOR = "动物的行为";

    //定义抽象类方法，其默认修饰为public abstract
    void breathe();

    void run();
}

/**
 * dog类实现Animal接口
 */
class Dog1 implements Animal1 {
    //实现方法
    public void breathe() {
        System.out.println(ANIMAL_BEHAVIOR + "：" + "狗在呼吸");
    }

    public void run() {
        System.out.println(ANIMAL_BEHAVIOR + "：" + "狗在奔跑");
    }
}

public class Example11 {

    public static void main(String[] args) {
        
        Dog1 dog = new Dog1();
        dog.breathe();
        dog.run();
    }
}