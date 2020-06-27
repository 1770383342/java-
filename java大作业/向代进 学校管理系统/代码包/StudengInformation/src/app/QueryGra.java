package app;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/* 教师查询学生成绩页面 */
public class QueryGra extends JFrame {
	private JTable table;
	public QueryGra() {
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		label.setBounds(172, 64, 152, 32);
		getContentPane().add(label);
		label.setText(MysqlConn.cname);
		
		MysqlConn.ConnectSQL();
		MysqlConn.getdatatea(MysqlConn.userword);
		MysqlConn.querygra(MysqlConn.cname);
		
		JLabel label_1 = new JLabel("所有学生成绩如下：");
		label_1.setBounds(330, 64, 190, 32);
		label_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		getContentPane().add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 128, 568, 152);
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
				"学号", "姓名", "成绩", "绩点"
			}
		));
		scrollPane.setViewportView(table);
		table.setRowHeight(30);
		
		for(int i = 0; i < MysqlConn.counter; i++){
			table.setValueAt(MysqlConn.stu_id[i], i, 0);
			table.setValueAt(MysqlConn.stu_name[i], i, 1);
			table.setValueAt(MysqlConn.stu_grade[i], i, 2);
			table.setValueAt(MysqlConn.stu_point[i], i, 3);
		}
		
		if(MysqlConn.counter == 0){
			JOptionPane.showMessageDialog(null, "该课程暂时没有成绩!", "提示消息", JOptionPane.ERROR_MESSAGE);
		}
		
		JButton button = new JButton("返回");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Teacher t = new Teacher();
			}
		});
		button.setBounds(165, 339, 104, 39);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("退出");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(341, 339, 104, 39);
		getContentPane().add(button_1);
		
		this.setTitle("学生信息管理系统-教师-查询学生成绩");
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
