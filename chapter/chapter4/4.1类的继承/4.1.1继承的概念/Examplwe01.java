
/**
 * 动物类
 */
class Animla {

    String name = "动物"; //定义name属性

    void speak() {
        System.out.println("动物发出叫声");
    }
}

/**
 * 狗类
 */
class Dog extends Animla {

    /**
     * 定义一个打印name属性的方法
     */
    public void printName() {
        System.out.println("name = " + name);
    }
}


public class Examplwe01 {

    public static void main(String[] args) {
        
        Dog dog = new Dog(); //创建一个dog类的实例对象
        dog.name = "小狗";
        dog.printName();
        dog.speak();

    }
}