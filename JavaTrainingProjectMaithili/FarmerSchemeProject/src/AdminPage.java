import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1363, 660);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(542, 11, 343, 55);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Get Farmer Details");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(112, 87, 266, 33);
		contentPane.add(btnNewButton);
		
		JButton btnGetBidderDetails = new JButton("Get Bidder Details");
		btnGetBidderDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGetBidderDetails.setBounds(924, 87, 266, 33);
		contentPane.add(btnGetBidderDetails);
		
		JButton btnApproveBid = new JButton("Approve Bid");
		btnApproveBid.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnApproveBid.setBounds(484, 87, 266, 33);
		contentPane.add(btnApproveBid);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"FARMER_NAME", "PHONENUMBER", "EMAIL", "CITY", "STATE", "PINCODE", "AREA", "LANDADD", "LAND_PINCODE", "ACC_NO", "IFSC_CODE", "AADHAR_CARD", "PAN_CARD", "PASSWORD"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class, Object.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, Object.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			
		});
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.setBounds(760, 186, -620, 177);
		contentPane.add(table);
		table.setVisible(true);
	}
}
