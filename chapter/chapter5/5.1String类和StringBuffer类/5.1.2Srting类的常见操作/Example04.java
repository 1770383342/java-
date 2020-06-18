
public class Example04 {

    public static void main(String[] args) {
        String s = "cqnu";
        //字符串操作
        System.out.println("将cq替换为cq.cq的结果："+s.replace("cq", "cq.cq"));
        //字符串去除空格的操作
        String s1 = "    c q n u      ";
        System.out.println("去除字符串两端空格后的结果："+s1.trim());
        System.out.println("去除字符中所有空格后的结果："+s1.replace(" ", ""));
    }
}