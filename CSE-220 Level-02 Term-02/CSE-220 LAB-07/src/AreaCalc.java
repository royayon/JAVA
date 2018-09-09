import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class AreaCalc {

	private JFrame frmAreaCalculator;
	private JTextField textFieldHeight;
	private JTextField textFieldWidth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaCalc window = new AreaCalc();
					window.frmAreaCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public AreaCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setLookAndFeel();
		frmAreaCalculator = new JFrame();
		frmAreaCalculator.setResizable(false);
		frmAreaCalculator.setTitle("Area Calculator");
		frmAreaCalculator.setBounds(100, 100, 450, 300);
		frmAreaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAreaCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shape Type:");
		lblNewLabel.setBounds(31, 47, 79, 14);
		frmAreaCalculator.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(158, 44, 118, 20);
		frmAreaCalculator.getContentPane().add(comboBox);
		comboBox.addItem("Triangle");
		comboBox.addItem("Rectangle");
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(31, 86, 46, 14);
		frmAreaCalculator.getContentPane().add(lblHeight);
		
		JLabel lblWidth = new JLabel("Width:");
		lblWidth.setBounds(31, 132, 46, 14);
		frmAreaCalculator.getContentPane().add(lblWidth);
		
		textFieldHeight = new JTextField();
		textFieldHeight.setBounds(158, 83, 245, 20);
		frmAreaCalculator.getContentPane().add(textFieldHeight);
		textFieldHeight.setColumns(10);
		
		textFieldWidth = new JTextField();
		textFieldWidth.setColumns(10);
		textFieldWidth.setBounds(158, 129, 245, 20);
		frmAreaCalculator.getContentPane().add(textFieldWidth);
		
		JLabel lblResult = new JLabel("");
		lblResult.setBounds(32, 183, 315, 14);
		frmAreaCalculator.getContentPane().add(lblResult);
		
		JButton btnCalculateArea = new JButton("Calculate Area");
		btnCalculateArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = comboBox.getSelectedIndex();
				int height = Integer.valueOf(textFieldHeight.getText());
				int width = Integer.valueOf(textFieldWidth.getText());
				if(choice == 0) {
					Triangle tri = new Triangle(height , width);
					lblResult.setText("The Area of The Trianle is: " + tri.getArea());
				}else if(choice == 1) {
					Rectangle rec = new Rectangle(height , width);
					lblResult.setText("The Area of The Rectanle is: " + rec.getArea());
				}
			}
		});
		btnCalculateArea.setBounds(180, 219, 137, 23);
		frmAreaCalculator.getContentPane().add(btnCalculateArea);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAreaCalculator.dispose();
			}
		});
		btnClose.setBounds(327, 219, 97, 23);
		frmAreaCalculator.getContentPane().add(btnClose);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 170, 393, 2);
		frmAreaCalculator.getContentPane().add(separator);
	}
}
