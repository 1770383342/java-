import javax.swing.*;
import java.awt.*;

public class Example02 {

    public static void main(String[] args) {
        
        final Frame f = new Frame("FlowLayout");//创建名为Flowlayout的窗体
        //设置布局管理器为FlowLayout，所有组件左对齐，水平间距20，垂直间距为30
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        f.setSize(300, 400);
        f.setLocation(800, 300);
        f.add(new JButton("第1个按钮"));
        f.add(new JButton("第2个按钮"));
        f.add(new JButton("第3个按钮"));
        f.add(new JButton("第4个按钮"));
        f.add(new JButton("第5个按钮"));
        f.add(new JButton("第6个按钮"));
        f.setVisible(true);
    }
}