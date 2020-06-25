import java.util.HashSet;

class Student {
    String id;
    String name;

    public Student(String id, String name) {// 创建构造方法
        this.id = id;
        this.name = name;
    }

    public String toString() {// 重写toString方法
        return id + "：" + name;
    }
}

public class Example08 {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        Student stu1 = new Student("1", "Jack");
        Student stu2 = new Student("2", "Rose");
        Student stu3 = new Student("2", "Rose");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}