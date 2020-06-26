import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Example15 extends JFrame {

    public Example15() {
        this.setTitle("JFramTest");
        this.setSize(300, 300);
        this.setLocation(800, 300);
        //定义一个按钮组件
        JButton bt = new JButton("按钮");
        //设置流式布局管理器
        this.setLayout(new FlowLayout());
        //添加按钮组件
        this.add(bt);
        //设置单机关闭按钮是的默认操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new Example15();
    }
}