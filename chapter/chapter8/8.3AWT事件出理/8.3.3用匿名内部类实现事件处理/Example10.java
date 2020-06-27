import java.awt.*;
import java.awt.event.*;

public class Example10 {

    public static void main(String[] args) {

        // 建立新窗体
        Frame f = new Frame("我的窗体！");
        // 设置窗体的宽和高
        f.setSize(400, 300);
        // 设置窗体的出现的位置
        f.setLocation(300, 200);
        // 设置窗体可见
        f.setVisible(true);
        Button btn = new Button("EXIT");
        f.add(btn);
        // 用内部类的方式为按钮组件注册监听器
        btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
}