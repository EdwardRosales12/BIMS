import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;
import java.awt.Color;

public class secondbox extends JFrame {

	private JPanel contentPane;
	private JTextField textField_7;
	private JTextField EmployID;
	private JTextField ename;
	private JTextField econtact;
	private JTextField eadd;
	private JTextField ebd;
	public JTable table_2;
	private JTextField textField_19;
	private JTextField CusID;
	private JTextField cname;
	private JTextField cc;
	private JTextField cadd;
	public JTable table_4;
	private JTextField txtSearch;
	private JTextField oid;
	private JTextField oname;
	private JTextField odate;
	private JTextField odd;
	private JTextField tp;
	private JTextField EmployeeID;
	private JTable ordertable;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_35;
	private JTextField suppname;
	private JTextField contact;
	private JTextField address;
	public JTable table_5;
	private JTextField textField_10;
	private JTextField supplyid;
	private JTextField sdesc;
	private JTextField sq;
	private JTextField SuppIDd;
	private JTextField CustID;
	private JTextField cname2;
	private JTextField ename2;
	private JPanel panel_4;
	public JTable table_1;
	public JTable table;
	private JTextField SuppID;
	private JTextField prodd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondbox frame = new secondbox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public secondbox() {
		setBackground(Color.LIGHT_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(secondbox.class.getResource("/resources/256x256.png")));
		setTitle("Bakery Inventory Management System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1289, 622);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 94, 1247, 480);
		contentPane.add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Home", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(secondbox.class.getResource("/resources/LAAAAST.png")));
		lblNewLabel_1.setBounds(0, 62, 1242, 298);
		panel_5.add(lblNewLabel_1);
		
		panel_4 = new JPanel();
		tabbedPane.addTab("Products", null, panel_4, null);
		
		JButton additem = new JButton("Add New Item");
		additem.setToolTipText("Add a new record in the table");
		additem.setBounds(12, 19, 113, 25);
		
		additem.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				new AddProduct().setVisible(true);
				
				
				
				
			}
		});
		panel_4.setLayout(null);
		panel_4.add(additem);
		
		JLabel label_48 = new JLabel("Search Item:");
		label_48.setBounds(577, 23, 94, 16);
		panel_4.add(label_48);
		
		textField_4 = new JTextField();
		textField_4.setBounds(683, 20, 199, 22);
		textField_4.setColumns(10);
		panel_4.add(textField_4);
		
		JLabel label_49 = new JLabel("Product Code:");
		label_49.setBounds(12, 83, 94, 16);
		panel_4.add(label_49);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(110, 80, 116, 22);
		textField_5.setColumns(10);
		panel_4.add(textField_5);
		
		
		
		JLabel label_50 = new JLabel("Product Name:");
		label_50.setBounds(12, 115, 94, 16);
		panel_4.add(label_50);
		
		textField_6 = new JTextField();
		textField_6.setBounds(110, 112, 116, 22);
		textField_6.setColumns(10);
		panel_4.add(textField_6);
		
		JLabel label_51 = new JLabel("Description:");
		label_51.setBounds(12, 147, 94, 16);
		panel_4.add(label_51);
		
		textField_15 = new JTextField();
		textField_15.setBounds(110, 144, 116, 22);
		textField_15.setColumns(10);
		panel_4.add(textField_15);
		
		JLabel label_52 = new JLabel("Price:");
		label_52.setBounds(12, 179, 94, 16);
		panel_4.add(label_52);
		
		textField_16 = new JTextField();
		textField_16.setBounds(110, 176, 116, 22);
		textField_16.setColumns(10);
		panel_4.add(textField_16);
		
		JLabel label_53 = new JLabel("Quantity:");
		label_53.setBounds(12, 211, 94, 16);
		panel_4.add(label_53);
		
		textField_17 = new JTextField();
		textField_17.setBounds(110, 208, 116, 22);
		textField_17.setColumns(10);
		panel_4.add(textField_17);
		
		JLabel label_54 = new JLabel("SupplierID:");
		label_54.setBounds(12, 243, 94, 16);
		panel_4.add(label_54);
		
		textField_18 = new JTextField();
		textField_18.setBounds(110, 240, 116, 22);
		textField_18.setColumns(10);
		panel_4.add(textField_18);
		
		JButton button_16 = new JButton("Edit Item");
		button_16.setIcon(null);
		button_16.setToolTipText("Edit the record in the table");
		button_16.setBounds(28, 309, 97, 25);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					int row = table_1.getSelectedRow();
					String value=(table_1.getModel().getValueAt(row, 0).toString());
					String sql="UPDATE testproduct SET ProductName=?, ProductDescription=?, ProductPrice=?, ProductQuantity=?, SupplierID=? where Productcode="+value;
				PreparedStatement pst = con.prepareStatement(sql);
				//Productcode, ProductName, ProductDescription, ProductPrice, ProductQuantity, SupplierID
				pst.setString(1,textField_6.getText());
				pst.setString(2,textField_15.getText());
				pst.setString(3,textField_16.getText());
				pst.setString(4,textField_17.getText());
				pst.setString(5,textField_18.getText());
			
				
				//Add JCalendar
				//Nonclickable Tables!
				
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Record Updated.");
				tableRef();
				clearproduct();
				 } catch( Exception ex) {
					 JOptionPane.showMessageDialog(null, "Record Update failed. Please try again.");
	                    System.out.println(ex);
	                }

			}
		});
		panel_4.add(button_16);
		
		JButton button_17 = new JButton("Delete Item");
		button_17.setToolTipText("Deletes record in the table");
		button_17.setBounds(142, 309, 113, 25);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table_1.getSelectedRow();
				String cell=table_1.getModel().getValueAt(row, 0).toString();
				String sql = "DELETE FROM testproduct where Productcode = "+cell;
				int action=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the data?","Delete",JOptionPane.YES_NO_OPTION);
				if (action==0)
				try
			    {
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.execute();
					JOptionPane.showMessageDialog(null, "Deleted Successfully.");
					tableRef();		
			    }
			    catch (Exception ex)
			    {
			JOptionPane.showMessageDialog(null, e);
			JOptionPane.showMessageDialog(null, "Deletion Failed. Please try again.");
			    }

			  }
			
		});
		panel_4.add(button_17);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setToolTipText("Refresh table");
		btnRefresh.setBounds(1013, 19, 97, 25);
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			tableRef();
			}
		});
		panel_4.add(btnRefresh);
		
		JButton button_21 = new JButton("");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearproduct();
			}
		});
		button_21.setIcon(new ImageIcon(secondbox.class.getResource("/resources/Webp.net-resizeimage.png")));
		button_21.setToolTipText("Reset fields");
		button_21.setBounds(265, 309, 40, 25);
		panel_4.add(button_21);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(336, 55, 774, 279);
		panel_4.add(scrollPane_3);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i=table_1.getSelectedRow();
					TableModel model = table_1.getModel();
					textField_5.setText(model.getValueAt(i,0).toString());
					textField_6.setText(model.getValueAt(i,1).toString());
					textField_15.setText(model.getValueAt(i,2).toString());
					textField_16.setText(model.getValueAt(i,3).toString());
					textField_17.setText(model.getValueAt(i,4).toString());
					textField_18.setText(model.getValueAt(i,5).toString());

					
				}
			});
		scrollPane_3.setViewportView(table_1);
		
		JButton button_26 = new JButton("Search");
		button_26.setToolTipText("Search Data in table");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");	
					//PreparedStatement pst = conn.prepareStatement("SELECT Productcode, ProductName FROM testproduct");
					PreparedStatement pst = conn.prepareStatement("select * from testproduct where Productcode= ? or ProductName=? or ProductDescription=? or ProductPrice=? or ProductQuantity=? or SupplierID=? ");
		
					Statement stmt=conn.createStatement();
					
					pst.setString(1,textField_4.getText());
					pst.setString(2,textField_4.getText());
					pst.setString(3,textField_4.getText());
					pst.setString(4,textField_4.getText());
					pst.setString(5,textField_4.getText());
					pst.setString(6,textField_4.getText());
					ResultSet rs = pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
					}
			catch(Exception e1) {
				System.out.println(e1);
				
			}
				
			}
		});
		button_26.setBounds(904, 19, 97, 25);
		panel_4.add(button_26);
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Employee", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton addEmploy = new JButton("Add New Item");
		addEmploy.setToolTipText("Add a new record in the table");
		addEmploy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddEmployee().setVisible(true);
				
				
				
				
			}
		});
		
				addEmploy.setBounds(12, 19, 113, 25);
				panel_2.add(addEmploy);
				
				JLabel label_9 = new JLabel("Search Item:");
				label_9.setBounds(565, 23, 94, 16);
				panel_2.add(label_9);
				
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(671, 20, 199, 22);
				panel_2.add(textField_7);
				
				EmployID = new JTextField();
				EmployID.setEditable(false);
				EmployID.setColumns(10);
				EmployID.setBounds(110, 80, 116, 22);
				panel_2.add(EmployID);
				
				JLabel lblEmployeeId_1 = new JLabel("Employee ID:");
				lblEmployeeId_1.setBounds(12, 83, 94, 16);
				panel_2.add(lblEmployeeId_1);
				
				JLabel lblEmployeeName = new JLabel("First Name:");
				lblEmployeeName.setBounds(12, 115, 94, 16);
				panel_2.add(lblEmployeeName);
				
				ename = new JTextField();
				ename.setColumns(10);
				ename.setBounds(110, 112, 116, 22);
				panel_2.add(ename);
				
				JLabel lblContactNumber = new JLabel("Contact #:");
				lblContactNumber.setBounds(12, 182, 94, 16);
				panel_2.add(lblContactNumber);
				
				econtact = new JTextField();
				econtact.setColumns(10);
				econtact.setBounds(110, 179, 116, 22);
				panel_2.add(econtact);
				
				JLabel lblAddress = new JLabel("Address:");
				lblAddress.setBounds(12, 214, 94, 16);
				panel_2.add(lblAddress);
				
				eadd = new JTextField();
				eadd.setColumns(10);
				eadd.setBounds(110, 211, 116, 22);
				panel_2.add(eadd);
				
				JLabel lblBirthdate = new JLabel("Birth Date:");
				lblBirthdate.setBounds(12, 246, 94, 16);
				panel_2.add(lblBirthdate);
				
				ebd = new JTextField();
				ebd.setColumns(10);
				ebd.setBounds(110, 243, 116, 22);
				panel_2.add(ebd);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(336, 55, 774, 279);
				panel_2.add(scrollPane_1);
				
				table_2 = new JTable();
				scrollPane_1.setViewportView(table_2);
				table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				table_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int i=	table_2.getSelectedRow();
						TableModel model = table_2.getModel();
						EmployID.setText(model.getValueAt(i,0).toString());
						ename.setText(model.getValueAt(i,1).toString());
						ename2.setText(model.getValueAt(i,2).toString());
						econtact.setText(model.getValueAt(i,3).toString());
						eadd.setText(model.getValueAt(i,4).toString());
						ebd.setText(model.getValueAt(i,5).toString());
				
						
						
					}
					
				});
				
				JButton button_7 = new JButton("Edit Item");
				button_7.setToolTipText("Edit the record in the table");
				button_7.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							try{
							
								Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
								int row = table_2.getSelectedRow();
								String value=(table_2.getModel().getValueAt(row, 0).toString());
								String sql="UPDATE testemployee SET EmployeeFirstName=?, EmployeeLastName=?, Contact=?, Address=?, Birthdate=? where EmployeeID="+value;
							PreparedStatement pst = con.prepareStatement(sql);
								
							pst.setString(1,ename.getText());
							pst.setString(2,ename2.getText());
							pst.setString(3,econtact.getText());
							pst.setString(4,eadd.getText());
							pst.setString(5,ebd.getText());
						
							
							pst.executeUpdate();
							JOptionPane.showMessageDialog(null, "Record Updated.");
							tableRef2();
							clearemployee();
							 } catch( Exception ex) {
								 JOptionPane.showMessageDialog(null, "Record Update failed. Please try again.");
				                    System.out.println(ex);
				                    System.out.println(e);
				                }

						}
					});
				
	
		button_7.setBounds(28, 338, 97, 25);
		panel_2.add(button_7);
		
		JButton button_8 = new JButton("Delete Item");
		button_8.setToolTipText("Deletes record in the table");
		button_8.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					int row=table_2.getSelectedRow();
					String cell=table_2.getModel().getValueAt(row, 0).toString();
					String sql = "DELETE FROM testemployee where EmployeeID = "+cell;
					int action=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the data?","Delete",JOptionPane.YES_NO_OPTION);
					if (action==0)
					try
					
				    {
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
						PreparedStatement ps = conn.prepareStatement(sql);
						ps.execute();
						JOptionPane.showMessageDialog(null, "Deleted Successfully.");
						tableRef2();
					
						
						
				    }
				    catch (Exception ex)
				    {
				JOptionPane.showMessageDialog(null, e);
				
					JOptionPane.showMessageDialog(null, "Deletion Failed. Please try again.");
				  }
				}
			});
		button_8.setBounds(142, 338, 113, 25);
		panel_2.add(button_8);
		
		JButton button_15 = new JButton("Refresh");
		button_15.setToolTipText("Refresh table");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableRef2();
			}
		});
		button_15.setBounds(1015, 19, 97, 25);
		panel_2.add(button_15);
		
		JLabel lblLastName_1 = new JLabel("Last Name:");
		lblLastName_1.setBounds(12, 147, 94, 16);
		panel_2.add(lblLastName_1);
		
		ename2 = new JTextField();
		ename2.setColumns(10);
		ename2.setBounds(110, 144, 116, 22);
		panel_2.add(ename2);
		
		JButton button_4 = new JButton("");
		button_4.setToolTipText("Reset fields");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearemployee();
			}
		});
		button_4.setIcon(new ImageIcon(secondbox.class.getResource("/resources/Webp.net-resizeimage.png")));
		button_4.setBounds(270, 338, 40, 25);
		panel_2.add(button_4);
		
		JButton button_23 = new JButton("Search");
		button_23.setToolTipText("Search Data in table");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");	
				
				PreparedStatement pst = conn.prepareStatement("select * from testemployee where EmployeeID = ? or EmployeeFirstName=? or EmployeeLastName=? or Contact=? or Address=? ");
					Statement stmt=conn.createStatement();
					
					pst.setString(1,textField_7.getText());
					pst.setString(2,textField_7.getText());
					pst.setString(3,textField_7.getText());
					pst.setString(4,textField_7.getText());
					pst.setString(5,textField_7.getText());
					
					ResultSet rs = pst.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));
					
					}
			catch(Exception e1) {
				System.out.println(e1);
				
			}
			}
		});
		button_23.setBounds(906, 19, 97, 25);
		panel_2.add(button_23);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Customer", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(12, 83, 56, 16);
		panel_1.add(label_4);
		
		JButton button_3 = new JButton("Add New Item");
		button_3.setToolTipText("Add a new record in the table");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddCustomer().setVisible(true);
			}
		});
		button_3.setBounds(12, 19, 113, 25);
		panel_1.add(button_3);
		
		JLabel label_15 = new JLabel("Search Item:");
		label_15.setBounds(567, 23, 94, 16);
		panel_1.add(label_15);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(673, 20, 199, 22);
		panel_1.add(textField_19);
		
		CusID = new JTextField();
		CusID.setEditable(false);
		CusID.setColumns(10);
		CusID.setBounds(110, 80, 116, 22);
		panel_1.add(CusID);
		
		JLabel lblCustomerId_1 = new JLabel("Customer ID:");
		lblCustomerId_1.setBounds(12, 83, 94, 16);
		panel_1.add(lblCustomerId_1);
		
		JLabel lblName = new JLabel("First Name:");
		lblName.setBounds(12, 115, 94, 16);
		panel_1.add(lblName);
		
		cname = new JTextField();
		cname.setColumns(10);
		cname.setBounds(110, 112, 116, 22);
		panel_1.add(cname);
		
		JLabel lblContact = new JLabel("Contact #");
		lblContact.setBounds(12, 182, 94, 16);
		panel_1.add(lblContact);
		
		cc = new JTextField();
		cc.setColumns(10);
		cc.setBounds(110, 179, 116, 22);
		panel_1.add(cc);
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setBounds(12, 214, 94, 16);
		panel_1.add(lblAddress_1);
		
		cadd = new JTextField();
		cadd.setColumns(10);
		cadd.setBounds(110, 211, 116, 22);
		panel_1.add(cadd);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(336, 55, 774, 279);
		panel_1.add(scrollPane_2);
		
		table_4 = new JTable();
		scrollPane_2.setViewportView(table_4);
		table_4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=	table_4.getSelectedRow();
				TableModel model = table_4.getModel();
				CusID.setText(model.getValueAt(i,0).toString());
				cname.setText(model.getValueAt(i,1).toString());
				cname2.setText(model.getValueAt(i,2).toString());
				cc.setText(model.getValueAt(i,3).toString());
				cadd.setText(model.getValueAt(i,4).toString());
			}
		});
		
		JButton editcustomer = new JButton("Edit Item");
		editcustomer.setToolTipText("Edit the record in the table");
		editcustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					int row = table_4.getSelectedRow();
					String value=(table_4.getModel().getValueAt(row, 0).toString());
					String sql="UPDATE testcustomer SET CustomerFirstName=?, CustomerLastName=?, ContactNo=?, Address=? where CustID="+value;
				PreparedStatement pst = con.prepareStatement(sql);
					
				pst.setString(1,cname.getText());
				pst.setString(2,cname2.getText());
				pst.setString(3,cc.getText());
				pst.setString(4,cadd.getText());
				
				
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Record Updated.");
				tableRef3();
				clearcustomer();
				} catch( Exception ex) {
					 JOptionPane.showMessageDialog(null, "Record Update failed. Please try again.");
				    System.out.println(ex);
				}

			}
		});
		
		
		editcustomer.setBounds(12, 261, 97, 25);
		panel_1.add(editcustomer);
		
		JButton button_5 = new JButton("Delete Item");
		button_5.setToolTipText("Deletes record in the table");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table_4.getSelectedRow();
				String cell=table_4.getModel().getValueAt(row, 0).toString();
				String sql = "DELETE FROM testcustomer where CustID = "+cell;
				int action=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the data?","Delete",JOptionPane.YES_NO_OPTION);
				if (action==0)
				try
			    {
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.execute();
					JOptionPane.showMessageDialog(null, "Deleted Successfully.");
					tableRef3();
					
				
					
					
			    }
			    catch (Exception ex)
			    {
			JOptionPane.showMessageDialog(null, e);
			JOptionPane.showMessageDialog(null, "Deletion Failed. Please try again.");
			    }

			  }
			
		});
		button_5.setBounds(126, 261, 113, 25);
		panel_1.add(button_5);
		
		JButton button_18 = new JButton("Refresh");
		button_18.setToolTipText("Refresh table");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableRef3();
			}
		});
		button_18.setBounds(1013, 19, 97, 25);
		panel_1.add(button_18);
		
		cname2 = new JTextField();
		cname2.setColumns(10);
		cname2.setBounds(110, 147, 116, 22);
		panel_1.add(cname2);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(12, 150, 94, 16);
		panel_1.add(lblLastName);
		
		JButton clear = new JButton("");
		clear.setToolTipText("Reset fields");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearcustomer();
				
			}
		});
		clear.setIcon(new ImageIcon(secondbox.class.getResource("/resources/Webp.net-resizeimage.png")));
		clear.setSelectedIcon(new ImageIcon("C:\\Users\\Jed\\Desktop\\BIMS\\rest.jpg"));
		clear.setBounds(251, 261, 40, 25);
		panel_1.add(clear);
		
		JButton button_24 = new JButton("Search");
		button_24.setToolTipText("Search Data in table");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");	
				
				PreparedStatement pst = conn.prepareStatement("select * from testcustomer where CustID = ? or CustomerFirstName=? or CustomerLastname=? or ContactNo=? or Address=?");
					Statement stmt=conn.createStatement();
					
					pst.setString(1,textField_19.getText());
					pst.setString(2,textField_19.getText());
					pst.setString(3,textField_19.getText());
					pst.setString(4,textField_19.getText());
					pst.setString(5,textField_19.getText());
					ResultSet rs = pst.executeQuery();
					table_4.setModel(DbUtils.resultSetToTableModel(rs));
					
					}
			catch(Exception e1) {
				System.out.println(e1);
				
			}
			}
		});
		button_24.setBounds(904, 19, 97, 25);
		panel_1.add(button_24);
		
	
		JPanel panel = new JPanel();
		tabbedPane.addTab("Order", null, panel, null);
		panel.setLayout(null);
		
		JButton button = new JButton("Add New Item");
		button.setToolTipText("Add a new record in the table");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddOrder().setVisible(true);
			}
		});
		button.setBounds(12, 19, 113, 25);
		panel.add(button);
		
		JLabel label_2 = new JLabel("Search Item:");
		label_2.setBounds(587, 23, 94, 16);
		panel.add(label_2);
		
		txtSearch = new JTextField();
		txtSearch.setColumns(10);
		txtSearch.setBounds(693, 20, 199, 22);
		panel.add(txtSearch);
		
		oid = new JTextField();
		oid.setEditable(false);
		oid.setColumns(10);
		oid.setBounds(110, 80, 116, 22);
		panel.add(oid);
		
		JLabel lblOrderId = new JLabel("Order ID:");
		lblOrderId.setBounds(12, 83, 94, 16);
		panel.add(lblOrderId);
		
		JLabel lblOrderNamel = new JLabel("Order Name:");
		lblOrderNamel.setBounds(12, 115, 94, 16);
		panel.add(lblOrderNamel);
		
		oname = new JTextField();
		oname.setColumns(10);
		oname.setBounds(110, 112, 116, 22);
		panel.add(oname);
		
		JLabel lblOrderDate = new JLabel("Order Date :");
		lblOrderDate.setBounds(12, 147, 94, 16);
		panel.add(lblOrderDate);
		
		odate = new JTextField();
		odate.setColumns(10);
		odate.setBounds(110, 144, 116, 22);
		panel.add(odate);
		
		JLabel lblDeliveryDate = new JLabel("Delivery Date:");
		lblDeliveryDate.setBounds(12, 179, 94, 16);
		panel.add(lblDeliveryDate);
		
		odd = new JTextField();
		odd.setColumns(10);
		odd.setBounds(110, 176, 116, 22);
		panel.add(odd);
		
		JLabel lblTotalPrice = new JLabel("Total Price:");
		lblTotalPrice.setBounds(12, 211, 94, 16);
		panel.add(lblTotalPrice);
		
		tp = new JTextField();
		tp.setColumns(10);
		tp.setBounds(110, 208, 116, 22);
		panel.add(tp);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(12, 243, 94, 16);
		panel.add(lblEmployeeId);
		
		EmployeeID = new JTextField();
		EmployeeID.setColumns(10);
		EmployeeID.setBounds(110, 240, 116, 22);
		panel.add(EmployeeID);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(336, 55, 774, 279);
				panel.add(scrollPane);
				
						
						ordertable = new JTable();
						scrollPane.setViewportView(ordertable);
						ordertable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						ordertable.addMouseListener(new MouseAdapter() {
							@Override
							
							public void mouseClicked(MouseEvent arg0) {
							int i=	ordertable.getSelectedRow();
								TableModel model = ordertable.getModel();
								oid.setText(model.getValueAt(i,0).toString());
								oname.setText(model.getValueAt(i,1).toString());
								odate.setText(model.getValueAt(i,2).toString());
								odd.setText(model.getValueAt(i,3).toString());
								tp.setText(model.getValueAt(i,4).toString());
								EmployeeID.setText(model.getValueAt(i,5).toString());
								CustID.setText(model.getValueAt(i,6).toString());
							
								
								
								
								
							}
						});
				
				JButton button_1 = new JButton("Edit Item");
				button_1.setToolTipText("Edit the record in the table");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try{
						
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
							int row = ordertable.getSelectedRow();
							String value=(ordertable.getModel().getValueAt(row, 0).toString());
							String sql="UPDATE ordert SET OrderName=?, Orderdate=?, DeliveryDate=?, TotalPrice=?, EmployeeID=?,CustID=? where OrderID="+value;
						PreparedStatement pst = con.prepareStatement(sql);
							//OrderID, OrderName, Orderdate, DeliveryDate, TotalPrice, EmployeeID, CustID
						//changeable EmployeeID?
						pst.setString(1,oname.getText());
						pst.setString(2,odate.getText());
						pst.setString(3,odd.getText());
						pst.setString(4,tp.getText());
						pst.setString(5,EmployeeID.getText());
						pst.setString(6,CustID.getText());
						
						
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Record Updated.");
						tableRef1();
						clearorder();
						 } catch( Exception ex) {
							 JOptionPane.showMessageDialog(null, "Record Update failed. Please try again.");
			                    System.out.println(ex);
			                }

					}
				});
				button_1.setBounds(28, 338, 97, 25);
				panel.add(button_1);
				
				JButton button_2 = new JButton("Delete Item");
				button_2.setToolTipText("Deletes record in the table");
				button_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						int row=ordertable.getSelectedRow();
						String cell=ordertable.getModel().getValueAt(row, 0).toString();
					
						String sql = "DELETE FROM ordert where OrderID = "+cell;
						int action=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the data?","Delete",JOptionPane.YES_NO_OPTION);
						if (action==0)
						try
					    {
							
							Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
							PreparedStatement ps = conn.prepareStatement(sql);
							ps.execute();
							JOptionPane.showMessageDialog(null, "Deleted Successfully.");
							tableRef1();
						
							
							
					    }
					    catch (Exception ex)
					    {
					JOptionPane.showMessageDialog(null, e);
					JOptionPane.showMessageDialog(null, "Deletion Failed. Please try again.");
					    }

					  }
					
				});
				button_2.setBounds(142, 338, 113, 25);
				panel.add(button_2);
				
				CustID = new JTextField();
				CustID.setColumns(10);
				CustID.setBounds(110, 272, 116, 22);
				panel.add(CustID);
				
				JLabel lblCustomerId = new JLabel("Customer ID:");
				lblCustomerId.setBounds(12, 275, 94, 16);
				panel.add(lblCustomerId);
				
				JButton button_6 = new JButton("Refresh");
				button_6.setToolTipText("Refresh table");
				button_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tableRef1();
					}
				});
				button_6.setBounds(1013, 19, 97, 25);
				panel.add(button_6);
				
				JButton button_20 = new JButton("");
				button_20.setToolTipText("Reset fields");
				button_20.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clearorder();
					}
				});
				button_20.setIcon(new ImageIcon(secondbox.class.getResource("/resources/Webp.net-resizeimage.png")));
				button_20.setBounds(267, 338, 40, 25);
				panel.add(button_20);
				
				JButton btnNewButton = new JButton("Search");
				btnNewButton.setToolTipText("Search Data in table");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try{
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");	
						
						PreparedStatement pst = conn.prepareStatement("select * from ordert where OrderID=? or OrderName=?  or TotalPrice=? or EmployeeID=? or CustID=?");
				//		 pst = conn.prepareStatement("select * from ordert where OrderName = ?");		
						//SELECT LEFT(subject , 10) FROM tbl 
						//SELECT SUBSTRING(DeliveryDate, 8, 10) 
						//
							Statement stmt=conn.createStatement();
							
							pst.setString(1,txtSearch.getText());
							pst.setString(2,txtSearch.getText());
							pst.setString(3,txtSearch.getText());
						
							pst.setString(4,txtSearch.getText());
							pst.setString(5,txtSearch.getText());
						
							
							ResultSet rs = pst.executeQuery();
							ordertable.setModel(DbUtils.resultSetToTableModel(rs));
							
							}
					catch(Exception e1) {
						System.out.println(e1);
						
					}
						
					}});
				btnNewButton.setBounds(904, 19, 97, 25);
				panel.add(btnNewButton);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Supply", null, tabbedPane_1, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Supplier Information", null, panel_6, null);
		panel_6.setLayout(null);
		
		JButton button_12 = new JButton("Add New Item");
		button_12.setToolTipText("Add a new record in the table");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new AddSupplier().setVisible(true);
			}
		});
		button_12.setBounds(12, 19, 113, 25);
		panel_6.add(button_12);
		
		JLabel label_39 = new JLabel("Search Item:");
		label_39.setBounds(591, 24, 94, 16);
		panel_6.add(label_39);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(697, 24, 199, 22);
		panel_6.add(textField_35);
		
		suppname = new JTextField();
		suppname.setColumns(10);
		suppname.setBounds(110, 94, 116, 22);
		panel_6.add(suppname);
		
		JLabel lblSupplierName = new JLabel("Supplier Name:");
		lblSupplierName.setBounds(12, 97, 94, 16);
		panel_6.add(lblSupplierName);
		
		JLabel lblContact_1 = new JLabel("Contact #:");
		lblContact_1.setBounds(12, 129, 94, 16);
		panel_6.add(lblContact_1);
		
		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(110, 126, 116, 22);
		panel_6.add(contact);
		
		JLabel lblAddress_2 = new JLabel("Address:");
		lblAddress_2.setBounds(12, 161, 94, 16);
		panel_6.add(lblAddress_2);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(110, 158, 116, 22);
		panel_6.add(address);
		
		JButton button_13 = new JButton("Edit Item");
		button_13.setToolTipText("Edit the record in the table");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					int row = table_5.getSelectedRow();
					String value=(table_5.getModel().getValueAt(row, 0).toString());
					String sql="UPDATE supplier SET SupplierName=?, ContactNum=?, Address=? where SupplierID="+value;
				PreparedStatement pst = con.prepareStatement(sql);
					
				pst.setString(1,suppname.getText());
				pst.setString(2,contact.getText());
				pst.setString(3,address.getText());
				
	
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Record Updated.");
				tableRef4();
				clearsupplier();
				 } catch( Exception ex) {
					 JOptionPane.showMessageDialog(null, "Record Update failed. Please try again.");
	                    System.out.println(ex);
	                }

			}
		});
		button_13.setBounds(12, 193, 97, 25);
		panel_6.add(button_13);
		
		JButton button_14 = new JButton("Delete Item");
		button_14.setToolTipText("Deletes record in the table");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table_5.getSelectedRow();
				String cell=table_5.getModel().getValueAt(row, 0).toString();
				String sql = "DELETE FROM supplier where SupplierID = "+cell;
				int action=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the data?","Delete",JOptionPane.YES_NO_OPTION);
				if (action==0)
				try
				
			    {
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.execute();
					JOptionPane.showMessageDialog(null, "Deleted Successfully.");
					tableRef4();
				
					
					
			    }
			    catch (Exception ex)
			    {
			    	 System.out.println(ex);
			
				JOptionPane.showMessageDialog(null, "Deletion Failed. Please try again.");
			  }
			}
		});
		button_14.setBounds(126, 193, 113, 25);
		panel_6.add(button_14);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(336, 55, 774, 279);
		panel_6.add(scrollPane_4);
		
		table_5 = new JTable();
		table_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=	table_5.getSelectedRow();
				TableModel model = table_5.getModel();
				SuppID.setText(model.getValueAt(i,0).toString());
				suppname.setText(model.getValueAt(i,1).toString());
				contact.setText(model.getValueAt(i,2).toString());
				address.setText(model.getValueAt(i,3).toString());
				
		
				
			}
			
		});
		scrollPane_4.setViewportView(table_5);
		
		JButton button_19 = new JButton("");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearsupplier();
			}
		});
		button_19.setToolTipText("Reset fields");
		button_19.setIcon(new ImageIcon(secondbox.class.getResource("/resources/Webp.net-resizeimage.png")));
		button_19.setBounds(249, 193, 40, 25);
		panel_6.add(button_19);
		
		JButton button_22 = new JButton("Search");
		button_22.setToolTipText("Search Data in table");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");	
				
					PreparedStatement pst = conn.prepareStatement("select * from supplier where SupplierID = ? or SupplierName=? or ContactNum=? or Address=?");
					Statement stmt=conn.createStatement();
					
					pst.setString(1,textField_35.getText());
					pst.setString(2,textField_35.getText());
					pst.setString(3,textField_35.getText());
					pst.setString(4,textField_35.getText());
					ResultSet rs = pst.executeQuery();
					table_5.setModel(DbUtils.resultSetToTableModel(rs));
					
					}
			catch(Exception e1) {
				System.out.println(e1);
				
			}
			}
		});
		button_22.setBounds(908, 24, 97, 25);
		panel_6.add(button_22);
		
		JButton button_27 = new JButton("Refresh");
		button_27.setToolTipText("Refresh table");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableRef4();
			}
			
		});
		button_27.setBounds(1013, 24, 97, 25);
		panel_6.add(button_27);
		
		JLabel supplierid = new JLabel("SupplierID:");
		supplierid.setBounds(12, 65, 94, 16);
		panel_6.add(supplierid);
		
		SuppID = new JTextField();
		SuppID.setEditable(false);
		SuppID.setColumns(10);
		SuppID.setBounds(110, 62, 116, 22);
		panel_6.add(SuppID);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("Supplier's Supplied Items", null, panel_7, null);
		panel_7.setLayout(null);
		
		JButton button_9 = new JButton("Add New Item");
		button_9.setToolTipText("Add a new record in the table");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddSupplies().setVisible(true);
			}
		});
		button_9.setBounds(12, 19, 113, 25);
		panel_7.add(button_9);
		
		JLabel label_12 = new JLabel("Search Item:");
		label_12.setBounds(603, 23, 94, 16);
		panel_7.add(label_12);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(693, 24, 199, 22);
		panel_7.add(textField_10);
		
		supplyid = new JTextField();
		supplyid.setEditable(false);
		supplyid.setColumns(10);
		supplyid.setBounds(110, 80, 116, 22);
		panel_7.add(supplyid);
		
		JLabel lblSuppliesId = new JLabel("Supplies ID");
		lblSuppliesId.setBounds(12, 83, 94, 16);
		panel_7.add(lblSuppliesId);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(12, 144, 94, 16);
		panel_7.add(lblDescription);
		
		sdesc = new JTextField();
		sdesc.setColumns(10);
		sdesc.setBounds(110, 141, 116, 22);
		panel_7.add(sdesc);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(12, 176, 94, 16);
		panel_7.add(lblQuantity);
		
		sq = new JTextField();
		sq.setColumns(10);
		sq.setBounds(110, 173, 116, 22);
		panel_7.add(sq);
		
		JLabel lblSupplierId = new JLabel("SupplierID");
		lblSupplierId.setBounds(12, 208, 94, 16);
		panel_7.add(lblSupplierId);
		
		SuppIDd = new JTextField();
		SuppIDd.setColumns(10);
		SuppIDd.setBounds(110, 205, 116, 22);
		panel_7.add(SuppIDd);
		
		JButton button_10 = new JButton("Edit Item");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					int row = table.getSelectedRow();
					String value=(table.getModel().getValueAt(row, 0).toString());
					String sql="UPDATE testsupply SET ProductName=?, Description=?, Quantity=?, SupplierID=? where SupplierSuppliesID="+value;
				PreparedStatement pst = con.prepareStatement(sql);
					
				pst.setString(1,prodd.getText());
				pst.setString(2,sdesc.getText());
				pst.setString(3,sq.getText());
				pst.setString(4,SuppIDd.getText());
				
				
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Record Updated.");
				tableRef5();
				clearssupply();
				} catch( Exception ex) {
					 JOptionPane.showMessageDialog(null, "Record Update failed. Please try again.");
				    System.out.println(ex);
				}

			}
		});
		
		button_10.setBounds(12, 253, 97, 25);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("Delete Item");
		button_11.setToolTipText("Deletes record in the table");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				String cell=table.getModel().getValueAt(row, 0).toString();
				String sql = "DELETE FROM testsupply where SupplierSuppliesID = "+cell;
				int action=JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the data?","Delete",JOptionPane.YES_NO_OPTION);
				if (action==0)
				try
				
			    {
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.execute();
					JOptionPane.showMessageDialog(null, "Deleted Successfully.");
					tableRef5();
				
					
					
			    }
			    catch (Exception ex)
			    {
			    	 System.out.println(ex);
			
				JOptionPane.showMessageDialog(null, "Deletion Failed. Please try again.");
			  }
			}
		});
		button_11.setBounds(126, 253, 113, 25);
		panel_7.add(button_11);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(336, 55, 774, 279);
		panel_7.add(scrollPane_5);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=	table.getSelectedRow();
				TableModel model = table.getModel();
				supplyid.setText(model.getValueAt(i,0).toString());
				prodd.setText(model.getValueAt(i,1).toString());
				sdesc.setText(model.getValueAt(i,2).toString());
				sq.setText(model.getValueAt(i,3).toString());
				SuppIDd.setText(model.getValueAt(i,4).toString());
				
		
				
			}
			
		});
		scrollPane_5.setViewportView(table);
		
		JButton button_25 = new JButton("Search");
		button_25.setToolTipText("Search Data in table");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");	
				
				PreparedStatement pst = conn.prepareStatement("select * from testsupply where SupplierSuppliesID =? or ProductName=? or Description=? or Quantity=? or SupplierID=?");
					Statement stmt=conn.createStatement();
					
					pst.setString(1,textField_10.getText());
					pst.setString(2,textField_10.getText());
					pst.setString(3,textField_10.getText());
					pst.setString(4,textField_10.getText());
					pst.setString(5,textField_10.getText());
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					}
			catch(Exception e1) {
				System.out.println(e1);
				
			}
			}
		});
		button_25.setBounds(904, 24, 97, 25);
		panel_7.add(button_25);
		
		JButton button_28 = new JButton("Refresh");
		button_28.setToolTipText("Refresh table");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableRef5();
				
			}
		});
		button_28.setBounds(1013, 24, 97, 25);
		panel_7.add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setIcon(new ImageIcon(secondbox.class.getResource("/resources/Webp.net-resizeimage.png")));
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		button_29.setToolTipText("Reset fields");
		button_29.setBounds(251, 253, 40, 25);
		panel_7.add(button_29);
		
		JLabel lblProductName = new JLabel("Product Name:");
		lblProductName.setBounds(12, 112, 94, 16);
		panel_7.add(lblProductName);
		
		prodd = new JTextField();
		prodd.setColumns(10);
		prodd.setBounds(110, 109, 116, 22);
		panel_7.add(prodd);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(1161, 80, 98, 25);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Logout().setVisible(true);
				
				dispose();
				
			}
		});
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(528, -7, 259, 73);
		lblNewLabel.setIcon(new ImageIcon(secondbox.class.getResource("/resources/BIMSICON.png")));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 71, 1247, 2);
		contentPane.add(separator);
		
		JButton btnNewButton_1 = new JButton("?");
		btnNewButton_1.setToolTipText("Help");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Help().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(1089, 80, 60, 25);
		contentPane.add(btnNewButton_1);
		tableRef();
		tableRef1();
		tableRef2();
		tableRef3();
		tableRef4();
		tableRef5();
	}
		
	
	
	public void tableRef() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
			DefaultTableModel model = new DefaultTableModel(new String[]{"ProductCode", "ProductName", "ProductDescription","ProductPrice","ProductQuantity","SupplierID"}, 0);
			String sql="SELECT * FROM testproduct";
			Statement stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			table_1.setModel(model);
			while(rs.next())
			{
			    String d = rs.getString("ProductCode");
			    String e = rs.getString("ProductName");
			    String f = rs.getString("ProductDescription");
			    String g = rs.getString("ProductPrice");
			    int  h= rs.getInt("ProductQuantity");
			    String i = rs.getString("SupplierID");
			    model.addRow(new Object[]{d, e, f,g,h,i});
			    
			  /**  if (h >= 10)
				{
			    	JLabel lblSomeItemsAre = new JLabel("Some items");
					lblSomeItemsAre.setForeground(Color.RED);
					lblSomeItemsAre.setBounds(743, 344, 74, 16);
					panel_4.add(lblSomeItemsAre);
					
					JLabel lblAreLowIn = new JLabel(" are low in storage");
					lblAreLowIn.setForeground(Color.RED);
					lblAreLowIn.setBounds(720, 361, 129, 16);
					panel_4.add(lblAreLowIn);
				} 
				*/
			}
			
			}
	catch(Exception e1) {
		System.out.println(e1);
		
		}
		}

