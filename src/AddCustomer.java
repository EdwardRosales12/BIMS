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

public class AddCustomer extends JFrame {

	private JPanel contentPane;
	private JButton Add;
	private JTextField cname;
	private JTextField cname2;
	private JTextField ccontact;
	private JTextField cadd;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public AddCustomer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddCustomer.class.getResource("/resources/256x256.png")));
		setResizable(false);
		setTitle("Add New Customer");
		setBounds(100, 100, 454, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, -32, 175, 243);
		lblNewLabel.setIcon(new ImageIcon(AddCustomer.class.getResource("/resources/BIMSICON.png")));
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
						PreparedStatement ps = conn.prepareStatement("insert into testcustomer(CustomerFirstName, CustomerLastName, ContactNo, Address) values(?,?,?,?)");
						ps.setString(1,cname.getText());
						ps.setString(2,cname2.getText());
						ps.setString(3,ccontact.getText());
						ps.setString(4,cadd.getText());
	
					int x = ps.executeUpdate();
					if(x>0) {
						System.out.println("Item Added Successfully.");
						JOptionPane.showMessageDialog(null, "Item Added Successfully.");	

					}else {
						System.out.println("Registration Failed. Please try again.");
						JOptionPane.showMessageDialog(null, "Registration Failed. Please try again.");
					}
					
					}catch(Exception e1) {
						System.out.println(e1);
				
					}
					
					
				
					
					
				}
			});
		Add.setBounds(257, 144, 144, 25);
		contentPane.add(Add);
		
		JLabel lblCustomerid = new JLabel("First Name:");
		lblCustomerid.setBounds(220, 16, 94, 16);
		contentPane.add(lblCustomerid);
		
		cname = new JTextField();
		cname.setColumns(10);
		cname.setBounds(318, 13, 116, 22);
		contentPane.add(cname);
		
		cname2 = new JTextField();
		cname2.setColumns(10);
		cname2.setBounds(318, 45, 116, 22);
		contentPane.add(cname2);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(220, 48, 94, 16);
		contentPane.add(lblLastName);
		
		JLabel label_2 = new JLabel("Contact #:");
		label_2.setBounds(220, 80, 94, 16);
		contentPane.add(label_2);
		
		ccontact = new JTextField();
		ccontact.setColumns(10);
		ccontact.setBounds(318, 77, 116, 22);
		contentPane.add(ccontact);
		
		JLabel label_4 = new JLabel("Address:");
		label_4.setBounds(220, 112, 94, 16);
		contentPane.add(label_4);
		
		cadd = new JTextField();
		cadd.setColumns(10);
		cadd.setBounds(318, 109, 116, 22);
		contentPane.add(cadd);
	}

}
