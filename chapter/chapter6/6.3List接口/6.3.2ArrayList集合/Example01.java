
import java.util.ArrayList;

public class Example01 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();// 创建ArrayList集合
        list.add("stul1");
        list.add("stul2");
        list.add("stul3");
        list.add("stul4");
        System.out.println("集合的长度：" + list.size());
        System.out.println("第2个元素是：" + list.get(1));
    }
}