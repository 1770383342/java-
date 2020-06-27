import javax.swing.*;
import java.awt.*;

public class Example04 {

    public static void main(String[] args) {
        
        Frame f = new Frame("GridLayout");
        f.setLayout(new GridLayout(3, 3));
        f.setSize(400, 400);
        f.setLocation(400, 300);
        //循环添加按钮
        for (int i = 1; i <= 9; i++) {
            JButton btn = new JButton("btn" + i);
            f.add(btn);
        }
        f.setVisible(true);
    }
}