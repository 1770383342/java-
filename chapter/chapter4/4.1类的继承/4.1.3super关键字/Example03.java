
class Dog2 extends Animla {
    String name = "犬类";

    /**
     * 重写父类继承方法
     */
    void speak() {
        super.speak();//访问父类的成员方法
    }

    /**
     * 定义打印name的方法
     */
    void printName() {
        System.out.println("name = " + super.name);
    }
}

public class Example03 {

    public static void main(String[] args) {
        Dog2 dog = new Dog2(); //创建一个dog对象
        dog.speak();//调用dog对象重写的spea（）方法
        dog.printName();//调用dog对象的printName（）方法
    }

}