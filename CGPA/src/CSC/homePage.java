package CSC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.Color;

public class homePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homePage frame = new homePage();
					frame.setVisible(true);
					frame.setTitle("CSC CGAP CALCULATOR");
					frame.setResizable(false);
					
					ImageIcon bgImage =new ImageIcon("logo.jpg");
					frame.setIconImage(bgImage.getImage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public homePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon uncrossLogo =new ImageIcon("un.jpg");
		JLabel jlabel_Logo = new JLabel("New label");
		jlabel_Logo.setText("logo");
		jlabel_Logo.setBounds(165, 80, 140, 103);
		contentPane.add(jlabel_Logo);
		jlabel_Logo.setIcon(uncrossLogo);
		jlabel_Logo.setText(" ");

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setForeground(SystemColor.activeCaption);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 414, 40);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("DEPRATMENT OF COMPUTER SCIENCE");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.white);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		
		JLabel  lblNewLabel1 = new JLabel("CGPA CALCULATOR");
		lblNewLabel1.setBounds(130, 53, 170, 20);
		//lblNewLabel1.setForeground(SystemColor.);
		lblNewLabel1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(lblNewLabel1);

		JButton btnYear1 = new JButton("Year One");
		btnYear1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year1 year1 = new year1();
				year1.setVisible(true);
				year1.setResizable(false);
				year1.setTitle("Year One CGPA");
				
				ImageIcon bgImage =new ImageIcon("un.jpg");
				year1.setIconImage(bgImage.getImage());
				
				year1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
			}
		});
		btnYear1.setBounds(58, 190, 89, 23);
		contentPane.add(btnYear1);
		
		JButton btnYear2 = new JButton("Year Two");
		btnYear2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year2 year2 = new year2();
				year2.setVisible(true);
				year2.setResizable(false);
				year2.setTitle("Year two CGPA");
				
				ImageIcon bgImage =new ImageIcon("un.jpg");
				year2.setIconImage(bgImage.getImage());
				
				year2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		btnYear2.setBounds(269, 190, 89, 23);
		contentPane.add(btnYear2);
		
		JButton btnYear3 = new JButton("Year Three");
		btnYear3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year3 year3 = new year3();
				year3.setVisible(true);
				year3.setResizable(false);
				year3.setTitle("Year three CGPA");
				
				ImageIcon bgImage =new ImageIcon("un.jpg");
				year3.setIconImage(bgImage.getImage());
				
				year3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		btnYear3.setBounds(58, 240, 99, 23);
		contentPane.add(btnYear3);
		
		JButton btnYear4 = new JButton("Year Four");
		btnYear4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year4 year4 = new year4();
				year4.setVisible(true);
				year4.setResizable(false);
				year4.setTitle("Year four CGPA");
				
				ImageIcon bgImage =new ImageIcon("un.jpg");
				year4.setIconImage(bgImage.getImage());
				
				year4.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		btnYear4.setBounds(269, 240, 89, 23);
		contentPane.add(btnYear4);
		
//		JButton btnFinalYear = new JButton("Final Year");
//		btnFinalYear.setBounds(167, 210, 89, 23);
//		contentPane.add(btnFinalYear);
	}
}
