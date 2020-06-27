package app;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/* 管理员管理教师页面 */
public class Tea extends JFrame {
	public Tea() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(153, 71, 314, 287);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("查询教师信息");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				QueryTea qt =new QueryTea();
			}
		});
		btnNewButton.setBounds(35, 34, 246, 47);
		panel.add(btnNewButton);
		
		JButton button = new JButton("插入教师信息");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InsertTea it = new InsertTea();
			}
		});
		button.setBounds(35, 94, 246, 47);
		panel.add(button);
		
		JButton button_1 = new JButton("修改教师信息");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				UpdateTea ut = new UpdateTea();
			}
		});
		button_1.setBounds(35, 153, 246, 47);
		panel.add(button_1);
		
		JButton button_2 = new JButton("删除教师信息");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Delete dt = new Delete();
			}
		});
		button_2.setBounds(35, 210, 246, 47);
		panel.add(button_2);
		
		JLabel label = new JLabel("请选择您要进行的操作：");
		label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		label.setBounds(212, 25, 203, 33);
		getContentPane().add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(153, 372, 314, 49);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton button_3 = new JButton("返回");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Admin ad = new Admin();
			}
		});
		button_3.setBounds(63, 5, 76, 40);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("退出\r\n");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_4.setBounds(186, 5, 76, 40);
		panel_1.add(button_4);
		
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
