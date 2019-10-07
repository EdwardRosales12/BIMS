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
import java.awt.Toolkit;

public class AddProduct extends JFrame {

	private JPanel contentPane;
	private JTextField pname;
	private JTextField pdesc;
	private JTextField pprice;
	private JTextField pquan;
	private JTextField SuppID;
	private JButton Add;

	public AddProduct() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddProduct.class.getResource("/resources/256x256.png")));
		setResizable(false);
		setTitle("Add New Product");
		setBounds(100, 100, 443, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, -33, 175, 243);
		lblNewLabel.setIcon(new ImageIcon(AddProduct.class.getResource("/resources/BIMSICON.png")));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(192, 13, 1, 227);
		contentPane.add(separator);
		
		JLabel label_1 = new JLabel("Product Name:");
		label_1.setBounds(199, 20, 94, 16);
		contentPane.add(label_1);
		
		pname = new JTextField();
		pname.setColumns(10);
		pname.setBounds(297, 17, 116, 22);
		contentPane.add(pname);
		
		JLabel label_2 = new JLabel("Description:");
		label_2.setBounds(199, 52, 94, 16);
		contentPane.add(label_2);
		
		pdesc = new JTextField();
		pdesc.setColumns(10);
		pdesc.setBounds(297, 49, 116, 22);
		contentPane.add(pdesc);
		
		JLabel label_3 = new JLabel("Price:");
		label_3.setBounds(199, 84, 94, 16);
		contentPane.add(label_3);
		
		pprice = new JTextField();
		pprice.setColumns(10);
		pprice.setBounds(297, 81, 116, 22);
		contentPane.add(pprice);
		
		JLabel label_4 = new JLabel("Quantity:");
		label_4.setBounds(199, 116, 94, 16);
		contentPane.add(label_4);
		
		pquan = new JTextField();
		pquan.setColumns(10);
		pquan.setBounds(297, 113, 116, 22);
		contentPane.add(pquan);
		
		JLabel label_5 = new JLabel("Supplier ID:");
		label_5.setBounds(199, 148, 94, 16);
		contentPane.add(label_5);
		
		SuppID = new JTextField();
		SuppID.setColumns(10);
		SuppID.setBounds(297, 145, 116, 22);
		contentPane.add(SuppID);
		
		Add = new JButton("Add New Item");
		Add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
						PreparedStatement ps = conn.prepareStatement("insert into testProduct(ProductName,ProductDescription,ProductPrice,ProductQuantity,SupplierID) values(?,?,?,?,?)");

						ps.setString(1,pname.getText());
						ps.setString(2,pdesc.getText());
						ps.setString(3,pprice.getText());
						ps.setString(4,pquan.getText());
						ps.setString(5,SuppID.getText());

					int x = ps.executeUpdate();
				
						System.out.println("Item Added Successfully.");
						JOptionPane.showMessageDialog(null, "Item Added Successfully. Click refresh to reflect changes in the table.");

					
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Registration Failed. Please try again.");
				
					}
					
					
				
					
					
				}
			});
		Add.setBounds(228, 185, 144, 25);
		contentPane.add(Add);
	}

}
