import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example12 {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1", "Javk");// 储存键和值
        map.put("2", "Rose");
        map.put("3", "Lucy");
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();// 获取Iterator对象
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) (it.next());// 获取集合中的键值
            Object key = entry.getKey();// 获取Entry中的键
            Object value = entry.getValue();// 获取Entry中的值
            System.out.println(key + "：" + value);
        }
    }
}