import java.util.ArrayList;

public class Example04 {

    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Rose");
        list.add("Tom");
        for (Object object : list) {//使用foreach循环遍历集合
            System.out.println(object);//取出打印集合中的元素
        }
    }
}