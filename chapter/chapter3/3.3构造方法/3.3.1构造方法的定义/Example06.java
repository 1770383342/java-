/**
 * Person
 */
class Person1 {
    int age;

    public Person1(int a) {
        age = a;                //给age属性赋值
    }

    public void speak() {
        System.out.println("今年我已经" + age + "岁了!");
    }    
}

public class Example06 {
    public static void main(String[] args) {
        Person1 p1 = new Person1(20); //实例化person对象
        p1.speak();
    }

}