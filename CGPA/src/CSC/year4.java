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
public class year4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCSC4101;
	private JTextField txtCSC4102;
	private JTextField txtCSC4103;
	private JTextField txtCSC4104;
	private JTextField txtCSC4105;
	private JTextField txtCSC4106;
	private JTextField txtCSC4107;
	
	private JTextField txtCSC4200;
	private JTextField txtCSC4201;
	private JTextField txtCSC4202;
	private JTextField txtCSC4205;
	private JTextField txtCSC4203;
	private JTextField txtCSC4204;

	double gradePoint1,  gradePoint2, totalgradePoint,  creditUnit1,  creditUnit2,  totalCreditUnit,  cgpa, gpa1, gpa2;
	
	String gpaClass1, gpaClass2, cgpaClass;
	
	// Course
	double CSC4101, CSC4102, CSC4103, CSC4104, CSC4105, CSC4106, CSC4107;
	double CSC4200, CSC4201, CSC4202, CSC4205, CSC4203, CSC4204;
	
	// Course Credit Unit
	double  CSC4101CU =3, CSC4102CU =3, CSC4103CU =4, CSC4104CU =3, CSC4105CU =3, CSC4106CU =2, CSC4107CU =3;
	double CSC4200CU =6, CSC4201CU =3, CSC4202CU =2, CSC4203CU =2, CSC4204CU =3, CSC4205CU =2;
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					year4 frame = new year4();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setTitle("Year four CGPA");
					
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
	public year4() {
		
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
		
		JLabel lblNewLabel = new JLabel("CSC4101");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 68, 63, 23);
		contentPane.add(lblNewLabel);
		
		txtCSC4101 = new JTextField();
		txtCSC4101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4101.setText(txtCSC4101.getText().toUpperCase());
			}
		});
		txtCSC4101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4101.setEnabled(false);
		txtCSC4101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4101.setToolTipText("Grade");
		txtCSC4101.setBounds(70, 68, 44, 20);
		contentPane.add(txtCSC4101);
		txtCSC4101.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CSC4102");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 102, 63, 23);
		contentPane.add(lblNewLabel_1);
		
		txtCSC4102 = new JTextField();
		txtCSC4102.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4102.setText(txtCSC4102.getText().toUpperCase());
			}
		});
		txtCSC4102.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4102.setEnabled(false);
		txtCSC4102.setToolTipText("Grade");
		txtCSC4102.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4102.setColumns(10);
		txtCSC4102.setBounds(70, 102, 44, 20);
		contentPane.add(txtCSC4102);
		
		JLabel lblNewLabel_2 = new JLabel("CSC4103");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 136, 63, 23);
		contentPane.add(lblNewLabel_2);
		
		txtCSC4103 = new JTextField();
		txtCSC4103.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4103.setText(txtCSC4103.getText().toUpperCase());
			}
		});
		txtCSC4103.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4103.setEnabled(false);
		txtCSC4103.setToolTipText("Grade");
		txtCSC4103.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4103.setColumns(10);
		txtCSC4103.setBounds(70, 136, 44, 20);
		contentPane.add(txtCSC4103);
		
		JLabel lblNewLabel_3 = new JLabel("CSC4104");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 170, 63, 23);
		contentPane.add(lblNewLabel_3);
		
		txtCSC4104 = new JTextField();
		txtCSC4104.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4104.setText(txtCSC4104.getText().toUpperCase());
			}
		});
		txtCSC4104.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4104.setEnabled(false);
		txtCSC4104.setToolTipText("Grade");
		txtCSC4104.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4104.setColumns(10);
		txtCSC4104.setBounds(70, 170, 44, 20);
		contentPane.add(txtCSC4104);
		
		JLabel lblNewLabel_4 = new JLabel("CSC4107");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 265, 63, 23);
		contentPane.add(lblNewLabel_4);
		
		txtCSC4105 = new JTextField();
		txtCSC4105.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4105.setText(txtCSC4105.getText().toUpperCase());
			}
		});
		txtCSC4105.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4105.setEnabled(false);
		txtCSC4105.setToolTipText("Grade");
		txtCSC4105.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4105.setColumns(10);
		txtCSC4105.setBounds(70, 200, 44, 20);
		contentPane.add(txtCSC4105);
		
		JLabel lblNewLabel_5 = new JLabel("CSC4105");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 200, 63, 23);
		contentPane.add(lblNewLabel_5);
		
		txtCSC4106 = new JTextField();
		txtCSC4106.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4106.setText(txtCSC4106.getText().toUpperCase());
			}
		});
		txtCSC4106.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4106.setEnabled(false);
		txtCSC4106.setToolTipText("Grade");
		txtCSC4106.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4106.setColumns(10);
		txtCSC4106.setBounds(70, 234, 44, 20);
		contentPane.add(txtCSC4106);
		
		JLabel lblNewLabel_6 = new JLabel("CSC4106");
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 231, 63, 23);
		contentPane.add(lblNewLabel_6);
		
		txtCSC4107 = new JTextField();
		txtCSC4107.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4107.setText(txtCSC4107.getText().toUpperCase());
			}
		});
		txtCSC4107.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4107.setEnabled(false);
		txtCSC4107.setToolTipText("Grade");
		txtCSC4107.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4107.setColumns(10);
		txtCSC4107.setBounds(71, 268, 44, 20);
		contentPane.add(txtCSC4107);
		
		JLabel lblNewLabel_9 = new JLabel("CSC4200");
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_9.setBounds(381, 68, 63, 23);
		contentPane.add(lblNewLabel_9);
		
		txtCSC4200 = new JTextField();
		txtCSC4200.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4200.setText(txtCSC4200.getText().toUpperCase());
			}
		});
		txtCSC4200.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4200.setEnabled(false);
		txtCSC4200.setToolTipText("Grade");
		txtCSC4200.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4200.setColumns(10);
		txtCSC4200.setBounds(441, 68, 44, 20);
		contentPane.add(txtCSC4200);
		
		JLabel lblNewLabel_1_1 = new JLabel("CSC4201");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(381, 102, 63, 23);
		contentPane.add(lblNewLabel_1_1);
		
		txtCSC4201 = new JTextField();
		txtCSC4201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4201.setText(txtCSC4201.getText().toUpperCase());
			}
		});
		txtCSC4201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4201.setEnabled(false);
		txtCSC4201.setToolTipText("Grade");
		txtCSC4201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4201.setColumns(10);
		txtCSC4201.setBounds(441, 102, 44, 20);
		contentPane.add(txtCSC4201);
		
		txtCSC4202 = new JTextField();
		txtCSC4202.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4202.setText(txtCSC4202.getText().toUpperCase());
			}
		});
		txtCSC4202.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4202.setEnabled(false);
		txtCSC4202.setToolTipText("Grade");
		txtCSC4202.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4202.setColumns(10);
		txtCSC4202.setBounds(441, 136, 44, 20);
		contentPane.add(txtCSC4202);
		
		txtCSC4203 = new JTextField();
		txtCSC4203.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4203.setText(txtCSC4203.getText().toUpperCase());
			}
		});
		txtCSC4203.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4203.setEnabled(false);
		txtCSC4203.setToolTipText("Grade");
		txtCSC4203.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4203.setColumns(10);
		txtCSC4203.setBounds(441, 170, 44, 20);
		contentPane.add(txtCSC4203);
		
		txtCSC4204 = new JTextField();
		txtCSC4204.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC4204.setText(txtCSC4204.getText().toUpperCase());
			}
		});
		txtCSC4204.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4204.setEnabled(false);
		txtCSC4204.setToolTipText("Grade");
		txtCSC4204.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4204.setColumns(10);
		txtCSC4204.setBounds(441, 200, 44, 20);
		contentPane.add(txtCSC4204);

		txtCSC4205 = new JTextField();
		txtCSC4205.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			    txtCSC4205.setText(txtCSC4205.getText().toUpperCase());
			}
		});
		txtCSC4205.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC4205.setEnabled(false);
		txtCSC4205.setToolTipText("Grade");
		txtCSC4205.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC4205.setColumns(10);
		txtCSC4205.setBounds(441, 233, 44, 20);
		contentPane.add(txtCSC4205);

		JLabel lblNewLabel_7_1 = new JLabel("CSC4205");
		lblNewLabel_7_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_7_1.setBounds(381, 233, 63, 23);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_6_1.setBounds(381, 266, 63, 23);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("CSC4204");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_5_1.setBounds(381, 200, 63, 23);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CSC4203");
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(381, 170, 63, 23);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("CSC4202");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(381, 136, 63, 23);
		contentPane.add(lblNewLabel_2_1);

		JButton btnRest = new JButton("Rest");
		btnRest.setEnabled(false);
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCSC4101.setText("");
				txtCSC4102.setText("");
				txtCSC4103.setText("");
				txtCSC4104.setText("");
				txtCSC4105.setText("");
				txtCSC4106.setText("");
				txtCSC4107.setText("");
				
				txtCSC4203.setText("");
				txtCSC4200.setText("");
				txtCSC4201.setText("");
				txtCSC4202.setText("");
				txtCSC4204.setText("");
				txtCSC4205.setText("");
				txtMain.setText("");
				
			}
		});
		btnRest.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRest.setBounds(207, 288, 89, 23);
		contentPane.add(btnRest);
		
		JButton btnGETCGPA = new JButton("GET CGPA");
		btnGETCGPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtCSC4101.getText().equalsIgnoreCase("a")) {
					CSC4101=5*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("b")) {
					CSC4101=4*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("c")) {
					CSC4101=3*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("d")) {
					CSC4101=2*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("e")) {
					CSC4101=1*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("f")) {
					CSC4101=0*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("")) {
					CSC4101=0*CSC4101CU;
				}
				
				if(txtCSC4102.getText().equalsIgnoreCase("a")) {
					CSC4102=5*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("b")) {
					CSC4102=4*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("c")) {
				    CSC4102=3*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("d")) {
				    CSC4102=2*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("e")) {
				    CSC4102=1*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("f")) {
				    CSC4102=0*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("")) {
				    CSC4102=0*CSC4102CU;
				}
				
				if(txtCSC4103.getText().equalsIgnoreCase("a")) {
					CSC4103=5*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("b")) {
					CSC4103=4*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("c")) {
					CSC4103=3*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("d")) {
					CSC4103=2*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("e")) {
					CSC4103=1*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("f")) {
					CSC4103=0*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("")) {
					CSC4103=0*CSC4103CU;
				}
				
				if(txtCSC4104.getText().equalsIgnoreCase("a")) {
					CSC4104=5*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("b")) {
					CSC4104=4*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("c")) {
					CSC4104=3*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("d")) {
					CSC4104=2*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("e")) {
					CSC4104=1*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("f")) {
					CSC4104=0*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("")) {
					CSC4104=0*CSC4104CU;
				}
							
				
				if(txtCSC4105.getText().equalsIgnoreCase("a")) {
					CSC4105=5*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("b")) {
					CSC4105=4*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("c")) {
					CSC4105=3*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("d")) {
					CSC4105=2*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("e")) {
					CSC4105=1*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("f")) {
					CSC4105=0*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("")) {
					CSC4105=0*CSC4105CU;
				}
				
				
				if(txtCSC4106.getText().equalsIgnoreCase("a")) {
					CSC4106=5*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("b")) {
					CSC4106=4*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("c")) {
					CSC4106=3*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("d")) {
					CSC4106=2*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("e")) {
					CSC4106=1*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("f")) {
					CSC4106=0*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("")) {
					CSC4106=0*CSC4106CU;
				}
				
				if(txtCSC4107.getText().equalsIgnoreCase("a")) {
					CSC4107=5*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("b")) {
					CSC4107=4*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("c")) {
					CSC4107=3*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("d")) {
					CSC4107=2*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("e")) {
					CSC4107=1*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("f")) {
					CSC4107=0*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("")) {
					CSC4107=0*CSC4107CU;
				}
				

				creditUnit1= CSC4101CU + CSC4102CU + CSC4103CU + CSC4104CU + CSC4105CU + CSC4106CU + CSC4107CU;
				gradePoint1= CSC4101 + CSC4102 + CSC4103 + CSC4104 + CSC4105 + CSC4106 +CSC4107;
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

				
				if(txtCSC4200.getText().equalsIgnoreCase("a")) {
					CSC4200=5*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("b")) {
					CSC4200=4*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("c")) {
					CSC4200=3*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("d")) {
					CSC4200=2*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("e")) {
					CSC4200=1*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("f")) {
					CSC4200=0*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("")) {
					CSC4200=0*CSC4200CU;
				}

				if(txtCSC4201.getText().equalsIgnoreCase("a")) {
					CSC4201=5*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("b")) {
					CSC4201=4*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("c")) {
					CSC4201=3*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("d")) {
					CSC4201=2*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("e")) {
					CSC4201=1*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("f")) {
					CSC4201=0*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("")) {
					CSC4201=0*CSC4201CU;
				}

				if(txtCSC4202.getText().equalsIgnoreCase("a")) {
					CSC4202=5*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("b")) {
					CSC4202=4*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("c")) {
					CSC4202=3*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("d")) {
					CSC4202=2*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("e")) {
					CSC4202=1*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("f")) {
					CSC4202=0*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("")) {
					CSC4202=0*CSC4202CU;
				}

				if(txtCSC4205.getText().equalsIgnoreCase("a")) {
					CSC4205=5*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("b")) {
					CSC4205=4*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("c")) {
					CSC4205=3*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("d")) {
					CSC4205=2*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("e")) {
					CSC4205=1*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("f")) {
					CSC4205=0*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("")) {
					CSC4205=0*CSC4205CU;
				}
				
				if(txtCSC4203.getText().equalsIgnoreCase("a")) {
					CSC4203=5*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("b")) {
					CSC4203=4*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("c")) {
					CSC4203=3*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("d")) {
					CSC4203=2*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("e")) {
					CSC4203=1*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("f")) {
					CSC4203=0*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("")) {
					CSC4203=0*CSC4203CU;
				}

				if(txtCSC4204.getText().equalsIgnoreCase("a")) {
					CSC4204=5*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("b")) {
					CSC4204=4*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("c")) {
					CSC4204=3*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("d")) {
					CSC4204=2*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("e")) {
					CSC4204=1*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("f")) {
					CSC4204=0*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("")) {
					CSC4204=0*CSC4204CU;
				}

				creditUnit2= CSC4200CU + CSC4201CU + CSC4202CU + CSC4205CU+ CSC4203CU  + CSC4204CU;
				gradePoint2= CSC4200 + CSC4201 + CSC4202 + CSC4205 + CSC4203  + CSC4204;
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
				
				if(txtCSC4101.getText().equalsIgnoreCase("a")) {
					CSC4101=5*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("b")) {
					CSC4101=4*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("c")) {
					CSC4101=3*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("d")) {
					CSC4101=2*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("e")) {
					CSC4101=1*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("f")) {
					CSC4101=0*CSC4101CU;
				}else if(txtCSC4101.getText().equalsIgnoreCase("")) {
					CSC4101=0*CSC4101CU;
				}
				
				if(txtCSC4102.getText().equalsIgnoreCase("a")) {
					CSC4102=5*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("b")) {
					CSC4102=4*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("c")) {
				    CSC4102=3*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("d")) {
				    CSC4102=2*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("e")) {
				    CSC4102=1*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("f")) {
				    CSC4102=0*CSC4102CU;
				}else if(txtCSC4102.getText().equalsIgnoreCase("")) {
				    CSC4102=0*CSC4102CU;
				}
				
				if(txtCSC4103.getText().equalsIgnoreCase("a")) {
					CSC4103=5*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("b")) {
					CSC4103=4*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("c")) {
					CSC4103=3*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("d")) {
					CSC4103=2*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("e")) {
					CSC4103=1*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("f")) {
					CSC4103=0*CSC4103CU;
				}else if(txtCSC4103.getText().equalsIgnoreCase("")) {
					CSC4103=0*CSC4103CU;
				}
				
				if(txtCSC4104.getText().equalsIgnoreCase("a")) {
					CSC4104=5*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("b")) {
					CSC4104=4*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("c")) {
					CSC4104=3*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("d")) {
					CSC4104=2*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("e")) {
					CSC4104=1*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("f")) {
					CSC4104=0*CSC4104CU;
				}else if(txtCSC4104.getText().equalsIgnoreCase("")) {
					CSC4104=0*CSC4104CU;
				}
							
				
				if(txtCSC4105.getText().equalsIgnoreCase("a")) {
					CSC4105=5*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("b")) {
					CSC4105=4*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("c")) {
					CSC4105=3*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("d")) {
					CSC4105=2*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("e")) {
					CSC4105=1*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("f")) {
					CSC4105=0*CSC4105CU;
				}else if(txtCSC4105.getText().equalsIgnoreCase("")) {
					CSC4105=0*CSC4105CU;
				}
				
				
				if(txtCSC4106.getText().equalsIgnoreCase("a")) {
					CSC4106=5*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("b")) {
					CSC4106=4*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("c")) {
					CSC4106=3*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("d")) {
					CSC4106=2*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("e")) {
					CSC4106=1*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("f")) {
					CSC4106=0*CSC4106CU;
				}else if(txtCSC4106.getText().equalsIgnoreCase("")) {
					CSC4106=0*CSC4106CU;
				}
				
				if(txtCSC4107.getText().equalsIgnoreCase("a")) {
					CSC4107=5*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("b")) {
					CSC4107=4*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("c")) {
					CSC4107=3*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("d")) {
					CSC4107=2*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("e")) {
					CSC4107=1*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("f")) {
					CSC4107=0*CSC4107CU;
				}else if(txtCSC4107.getText().equalsIgnoreCase("")) {
					CSC4107=0*CSC4107CU;
				}
				

				creditUnit1= CSC4101CU + CSC4102CU + CSC4103CU + CSC4104CU + CSC4105CU + CSC4106CU + CSC4107CU;
				gradePoint1= CSC4101 + CSC4102 + CSC4103 + CSC4104 + CSC4105 + CSC4106 +CSC4107;
				gpa1= (gradePoint1 / creditUnit1);
				
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
				
				if(txtCSC4200.getText().equalsIgnoreCase("a")) {
					CSC4200=5*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("b")) {
					CSC4200=4*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("c")) {
					CSC4200=3*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("d")) {
					CSC4200=2*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("e")) {
					CSC4200=1*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("f")) {
					CSC4200=0*CSC4200CU;
				}else if(txtCSC4200.getText().equalsIgnoreCase("")) {
					CSC4200=0*CSC4200CU;
				}

				if(txtCSC4201.getText().equalsIgnoreCase("a")) {
					CSC4201=5*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("b")) {
					CSC4201=4*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("c")) {
					CSC4201=3*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("d")) {
					CSC4201=2*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("e")) {
					CSC4201=1*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("f")) {
					CSC4201=0*CSC4201CU;
				}else if(txtCSC4201.getText().equalsIgnoreCase("")) {
					CSC4201=0*CSC4201CU;
				}

				if(txtCSC4202.getText().equalsIgnoreCase("a")) {
					CSC4202=5*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("b")) {
					CSC4202=4*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("c")) {
					CSC4202=3*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("d")) {
					CSC4202=2*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("e")) {
					CSC4202=1*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("f")) {
					CSC4202=0*CSC4202CU;
				}else if(txtCSC4202.getText().equalsIgnoreCase("")) {
					CSC4202=0*CSC4202CU;
				}
				
				if(txtCSC4203.getText().equalsIgnoreCase("a")) {
					CSC4203=5*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("b")) {
					CSC4203=4*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("c")) {
					CSC4203=3*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("d")) {
					CSC4203=2*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("e")) {
					CSC4203=1*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("f")) {
					CSC4203=0*CSC4203CU;
				}else if(txtCSC4203.getText().equalsIgnoreCase("")) {
					CSC4203=0*CSC4203CU;
				}

				if(txtCSC4204.getText().equalsIgnoreCase("a")) {
					CSC4204=5*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("b")) {
					CSC4204=4*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("c")) {
					CSC4204=3*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("d")) {
					CSC4204=2*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("e")) {
					CSC4204=1*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("f")) {
					CSC4204=0*CSC4204CU;
				}else if(txtCSC4204.getText().equalsIgnoreCase("")) {
					CSC4204=0*CSC4204CU;
				}

				if(txtCSC4205.getText().equalsIgnoreCase("a")) {
				    CSC4205=5*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("b")) {
				    CSC4205=4*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("c")) {
				    CSC4205=3*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("d")) {
				    CSC4205=2*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("e")) {
				    CSC4205=1*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("f")) {
				    CSC4205=0*CSC4205CU;
				}else if(txtCSC4205.getText().equalsIgnoreCase("")) {
				    CSC4205=0*CSC4205CU;
				}

				creditUnit2= CSC4200CU + CSC4201CU + CSC4202CU + CSC4203CU  + CSC4204CU + CSC4205CU;
				gradePoint2= CSC4200 + CSC4201 + CSC4202 + CSC4203 + CSC4204 + CSC4205 ;
				gpa2= (gradePoint2 / creditUnit2);

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
					txtCSC4101.setEnabled(true);
					txtCSC4102.setEnabled(true);
					txtCSC4103.setEnabled(true);
					txtCSC4104.setEnabled(true);
					txtCSC4105.setEnabled(true);
					txtCSC4106.setEnabled(true);
					txtCSC4107.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btn1GPA.setEnabled(true);
				}else {
					txtCSC4101.setEnabled(false);
					txtCSC4102.setEnabled(false);
					txtCSC4103.setEnabled(false);
					txtCSC4104.setEnabled(false);
					txtCSC4105.setEnabled(false);
					txtCSC4106.setEnabled(false);
					txtCSC4107.setEnabled(false);
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
					txtCSC4203.setEnabled(true);
					txtCSC4200.setEnabled(true);
					txtCSC4201.setEnabled(true);
					txtCSC4202.setEnabled(true);
					txtCSC4204.setEnabled(true);
					txtCSC4205.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btn2GPA.setEnabled(true);
				}else {
					txtCSC4203.setEnabled(false);
					txtCSC4200.setEnabled(false);
					txtCSC4201.setEnabled(false);
					txtCSC4202.setEnabled(false);
					txtCSC4204.setEnabled(false);
					txtCSC4205.setEnabled(false);
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
					txtCSC4101.setEnabled(true);
					txtCSC4102.setEnabled(true);
					txtCSC4103.setEnabled(true);
					txtCSC4104.setEnabled(true);
					txtCSC4105.setEnabled(true);
					txtCSC4106.setEnabled(true);
					txtCSC4107.setEnabled(true);
					
					txtCSC4203.setEnabled(true);
					txtCSC4200.setEnabled(true);
					txtCSC4201.setEnabled(true);
					txtCSC4202.setEnabled(true);
					txtCSC4204.setEnabled(true);
					txtCSC4205.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btnGETCGPA.setEnabled(true);
				}else {
					txtCSC4101.setEnabled(false);
					txtCSC4102.setEnabled(false);
					txtCSC4103.setEnabled(false);
					txtCSC4104.setEnabled(false);
					txtCSC4105.setEnabled(false);
					txtCSC4106.setEnabled(false);
					txtCSC4107.setEnabled(false);
					
					txtCSC4203.setEnabled(false);
					txtCSC4200.setEnabled(false);
					txtCSC4201.setEnabled(false);
					txtCSC4202.setEnabled(false);
					txtCSC4204.setEnabled(false);
					txtCSC4205.setEnabled(false);
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
