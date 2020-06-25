import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example13 {

    public static void main(String[] args) {
        
        Map map = new HashMap();
        map.put("1", "Javk");// 储存键和值
        map.put("2", "Rose");
        map.put("3", "Lucy");
        Collection values = map.values();
        Iterator it=values.iterator();
        while (it.hasNext()){
            Object value=it.next();
            System.out.println(value);
        }
    }
}