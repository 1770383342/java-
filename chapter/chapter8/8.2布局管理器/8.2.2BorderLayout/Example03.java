import javax.swing.*;
import java.awt.*;

public class Example03 {

    public static void main(String[] args) {

        final Frame f = new Frame("BorderLayout");
        f.setLayout(new BorderLayout());
        f.setSize(500, 500);
        f.setLocation(300, 200);
        f.setVisible(true);
        //下面5个按钮分别用于填充BorderLayout的5个区域
        JButton but1 = new JButton("东部");
        JButton but2 = new JButton("西部");
        JButton but3 = new JButton("南部");
        JButton but4 = new JButton("北部");
        JButton but5 = new JButton("中部");
        //将按钮添加到窗体中，并且设置按钮所在的区域
        f.add(but1, BorderLayout.EAST);
        f.add(but2, BorderLayout.WEST);
        f.add(but3, BorderLayout.SOUTH);
        f.add(but4, BorderLayout.NORTH);
        f.add(but5, BorderLayout.CENTER);
    }
}