public void tableRef1() {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
		DefaultTableModel model = new DefaultTableModel(new String[]{"OrderID", "OrderName", "Orderdate", "DeliveryDate", "TotalPrice", "EmployeeID", "CustID"}, 0);
		String sql="SELECT * FROM ordert ";
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		ordertable.setModel(model);
		while(rs.next())
		{
		    String d = rs.getString("OrderID");
		    String e = rs.getString("OrderName");
		    String f = rs.getString("Orderdate");
		    String g = rs.getString("DeliveryDate");
		    String h= rs.getString("TotalPrice");
		    String i = rs.getString("EmployeeID");
		    String j = rs.getString("CustID");
		    model.addRow(new Object[]{d, e, f,g,h,i,j});
		}
		
		}
catch(Exception e1) {
	System.out.println(e1);
	
	}
	}


public void tableRef2() {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
		DefaultTableModel model = new DefaultTableModel(new String[]{"EmployeeID", "EmployeeFirstName","EmployeeLastName", "Contact", "Address", "Birthdate"}, 0);
		String sql="SELECT * FROM testemployee";
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		table_2.setModel(model);
		while(rs.next())
		{
		    String d = rs.getString("EmployeeID");
		    String e = rs.getString("EmployeeFirstName");
		    String f = rs.getString("EmployeeLastName");
		    String g = rs.getString("Contact");
		    String h = rs.getString("Address");
		    String i= rs.getString("Birthdate");
		    
		    model.addRow(new Object[]{d, e, f,g,h,i});
		}
		
		}
