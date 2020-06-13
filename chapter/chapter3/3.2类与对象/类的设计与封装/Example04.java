
class Student {

    private String name;
    private int age;

    // 下面是公有的getxxx和setXXX方法
    public String getName() {
        return name;
    }

    public void setName(String stuName) {
        name = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int stuAge) {
        if (stuAge <= 0) {
            System.out.println("对不起你输入的年您不合法...");
        } else {
            age = stuAge; //对属性赋值
        }
    }

    public void introduce() {
        System.out.println("大家好，我叫" + name + "，我今年" + age + "岁！");
    }

}

public class Example04 {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(-30);
        stu.setName("小王");
        stu.introduce();
    }

}