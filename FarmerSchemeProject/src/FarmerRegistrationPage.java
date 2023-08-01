import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

public class FarmerRegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmerRegistrationPage frame = new FarmerRegistrationPage();
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
	public FarmerRegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1351, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1300, 732);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Farmer Registeration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(552, 0, 265, 30);
		panel.add(lblNewLabel);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPersonalDetails.setBounds(605, 28, 134, 30);
		panel.add(lblPersonalDetails);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(482, 68, 69, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact Number");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(482, 102, 114, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email ID");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(492, 136, 69, 24);
		panel.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(651, 68, 265, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(651, 106, 265, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(651, 135, 265, 19);
		panel.add(textField_2);
		
		JLabel lblAddressDetails = new JLabel("Address Details");
		lblAddressDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddressDetails.setBounds(605, 164, 144, 30);
		panel.add(lblAddressDetails);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(492, 216, 69, 24);
		panel.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(651, 204, 265, 52);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("City");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1.setBounds(492, 262, 69, 24);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("State");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_2.setBounds(492, 296, 69, 24);
		panel.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Pincode");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_3.setBounds(482, 330, 69, 24);
		panel.add(lblNewLabel_1_3_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(651, 266, 265, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(651, 295, 265, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(651, 324, 265, 19);
		panel.add(textField_6);
		
		JLabel lblBankDetails = new JLabel("Bank Details");
		lblBankDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBankDetails.setBounds(595, 353, 144, 30);
		panel.add(lblBankDetails);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Account No");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_1.setBounds(492, 393, 103, 24);
		panel.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("IFSC code");
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2.setBounds(502, 427, 69, 24);
		panel.add(lblNewLabel_1_3_1_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(651, 393, 265, 19);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(651, 422, 265, 19);
		panel.add(textField_8);
		
		JLabel lblNewLabel_1_3_1_2_1 = new JLabel("Aadhar Card");
		lblNewLabel_1_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_1.setBounds(493, 491, 103, 24);
		panel.add(lblNewLabel_1_3_1_2_1);
		
		JLabel lblNewLabel_1_3_1_2_2 = new JLabel("Pan Card");
		lblNewLabel_1_3_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2.setBounds(502, 525, 69, 24);
		panel.add(lblNewLabel_1_3_1_2_2);
		
		JLabel lblDocuments = new JLabel("Documents");
		lblDocuments.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDocuments.setBounds(595, 451, 144, 30);
		panel.add(lblDocuments);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(651, 491, 265, 19);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(651, 520, 265, 19);
		panel.add(textField_10);
		
		JLabel lblNewLabel_1_3_1_2_2_1 = new JLabel("Password");
		lblNewLabel_1_3_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2_1.setBounds(492, 559, 69, 24);
		panel.add(lblNewLabel_1_3_1_2_2_1);
		
		JLabel lblNewLabel_1_3_1_2_2_2 = new JLabel("Confirm Password");
		lblNewLabel_1_3_1_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3_1_2_2_2.setBounds(462, 593, 134, 24);
		panel.add(lblNewLabel_1_3_1_2_2_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(439, 641, 112, 36);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBackground(new Color(255, 0, 0));
		btnReset.setBounds(743, 641, 112, 36);
		panel.add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(651, 561, 265, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(651, 591, 265, 20);
		panel.add(passwordField_1);
	}

}