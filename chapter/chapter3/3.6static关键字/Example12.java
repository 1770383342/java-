
class Student {

    //定义静态变量schoolName
    static String schoolName;
    // static String schoolName = "cqnu";
}

/**
 * 静态变量
 */
public class Example12 {
    public static void main(String[] args) {
        
        Student stu1 = new Student();
        Student stu2 = new Student();

        //给静态变量变量赋值
        Student.schoolName = "cqnu";
        //打印第一个学生对象的学校
        System.out.println("我的学校是" + stu1.schoolName);
        System.out.println("我的学校是" + stu2.schoolName);
        
    }
    
}