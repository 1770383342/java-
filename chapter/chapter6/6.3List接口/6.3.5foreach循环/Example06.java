import java.util.ArrayList;
import java.util.Iterator;

public class Example06 {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add("Jack");
        list1.add("Annie");
        list1.add("Rose");
        list1.add("Tom");
        Iterator it = list1.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if ("Annie".equals(obj)) {
                it.remove();
            }
        }
        System.out.println(list1);
    }
}