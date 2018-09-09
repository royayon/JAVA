package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Button;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import java.awt.Choice;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JSeparator;

public class AyZenHUB {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AyZenHUB window = new AyZenHUB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	int xMouse;
	int yMouse;
	public AyZenHUB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void setSystemLook() {
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
	
	private void initialize() {
		setSystemLook();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 678, 513);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_Top = new JPanel();
		panel_Top.setBackground(Color.WHITE);
		panel_Top.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				xMouse = arg0.getX();
				yMouse = arg0.getY();
			}
		});
		panel_Top.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				frame.setLocation(x-xMouse, y-yMouse);
			}
		});
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(578, 11, 90, 33);
		btnClose.setBackground(new Color(0, 140, 186));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnClose.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnClose.setForeground(Color.WHITE);
		btnClose.setBorderPainted(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setOpaque(true);
		
		JLabel jLabel_logo = new JLabel("");
		jLabel_logo.setBounds(10, 11, 53, 53);
		jLabel_logo.setIcon(new ImageIcon(AyZenHUB.class.getResource("/package1/Entypo_e73e(0)_48.png")));
		
		JLabel lblAyzenhub = new JLabel("AyZenHUB");
		lblAyzenhub.setBounds(62, 11, 201, 45);
		lblAyzenhub.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		
		
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new CardLayout(0, 0));
		
		Panel panel_Project = new Panel();
		panel_Project.setBackground(Color.GRAY);
		contentPanel.add(panel_Project, "name_164396689668438");
		panel_Project.setLayout(null);
		
		Panel panel_Versions = new Panel();
		panel_Versions.setBackground(Color.GRAY);
		contentPanel.add(panel_Versions, "name_164396711623408");
		panel_Versions.setLayout(null);
		
		Button button_5 = new Button("New button");
		button_5.setBounds(108, 179, 70, 22);
		panel_Versions.add(button_5);
		
		Button button_6 = new Button("New button");
		button_6.setBounds(314, 179, 70, 22);
		panel_Versions.add(button_6);
		
		Panel panel_Branches = new Panel();
		panel_Branches.setBackground(Color.GRAY);
		contentPanel.add(panel_Branches, "name_164396732948605");
		
		Panel panel_Log = new Panel();
		panel_Log.setBackground(Color.GRAY);
		contentPanel.add(panel_Log, "name_164396757268222");
		
		
		JButton btnProject = new JButton("Project");
		btnProject.setForeground(Color.LIGHT_GRAY);
		btnProject.setBackground(Color.BLACK);
		btnProject.setFont(new Font("Segoe UI Historic", Font.PLAIN, 17));
		btnProject.setBorderPainted(false);
		btnProject.setContentAreaFilled(false);
		btnProject.setOpaque(true);
		btnProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPanel.removeAll();
				contentPanel.add(panel_Project);
				contentPanel.repaint();
				contentPanel.revalidate();
			}
		});
		
		JButton btnVersions = new JButton("Versions");
		btnVersions.setForeground(Color.LIGHT_GRAY);
		btnVersions.setBackground(Color.BLACK);
		btnVersions.setFont(new Font("Segoe UI Historic", Font.PLAIN, 17));
		btnVersions.setBorderPainted(false);
		btnVersions.setContentAreaFilled(false);
		btnVersions.setOpaque(true);
		btnVersions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPanel.removeAll();
				contentPanel.add(panel_Versions);
				contentPanel.repaint();
				contentPanel.revalidate();
			}
		});
		
		JButton btnBranches = new JButton("Branches");
		btnBranches.setForeground(Color.LIGHT_GRAY);
		btnBranches.setBackground(Color.BLACK);
		btnBranches.setFont(new Font("Segoe UI Historic", Font.PLAIN, 17));
		btnBranches.setBorderPainted(false);
		btnBranches.setContentAreaFilled(false);
		btnBranches.setOpaque(true);
		btnBranches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPanel.removeAll();
				contentPanel.add(panel_Branches);
				contentPanel.repaint();
				contentPanel.revalidate();
			}
		});
		panel_Top.setLayout(null);
		panel_Top.add(jLabel_logo);
		panel_Top.add(lblAyzenhub);
		panel_Top.add(btnClose);
		
		JButton btnLog = new JButton("Activity Log");
		btnLog.setForeground(Color.LIGHT_GRAY);
		btnLog.setBackground(Color.BLACK);
		btnLog.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnLog.setBorderPainted(false);
		btnLog.setContentAreaFilled(false);
		btnLog.setOpaque(true);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPanel.removeAll();
				contentPanel.add(panel_Log);
				contentPanel.repaint();
				contentPanel.revalidate();
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_Top, GroupLayout.PREFERRED_SIZE, 678, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnProject, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnVersions)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnBranches)
					.addGap(18)
					.addComponent(btnLog)
					.addContainerGap(230, Short.MAX_VALUE))
				.addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_Top, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLog, 0, 0, Short.MAX_VALUE)
						.addComponent(btnBranches, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnVersions, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnProject, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
