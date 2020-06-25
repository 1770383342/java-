import java.util.HashSet;
import java.util.Iterator;

public class Example07 {

    public static void main(String[] args) {
        
        HashSet set = new HashSet();
        set.add("Jack");//向集合中添加字符串
        set.add("Eve");
        set.add("Rose");
        set.add("Rose");//向该set集合中添加重复元素
        Iterator it = set.iterator();//获取Iterator对象
        while (it.hasNext()) {//通过while循环，判断集合中是否有元素
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}