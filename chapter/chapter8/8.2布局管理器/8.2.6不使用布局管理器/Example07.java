import java.awt.*;
import javax.swing.*;

public class Example07 {

    public static void main(String[] args) {
        
        JFrame f = new JFrame("hello");
        f.setLayout(null);
        f.setSize(300, 300);
        JButton btn1 = new JButton("Press");
        JButton btn2 = new JButton("Pop");
        btn1.setBounds(40, 60, 100, 30);
        btn2.setBounds(140, 90, 100, 30);
        //在窗口中添加按钮
        f.add(btn1);
        f.add(btn2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}