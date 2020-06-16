
/**
 * 抽象类animal
 */
abstract class Animal {
    //抽象方法
    abstract void shout();
}

/**
 * dog类继承抽象类animal
 */
class Dog extends Animal {
    //实现抽象方法shout()
    void shout() {
        System.out.println("汪汪汪...");
    }
}

public class Example10 {
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}