import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Example16 {

    public static void main(String[] args) {

        // 建立两个按钮
        JButton btn1 = new JButton("模拟对话框");
        JButton btn2 = new JButton("非模拟对话框");
        JFrame f = new JFrame("DialogDemo");
        f.setSize(300, 300);
        f.setLocation(800, 300);
        // 为内容模板设置布局管理器
        f.setLayout(new FlowLayout());
        // 在Container对象上添加按钮
        f.add(btn1);
        f.add(btn2);
        // 设置单机关闭按钮是的默认操作
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}