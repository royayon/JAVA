import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class HomePage {

	private JFrame frmLogin;
	private JTextField txtUserName;
	private JButton btnSubmit;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}
	void setSystemLook() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setSystemLook();
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name :");
		lblUserName.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblUserName.setBounds(23, 35, 87, 30);
		frmLogin.getContentPane().add(lblUserName);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(140, 42, 177, 20);
		frmLogin.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblStatus = new JLabel("Status : Logged Out!");
		lblStatus.setBounds(137, 173, 297, 14);
		frmLogin.getContentPane().add(lblStatus);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txtUserName.getText();
				String pass = txtPassword.getText();
				if(name.equals("user1") && pass.equals("123")) {
					lblStatus.setText("Status : Login Successful!");
					frmLogin.dispose();
					new MainWindow();
				}
				else
					lblStatus.setText("Status : Invalid Credential!");
				//lblStatus.setText("Status : " + name + " is trying to login..");
			}
		});
		btnSubmit.setBounds(105, 198, 99, 42);
		frmLogin.getContentPane().add(btnSubmit);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblPassword.setBounds(23, 76, 87, 30);
		frmLogin.getContentPane().add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(140, 83, 177, 20);
		frmLogin.getContentPane().add(txtPassword);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.dispose();
			}
		});
		btnClose.setBounds(237, 198, 99, 42);
		frmLogin.getContentPane().add(btnClose);
	}
}
