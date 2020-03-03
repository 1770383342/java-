package JiCheng.Test1;

/**
 * Test1
 */

//  人类
class Human {
    public String name = "张三";
    public int age = 22;
}
// 学生
class Student extends Human {
    // 成绩
    public double score = 66.6;
}
// 研究生
class Graduate extends Student {
    // 导师
    public String daoshi = "小李";
}

public class Test1 {

    public static void main(String[] args) {
        Graduate gd=new Graduate();
        System.out.printf("%s %f",gd.name, gd.score);
    }
}