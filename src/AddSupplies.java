import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class AddSupplies extends JFrame {

	private JPanel contentPane;
	private JTextField desc;
	private JTextField q;
	private JTextField sid;
	private JTextField prodname;

	public AddSupplies() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddSupplies.class.getResource("/resources/256x256.png")));
		setTitle("Add New Supply");
	
		setBounds(100, 100, 447, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, -18, 438, 253);
		contentPane.add(panel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(192, 13, 1, 227);
		panel.add(separator);
		
		JButton button = new JButton("Add New Item");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					PreparedStatement ps = conn.prepareStatement("insert into testsupply(ProductName, Description, Quantity, SupplierID) values(?,?,?,?)");
					ps.setString(1,prodname.getText());
					ps.setString(2,desc.getText());
					ps.setString(3,q.getText());
					ps.setString(4,sid.getText());

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
		button.setBounds(238, 179, 144, 25);
		panel.add(button);
		
		JLabel lblSupplierName = new JLabel("Description:");
		lblSupplierName.setBounds(205, 78, 94, 16);
		panel.add(lblSupplierName);
		
		desc = new JTextField();
		desc.setColumns(10);
		desc.setBounds(303, 75, 116, 22);
		panel.add(desc);
		
		JLabel lblContact = new JLabel("Quantity:");
		lblContact.setBounds(205, 110, 94, 16);
		panel.add(lblContact);
		
		q = new JTextField();
		q.setColumns(10);
		q.setBounds(303, 107, 116, 22);
		panel.add(q);
		
		JLabel lblSupplierId = new JLabel("Supplier ID:");
		lblSupplierId.setBounds(205, 142, 94, 16);
		panel.add(lblSupplierId);
		
		sid = new JTextField();
		sid.setColumns(10);
		sid.setBounds(303, 139, 116, 22);
		panel.add(sid);
		
		JLabel lblProductName = new JLabel("Product Name:");
		lblProductName.setBounds(205, 46, 94, 16);
		panel.add(lblProductName);
		
		prodname = new JTextField();
		prodname.setColumns(10);
		prodname.setBounds(303, 43, 116, 22);
		panel.add(prodname);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AddSupplies.class.getResource("/resources/BIMSICON.png")));
		lblNewLabel.setBounds(17, 71, 169, 71);
		panel.add(lblNewLabel);
	}
}
