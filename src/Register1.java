import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Register1 extends JFrame {
	private JTextField user;
	private JPasswordField pass;
	private JTextField email;
	private JTextField employee_id;

	public Register1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Register1.class.getResource("/resources/256x256.png")));
		setTitle("Registration");
		setResizable(false);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(12, 13, 414, 420);
		getContentPane().add(panel);
		setSize(275,375);
		JLabel label_2 = new JLabel("Username:");
		label_2.setBounds(12, 91, 71, 57);
		panel.add(label_2);
		
		user = new JTextField();
		user.setColumns(10);
		user.setBounds(80, 108, 176, 22);
		panel.add(user);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 77, 241, 1);
		panel.add(separator);
		
		JLabel label_3 = new JLabel("Password:");
		label_3.setBounds(12, 143, 71, 57);
		panel.add(label_3);
		
		JButton button = new JButton("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					PreparedStatement ps = conn.prepareStatement("insert into tblogin(UserName,user_email,Password,employee_id) values(?,?,?,?)");
					ps.setString(1,user.getText());
					ps.setString(2,email.getText());
					ps.setString(3,pass.getText());
					ps.setString(4,employee_id.getText());
				int x = ps.executeUpdate();
				if(x>0) {
					System.out.println("Registration Successful.");
					JOptionPane.showMessageDialog(null, "Registration Successfully.");
					
					dispose();
				}else {
					System.out.println("Registration Failed. Please try again.");
					JOptionPane.showMessageDialog(null, "Registration Failed. Please try again.");
				}
				
				}catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Registration Failed. Please try again.");
				}
				
				
			
				
				
			}
		});
		button.setBounds(12, 299, 97, 25);
		panel.add(button);
		
		pass = new JPasswordField();
		pass.setBounds(80, 161, 176, 22);
		panel.add(pass);
		
		JLabel label_4 = new JLabel("Email:");
		label_4.setBounds(12, 189, 71, 57);
		panel.add(label_4);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(80, 206, 176, 22);
		panel.add(email);
		
		JLabel label_5 = new JLabel("Employee ID:");
		label_5.setBounds(12, 229, 91, 57);
		panel.add(label_5);
		
		employee_id = new JTextField();
		employee_id.setColumns(10);
		employee_id.setBounds(110, 247, 91, 22);
		panel.add(employee_id);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Register1.class.getResource("/resources/BIMSICON.png")));
		label.setBounds(54, 0, 168, 77);
		panel.add(label);
	}
}
