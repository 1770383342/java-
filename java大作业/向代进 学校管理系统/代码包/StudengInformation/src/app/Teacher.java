package app;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* 教师管理学生成绩页面 */
public class Teacher extends JFrame {
	public Teacher() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(147, 132, 350, 231);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("请选择您要进行的操作：");
		lblNewLabel.setBounds(76, 5, 198, 34);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		
		JButton button = new JButton("查询学生成绩");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				QueryGra qg = new QueryGra();
			}
		});
		button.setBounds(88, 62, 169, 39);
		panel.add(button);
		
		JButton button_1 = new JButton("录入学生成绩");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InsertGra ig = new InsertGra();
			}
		});
		button_1.setBounds(89, 113, 169, 39);
		panel.add(button_1);
		
		JButton button_2 = new JButton("修改学生成绩");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String s = null;
				InsertGra ig = new InsertGra(s);
			}
		});
		button_2.setBounds(88, 167, 169, 39);
		panel.add(button_2);
		
		JButton button_4 = new JButton("退出");
		button_4.setBounds(337, 398, 85, 39);
		getContentPane().add(button_4);
		
		JLabel label = new JLabel("欢迎登录学生信息管理系统！");
		label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 46));
		label.setBounds(14, 35, 604, 62);
		getContentPane().add(label);
		
		JButton button_3 = new JButton("返回");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login l = new Login();
			}
		});
		button_3.setBounds(216, 398, 85, 39);
		getContentPane().add(button_3);
		
		this.setTitle("学生信息管理系统-教师");
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
