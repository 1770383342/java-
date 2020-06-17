
/**
 * 动物接口
 */
interface Animal {
    void shout();// 定义抽象shout方法
}

/**
 * cat类实现动物接口
 */
class Cat implements Animal {
    public void shout() {
        System.out.println("喵喵..");
    }
}

/**
 * dog类实现动物接口
 */
class Dog implements Animal {
    public void shout() {
        System.out.println("汪汪..");
    }
}

public class Example13 {

    public static void main(String[] args) {

        Animal an1 = new Cat();
        Animal an2 = new Dog();
        animalShout(an1);
        animalShout(an2);
    }

    /**
     * 接收一个Animal类型的参数
     * @param an
     */
    public static void animalShout(Animal an) {
        an.shout();
    }
}