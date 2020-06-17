
class Animal3 {
    //重写Object类的toString()方法
    public String toString() {
        return "这是一个动物..";
    }
}

public class Example17 {

    public static void main(String[] args) {
        
        Animal3 animal = new Animal3();
        System.out.println(animal.toString());
    }
}