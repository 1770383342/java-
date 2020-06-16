
/**
 * 动物类
 */
class Animla1 {

    void speak() {
        System.out.println("动物法出叫声");
    }
}

/**
 * 狗类
 */
class Dog1 extends Animla1 {

    //定义狗叫的方法
    void speak() {
        System.out.println("汪汪汪...");
    }
}

public class Example02 {

    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.speak();
    }
}