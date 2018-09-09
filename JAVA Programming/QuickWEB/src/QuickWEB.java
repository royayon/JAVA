import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuickWEB extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		try {
			QuickWEB dialog = new QuickWEB();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

	/**
	 * Create the dialog.
	 */
	public QuickWEB () {
		
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
		}
		getContentPane().setBackground(new Color(0, 0, 0));
		setBackground(new Color(0, 0, 0));
		setUndecorated(true);
		setBounds(100, 100, 268, 77);
		getContentPane().setLayout(null);
		
		JLabel fb = new JLabel("New label");
		fb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Desktop.getDesktop().browse(null)
			
		}
		fb.setIcon(new ImageIcon("F:\\Programming\\JAVA Programming\\QuickWEB\\icons+\\rsz_036-facebook.png"));
		fb.setBounds(10, 11, 54, 54);
		getContentPane().add(fb);
		
		JLabel you = new JLabel("New label");
		you.setIcon(new ImageIcon("F:\\Programming\\JAVA Programming\\QuickWEB\\icons+\\rsz_001-youtube.png"));
		you.setBounds(74, 11, 54, 54);
		getContentPane().add(you);
		
		JLabel anm = new JLabel("New label");
		anm.setIcon(new ImageIcon("F:\\Programming\\JAVA Programming\\QuickWEB\\icons+\\rsz_1anime-central-logo.png"));
		anm.setBounds(138, 11, 54, 54);
		getContentPane().add(anm);
		
		JLabel gm = new JLabel("New label");
		gm.setIcon(new ImageIcon("F:\\Programming\\JAVA Programming\\QuickWEB\\icons+\\rsz_281769.png"));
		gm.setBounds(202, 11, 54, 54);
		getContentPane().add(gm);
	}
}

