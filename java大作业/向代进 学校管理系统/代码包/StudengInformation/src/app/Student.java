package app;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* 学生查询页面 */
public class Student extends JFrame {
	private JTable table;
	public Student() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("查成绩");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MysqlConn.ConnectSQL();
				MysqlConn.getdatastu(MysqlConn.userword);
				MysqlConn.query_gra(MysqlConn.stuid);
				
				for(int i = 0; i < MysqlConn.counter; i++){
					table.setValueAt(MysqlConn.c_name[i], i, 0);
					table.setValueAt(MysqlConn.stu_grade[i], i, 1);
					table.setValueAt(MysqlConn.credit[i], i, 2);
					table.setValueAt(MysqlConn.stu_point[i], i, 3);
				}
				
				JLabel label_2 = new JLabel("");
				label_2.setBounds(351, 380, 79, 37);
				getContentPane().add(label_2);
				String s = "" + Calculate.calculatecre(MysqlConn.credit);
				label_2.setText(s);
				
				JLabel label_3 = new JLabel("");
				label_3.setBounds(351, 423, 79, 37);
				getContentPane().add(label_3);
				String s1 = "" + Calculate.calculateGPA(MysqlConn.credit,MysqlConn.stu_point);
				label_3.setText(s1);
			}
		});
		btnNewButton.setBounds(161, 162, 97, 37);
		getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 212, 560, 152);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"课程", "成绩", "学分", "绩点"
			}
		));
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("总学分：");
		label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		label.setBounds(250, 377, 87, 40);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("平均绩点：");
		label_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		label_1.setBounds(240, 420, 97, 40);
		getContentPane().add(label_1);
		
		JButton button = new JButton("退出");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setBounds(383, 162, 97, 37);
		getContentPane().add(button);
		
		JLabel label_4 = new JLabel("欢迎登录学生信息管理系统！");
		label_4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 46));
		label_4.setBounds(14, 29, 604, 117);
		getContentPane().add(label_4);
		
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login l = new Login();
			}
		});
		button_1.setBounds(272, 162, 97, 37);
		getContentPane().add(button_1);
		
		this.setTitle("学生信息管理系统-学生");
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
