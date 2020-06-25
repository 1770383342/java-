
import java.util.HashSet;

class Student1 {
    String id;
    String name;

    // 创建构造方法
    public Student1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 重写toString方法
    public String toString() {
        return id + "：" + name;
    }
    //重写hashCode方法
    public int hashCode() {
        return id.hashCode();
    }
    //重写equals方法
    public boolean equals(Object obj) {
        if (this == obj) {//判断是否是同一个对象
            return true;//如果是，直接返回true
        }
        if (!(obj instanceof Student1)) {//判断对象是否为Student类型
            return false;//如果对象不是Student类型，返回false
        }
        Student1 stu = (Student1) obj;
        boolean b = this.id.equals(stu.id);//判断id值是否相同
        return b;//返回判断结果
    }
}

public class Example09 {

    public static void main(String[] args) {
        
        HashSet hs = new HashSet();
        Student1 stu1 = new Student1("1", "Jack");
        Student1 stu2 = new Student1("2", "Rose");
        Student1 stu3 = new Student1("2", "Rose");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}