import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class AddSupplier extends JFrame {

	private JPanel contentPane;
	private JTextField sc;
	private JTextField sadd;
	private JTextField suppname;

	public AddSupplier() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddSupplier.class.getResource("/resources/256x256.png")));
		setTitle("Add New Supplier");

		setBounds(100, 100, 450, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 438, 191);
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
					PreparedStatement ps = conn.prepareStatement("insert into supplier(SupplierName, ContactNum, Address) values(?,?,?)");
					ps.setString(1,suppname.getText());
					ps.setString(2,sc.getText());
					ps.setString(3,sadd.getText());
				int x = ps.executeUpdate();
				
					System.out.println("Item Added Successfully.");
					JOptionPane.showMessageDialog(null, "Item Added Successfully. Click refresh to reflect changes in the table.");	

				}catch(Exception e1) {
					System.out.println(e1);
					
					JOptionPane.showMessageDialog(null, "Registration Failed. Please try again.");
			
				}
	
			}
		});
		button.setBounds(235, 126, 144, 25);
		panel.add(button);
		
		JLabel label_2 = new JLabel("Contact #:");
		label_2.setBounds(205, 51, 94, 16);
		panel.add(label_2);
		
		sc = new JTextField();
		sc.setColumns(10);
		sc.setBounds(303, 48, 116, 22);
		panel.add(sc);
		
		JLabel label_3 = new JLabel("Address:");
		label_3.setBounds(205, 83, 94, 16);
		panel.add(label_3);
		
		sadd = new JTextField();
		sadd.setColumns(10);
		sadd.setBounds(303, 80, 116, 22);
		panel.add(sadd);
		
		JLabel lblSupplierName = new JLabel("Supplier Name");
		lblSupplierName.setBounds(205, 16, 94, 16);
		panel.add(lblSupplierName);
		
		suppname = new JTextField();
		suppname.setColumns(10);
		suppname.setBounds(303, 13, 116, 22);
		panel.add(suppname);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AddSupplier.class.getResource("/resources/BIMSICON.png")));
		label.setBounds(12, 29, 191, 70);
		panel.add(label);
	}
}
