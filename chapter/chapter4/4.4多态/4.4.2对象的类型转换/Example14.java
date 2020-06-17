
/**
 * 动物接口
 */
interface Animal1 {
    void shout();
}

/**
 * cat类实现动物接口
 */
class Cat1 implements Animal1 {
    public void shout() {
        System.out.println("喵喵..");
    }

    void sleep() {
        System.out.println("猫睡觉...");
    }
}

public class Example14 {

    public static void main(String[] args) {
        Cat1 cat = new Cat1();
        animalShout1(cat);
    }

    /**
     * 接收一个Animal类型的参数
     * @param animal
     */
    public static void animalShout1(Animal1 animal) {
        Cat1 cat = (Cat1) animal;
        cat.shout();
        cat.sleep();
    }
}