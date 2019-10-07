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
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Logout extends JFrame {
	private JTextField user;
	private JPasswordField pass;

	public Logout() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Logout.class.getResource("/resources/256x256.png")));
		setTitle("Login");
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(12, 13, 278, 262);
		getContentPane().add(panel);
		setSize(304,320);
		
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
		
		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					Statement stmt=con.createStatement();
					String sql="Select * from tblogin where Username= '"+user.getText()+"' and Password='"+pass.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "Login Successfully.");
						new secondbox().setVisible(true);
					
						dispose();
					}
						else
						JOptionPane.showMessageDialog(null, "Incorrect password or username.");
					con.close();
						
						
					}catch(Exception e){System.out.print(e);
					}
				}
			}
		);
		Login.setBounds(12, 213, 97, 25);
		panel.add(Login);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register1().setVisible(true);
			}
		});
		register.setBounds(159, 213, 97, 25);
		panel.add(register);
		
		pass = new JPasswordField();
		pass.setBounds(80, 161, 176, 22);
		panel.add(pass);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Logout.class.getResource("/resources/BIMSICON.png")));
		lblNewLabel.setBounds(46, -10, 235, 100);
		panel.add(lblNewLabel);
	}
}

