import java.util.ArrayList;

public class Example16 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("String");
        list.add("Collection");
        for (String str : list) {
            System.out.println(str);
        }
    }
}