import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example14 {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1", "Javk");// 储存键和值
        map.put("2", "Rose");
        map.put("3", "Lucy");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + "：" + value);
        }
    }
}