catch(Exception e1) {
	System.out.println(e1);
	
	}
	}


public void tableRef3() {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
		DefaultTableModel model = new DefaultTableModel(new String[]{"CustID", "CustomerFirstName","CustomerLastname", "ContactNo", "Address"}, 0);
		String sql="SELECT * FROM testcustomer";
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		table_4.setModel(model);
		while(rs.next())
		{
		    String d = rs.getString("CustID");
		    String e = rs.getString("CustomerFirstName");
		    String f = rs.getString("CustomerLastName");
		    String g = rs.getString("ContactNo");
		    String h = rs.getString("Address");
		    model.addRow(new Object[]{d, e, f,g,h});
		}
		
		}
catch(Exception e1) {
	System.out.println(e1);
	
	}
	}

public void tableRef4() {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
		DefaultTableModel model = new DefaultTableModel(new String[]{"SupplierID", "SupplierName", "ContactNum", "Address"}, 0);
		String sql="SELECT * FROM supplier";
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		table_5.setModel(model);
		while(rs.next())
		{
		    String d = rs.getString("SupplierID");
		    String e = rs.getString("SupplierName");
		    String f = rs.getString("ContactNum");
		    String g = rs.getString("Address");
		    model.addRow(new Object[]{d, e, f,g});
		}
		
		}
