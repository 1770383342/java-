 package FangFaChongXie.Test3;
 
/**
* Test
*/

class Human {
    private String name;
    private int age;

    public Human() {

    }

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfor() {
        String strInf = name + ": " + age;
        return strInf;
    }
}

class Student extends Human {
    public String school;

    public Student(String name, int age, String school) {
        super(name, age);
        // this.name = name;
        // this.age = age;      //error 私有属性
        this.school = school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getInfor() {
        // String strInf = name + ": " + age;
        String strInf = super.getInfor() + ": " + school;
        return strInf;
    }
}

 public class Test {
 
     public static void main(String[] args) {
        Student st1 = new Student("张三", 20, "cq");
        System.out.println(st1.getInfor());
     }
 }