import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class BorderLayout {

	private JFrame frmSendEmailClient;
	private JTextField txtSomeonegamilcom;
	private JTextField txtSomeonegamilcom_1;
	private JTextField txtText;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayout window = new BorderLayout();
					window.frmSendEmailClient.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BorderLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSendEmailClient = new JFrame();
		frmSendEmailClient.setTitle("Send E-mail Client");
		frmSendEmailClient.setBounds(100, 100, 504, 458);
		frmSendEmailClient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSendEmailClient.getContentPane().setLayout(new java.awt.BorderLayout(0, 0));
		
		JButton btnSendEmail = new JButton("Send E-mail");
		frmSendEmailClient.getContentPane().add(btnSendEmail, java.awt.BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		frmSendEmailClient.getContentPane().add(panel, java.awt.BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 2));
		
		JLabel lblNewLabel = new JLabel("Name:");
		panel.add(lblNewLabel);
		
		txtSomeonegamilcom = new JTextField();
		txtSomeonegamilcom.setText("someone@gmail.com");
		txtSomeonegamilcom.setToolTipText("");
		panel.add(txtSomeonegamilcom);
		txtSomeonegamilcom.setColumns(10);
		
		JLabel lblTo = new JLabel("To:");
		panel.add(lblTo);
		
		txtSomeonegamilcom_1 = new JTextField();
		txtSomeonegamilcom_1.setText("someone@gmail.com");
		txtSomeonegamilcom_1.setColumns(10);
		panel.add(txtSomeonegamilcom_1);
		
		JLabel lblSubject = new JLabel("Subject:");
		panel.add(lblSubject);
		
		txtText = new JTextField();
		txtText.setText("Text");
		txtText.setColumns(10);
		panel.add(txtText);
		
		JLabel lblStmpServer = new JLabel("STMP Server:");
		panel.add(lblStmpServer);
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		
		JLabel lblUsername = new JLabel("Username:");
		panel.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setColumns(10);
		panel.add(txtUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		panel.add(passwordField);
		
		JLabel lblMessage = new JLabel("Message:");
		panel.add(lblMessage);
		
		textField = new JTextField();
		frmSendEmailClient.getContentPane().add(textField, java.awt.BorderLayout.CENTER);
		textField.setColumns(10);
	}

}
