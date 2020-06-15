
/**
 * Person
 */
class Person {

    String name;
    int age;
    //定义两个参数的构造方法
    public Person(String con_name, int con_age) {
        name = con_name;
        age = con_age;
    }
    //定义一个参数的构造方法
    public Person(String con_name) {
        name = con_name;
    }
    
    public void speak() {
        System.out.println("大家好，我叫"+name+"，我今年"+age+"岁");
    }
}


public class Examaple07 {

    public static void main(String[] args) {
        
        Person p1 = new Person("韩强");
        Person p2 = new Person("小王", 20);
        p1.speak();
        p2.speak();
    }

}