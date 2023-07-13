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
public class year3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCSC3101;
	private JTextField txtCSC3102;
	private JTextField txtCSC3103;
	private JTextField txtCSC3104;
	private JTextField txtCSC3105;
	private JTextField txtCSC3106;
	private JTextField txtCSC3107;
	private JTextField txtCSC3201;
	private JTextField txtCSC3202;
	private JTextField txtCSC3203;
	private JTextField txtCSC3206;
	private JTextField txtCSC3204;
	private JTextField txtCSC3207;
	private JTextField txtCSC3205;

	double gradePoint1,  gradePoint2, totalgradePoint,  creditUnit1,  creditUnit2,  totalCreditUnit,  cgpa, gpa1, gpa2;
	
	String gpaClass1, gpaClass2, cgpaClass;
	
	// Course
	double CSC3101, CSC3102, CSC3103, CSC3104, CSC3105, CSC3106, CSC3107;
	double CSC3201, CSC3202, CSC3203, CSC3206, CSC3204, CSC3205, CSC3207 ;
	
	// Course Credit Unit
	double  CSC3101CU =3, CSC3102CU =3, CSC3103CU =3, CSC3104CU =3, CSC3105CU =3, CSC3106CU =3, CSC3107CU =3;
	double CSC3201CU =3, CSC3202CU =3, CSC3203CU =2, CSC3204CU =3, CSC3205CU =3, CSC3206CU =2, CSC3207CU =3;
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					year3 frame = new year3();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setTitle("Year three CGPA");
					
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
	public year3() {
		
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
		
		JLabel lblNewLabel = new JLabel("CSC3101");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 68, 63, 23);
		contentPane.add(lblNewLabel);
		
		txtCSC3101 = new JTextField();
		txtCSC3101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3101.setText(txtCSC3101.getText().toUpperCase());
			}
		});
		txtCSC3101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3101.setEnabled(false);
		txtCSC3101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3101.setToolTipText("Grade");
		txtCSC3101.setBounds(70, 68, 44, 20);
		contentPane.add(txtCSC3101);
		txtCSC3101.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CSC3102");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 102, 63, 23);
		contentPane.add(lblNewLabel_1);
		
		txtCSC3102 = new JTextField();
		txtCSC3102.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3102.setText(txtCSC3102.getText().toUpperCase());
			}
		});
		txtCSC3102.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3102.setEnabled(false);
		txtCSC3102.setToolTipText("Grade");
		txtCSC3102.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3102.setColumns(10);
		txtCSC3102.setBounds(70, 102, 44, 20);
		contentPane.add(txtCSC3102);
		
		JLabel lblNewLabel_2 = new JLabel("CSC3103");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 136, 63, 23);
		contentPane.add(lblNewLabel_2);
		
		txtCSC3103 = new JTextField();
		txtCSC3103.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3103.setText(txtCSC3103.getText().toUpperCase());
			}
		});
		txtCSC3103.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3103.setEnabled(false);
		txtCSC3103.setToolTipText("Grade");
		txtCSC3103.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3103.setColumns(10);
		txtCSC3103.setBounds(70, 136, 44, 20);
		contentPane.add(txtCSC3103);
		
		JLabel lblNewLabel_3 = new JLabel("CSC3104");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 170, 63, 23);
		contentPane.add(lblNewLabel_3);
		
		txtCSC3104 = new JTextField();
		txtCSC3104.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3104.setText(txtCSC3104.getText().toUpperCase());
			}
		});
		txtCSC3104.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3104.setEnabled(false);
		txtCSC3104.setToolTipText("Grade");
		txtCSC3104.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3104.setColumns(10);
		txtCSC3104.setBounds(70, 170, 44, 20);
		contentPane.add(txtCSC3104);
		
		JLabel lblNewLabel_4 = new JLabel("CSC3107");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 265, 63, 23);
		contentPane.add(lblNewLabel_4);
		
		txtCSC3105 = new JTextField();
		txtCSC3105.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3105.setText(txtCSC3105.getText().toUpperCase());
			}
		});
		txtCSC3105.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3105.setEnabled(false);
		txtCSC3105.setToolTipText("Grade");
		txtCSC3105.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3105.setColumns(10);
		txtCSC3105.setBounds(70, 200, 44, 20);
		contentPane.add(txtCSC3105);
		
		JLabel lblNewLabel_5 = new JLabel("CSC3105");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 200, 63, 23);
		contentPane.add(lblNewLabel_5);
		
		txtCSC3106 = new JTextField();
		txtCSC3106.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3106.setText(txtCSC3106.getText().toUpperCase());
			}
		});
		txtCSC3106.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3106.setEnabled(false);
		txtCSC3106.setToolTipText("Grade");
		txtCSC3106.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3106.setColumns(10);
		txtCSC3106.setBounds(70, 234, 44, 20);
		contentPane.add(txtCSC3106);
		
		JLabel lblNewLabel_6 = new JLabel("CSC3106");
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 231, 63, 23);
		contentPane.add(lblNewLabel_6);
		
		txtCSC3107 = new JTextField();
		txtCSC3107.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3107.setText(txtCSC3107.getText().toUpperCase());
			}
		});
		txtCSC3107.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3107.setEnabled(false);
		txtCSC3107.setToolTipText("Grade");
		txtCSC3107.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3107.setColumns(10);
		txtCSC3107.setBounds(71, 268, 44, 20);
		contentPane.add(txtCSC3107);
		
		JLabel lblNewLabel_9 = new JLabel("CSC3201");
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_9.setBounds(381, 68, 63, 23);
		contentPane.add(lblNewLabel_9);
		
		txtCSC3201 = new JTextField();
		txtCSC3201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3201.setText(txtCSC3201.getText().toUpperCase());
			}
		});
		txtCSC3201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3201.setEnabled(false);
		txtCSC3201.setToolTipText("Grade");
		txtCSC3201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3201.setColumns(10);
		txtCSC3201.setBounds(441, 68, 44, 20);
		contentPane.add(txtCSC3201);
		
		JLabel lblNewLabel_1_1 = new JLabel("CSC3202");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(381, 102, 63, 23);
		contentPane.add(lblNewLabel_1_1);
		
		txtCSC3202 = new JTextField();
		txtCSC3202.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3202.setText(txtCSC3202.getText().toUpperCase());
			}
		});
		txtCSC3202.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3202.setEnabled(false);
		txtCSC3202.setToolTipText("Grade");
		txtCSC3202.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3202.setColumns(10);
		txtCSC3202.setBounds(441, 102, 44, 20);
		contentPane.add(txtCSC3202);
		
		txtCSC3203 = new JTextField();
		txtCSC3203.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3203.setText(txtCSC3203.getText().toUpperCase());
			}
		});
		txtCSC3203.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3203.setEnabled(false);
		txtCSC3203.setToolTipText("Grade");
		txtCSC3203.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3203.setColumns(10);
		txtCSC3203.setBounds(441, 136, 44, 20);
		contentPane.add(txtCSC3203);
		
		txtCSC3204 = new JTextField();
		txtCSC3204.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3204.setText(txtCSC3204.getText().toUpperCase());
			}
		});
		txtCSC3204.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3204.setEnabled(false);
		txtCSC3204.setToolTipText("Grade");
		txtCSC3204.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3204.setColumns(10);
		txtCSC3204.setBounds(441, 170, 44, 20);
		contentPane.add(txtCSC3204);
		
		txtCSC3205 = new JTextField();
		txtCSC3205.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3205.setText(txtCSC3205.getText().toUpperCase());
			}
		});
		txtCSC3205.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3205.setEnabled(false);
		txtCSC3205.setToolTipText("Grade");
		txtCSC3205.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3205.setColumns(10);
		txtCSC3205.setBounds(441, 200, 44, 20);
		contentPane.add(txtCSC3205);

		txtCSC3206 = new JTextField();
		txtCSC3206.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			    txtCSC3206.setText(txtCSC3206.getText().toUpperCase());
			}
		});
		txtCSC3206.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3206.setEnabled(false);
		txtCSC3206.setToolTipText("Grade");
		txtCSC3206.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3206.setColumns(10);
		txtCSC3206.setBounds(441, 233, 44, 20);
		contentPane.add(txtCSC3206);
		
		txtCSC3207 = new JTextField();
		txtCSC3207.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC3207.setText(txtCSC3207.getText().toUpperCase());
			}
		});
		txtCSC3207.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC3207.setEnabled(false);
		txtCSC3207.setToolTipText("Grade");
		txtCSC3207.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC3207.setColumns(10);
		txtCSC3207.setBounds(441, 263, 44, 20);
		contentPane.add(txtCSC3207);

		JLabel lblNewLabel_7_1 = new JLabel("CSC3206");
		lblNewLabel_7_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_7_1.setBounds(381, 233, 63, 23);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("CSC3207");
		lblNewLabel_6_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_6_1.setBounds(381, 266, 63, 23);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("CSC3205");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_5_1.setBounds(381, 200, 63, 23);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CSC3204");
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(381, 170, 63, 23);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("CSC3203");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(381, 136, 63, 23);
		contentPane.add(lblNewLabel_2_1);

		JButton btnRest = new JButton("Rest");
		btnRest.setEnabled(false);
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCSC3101.setText("");
				txtCSC3102.setText("");
				txtCSC3103.setText("");
				txtCSC3104.setText("");
				txtCSC3105.setText("");
				txtCSC3106.setText("");
				txtCSC3107.setText("");
				
				txtCSC3204.setText("");
				txtCSC3201.setText("");
				txtCSC3202.setText("");
				txtCSC3203.setText("");
				txtCSC3205.setText("");
				txtCSC3207.setText("");
				txtCSC3206.setText("");
				txtMain.setText("");
				
			}
		});
		btnRest.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRest.setBounds(207, 288, 89, 23);
		contentPane.add(btnRest);
		
		JButton btnGETCGPA = new JButton("GET CGPA");
		btnGETCGPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtCSC3101.getText().equalsIgnoreCase("a")) {
					CSC3101=5*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("b")) {
					CSC3101=4*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("c")) {
					CSC3101=3*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("d")) {
					CSC3101=2*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("e")) {
					CSC3101=1*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("f")) {
					CSC3101=0*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("")) {
					CSC3101=0*CSC3101CU;
				}
				
				if(txtCSC3102.getText().equalsIgnoreCase("a")) {
					CSC3102=5*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("b")) {
					CSC3102=4*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("c")) {
				    CSC3102=3*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("d")) {
				    CSC3102=2*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("e")) {
				    CSC3102=1*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("f")) {
				    CSC3102=0*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("")) {
				    CSC3102=0*CSC3102CU;
				}
				
				if(txtCSC3103.getText().equalsIgnoreCase("a")) {
					CSC3103=5*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("b")) {
					CSC3103=4*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("c")) {
					CSC3103=3*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("d")) {
					CSC3103=2*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("e")) {
					CSC3103=1*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("f")) {
					CSC3103=0*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("")) {
					CSC3103=0*CSC3103CU;
				}
				
				if(txtCSC3104.getText().equalsIgnoreCase("a")) {
					CSC3104=5*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("b")) {
					CSC3104=4*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("c")) {
					CSC3104=3*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("d")) {
					CSC3104=2*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("e")) {
					CSC3104=1*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("f")) {
					CSC3104=0*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("")) {
					CSC3104=0*CSC3104CU;
				}
							
				
				if(txtCSC3105.getText().equalsIgnoreCase("a")) {
					CSC3105=5*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("b")) {
					CSC3105=4*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("c")) {
					CSC3105=3*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("d")) {
					CSC3105=2*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("e")) {
					CSC3105=1*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("f")) {
					CSC3105=0*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("")) {
					CSC3105=0*CSC3105CU;
				}
				
				
				if(txtCSC3106.getText().equalsIgnoreCase("a")) {
					CSC3106=5*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("b")) {
					CSC3106=4*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("c")) {
					CSC3106=3*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("d")) {
					CSC3106=2*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("e")) {
					CSC3106=1*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("f")) {
					CSC3106=0*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("")) {
					CSC3106=0*CSC3106CU;
				}
				
				if(txtCSC3107.getText().equalsIgnoreCase("a")) {
					CSC3107=5*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("b")) {
					CSC3107=4*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("c")) {
					CSC3107=3*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("d")) {
					CSC3107=2*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("e")) {
					CSC3107=1*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("f")) {
					CSC3107=0*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("")) {
					CSC3107=0*CSC3107CU;
				}
				

				creditUnit1= CSC3101CU + CSC3102CU + CSC3103CU + CSC3104CU + CSC3105CU + CSC3106CU + CSC3107CU;
				gradePoint1= CSC3101 + CSC3102 + CSC3103 + CSC3104 + CSC3105 + CSC3106 +CSC3107;
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
				
				if(txtCSC3201.getText().equalsIgnoreCase("a")) {
					CSC3201=5*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("b")) {
					CSC3201=4*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("c")) {
					CSC3201=3*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("d")) {
					CSC3201=2*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("e")) {
					CSC3201=1*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("f")) {
					CSC3201=0*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("")) {
					CSC3201=0*CSC3201CU;
				}

				if(txtCSC3202.getText().equalsIgnoreCase("a")) {
					CSC3202=5*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("b")) {
					CSC3202=4*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("c")) {
					CSC3202=3*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("d")) {
					CSC3202=2*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("e")) {
					CSC3202=1*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("f")) {
					CSC3202=0*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("")) {
					CSC3202=0*CSC3202CU;
				}

				if(txtCSC3203.getText().equalsIgnoreCase("a")) {
					CSC3203=5*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("b")) {
					CSC3203=4*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("c")) {
					CSC3203=3*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("d")) {
					CSC3203=2*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("e")) {
					CSC3203=1*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("f")) {
					CSC3203=0*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("")) {
					CSC3203=0*CSC3203CU;
				}

				if(txtCSC3206.getText().equalsIgnoreCase("a")) {
					CSC3206=5*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("b")) {
					CSC3206=4*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("c")) {
					CSC3206=3*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("d")) {
					CSC3206=2*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("e")) {
					CSC3206=1*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("f")) {
					CSC3206=0*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("")) {
					CSC3206=0*CSC3206CU;
				}
				
				if(txtCSC3204.getText().equalsIgnoreCase("a")) {
					CSC3204=5*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("b")) {
					CSC3204=4*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("c")) {
					CSC3204=3*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("d")) {
					CSC3204=2*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("e")) {
					CSC3204=1*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("f")) {
					CSC3204=0*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("")) {
					CSC3204=0*CSC3204CU;
				}

				if(txtCSC3207.getText().equalsIgnoreCase("a")) {
					CSC3207=5*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("b")) {
					CSC3207=4*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("c")) {
					CSC3207=3*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("d")) {
					CSC3207=2*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("e")) {
					CSC3207=1*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("f")) {
					CSC3207=0*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("")) {
					CSC3207=0*CSC3207CU;
				}

				if(txtCSC3205.getText().equalsIgnoreCase("a")) {
					CSC3205=5*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("b")) {
					CSC3205=4*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("c")) {
					CSC3205=3*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("d")) {
					CSC3205=2*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("e")) {
					CSC3205=1*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("f")) {
					CSC3205=0*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("")) {
					CSC3205=0*CSC3205CU;
				}

				creditUnit2= CSC3201CU + CSC3202CU + CSC3203CU + CSC3206CU+ CSC3204CU  + CSC3205CU + CSC3207CU;
				gradePoint2= CSC3201 + CSC3202 + CSC3203 + CSC3206 + CSC3204  + CSC3205 + CSC3207;
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
				
				if(txtCSC3101.getText().equalsIgnoreCase("a")) {
					CSC3101=5*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("b")) {
					CSC3101=4*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("c")) {
					CSC3101=3*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("d")) {
					CSC3101=2*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("e")) {
					CSC3101=1*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("f")) {
					CSC3101=0*CSC3101CU;
				}else if(txtCSC3101.getText().equalsIgnoreCase("")) {
					CSC3101=0*CSC3101CU;
				}
				
				if(txtCSC3102.getText().equalsIgnoreCase("a")) {
					CSC3102=5*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("b")) {
					CSC3102=4*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("c")) {
				    CSC3102=3*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("d")) {
				    CSC3102=2*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("e")) {
				    CSC3102=1*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("f")) {
				    CSC3102=0*CSC3102CU;
				}else if(txtCSC3102.getText().equalsIgnoreCase("")) {
				    CSC3102=0*CSC3102CU;
				}
				
				if(txtCSC3103.getText().equalsIgnoreCase("a")) {
					CSC3103=5*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("b")) {
					CSC3103=4*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("c")) {
					CSC3103=3*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("d")) {
					CSC3103=2*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("e")) {
					CSC3103=1*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("f")) {
					CSC3103=0*CSC3103CU;
				}else if(txtCSC3103.getText().equalsIgnoreCase("")) {
					CSC3103=0*CSC3103CU;
				}
				
				if(txtCSC3104.getText().equalsIgnoreCase("a")) {
					CSC3104=5*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("b")) {
					CSC3104=4*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("c")) {
					CSC3104=3*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("d")) {
					CSC3104=2*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("e")) {
					CSC3104=1*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("f")) {
					CSC3104=0*CSC3104CU;
				}else if(txtCSC3104.getText().equalsIgnoreCase("")) {
					CSC3104=0*CSC3104CU;
				}
							
				
				if(txtCSC3105.getText().equalsIgnoreCase("a")) {
					CSC3105=5*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("b")) {
					CSC3105=4*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("c")) {
					CSC3105=3*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("d")) {
					CSC3105=2*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("e")) {
					CSC3105=1*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("f")) {
					CSC3105=0*CSC3105CU;
				}else if(txtCSC3105.getText().equalsIgnoreCase("")) {
					CSC3105=0*CSC3105CU;
				}
				
				
				if(txtCSC3106.getText().equalsIgnoreCase("a")) {
					CSC3106=5*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("b")) {
					CSC3106=4*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("c")) {
					CSC3106=3*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("d")) {
					CSC3106=2*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("e")) {
					CSC3106=1*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("f")) {
					CSC3106=0*CSC3106CU;
				}else if(txtCSC3106.getText().equalsIgnoreCase("")) {
					CSC3106=0*CSC3106CU;
				}
				
				if(txtCSC3107.getText().equalsIgnoreCase("a")) {
					CSC3107=5*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("b")) {
					CSC3107=4*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("c")) {
					CSC3107=3*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("d")) {
					CSC3107=2*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("e")) {
					CSC3107=1*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("f")) {
					CSC3107=0*CSC3107CU;
				}else if(txtCSC3107.getText().equalsIgnoreCase("")) {
					CSC3107=0*CSC3107CU;
				}
				

				creditUnit1= CSC3101CU + CSC3102CU + CSC3103CU + CSC3104CU + CSC3105CU + CSC3106CU + CSC3107CU;
				gradePoint1= CSC3101 + CSC3102 + CSC3103 + CSC3104 + CSC3105 + CSC3106 +CSC3107;
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
				
				if(txtCSC3201.getText().equalsIgnoreCase("a")) {
					CSC3201=5*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("b")) {
					CSC3201=4*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("c")) {
					CSC3201=3*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("d")) {
					CSC3201=2*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("e")) {
					CSC3201=1*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("f")) {
					CSC3201=0*CSC3201CU;
				}else if(txtCSC3201.getText().equalsIgnoreCase("")) {
					CSC3201=0*CSC3201CU;
				}

				if(txtCSC3202.getText().equalsIgnoreCase("a")) {
					CSC3202=5*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("b")) {
					CSC3202=4*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("c")) {
					CSC3202=3*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("d")) {
					CSC3202=2*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("e")) {
					CSC3202=1*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("f")) {
					CSC3202=0*CSC3202CU;
				}else if(txtCSC3202.getText().equalsIgnoreCase("")) {
					CSC3202=0*CSC3202CU;
				}

				if(txtCSC3203.getText().equalsIgnoreCase("a")) {
					CSC3203=5*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("b")) {
					CSC3203=4*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("c")) {
					CSC3203=3*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("d")) {
					CSC3203=2*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("e")) {
					CSC3203=1*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("f")) {
					CSC3203=0*CSC3203CU;
				}else if(txtCSC3203.getText().equalsIgnoreCase("")) {
					CSC3203=0*CSC3203CU;
				}
				
				if(txtCSC3204.getText().equalsIgnoreCase("a")) {
					CSC3204=5*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("b")) {
					CSC3204=4*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("c")) {
					CSC3204=3*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("d")) {
					CSC3204=2*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("e")) {
					CSC3204=1*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("f")) {
					CSC3204=0*CSC3204CU;
				}else if(txtCSC3204.getText().equalsIgnoreCase("")) {
					CSC3204=0*CSC3204CU;
				}

				if(txtCSC3205.getText().equalsIgnoreCase("a")) {
					CSC3205=5*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("b")) {
					CSC3205=4*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("c")) {
					CSC3205=3*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("d")) {
					CSC3205=2*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("e")) {
					CSC3205=1*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("f")) {
					CSC3205=0*CSC3205CU;
				}else if(txtCSC3205.getText().equalsIgnoreCase("")) {
					CSC3205=0*CSC3205CU;
				}

				if(txtCSC3206.getText().equalsIgnoreCase("a")) {
				    CSC3206=5*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("b")) {
				    CSC3206=4*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("c")) {
				    CSC3206=3*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("d")) {
				    CSC3206=2*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("e")) {
				    CSC3206=1*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("f")) {
				    CSC3206=0*CSC3206CU;
				}else if(txtCSC3206.getText().equalsIgnoreCase("")) {
				    CSC3206=0*CSC3206CU;
				}

				if(txtCSC3207.getText().equalsIgnoreCase("a")) {
					CSC3207=5*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("b")) {
					CSC3207=4*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("c")) {
					CSC3207=3*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("d")) {
					CSC3207=2*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("e")) {
					CSC3207=1*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("f")) {
					CSC3207=0*CSC3207CU;
				}else if(txtCSC3207.getText().equalsIgnoreCase("")) {
					CSC3207=0*CSC3207CU;
				}

				creditUnit2= CSC3201CU + CSC3202CU + CSC3203CU + CSC3204CU  + CSC3205CU + CSC3206CU + CSC3207CU;
				gradePoint2= CSC3201 + CSC3202 + CSC3203 + CSC3204 + CSC3205 + CSC3206 + CSC3207;
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
					txtCSC3101.setEnabled(true);
					txtCSC3102.setEnabled(true);
					txtCSC3103.setEnabled(true);
					txtCSC3104.setEnabled(true);
					txtCSC3105.setEnabled(true);
					txtCSC3106.setEnabled(true);
					txtCSC3107.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btn1GPA.setEnabled(true);
				}else {
					txtCSC3101.setEnabled(false);
					txtCSC3102.setEnabled(false);
					txtCSC3103.setEnabled(false);
					txtCSC3104.setEnabled(false);
					txtCSC3105.setEnabled(false);
					txtCSC3106.setEnabled(false);
					txtCSC3107.setEnabled(false);
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
					txtCSC3204.setEnabled(true);
					txtCSC3201.setEnabled(true);
					txtCSC3202.setEnabled(true);
					txtCSC3203.setEnabled(true);
					txtCSC3205.setEnabled(true);
					txtCSC3207.setEnabled(true);
					txtCSC3206.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btn2GPA.setEnabled(true);
				}else {
					txtCSC3204.setEnabled(false);
					txtCSC3201.setEnabled(false);
					txtCSC3202.setEnabled(false);
					txtCSC3203.setEnabled(false);
					txtCSC3205.setEnabled(false);
					txtCSC3207.setEnabled(false);		
					txtCSC3206.setEnabled(false);
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
					txtCSC3101.setEnabled(true);
					txtCSC3102.setEnabled(true);
					txtCSC3103.setEnabled(true);
					txtCSC3104.setEnabled(true);
					txtCSC3105.setEnabled(true);
					txtCSC3106.setEnabled(true);
					txtCSC3107.setEnabled(true);
					
					txtCSC3204.setEnabled(true);
					txtCSC3201.setEnabled(true);
					txtCSC3202.setEnabled(true);
					txtCSC3203.setEnabled(true);
					txtCSC3205.setEnabled(true);
					txtCSC3207.setEnabled(true);
					txtCSC3206.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btnGETCGPA.setEnabled(true);
				}else {
					txtCSC3101.setEnabled(false);
					txtCSC3102.setEnabled(false);
					txtCSC3103.setEnabled(false);
					txtCSC3104.setEnabled(false);
					txtCSC3105.setEnabled(false);
					txtCSC3106.setEnabled(false);
					txtCSC3107.setEnabled(false);
					
					txtCSC3204.setEnabled(false);
					txtCSC3201.setEnabled(false);
					txtCSC3202.setEnabled(false);
					txtCSC3203.setEnabled(false);
					txtCSC3205.setEnabled(false);
					txtCSC3207.setEnabled(false);	
					txtCSC3206.setEnabled(false);
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
