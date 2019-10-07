import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import com.toedter.calendar.JDateChooser;

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JButton Add;
	private JTextField ename;
	private JTextField contact;
	private JTextField add;
	private JTextField bdate;
	private JTextField ename2;

	/**
	 * Launch the application.
	 */

	public AddEmployee() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddEmployee.class.getResource("/resources/256x256.png")));
		setResizable(false);
		setTitle("Add New Employee");
		setBounds(100, 100, 438, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, -7, 175, 243);
		lblNewLabel.setIcon(new ImageIcon(AddEmployee.class.getResource("/resources/BIMSICON.png")));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(192, 13, 1, 227);
		contentPane.add(separator);
		
		Add = new JButton("Add New Item");
		Add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
						PreparedStatement ps = conn.prepareStatement("insert into testemployee(EmployeeFirstName, EmployeeLastName, Contact, Address, Birthdate) values(?,?,?,?,?)");		
						ps.setString(1,ename.getText());
						ps.setString(2,ename2.getText());
						ps.setString(3,contact.getText());
						ps.setString(4,add.getText());
						ps.setString(5,bdate.getText());
						
					
					int x = ps.executeUpdate();
		
						System.out.println("Item Added Successfully.");
						JOptionPane.showMessageDialog(null, "Item Added Successfully. Click refresh to reflect changes in the table.");
					
					}catch(Exception e1) {
						System.out.println(e1);
						System.out.println("Registration Failed. Please try again.");
						JOptionPane.showMessageDialog(null, "Registration Failed. Please try again.");
					}
					
					
				
					
					
				}
			});
		Add.setBounds(238, 187, 144, 25);
		contentPane.add(Add);
		
		ename = new JTextField();
		ename.setColumns(10);
		ename.setBounds(303, 8, 116, 22);
		contentPane.add(ename);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(205, 11, 94, 16);
		contentPane.add(lblFirstName);
		
		JLabel label_2 = new JLabel("Contact #:");
		label_2.setBounds(205, 81, 94, 16);
		contentPane.add(label_2);
		
		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(303, 78, 116, 22);
		contentPane.add(contact);
		
		JLabel label_4 = new JLabel("Address:");
		label_4.setBounds(205, 113, 94, 16);
		contentPane.add(label_4);
		
		add = new JTextField();
		add.setColumns(10);
		add.setBounds(303, 110, 116, 22);
		contentPane.add(add);
		
		JLabel label_5 = new JLabel("Birth Date:");
		label_5.setBounds(205, 145, 94, 16);
		contentPane.add(label_5);
		
		bdate = new JTextField();
		bdate.setColumns(10);
		bdate.setBounds(303, 142, 116, 22);
		contentPane.add(bdate);
		
		JLabel label_3 = new JLabel("Year/Month/Day");
		label_3.setFont(new Font("Tahoma", Font.ITALIC, 9));
		label_3.setBounds(215, 158, 101, 16);
		contentPane.add(label_3);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(205, 46, 94, 16);
		contentPane.add(lblLastName);
		
		ename2 = new JTextField();
		ename2.setColumns(10);
		ename2.setBounds(303, 43, 116, 22);
		contentPane.add(ename2);
	}
}
