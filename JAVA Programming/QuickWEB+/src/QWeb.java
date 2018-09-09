import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.URI;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class QWeb {
	
	private JFrame frmQuickweb;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QWeb window = new QWeb();
					//window.frame.setUndecorated(true);
					window.frmQuickweb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QWeb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuickweb = new JFrame();
		frmQuickweb.setResizable(false);
		frmQuickweb.setIconImage(Toolkit.getDefaultToolkit().getImage(QWeb.class.getResource("/icon/Entypo_2712(0)_64.png")));
		frmQuickweb.setAlwaysOnTop(true);
		frmQuickweb.setTitle("QuickWEB+");
		
		frmQuickweb.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			
			
			public void mouseDragged(MouseEvent arg0) {
			}
		});
		frmQuickweb.getContentPane().addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent arg0) {
			
			}
		});
		frmQuickweb.getContentPane().setBackground(Color.BLACK);
		frmQuickweb.setBackground(Color.BLACK);
		frmQuickweb.setBounds(100, 100, 278, 118);
		frmQuickweb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuickweb.getContentPane().setLayout(null);
		
		JLabel fb = new JLabel("");
		fb.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				try
				{
				    URI uri = new URI("http://www.facebook.com/");
				    Desktop dt = Desktop.getDesktop();
				    dt.browse(uri);
				}
				catch(Exception ex){}
			}
		});
		fb.setIcon(new ImageIcon(QWeb.class.getResource("/icon/rsz_036-facebook.png")));
		fb.setBounds(10, 11, 54, 54);
		frmQuickweb.getContentPane().add(fb);
		
		JLabel you = new JLabel("");
		you.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
				    URI uri = new URI("http://www.youtube.com/");
				    Desktop dt = Desktop.getDesktop();
				    dt.browse(uri);
				}
				catch(Exception ex){}
			}
		});
		you.setIcon(new ImageIcon(QWeb.class.getResource("/icon/rsz_001-youtube.png")));
		you.setBounds(74, 11, 54, 54);
		frmQuickweb.getContentPane().add(you);
		
		JLabel anm = new JLabel("");
		anm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
				    URI uri = new URI("https://9anime.is/");
				    Desktop dt = Desktop.getDesktop();
				    dt.browse(uri);
				}
				catch(Exception ex){}
			}
		});
		anm.setIcon(new ImageIcon(QWeb.class.getResource("/icon/rsz_1anime-central-logo.png")));
		anm.setBounds(131, 11, 54, 54);
		frmQuickweb.getContentPane().add(anm);
		
		JLabel gm = new JLabel("");
		gm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
				    URI uri = new URI("http://mail.google.com/");
				    Desktop dt = Desktop.getDesktop();
				    dt.browse(uri);
				}
				catch(Exception ex){}
			}
		});
		gm.setIcon(new ImageIcon(QWeb.class.getResource("/icon/rsz_281769.png")));
		gm.setBounds(195, 11, 54, 54);
		frmQuickweb.getContentPane().add(gm);
		
		JLabel lblNewLabel = new JLabel("  created by Ayon Roy");
		lblNewLabel.setFont(new Font("Consolas", Font.ITALIC, 10));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(120, 62, 142, 14);
		frmQuickweb.getContentPane().add(lblNewLabel);
	}
}
