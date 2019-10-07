
import java.sql.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class Login {

	private JFrame frmLogin;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jed\\Desktop\\BIMS\\256x256.png"));
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 304, 320);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 414, 420);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Username:");
		lblNewLabel_2.setBounds(12, 91, 71, 57);
		panel.add(lblNewLabel_2);
		
		user = new JTextField();
		user.setBounds(80, 108, 176, 22);
		panel.add(user);
		user.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 77, 241, 1);
		panel.add(separator);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(12, 143, 71, 57);
		panel.add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
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
					
						frmLogin.dispose();
					}
						else
						JOptionPane.showMessageDialog(null, "Incorrect password or username.");
					con.close();
						
						
					}catch(Exception e){
						System.out.print(e);
					}
				}
			
			}
		);
		btnNewButton.setBounds(12, 213, 97, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register1().setVisible(true);
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(159, 213, 97, 25);
		panel.add(btnNewButton_1);
		
		pass = new JPasswordField();
		pass.setBounds(80, 161, 176, 22);
		panel.add(pass);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/resources/BIMSICON.png")));
		lblNewLabel.setBounds(68, -3, 175, 82);
		panel.add(lblNewLabel);
	}
}
