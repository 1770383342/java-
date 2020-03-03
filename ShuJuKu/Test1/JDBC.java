package ShuJuKu.Test1;

/**
 * JDBC
 */
public class JDBC {

    public static void main(String[] args) {
        // 加载Mysql驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}