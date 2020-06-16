//java中的类被final关键字修饰后不可以被继承

final class Animal {
    //方法体为空
}

/**
 * dog类继承animal类
 */
class Dog extends Animal {
    //方法体为空
}

class Example06 {
    
    public static void main(String[] args) {

        Dog dog = new Dog();
        //error:The type Dog cannot subclass the final class Animal
    }
}
