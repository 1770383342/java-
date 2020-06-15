
class Person {
    
    public Person() {
        System.out.println("无参的构造方法被调用了");
    }
    
    public Person(String name) {
        //调用无参的构造方法
        this();
        System.out.println("有参的构造方法被调用了");
    }
}

public class Example10 {

    public static void main(String[] args) {
        Person p = new Person("小王");          //实例化Person对象
    }
    
}