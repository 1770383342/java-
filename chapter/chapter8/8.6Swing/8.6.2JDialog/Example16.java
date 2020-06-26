import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.*;
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
        f.setVisible(true);
        final JLabel label = new JLabel();
        final JDialog dialog = new JDialog(f, "Dialog");
        dialog.setSize(220, 150);
        dialog.setLocation(350, 250);
        dialog.setLayout(new FlowLayout());
        JButton btn3 = new JButton("确定");
        dialog.add(btn3);
        // 为“模拟对话框”按钮添加单机事件
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 设置对话框为模态
                dialog.setModal(true);
                // 如果JDialog窗口中没有添加JLabel标签，就把Jlabel标签加上
                if (dialog.getComponents().length == 1) {
                    dialog.add(label);
                }
                // 否则修改标签的内容
                label.setText("模式对话框，点击确定按钮关闭");
                // 显示对话框
                dialog.setVisible(true);
            }
        });
        // 为“非模态对话框”按钮
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 设置对话框为非模态
                dialog.setModal(false);
                // 如果JDialog窗口中没有添加JLabel标签，就把Jlabel标签加上
                if (dialog.getComponents().length == 1) {
                    dialog.add(label);
                }
                // 否则修改标签的内容
                label.setText("非模式对话框，点击确定按钮关闭");
                // 显示对话框
                dialog.setVisible(true);
            }
        });
        // 为对话框中的按钮添加单机事件
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
    }
}