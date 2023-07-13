package CSC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.BevelBorder;
public class year2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtGSS2101;
	private JTextField txtCSC2101;
	private JTextField txtCSC2102;
	private JTextField txtCSC2103;
	private JTextField txtMTH2103;
	private JTextField txtMTH2104;
	private JTextField txtENT3101;
	private JTextField txtCSC2201;
	private JTextField txtCSC2202;
	private JTextField txtCSC2203;
	private JTextField txtCSC2204;
	private JTextField txtCSC2205;
	private JTextField txtENT3201;
	private JTextField txtCSC2206;
	private JTextField txtMTH2201;

	double gradePoint1,  gradePoint2, totalgradePoint,  creditUnit1,  creditUnit2,  totalCreditUnit,  cgpa, gpa1, gpa2;
	
	String gpaClass1, gpaClass2, cgpaClass;
	
	// Course
	double GSS2101, CSC2101, CSC2102, CSC2103, MTH2103, MTH2104, ENT3101;
	double CSC2201, CSC2202, CSC2203, CSC2204, CSC2205, MTH2201, CSC2206, ENT3201;
	
	// Course Credit Unit
	double GSS2101CU =2, CSC2101CU =3, CSC2102CU =3, CSC2103CU =3, MTH2103CU =3, MTH2104CU =3, ENT3101CU =1;
	double CSC2201CU =3, CSC2202CU =3, CSC2203CU =2, CSC2204CU =3, CSC2205CU =3, MTH2201CU =3, CSC2206CU =3, ENT3201CU =1;
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					year2 frame = new year2();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setTitle("Year two CGPA");
					
					ImageIcon bgImage =new ImageIcon("un.jpg");
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
	public year2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ENTER YOUR GRADE'S BELOW", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtMain = new JTextArea();
		txtMain.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtMain.setLineWrap(true);
		txtMain.setColumns(3);
		txtMain.setToolTipText("output");
		txtMain.setRows(3);
		txtMain.setEnabled(false);
		txtMain.setEditable(false);
		txtMain.setBounds(132, 102, 229, 150);
		contentPane.add(txtMain);
		
		JLabel lblNewLabel = new JLabel("GSS2101");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 68, 63, 23);
		contentPane.add(lblNewLabel);
		
		txtGSS2101 = new JTextField();
		txtGSS2101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtGSS2101.setText(txtGSS2101.getText().toUpperCase());
			}
		});
		txtGSS2101.setHorizontalAlignment(SwingConstants.CENTER);
		txtGSS2101.setEnabled(false);
		txtGSS2101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGSS2101.setToolTipText("Grade");
		txtGSS2101.setBounds(70, 68, 44, 20);
		contentPane.add(txtGSS2101);
		txtGSS2101.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CSC2101");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 102, 63, 23);
		contentPane.add(lblNewLabel_1);
		
		txtCSC2101 = new JTextField();
		txtCSC2101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC2101.setText(txtCSC2101.getText().toUpperCase());
			}
		});
		txtCSC2101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC2101.setEnabled(false);
		txtCSC2101.setToolTipText("Grade");
		txtCSC2101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC2101.setColumns(10);
		txtCSC2101.setBounds(70, 102, 44, 20);
		contentPane.add(txtCSC2101);
		
		JLabel lblNewLabel_2 = new JLabel("CSC2102");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 136, 63, 23);
		contentPane.add(lblNewLabel_2);
		
		txtCSC2102 = new JTextField();
		txtCSC2102.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC2102.setText(txtCSC2102.getText().toUpperCase());
			}
		});
		txtCSC2102.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC2102.setEnabled(false);
		txtCSC2102.setToolTipText("Grade");
		txtCSC2102.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC2102.setColumns(10);
		txtCSC2102.setBounds(70, 136, 44, 20);
		contentPane.add(txtCSC2102);
		
		JLabel lblNewLabel_3 = new JLabel("CSC2103");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 170, 63, 23);
		contentPane.add(lblNewLabel_3);
		
		txtCSC2103 = new JTextField();
		txtCSC2103.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC2103.setText(txtCSC2103.getText().toUpperCase());
			}
		});
		txtCSC2103.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC2103.setEnabled(false);
		txtCSC2103.setToolTipText("Grade");
		txtCSC2103.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC2103.setColumns(10);
		txtCSC2103.setBounds(70, 170, 44, 20);
		contentPane.add(txtCSC2103);
		
		JLabel lblNewLabel_4 = new JLabel("ENT3101");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 265, 63, 23);
		contentPane.add(lblNewLabel_4);
		
		txtMTH2103 = new JTextField();
		txtMTH2103.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtMTH2103.setText(txtMTH2103.getText().toUpperCase());
			}
		});
		txtMTH2103.setHorizontalAlignment(SwingConstants.CENTER);
		txtMTH2103.setEnabled(false);
		txtMTH2103.setToolTipText("Grade");
		txtMTH2103.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMTH2103.setColumns(10);
		txtMTH2103.setBounds(70, 200, 44, 20);
		contentPane.add(txtMTH2103);
		
		JLabel lblNewLabel_5 = new JLabel("MTH2103");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_5.setBounds(10, 200, 63, 23);
		contentPane.add(lblNewLabel_5);
		
		txtMTH2104 = new JTextField();
		txtMTH2104.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtMTH2104.setText(txtMTH2104.getText().toUpperCase());
			}
		});
		txtMTH2104.setHorizontalAlignment(SwingConstants.CENTER);
		txtMTH2104.setEnabled(false);
		txtMTH2104.setToolTipText("Grade");
		txtMTH2104.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMTH2104.setColumns(10);
		txtMTH2104.setBounds(70, 234, 44, 20);
		contentPane.add(txtMTH2104);
		
		JLabel lblNewLabel_6 = new JLabel("MTH2104");
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_6.setBounds(10, 234, 63, 23);
		contentPane.add(lblNewLabel_6);
		
		txtENT3101 = new JTextField();
		txtENT3101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtENT3101.setText(txtENT3101.getText().toUpperCase());
			}
		});
		txtENT3101.setHorizontalAlignment(SwingConstants.CENTER);
		txtENT3101.setEnabled(false);
		txtENT3101.setToolTipText("Grade");
		txtENT3101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtENT3101.setColumns(10);
		txtENT3101.setBounds(71, 268, 44, 20);
		contentPane.add(txtENT3101);
		
		JLabel lblNewLabel_9 = new JLabel("CSC2201");
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_9.setBounds(381, 68, 63, 23);
		contentPane.add(lblNewLabel_9);
		
		txtCSC2201 = new JTextField();
		txtCSC2201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC2201.setText(txtCSC2201.getText().toUpperCase());
			}
		});
		txtCSC2201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC2201.setEnabled(false);
		txtCSC2201.setToolTipText("Grade");
		txtCSC2201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC2201.setColumns(10);
		txtCSC2201.setBounds(441, 68, 44, 20);
		contentPane.add(txtCSC2201);
		
		JLabel lblNewLabel_1_1 = new JLabel("CSC2202");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(381, 102, 63, 23);
		contentPane.add(lblNewLabel_1_1);
		
		txtCSC2202 = new JTextField();
		txtCSC2202.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC2202.setText(txtCSC2202.getText().toUpperCase());
			}
		});
		txtCSC2202.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC2202.setEnabled(false);
		txtCSC2202.setToolTipText("Grade");
		txtCSC2202.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC2202.setColumns(10);
		txtCSC2202.setBounds(441, 102, 44, 20);
		contentPane.add(txtCSC2202);
		
		txtCSC2203 = new JTextField();
		txtCSC2203.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC2203.setText(txtCSC2203.getText().toUpperCase());
			}
		});
		txtCSC2203.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC2203.setEnabled(false);
		txtCSC2203.setToolTipText("Grade");
		txtCSC2203.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC2203.setColumns(10);
		txtCSC2203.setBounds(441, 136, 44, 20);
		contentPane.add(txtCSC2203);
		
		txtCSC2205 = new JTextField();
		txtCSC2205.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC2205.setText(txtCSC2205.getText().toUpperCase());
			}
		});
		txtCSC2205.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC2205.setEnabled(false);
		txtCSC2205.setToolTipText("Grade");
		txtCSC2205.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC2205.setColumns(10);
		txtCSC2205.setBounds(441, 170, 44, 20);
		contentPane.add(txtCSC2205);
		
		txtENT3201 = new JTextField();
		txtENT3201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtENT3201.setText(txtENT3201.getText().toUpperCase());
			}
		});
		txtENT3201.setHorizontalAlignment(SwingConstants.CENTER);
		txtENT3201.setEnabled(false);
		txtENT3201.setToolTipText("Grade");
		txtENT3201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtENT3201.setColumns(10);
		txtENT3201.setBounds(441, 265, 44, 20);
		contentPane.add(txtENT3201);
		
		txtCSC2204 = new JTextField();
		txtCSC2204.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			    txtCSC2204.setText(txtCSC2204.getText().toUpperCase());
			}
		});
		txtCSC2204.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC2204.setEnabled(false);
		txtCSC2204.setToolTipText("Grade");
		txtCSC2204.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC2204.setColumns(10);
		txtCSC2204.setBounds(441, 296, 44, 20);
		contentPane.add(txtCSC2204);
		
		txtMTH2201 = new JTextField();
		txtMTH2201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtMTH2201.setText(txtMTH2201.getText().toUpperCase());
			}
		});
		txtMTH2201.setHorizontalAlignment(SwingConstants.CENTER);
		txtMTH2201.setEnabled(false);
		txtMTH2201.setToolTipText("Grade");
		txtMTH2201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMTH2201.setColumns(10);
		txtMTH2201.setBounds(441, 200, 44, 20);
		contentPane.add(txtMTH2201);
		
		txtCSC2206 = new JTextField();
		txtCSC2206.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC2206.setText(txtCSC2206.getText().toUpperCase());
			}
		});
		txtCSC2206.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC2206.setEnabled(false);
		txtCSC2206.setToolTipText("Grade");
		txtCSC2206.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC2206.setColumns(10);
		txtCSC2206.setBounds(441, 234, 44, 20);
		contentPane.add(txtCSC2206);

		JLabel lblNewLabel_7_1 = new JLabel("CSC2204");
		lblNewLabel_7_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_7_1.setBounds(381, 233, 63, 23);
		contentPane.add(lblNewLabel_7_1);

		JLabel lblNewLabel_4_1 = new JLabel("ENT3201");
		lblNewLabel_4_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(381, 265, 63, 23);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("CSC2206");
		lblNewLabel_6_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_6_1.setBounds(381, 296, 63, 23);
		contentPane.add(lblNewLabel_6_1);

		JLabel lblNewLabel_5_1 = new JLabel("MTH2201");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_5_1.setBounds(381, 200, 63, 23);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CSC2205");
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(381, 170, 63, 23);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("CSC2203");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(381, 136, 63, 23);
		contentPane.add(lblNewLabel_2_1);

		JButton btnRest = new JButton("Rest");
		btnRest.setEnabled(false);
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtGSS2101.setText("");
				txtCSC2101.setText("");
				txtCSC2102.setText("");
				txtCSC2103.setText("");
				txtMTH2103.setText("");
				txtMTH2104.setText("");
				txtENT3101.setText("");
				
				txtCSC2205.setText("");
				txtCSC2201.setText("");
				txtCSC2202.setText("");
				txtCSC2203.setText("");
				txtENT3201.setText("");
				txtMTH2201.setText("");
				txtCSC2206.setText("");
				txtCSC2204.setText("");
				txtMain.setText("");
				
			}
		});
		btnRest.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRest.setBounds(207, 288, 89, 23);
		contentPane.add(btnRest);
		
		JButton btnGETCGPA = new JButton("GET CGPA");
		btnGETCGPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtGSS2101.getText().equalsIgnoreCase("a")) {
					GSS2101=5*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("b")) {
					GSS2101=4*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("c")) {
					GSS2101=3*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("d")) {
					GSS2101=2*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("e")) {
					GSS2101=1*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("f")) {
					GSS2101=0*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("")) {
					GSS2101=0*GSS2101CU;
				}
				
				if(txtCSC2101.getText().equalsIgnoreCase("a")) {
					CSC2101=5*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("b")) {
					CSC2101=4*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("c")) {
				    CSC2101=3*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("d")) {
				    CSC2101=2*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("e")) {
				    CSC2101=1*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("f")) {
				    CSC2101=0*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("")) {
				    CSC2101=0*CSC2101CU;
				}
				
				if(txtCSC2102.getText().equalsIgnoreCase("a")) {
					CSC2102=5*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("b")) {
					CSC2102=4*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("c")) {
					CSC2102=3*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("d")) {
					CSC2102=2*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("e")) {
					CSC2102=1*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("f")) {
					CSC2102=0*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("")) {
					CSC2102=0*CSC2102CU;
				}
				
				if(txtCSC2103.getText().equalsIgnoreCase("a")) {
					CSC2103=5*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("b")) {
					CSC2103=4*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("c")) {
					CSC2103=3*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("d")) {
					CSC2103=2*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("e")) {
					CSC2103=1*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("f")) {
					CSC2103=0*CSC2103CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("")) {
					CSC2103=0*CSC2103CU;
				}
							
				
				if(txtMTH2103.getText().equalsIgnoreCase("a")) {
					MTH2103=5*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("b")) {
					MTH2103=4*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("c")) {
					MTH2103=3*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("d")) {
					MTH2103=2*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("e")) {
					MTH2103=1*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("f")) {
					MTH2103=0*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("")) {
					MTH2103=0*MTH2103CU;
				}
				
				
				if(txtMTH2104.getText().equalsIgnoreCase("a")) {
					MTH2104=5*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("b")) {
					MTH2104=4*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("c")) {
					MTH2104=3*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("d")) {
					MTH2104=2*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("e")) {
					MTH2104=1*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("f")) {
					MTH2104=0*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("")) {
					MTH2104=0*MTH2104CU;
				}
				
				if(txtENT3101.getText().equalsIgnoreCase("a")) {
					ENT3101=5*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("b")) {
					ENT3101=4*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("c")) {
					ENT3101=3*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("d")) {
					ENT3101=2*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("e")) {
					ENT3101=1*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("f")) {
					ENT3101=0*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("")) {
					ENT3101=0*ENT3101CU;
				}
				

				creditUnit1= GSS2101CU + CSC2101CU + CSC2102CU + CSC2103CU + MTH2103CU + MTH2104CU + ENT3101CU;
				gradePoint1= GSS2101 + CSC2101 + CSC2102 + CSC2103 + MTH2103 + MTH2104 +ENT3101;
				gpa1= gradePoint1 / creditUnit1;
				
				if(gpa2>4.50) {
					gpa2=5.00;
					gpaClass2= "First Class";
				}
				else if(gpa2==4.50) {
					 gpaClass2= "First Class";
				}else if(gpa2>=3.50 && gpa2<=4.49) {
					gpaClass2= "Second Class Upper";
				}else if(gpa2>=2.40 && gpa2<=3.49) {
					gpaClass2= "Second Class Lower";
				}else if(gpa2>=1.50 && gpa2<=2.39) {
					gpaClass2= "Thrid Class";
				}else if(gpa2>=1.0 && gpa2<=1.49) {
					gpaClass2= "Pass";
				}else {
					gpaClass2= "Fail";
				}
				
				if(txtCSC2201.getText().equalsIgnoreCase("a")) {
					CSC2201=5*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("b")) {
					CSC2201=4*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("c")) {
					CSC2201=3*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("d")) {
					CSC2201=2*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("e")) {
					CSC2201=1*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("f")) {
					CSC2201=0*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("")) {
					CSC2201=0*CSC2201CU;
				}

				if(txtCSC2202.getText().equalsIgnoreCase("a")) {
					CSC2202=5*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("b")) {
					CSC2202=4*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("c")) {
					CSC2202=3*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("d")) {
					CSC2202=2*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("e")) {
					CSC2202=1*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("f")) {
					CSC2202=0*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("")) {
					CSC2202=0*CSC2202CU;
				}

				if(txtCSC2203.getText().equalsIgnoreCase("a")) {
					CSC2203=5*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("b")) {
					CSC2203=4*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("c")) {
					CSC2203=3*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("d")) {
					CSC2203=2*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("e")) {
					CSC2203=1*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("f")) {
					CSC2203=0*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("")) {
					CSC2203=0*CSC2203CU;
				}

				if(txtCSC2204.getText().equalsIgnoreCase("a")) {
					CSC2204=5*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("b")) {
					CSC2204=4*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("c")) {
					CSC2204=3*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("d")) {
					CSC2204=2*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("e")) {
					CSC2204=1*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("f")) {
					CSC2204=0*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("")) {
					CSC2204=0*CSC2204CU;
				}
				
				if(txtCSC2205.getText().equalsIgnoreCase("a")) {
					CSC2205=5*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("b")) {
					CSC2205=4*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("c")) {
					CSC2205=3*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("d")) {
					CSC2205=2*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("e")) {
					CSC2205=1*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("f")) {
					CSC2205=0*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("")) {
					CSC2205=0*CSC2205CU;
				}

				if(txtENT3201.getText().equalsIgnoreCase("a")) {
					ENT3201=5*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("b")) {
					ENT3201=4*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("c")) {
					ENT3201=3*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("d")) {
					ENT3201=2*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("e")) {
					ENT3201=1*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("f")) {
					ENT3201=0*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("")) {
					ENT3201=0*ENT3201CU;
				}                

				if(txtCSC2206.getText().equalsIgnoreCase("a")) {
					CSC2206=5*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("b")) {
					CSC2206=4*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("c")) {
					CSC2206=3*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("d")) {
					CSC2206=2*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("e")) {
					CSC2206=1*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("f")) {
					CSC2206=0*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("")) {
					CSC2206=0*CSC2206CU;
				}

				if(txtMTH2201.getText().equalsIgnoreCase("a")) {
					MTH2201=5*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("b")) {
					MTH2201=4*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("c")) {
					MTH2201=3*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("d")) {
					MTH2201=2*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("e")) {
					MTH2201=1*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("f")) {
					MTH2201=0*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("")) {
					MTH2201=0*MTH2201CU;
				}

				creditUnit2= CSC2201CU + CSC2202CU + CSC2203CU + CSC2204CU+ CSC2205CU + ENT3201CU + MTH2201CU + CSC2206CU;
				gradePoint2= CSC2201 + CSC2202 + CSC2203 + CSC2204 + CSC2205 + ENT3201 + MTH2201 + CSC2206;
				gpa2= gradePoint2 / creditUnit2;
				
				if(gpa1>4.50) {
					gpa1=5.00;
					gpaClass1= "First Class";
				}
				else if(gpa1==4.50) {
					 gpaClass1= "First Class";
				}else if(gpa1>=3.50 && gpa1<=4.49) {
					 gpaClass1= "Second Class Upper";
				}else if(gpa1>=2.40 && gpa1<=3.49) {
					 gpaClass1= "Second Class Lower";
				}else if(gpa1>=1.50 && gpa1<=2.39) {
					 gpaClass1= "Thrid Class";
				}else if(gpa1>=1.0 && gpa1<=1.49) {
					 gpaClass1= "Pass";
				}else {
					gpaClass1= "Fail";
				}

				totalgradePoint = gradePoint1 + gradePoint2;
				totalCreditUnit = creditUnit1 + creditUnit2;
				cgpa= totalgradePoint / totalCreditUnit;
				
				if(cgpa>4.50) {
					cgpa=5.00;
					cgpaClass= "First Class";
				}
				else if(cgpa==4.50) {
					 cgpaClass= "First Class";
				}else if(cgpa>=3.50 && cgpa<=4.49) {
				    cgpaClass= "Second Class Upper";
				}else if(cgpa>=2.40 && cgpa<=3.49) {
				    cgpaClass= "Second Class Lower";
				}else if(cgpa>=1.50 && cgpa<=2.39) {
				    cgpaClass= "Thrid Class";
				}else if(cgpa>=1.0 && cgpa<=1.49) {
				    cgpaClass= "Pass";
				}else {
				   cgpaClass= "Fail";
				}
				
				String final_cgpa = String.format("%.2f",cgpa);
				String final_gpa1 = String.format("%.2f",gpa1);
				String final_gpa2 = String.format("%.2f",gpa2);
				txtMain.setText("*************************\nFirst Semester GPA: "+final_gpa1+"\nSecond Semester GPA: "+final_gpa2+"\nYear Two CGPA: "+final_cgpa+"\n"+"Remark: "+cgpaClass+"\n\n*************************");
			}
		});
		btnGETCGPA.setEnabled(false);
		btnGETCGPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGETCGPA.setBounds(207, 325, 89, 23);
		contentPane.add(btnGETCGPA);
		
		JButton btn1GPA = new JButton("1st GPA");
		btn1GPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtGSS2101.getText().equalsIgnoreCase("a")) {
					GSS2101=5*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("b")) {
					GSS2101=4*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("c")) {
					GSS2101=3*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("d")) {
					GSS2101=2*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("e")) {
					GSS2101=1*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("f")) {
					GSS2101=0*GSS2101CU;
				}else if(txtGSS2101.getText().equalsIgnoreCase("")) {
					GSS2101=0*GSS2101CU;
				}
				
				if(txtCSC2101.getText().equalsIgnoreCase("a")) {
					CSC2101=5*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("b")) {
					CSC2101=4*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("c")) {
				    CSC2101=3*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("d")) {
				    CSC2101=2*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("e")) {
				    CSC2101=1*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("f")) {
				    CSC2101=0*CSC2101CU;
				}else if(txtCSC2101.getText().equalsIgnoreCase("")) {
				    CSC2101=0*CSC2101CU;
				}
				
				if(txtCSC2102.getText().equalsIgnoreCase("a")) {
					CSC2102=5*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("b")) {
					CSC2102=4*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("c")) {
					CSC2102=3*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("d")) {
					CSC2102=2*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("e")) {
					CSC2102=1*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("f")) {
					CSC2102=0*CSC2102CU;
				}else if(txtCSC2102.getText().equalsIgnoreCase("")) {
					CSC2102=0*CSC2102CU;
				}
				
				if(txtCSC2103.getText().equalsIgnoreCase("a")) {
					CSC2103=5*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("b")) {
					CSC2103=4*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("c")) {
					CSC2103=3*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("d")) {
					CSC2103=2*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("e")) {
					CSC2103=1*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("f")) {
					CSC2103=0*CSC2103CU;
				}else if(txtCSC2103.getText().equalsIgnoreCase("")) {
					CSC2103=0*CSC2103CU;
				}
							
				
				if(txtMTH2103.getText().equalsIgnoreCase("a")) {
					MTH2103=5*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("b")) {
					MTH2103=4*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("c")) {
					MTH2103=3*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("d")) {
					MTH2103=2*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("e")) {
					MTH2103=1*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("f")) {
					MTH2103=0*MTH2103CU;
				}else if(txtMTH2103.getText().equalsIgnoreCase("")) {
					MTH2103=0*MTH2103CU;
				}
				
				
				if(txtMTH2104.getText().equalsIgnoreCase("a")) {
					MTH2104=5*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("b")) {
					MTH2104=4*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("c")) {
					MTH2104=3*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("d")) {
					MTH2104=2*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("e")) {
					MTH2104=1*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("f")) {
					MTH2104=0*MTH2104CU;
				}else if(txtMTH2104.getText().equalsIgnoreCase("")) {
					MTH2104=0*MTH2104CU;
				}
				
				if(txtENT3101.getText().equalsIgnoreCase("a")) {
					ENT3101=5*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("b")) {
					ENT3101=4*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("c")) {
					ENT3101=3*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("d")) {
					ENT3101=2*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("e")) {
					ENT3101=1*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("f")) {
					ENT3101=0*ENT3101CU;
				}else if(txtENT3101.getText().equalsIgnoreCase("")) {
					ENT3101=0*ENT3101CU;
				}
				

				creditUnit1= GSS2101CU + CSC2101CU + CSC2102CU + CSC2103CU + MTH2103CU + MTH2104CU + ENT3101CU;
				gradePoint1= GSS2101 + CSC2101 + CSC2102 + CSC2103 + MTH2103 + MTH2104 +ENT3101;
				gpa1= gradePoint1 / creditUnit1;
				
				if(gpa1>4.50) {
					gpa1=5.00;
					gpaClass1= "First Class";
				}
				else if(gpa1==4.50) {
					 gpaClass1= "First Class";
				}else if(gpa1>=3.50 && gpa1<=4.49) {
					 gpaClass1= "Second Class Upper";
				}else if(gpa1>=2.40 && gpa1<=3.49) {
					 gpaClass1= "Second Class Lower";
				}else if(gpa1>=1.50 && gpa1<=2.39) {
					 gpaClass1= "Thrid Class";
				}else if(gpa1>=1.0 && gpa1<=1.49) {
					 gpaClass1= "Pass";
				}else {
					gpaClass1= "Fail";
				}
				
				
				String final_gpa1 = String.format("%.2f",gpa1);
				txtMain.setText("*************************\nFirst Semester GPA: "+final_gpa1+"\n"+gpaClass1+"\n\n\n\n*************************");
				
			}
		});
		btn1GPA.setEnabled(false);
		btn1GPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1GPA.setBounds(10, 325, 89, 23);
		contentPane.add(btn1GPA);
		
		JButton btn2GPA = new JButton("2nd GPA");
		btn2GPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtCSC2201.getText().equalsIgnoreCase("a")) {
					CSC2201=5*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("b")) {
					CSC2201=4*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("c")) {
					CSC2201=3*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("d")) {
					CSC2201=2*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("e")) {
					CSC2201=1*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("f")) {
					CSC2201=0*CSC2201CU;
				}else if(txtCSC2201.getText().equalsIgnoreCase("")) {
					CSC2201=0*CSC2201CU;
				}

				if(txtCSC2202.getText().equalsIgnoreCase("a")) {
					CSC2202=5*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("b")) {
					CSC2202=4*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("c")) {
					CSC2202=3*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("d")) {
					CSC2202=2*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("e")) {
					CSC2202=1*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("f")) {
					CSC2202=0*CSC2202CU;
				}else if(txtCSC2202.getText().equalsIgnoreCase("")) {
					CSC2202=0*CSC2202CU;
				}

				if(txtCSC2203.getText().equalsIgnoreCase("a")) {
					CSC2203=5*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("b")) {
					CSC2203=4*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("c")) {
					CSC2203=3*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("d")) {
					CSC2203=2*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("e")) {
					CSC2203=1*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("f")) {
					CSC2203=0*CSC2203CU;
				}else if(txtCSC2203.getText().equalsIgnoreCase("")) {
					CSC2203=0*CSC2203CU;
				}
				
				if(txtCSC2204.getText().equalsIgnoreCase("a")) {
					CSC2204=5*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("b")) {
					CSC2204=4*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("c")) {
					CSC2204=3*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("d")) {
					CSC2204=2*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("e")) {
					CSC2204=1*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("f")) {
					CSC2204=0*CSC2204CU;
				}else if(txtCSC2204.getText().equalsIgnoreCase("")) {
					CSC2204=0*CSC2204CU;
				}
				
				if(txtCSC2205.getText().equalsIgnoreCase("a")) {
					CSC2205=5*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("b")) {
					CSC2205=4*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("c")) {
					CSC2205=3*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("d")) {
					CSC2205=2*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("e")) {
					CSC2205=1*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("f")) {
					CSC2205=0*CSC2205CU;
				}else if(txtCSC2205.getText().equalsIgnoreCase("")) {
					CSC2205=0*CSC2205CU;
				}

				if(txtENT3201.getText().equalsIgnoreCase("a")) {
					ENT3201=5*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("b")) {
					ENT3201=4*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("c")) {
					ENT3201=3*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("d")) {
					ENT3201=2*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("e")) {
					ENT3201=1*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("f")) {
					ENT3201=0*ENT3201CU;
				}else if(txtENT3201.getText().equalsIgnoreCase("")) {
					ENT3201=0*ENT3201CU;
				}                

				if(txtCSC2206.getText().equalsIgnoreCase("a")) {
					CSC2206=5*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("b")) {
					CSC2206=4*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("c")) {
					CSC2206=3*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("d")) {
					CSC2206=2*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("e")) {
					CSC2206=1*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("f")) {
					CSC2206=0*CSC2206CU;
				}else if(txtCSC2206.getText().equalsIgnoreCase("")) {
					CSC2206=0*CSC2206CU;
				}

				if(txtMTH2201.getText().equalsIgnoreCase("a")) {
					MTH2201=5*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("b")) {
					MTH2201=4*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("c")) {
					MTH2201=3*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("d")) {
					MTH2201=2*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("e")) {
					MTH2201=1*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("f")) {
					MTH2201=0*MTH2201CU;
				}else if(txtMTH2201.getText().equalsIgnoreCase("")) {
					MTH2201=0*MTH2201CU;
				}

				creditUnit2= CSC2201CU + CSC2202CU + CSC2203CU + CSC2204CU+ CSC2205CU + ENT3201CU + MTH2201CU + CSC2206CU;
				gradePoint2= CSC2201 + CSC2202 + CSC2203 + CSC2204 + CSC2205 + ENT3201 + MTH2201 + CSC2206;
				gpa2= gradePoint2 / creditUnit2;

				if(gpa2>4.50) {
					gpa2=5.00;
					gpaClass2= "First Class";
				}
				else if(gpa2==4.50) {
					 gpaClass2= "First Class";
				}else if(gpa2>=3.50 && gpa2<=4.49) {
					gpaClass2= "Second Class Upper";
				}else if(gpa2>=2.40 && gpa2<=3.49) {
					gpaClass2= "Second Class Lower";
				}else if(gpa2>=1.50 && gpa2<=2.39) {
					gpaClass2= "Thrid Class";
				}else if(gpa2>=1.0 && gpa2<=1.49) {
					gpaClass2= "Pass";
				}else {
					gpaClass2= "Fail";
				}

				String final_gpa2 = String.format("%.2f" ,gpa2);
				txtMain.setText("*************************\nSecond Semester GPA: "+final_gpa2+"\n"+gpaClass2+"\n\n\n\n*************************");
			}
		});
		btn2GPA.setEnabled(false);
		btn2GPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2GPA.setBounds(386, 325, 89, 23);
		contentPane.add(btn2GPA);
		
		JCheckBox chckbx1semester = new JCheckBox("First Semester");
		chckbx1semester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbx1semester.isSelected()) {
					txtGSS2101.setEnabled(true);
					txtCSC2101.setEnabled(true);
					txtCSC2102.setEnabled(true);
					txtCSC2103.setEnabled(true);
					txtMTH2103.setEnabled(true);
					txtMTH2104.setEnabled(true);
					txtENT3101.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btn1GPA.setEnabled(true);
				}else {
					txtGSS2101.setEnabled(false);
					txtCSC2101.setEnabled(false);
					txtCSC2102.setEnabled(false);
					txtCSC2103.setEnabled(false);
					txtMTH2103.setEnabled(false);
					txtMTH2104.setEnabled(false);
					txtENT3101.setEnabled(false);
					txtMain.setEnabled(false);
					
					btnRest.setEnabled(false);
					btn1GPA.setEnabled(false);
				}			
			}
		});
		chckbx1semester.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbx1semester.setBounds(6, 38, 108, 23);
		contentPane.add(chckbx1semester);
		
		JCheckBox chckbx2semester = new JCheckBox("Second Semester");
		chckbx2semester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbx2semester.isSelected()) {
					txtCSC2205.setEnabled(true);
					txtCSC2201.setEnabled(true);
					txtCSC2202.setEnabled(true);
					txtCSC2203.setEnabled(true);
					txtENT3201.setEnabled(true);
					txtMTH2201.setEnabled(true);
					txtCSC2206.setEnabled(true);
					txtCSC2204.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btn2GPA.setEnabled(true);
				}else {
					txtCSC2205.setEnabled(false);
					txtCSC2201.setEnabled(false);
					txtCSC2202.setEnabled(false);
					txtCSC2203.setEnabled(false);
					txtENT3201.setEnabled(false);
					txtMTH2201.setEnabled(false);
					txtCSC2206.setEnabled(false);		
					txtCSC2204.setEnabled(false);
					txtMain.setEnabled(false);
					
					btnRest.setEnabled(false);
					btn2GPA.setEnabled(false);
				}
			}
		});
		chckbx2semester.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbx2semester.setBounds(371, 38, 140, 23);
		contentPane.add(chckbx2semester);
		
		JLabel lblNewLabel_10 = new JLabel("Leave blank  for courses you dont have thier grade");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setBounds(119, 21, 289, 14);
		contentPane.add(lblNewLabel_10);
		
		JCheckBox chckbxBothsemester = new JCheckBox("Both Semester");
		chckbxBothsemester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxBothsemester.isSelected()) {
					txtGSS2101.setEnabled(true);
					txtCSC2101.setEnabled(true);
					txtCSC2102.setEnabled(true);
					txtCSC2103.setEnabled(true);
					txtMTH2103.setEnabled(true);
					txtMTH2104.setEnabled(true);
					txtENT3101.setEnabled(true);
					
					txtCSC2205.setEnabled(true);
					txtCSC2201.setEnabled(true);
					txtCSC2202.setEnabled(true);
					txtCSC2203.setEnabled(true);
					txtENT3201.setEnabled(true);
					txtMTH2201.setEnabled(true);
					txtCSC2206.setEnabled(true);
					txtCSC2204.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btnGETCGPA.setEnabled(true);
				}else {
					txtGSS2101.setEnabled(false);
					txtCSC2101.setEnabled(false);
					txtCSC2102.setEnabled(false);
					txtCSC2103.setEnabled(false);
					txtMTH2103.setEnabled(false);
					txtMTH2104.setEnabled(false);
					txtENT3101.setEnabled(false);
					
					txtCSC2205.setEnabled(false);
					txtCSC2201.setEnabled(false);
					txtCSC2202.setEnabled(false);
					txtCSC2203.setEnabled(false);
					txtENT3201.setEnabled(false);
					txtMTH2201.setEnabled(false);
					txtCSC2206.setEnabled(false);	
					txtCSC2204.setEnabled(false);
					txtMain.setEnabled(false);
					
					btnRest.setEnabled(false);
					btnGETCGPA.setEnabled(false);
				}
			}
		});
		chckbxBothsemester.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxBothsemester.setBounds(190, 38, 122, 23);
		contentPane.add(chckbxBothsemester);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(122, 93, 250, 174);
		contentPane.add(panel);
		
		
	}
}
