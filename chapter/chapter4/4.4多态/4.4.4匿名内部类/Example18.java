
/**
 * 动物接口
 */
interface Animal4 {
    void shout();
}

public class Example18 {

    public static void main(String[] args) {
        //定义一个内部类cat实现animal接口
        class Cat implements Animal4 {

            public void shout() {
                System.out.println("喵喵..");
            }
        }
        animalShout(new Cat());
    }

    public static void animalShout(Animal4 an) {
        an.shout();
    }
}