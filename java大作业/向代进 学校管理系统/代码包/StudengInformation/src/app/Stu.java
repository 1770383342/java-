package app;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* 管理员管理学生信息页面 */
public class Stu extends JFrame{
	public Stu() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(151, 27, 330, 305);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("请选择您要进行的操作");
		label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		label.setBounds(69, 13, 191, 41);
		panel.add(label);
		
		JButton button = new JButton("查询学生信息");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				QueryStu qs = new QueryStu();
			}
		});
		button.setBounds(91, 67, 143, 50);
		panel.add(button);
		
		JButton button_1 = new JButton("插入学生信息");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InsertStu is = new InsertStu();
			}
		});
		button_1.setBounds(91, 128, 143, 50);
		panel.add(button_1);
		
		JButton button_2 = new JButton("修改学生信息");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String s = null;
				InsertStu us = new InsertStu(s);
			}
		});
		button_2.setBounds(91, 185, 143, 50);
		panel.add(button_2);
		
		JButton button_3 = new JButton("删除学生信息");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Delete ds = new Delete();
			}
		});
		button_3.setBounds(91, 242, 143, 50);
		panel.add(button_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(179, 367, 272, 49);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton button_4 = new JButton("返回");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Admin ad = new Admin();
			}
		});
		button_4.setBounds(41, 5, 76, 40);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("退出");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_5.setBounds(146, 5, 76, 40);
		panel_1.add(button_5);
		
		//给窗口设置标题
		this.setTitle("学生信息管理系统-管理员");
		//设置窗体大小
		this.setSize(650,520);
		//设置窗体初始位置
		this.setLocation(200, 150);
		//设置当关闭窗口时，保证JVM也退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示窗体
		this.setVisible(true);
		//窗体大小可变
		this.setResizable(true);
	}
}