catch(Exception e1) {
	System.out.println(e1);
	
	}
	}

public void tableRef5() {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
		DefaultTableModel model = new DefaultTableModel(new String[]{"SupplierSuppliesID", "ProductName", "Description", "Quantity","SupplierID"}, 0);
		String sql="SELECT * FROM testsupply";
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		table.setModel(model);
		while(rs.next())
		{
		    String d = rs.getString("SupplierSuppliesID");
		    String e = rs.getString("ProductName");
		    String f = rs.getString("Description");
		    String g = rs.getString("Quantity");
		    String h = rs.getString("SupplierID");
		    
		    model.addRow(new Object[]{d, e, f,g,h});
		}
		
		}
catch(Exception e1) {
	System.out.println(e1);
	
	}
	}

public void theQuery(String query){
    Connection con = null;
    Statement st = null;
    try{
    
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tests","root","admin");
		Statement stmt=conn.createStatement();
        st.executeUpdate(query);
        JOptionPane.showMessageDialog(null,"Query Executed");
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex.getMessage());

    
    }
}
public void clearcustomer(){
	CusID.setText(null);
	cname.setText(null);
	cname2.setText(null);
	cc.setText(null);
	cadd.setText(null);

}

public void clearemployee(){
	EmployID.setText(null);
	ename.setText(null);
	ename2.setText(null);
	econtact.setText(null);
	ebd.setText(null);
	
	eadd.setText(null);

}


public void clearorder(){
	oid.setText(null);
	oname.setText(null);
	odate.setText(null);
	tp.setText(null);
	EmployeeID.setText(null);
	CustID.setText(null);
	odd.setText(null);
}



public void clearproduct(){
	textField_5.setText(null);
	textField_6.setText(null);
	textField_15.setText(null);
	textField_16.setText(null);
	textField_17.setText(null);
	textField_18.setText(null);
}


public void clearsupplier(){
	suppname.setText(null);
	contact.setText(null);
	address.setText(null);
	SuppID.setText(null);
}

public void clearssupply(){
	supplyid.setText(null);
	prodd.setText(null);
	sdesc.setText(null);
	sq.setText(null);
	SuppIDd.setText(null);
	
	
}
}