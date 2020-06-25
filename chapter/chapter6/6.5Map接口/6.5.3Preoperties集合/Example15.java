import java.util.Enumeration;
import java.util.Properties;

public class Example15 {

    public static void main(String[] args) {

        Properties p = new Properties();
        p.setProperty("BackGroup-color", "red");
        p.setProperty("Font-size", "14px");
        p.setProperty("Language", "chinese");
        Enumeration names = p.propertyNames();
        // 循环遍历所有的键
        while (names.hasMoreElements()) {
            String key = (String) names.nextElement();
            String value = p.getProperty(key);// 获取对应的键值
            System.out.println(key + " = " + value);
        }
    }
}