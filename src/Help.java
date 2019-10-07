import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Help extends JFrame {

	private JPanel contentPane;

	public Help() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Help.class.getResource("/resources/kisspng-question-mark-icon-question-mark-5a7214f2980a92.2259030715174259066228.jpg")));
		setTitle("Help");
		setBounds(100, 100, 699, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Add New Item");
		button.setToolTipText("Add a new record in the table");
		button.setBounds(30, 13, 113, 25);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("Inserts a new record/data in the table.");
		lblNewLabel.setBounds(155, -7, 471, 65);
		contentPane.add(lblNewLabel);
		
		JButton button_1 = new JButton("Edit Item");
		button_1.setToolTipText("Edit the record in the table");
		button_1.setBounds(40, 48, 97, 25);
		contentPane.add(button_1);
		
		JLabel lblEditsAnAlready = new JLabel("Edits an already existing record in the table to what the user wants.");
		lblEditsAnAlready.setBounds(155, 28, 438, 65);
		contentPane.add(lblEditsAnAlready);
		
		JButton button_2 = new JButton("Delete Item");
		button_2.setToolTipText("Deletes record in the table");
		button_2.setBounds(30, 84, 113, 25);
		contentPane.add(button_2);
		
		JLabel lblDeleteAnAlready = new JLabel("Deletes an already existing record/data. Completely removing the data/record in the table.");
		lblDeleteAnAlready.setBounds(155, 63, 526, 65);
		contentPane.add(lblDeleteAnAlready);
		
		JButton button_3 = new JButton("Search");
		button_3.setToolTipText("Search Data in table");
		button_3.setBounds(40, 126, 97, 25);
		contentPane.add(button_3);
		
		JLabel lblSearchesForAnd = new JLabel("Searches for and identifies items in a database that correspond to keywords ");
		lblSearchesForAnd.setBounds(155, 106, 526, 65);
		contentPane.add(lblSearchesForAnd);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(Help.class.getResource("/resources/Webp.net-resizeimage.png")));
		button_4.setToolTipText("Reset fields");
		button_4.setBounds(68, 164, 40, 25);
		contentPane.add(button_4);
		
		JLabel label = new JLabel("Clear textfields");
		label.setToolTipText("Resets table fields.");
		label.setBounds(155, 141, 526, 65);
		contentPane.add(label);
		
		JButton button_5 = new JButton("Refresh");
		button_5.setToolTipText("Refresh table");
		button_5.setBounds(40, 202, 97, 25);
		contentPane.add(button_5);
		
		JLabel label_1 = new JLabel("Refresh Table Cells");
		label_1.setToolTipText("Refreshes changes made in the table. Click when added a new record in the table.");
		label_1.setBounds(155, 182, 526, 65);
		contentPane.add(label_1);
	}
}
