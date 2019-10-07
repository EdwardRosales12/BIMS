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

public class AddOrder extends JFrame {

	private JPanel contentPane;
	private JButton Add;
	private JTextField oname;
	private JTextField odate;
	private JTextField oddate;
	private JTextField totalprice;
	private JTextField EmployeeID;
	private JTextField CustID;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AddOrder() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddOrder.class.getResource("/resources/256x256.png")));
		setResizable(false);
		setTitle("Add New Order");
		setBounds(100, 100, 457, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(18, -3, 175, 243);
		lblNewLabel.setIcon(new ImageIcon(AddOrder.class.getResource("/resources/BIMSICON.png")));
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
						PreparedStatement ps = conn.prepareStatement("insert into ordert(OrderName, Orderdate, DeliveryDate, TotalPrice, EmployeeID, CustID) values(?,?,?,?,?,?)");
					
						ps.setString(1,oname.getText());
						ps.setString(2,odate.getText());
						ps.setString(3,oddate.getText());
						ps.setString(4,totalprice.getText());
						ps.setString(5,EmployeeID.getText());
						ps.setString(6,CustID.getText());
						
						
					
					int x = ps.executeUpdate();
			
						System.out.println("Item Added Successfully.");
						JOptionPane.showMessageDialog(null, "Item Added Successfully.Click refresh to reflect changes in the table.  ");
			
					
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Registration Failed. Please try again.");
				
					}
					
					
				
					
					
				}
			});
		Add.setBounds(231, 229, 144, 25);
		contentPane.add(Add);
		
		oname = new JTextField();
		oname.setColumns(10);
		oname.setBounds(318, 13, 116, 22);
		contentPane.add(oname);
		
		JLabel label_1 = new JLabel("Order Name:");
		label_1.setBounds(220, 16, 94, 16);
		contentPane.add(label_1);
		
		JLabel lblOrderDate = new JLabel("Order Date: ");
		lblOrderDate.setBounds(220, 48, 94, 16);
		contentPane.add(lblOrderDate);
		
		odate = new JTextField();
		odate.setColumns(10);
		odate.setBounds(318, 45, 116, 22);
		contentPane.add(odate);
		
		JLabel label_3 = new JLabel("Delivery Date:");
		label_3.setBounds(220, 80, 94, 16);
		contentPane.add(label_3);
		
		oddate = new JTextField();
		oddate.setColumns(10);
		oddate.setBounds(318, 77, 116, 22);
		contentPane.add(oddate);
		
		JLabel label_4 = new JLabel("Total Price:");
		label_4.setBounds(220, 112, 94, 16);
		contentPane.add(label_4);
		
		totalprice = new JTextField();
		totalprice.setColumns(10);
		totalprice.setBounds(318, 109, 116, 22);
		contentPane.add(totalprice);
		
		JLabel label_5 = new JLabel("Employee ID:");
		label_5.setBounds(220, 144, 94, 16);
		contentPane.add(label_5);
		
		EmployeeID = new JTextField();
		EmployeeID.setColumns(10);
		EmployeeID.setBounds(318, 141, 116, 22);
		contentPane.add(EmployeeID);
		
		JLabel label_6 = new JLabel("Customer ID:");
		label_6.setBounds(220, 176, 94, 16);
		contentPane.add(label_6);
		
		CustID = new JTextField();
		CustID.setColumns(10);
		CustID.setBounds(318, 173, 116, 22);
		contentPane.add(CustID);
		
		JLabel lblNewLabel_1 = new JLabel("Year/Month/Day");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblNewLabel_1.setBounds(230, 61, 101, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_7 = new JLabel("Year/Month/Day");
		label_7.setFont(new Font("Tahoma", Font.ITALIC, 9));
		label_7.setBounds(230, 95, 101, 16);
		contentPane.add(label_7);
	}

}
