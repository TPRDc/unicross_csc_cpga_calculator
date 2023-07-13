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
public class year1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtGSS1101;
	private JTextField txtGSS1102;
	private JTextField txtGSS1103;
	private JTextField txtCSC1101;
	private JTextField txtMTH1101;
	private JTextField txtPHY1101;
	private JTextField txtPHY1104;
	private JTextField txtCHM1101;
	private JTextField txtBIO1101;
	private JTextField txtGSS1201;
	private JTextField txtGSS1202;
	private JTextField txtGSS1203;
	private JTextField txtCSC1201;
	private JTextField txtCSC1202;
	private JTextField txtMTH1201;
	private JTextField txtMTH1203;
	private JTextField txtPHY1201;
	private JTextField txtSTA1201;
	private JTextField txtCSC1203;

	double gradePoint1=0, gradePoint2=0, totalgradePoint=0, creditUnit1=0, creditUnit2=0, totalCreditUnit=0, cgpa, gpa1, gpa2;
	
	String gpaClass1, gpaClass2, cgpaClass;
	
	// Course 
	double GSS1101, GSS1102, GSS1103, CSC1101, MTH1101, PHY1101, PHY1104, CHM1101, BIO1101;
	double GSS1201, GSS1202, GSS1203, CSC1201, MTH1201, PHY1201, CSC1202, MTH1203, STA1201, CSC1203;
	
	// Course Credit Unit
	double GSS1101CU =2, GSS1102CU =2, GSS1103CU =2, CSC1101CU =3, MTH1101CU =3, PHY1101CU =3, PHY1104CU =1, CHM1101CU =3, BIO1101CU =3;
	double GSS1201CU =2, GSS1202CU =2, GSS1203CU =2, CSC1201CU =2, MTH1201CU =3, PHY1201CU =3, CSC1202CU =2, MTH1203CU =3, STA1201CU =3, CSC1203CU =2;;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					year1 frame = new year1();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setTitle("Year One CGPA");
					
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
	public year1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 484);
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
		
		JLabel lblNewLabel = new JLabel("GSS1101\r\n");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 68, 63, 23);
		contentPane.add(lblNewLabel);
		
		txtGSS1101 = new JTextField();
		txtGSS1101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtGSS1101.setText(txtGSS1101.getText().toUpperCase());
			}
		});
		txtGSS1101.setHorizontalAlignment(SwingConstants.CENTER);
		txtGSS1101.setEnabled(false);
		txtGSS1101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGSS1101.setToolTipText("Grade");
		txtGSS1101.setBounds(70, 68, 44, 20);
		contentPane.add(txtGSS1101);
		txtGSS1101.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("GSS1102");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 102, 63, 23);
		contentPane.add(lblNewLabel_1);
		
		txtGSS1102 = new JTextField();
		txtGSS1102.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtGSS1102.setText(txtGSS1102.getText().toUpperCase());
			}
		});
		txtGSS1102.setHorizontalAlignment(SwingConstants.CENTER);
		txtGSS1102.setEnabled(false);
		txtGSS1102.setToolTipText("Grade");
		txtGSS1102.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGSS1102.setColumns(10);
		txtGSS1102.setBounds(70, 102, 44, 20);
		contentPane.add(txtGSS1102);
		
		JLabel lblNewLabel_2 = new JLabel("GSS1103");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 136, 63, 23);
		contentPane.add(lblNewLabel_2);
		
		txtGSS1103 = new JTextField();
		txtGSS1103.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtGSS1103.setText(txtGSS1103.getText().toUpperCase());
			}
		});
		txtGSS1103.setHorizontalAlignment(SwingConstants.CENTER);
		txtGSS1103.setEnabled(false);
		txtGSS1103.setToolTipText("Grade");
		txtGSS1103.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGSS1103.setColumns(10);
		txtGSS1103.setBounds(70, 136, 44, 20);
		contentPane.add(txtGSS1103);
		
		JLabel lblNewLabel_3 = new JLabel("CSC1101\r\n");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 170, 63, 23);
		contentPane.add(lblNewLabel_3);
		
		txtCSC1101 = new JTextField();
		txtCSC1101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC1101.setText(txtCSC1101.getText().toUpperCase());
			}
		});
		txtCSC1101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC1101.setEnabled(false);
		txtCSC1101.setToolTipText("Grade");
		txtCSC1101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC1101.setColumns(10);
		txtCSC1101.setBounds(70, 170, 44, 20);
		contentPane.add(txtCSC1101);
		
		JLabel lblNewLabel_4 = new JLabel("MTH1101\r\n");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 200, 63, 23);
		contentPane.add(lblNewLabel_4);
		
		txtMTH1101 = new JTextField();
		txtMTH1101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtMTH1101.setText(txtMTH1101.getText().toUpperCase());
			}
		});
		txtMTH1101.setHorizontalAlignment(SwingConstants.CENTER);
		txtMTH1101.setEnabled(false);
		txtMTH1101.setToolTipText("Grade");
		txtMTH1101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMTH1101.setColumns(10);
		txtMTH1101.setBounds(70, 200, 44, 20);
		contentPane.add(txtMTH1101);
		
		JLabel lblNewLabel_5 = new JLabel("PHY1101\r\n");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 234, 63, 23);
		contentPane.add(lblNewLabel_5);
		
		txtPHY1101 = new JTextField();
		txtPHY1101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtPHY1101.setText(txtPHY1101.getText().toUpperCase());
			}
		});
		txtPHY1101.setHorizontalAlignment(SwingConstants.CENTER);
		txtPHY1101.setEnabled(false);
		txtPHY1101.setToolTipText("Grade");
		txtPHY1101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPHY1101.setColumns(10);
		txtPHY1101.setBounds(70, 234, 44, 20);
		contentPane.add(txtPHY1101);
		
		JLabel lblNewLabel_6 = new JLabel("PHY1104");
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 268, 63, 23);
		contentPane.add(lblNewLabel_6);
		
		txtPHY1104 = new JTextField();
		txtPHY1104.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtPHY1104.setText(txtPHY1104.getText().toUpperCase());
			}
		});
		txtPHY1104.setHorizontalAlignment(SwingConstants.CENTER);
		txtPHY1104.setEnabled(false);
		txtPHY1104.setToolTipText("Grade");
		txtPHY1104.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPHY1104.setColumns(10);
		txtPHY1104.setBounds(71, 268, 44, 20);
		contentPane.add(txtPHY1104);
		
		JLabel lblNewLabel_7 = new JLabel("CHM1101\r\n");
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_7.setBounds(10, 302, 63, 23);
		contentPane.add(lblNewLabel_7);
		
		txtCHM1101 = new JTextField();
		txtCHM1101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCHM1101.setText(txtCHM1101.getText().toUpperCase());
			}
		});
		txtCHM1101.setHorizontalAlignment(SwingConstants.CENTER);
		txtCHM1101.setEnabled(false);
		txtCHM1101.setToolTipText("Grade");
		txtCHM1101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCHM1101.setColumns(10);
		txtCHM1101.setBounds(70, 302, 44, 20);
		contentPane.add(txtCHM1101);
		
		JLabel lblNewLabel_8 = new JLabel("BIO1101\r\n");
		lblNewLabel_8.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_8.setBounds(10, 336, 63, 23);
		contentPane.add(lblNewLabel_8);
		
		txtBIO1101 = new JTextField();
		txtBIO1101.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtBIO1101.setText(txtBIO1101.getText().toUpperCase());
			}
		});
		txtBIO1101.setHorizontalAlignment(SwingConstants.CENTER);
		txtBIO1101.setEnabled(false);
		txtBIO1101.setToolTipText("Grade");
		txtBIO1101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtBIO1101.setColumns(10);
		txtBIO1101.setBounds(70, 336, 44, 20);
		contentPane.add(txtBIO1101);
		
		JLabel lblNewLabel_9 = new JLabel("GSS1201");
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_9.setBounds(381, 68, 63, 23);
		contentPane.add(lblNewLabel_9);
		
		txtGSS1201 = new JTextField();
		txtGSS1201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtGSS1201.setText(txtGSS1201.getText().toUpperCase());
			}
		});
		txtGSS1201.setHorizontalAlignment(SwingConstants.CENTER);
		txtGSS1201.setEnabled(false);
		txtGSS1201.setToolTipText("Grade");
		txtGSS1201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGSS1201.setColumns(10);
		txtGSS1201.setBounds(441, 68, 44, 20);
		contentPane.add(txtGSS1201);
		
		JLabel lblNewLabel_1_1 = new JLabel("GSS1202");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(381, 102, 63, 23);
		contentPane.add(lblNewLabel_1_1);
		
		txtGSS1202 = new JTextField();
		txtGSS1202.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtGSS1202.setText(txtGSS1202.getText().toUpperCase());
			}
		});
		txtGSS1202.setHorizontalAlignment(SwingConstants.CENTER);
		txtGSS1202.setEnabled(false);
		txtGSS1202.setToolTipText("Grade");
		txtGSS1202.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGSS1202.setColumns(10);
		txtGSS1202.setBounds(441, 102, 44, 20);
		contentPane.add(txtGSS1202);
		
		txtGSS1203 = new JTextField();
		txtGSS1203.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtGSS1203.setText(txtGSS1203.getText().toUpperCase());
			}
		});
		txtGSS1203.setHorizontalAlignment(SwingConstants.CENTER);
		txtGSS1203.setEnabled(false);
		txtGSS1203.setToolTipText("Grade");
		txtGSS1203.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGSS1203.setColumns(10);
		txtGSS1203.setBounds(441, 136, 44, 20);
		contentPane.add(txtGSS1203);
		
		txtCSC1201 = new JTextField();
		txtCSC1201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC1201.setText(txtCSC1201.getText().toUpperCase());
			}
		});
		txtCSC1201.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC1201.setEnabled(false);
		txtCSC1201.setToolTipText("Grade");
		txtCSC1201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC1201.setColumns(10);
		txtCSC1201.setBounds(441, 170, 44, 20);
		contentPane.add(txtCSC1201);
		
		txtCSC1202 = new JTextField();
		txtCSC1202.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtCSC1202.setText(txtCSC1202.getText().toUpperCase());
			}
		});
		txtCSC1202.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC1202.setEnabled(false);
		txtCSC1202.setToolTipText("Grade");
		txtCSC1202.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC1202.setColumns(10);
		txtCSC1202.setBounds(441, 200, 44, 20);
		contentPane.add(txtCSC1202);
		
		txtMTH1201 = new JTextField();
		txtMTH1201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtMTH1201.setText(txtMTH1201.getText().toUpperCase());
			}
		});
		txtMTH1201.setHorizontalAlignment(SwingConstants.CENTER);
		txtMTH1201.setEnabled(false);
		txtMTH1201.setToolTipText("Grade");
		txtMTH1201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMTH1201.setColumns(10);
		txtMTH1201.setBounds(441, 234, 44, 20);
		contentPane.add(txtMTH1201);
		
		txtMTH1203 = new JTextField();
		txtMTH1203.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtMTH1203.setText(txtMTH1203.getText().toUpperCase());
			}
		});
		txtMTH1203.setHorizontalAlignment(SwingConstants.CENTER);
		txtMTH1203.setEnabled(false);
		txtMTH1203.setToolTipText("Grade");
		txtMTH1203.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMTH1203.setColumns(10);
		txtMTH1203.setBounds(441, 268, 44, 20);
		contentPane.add(txtMTH1203);
		
		txtPHY1201 = new JTextField();
		txtPHY1201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtPHY1201.setText(txtPHY1201.getText().toUpperCase());
			}
		});
		txtPHY1201.setHorizontalAlignment(SwingConstants.CENTER);
		txtPHY1201.setEnabled(false);
		txtPHY1201.setToolTipText("Grade");
		txtPHY1201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPHY1201.setColumns(10);
		txtPHY1201.setBounds(441, 302, 44, 20);
		contentPane.add(txtPHY1201);
		
		txtSTA1201 = new JTextField();
		txtSTA1201.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtSTA1201.setText(txtSTA1201.getText().toUpperCase());
			}
		});
		txtSTA1201.setHorizontalAlignment(SwingConstants.CENTER);
		txtSTA1201.setEnabled(false);
		txtSTA1201.setToolTipText("Grade");
		txtSTA1201.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSTA1201.setColumns(10);
		txtSTA1201.setBounds(441, 336, 44, 20);
		contentPane.add(txtSTA1201);

		txtCSC1203 = new JTextField();
		txtCSC1203.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyReleased(KeyEvent e) {
		        txtCSC1203.setText(txtCSC1203.getText().toUpperCase());
		    }
		});
		txtCSC1203.setHorizontalAlignment(SwingConstants.CENTER);
		txtCSC1203.setEnabled(false);
		txtCSC1203.setToolTipText("Grade");
		txtCSC1203.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCSC1203.setColumns(10);
		txtCSC1203.setBounds(441, 370, 44, 20);
		contentPane.add(txtCSC1203);

		JLabel lblNewLabel_9_1 = new JLabel("CSC1203");
		lblNewLabel_9_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_9_1.setBounds(381, 370, 63, 23);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("STA1201");
		lblNewLabel_8_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_8_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_8_1.setBounds(381, 336, 63, 23);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("PHY1201");
		lblNewLabel_7_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_7_1.setBounds(381, 302, 63, 23);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("MTH1203");
		lblNewLabel_6_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_6_1.setBounds(381, 268, 63, 23);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("MTH1201");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_5_1.setBounds(381, 234, 63, 23);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("CSC1202");
		lblNewLabel_4_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(381, 200, 63, 23);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CSC1201");
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(381, 170, 63, 23);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("GSS1203");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(381, 136, 63, 23);
		contentPane.add(lblNewLabel_2_1);
	
		JButton btnGETCGPA = new JButton("GET CGPA");
		btnGETCGPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtGSS1101.getText().toString().equalsIgnoreCase("a")) {
					GSS1101=5*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("b")) {
					GSS1101=4*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("c")) {
					GSS1101=3*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("d")) {
					GSS1101=2*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("e")) {
					GSS1101=1*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("f")) {
					GSS1101=0*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("")) {
					GSS1101=0*GSS1101CU;
				}
				
				if(txtGSS1102.getText().equalsIgnoreCase("a")) {
					GSS1102=5*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("b")) {
					GSS1102=4*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("c")) {
					GSS1102=3*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("d")) {
					GSS1102=2*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("e")) {
					GSS1102=1*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("f")) {
					GSS1102=0*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("")) {
					GSS1102=0*GSS1102CU;
				}
				
				if(txtGSS1103.getText().equalsIgnoreCase("a")) {
					GSS1103=5*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("b")) {
					GSS1103=4*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("c")) {
					GSS1103=3*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("d")) {
					GSS1103=2*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("e")) {
					GSS1103=1*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("f")) {
					GSS1103=0*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("")) {
					GSS1103=0*GSS1103CU;
				}
				
				if(txtCSC1101.getText().equalsIgnoreCase("a")) {
					CSC1101=5*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("b")) {
					CSC1101=4*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("c")) {
					CSC1101=3*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("d")) {
					CSC1101=2*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("e")) {
					CSC1101=1*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("f")) {
					CSC1101=0*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("")) {
					CSC1101=0*CSC1101CU;
				}
				
				if(txtMTH1101.getText().equalsIgnoreCase("a")) {
					MTH1101=5*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("b")) {
					MTH1101=4*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("c")) {
					MTH1101=3*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("d")) {
					MTH1101=2*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("e")) {
					MTH1101=1*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("f")) {
					MTH1101=0*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("")) {
					MTH1101=0*MTH1101CU;
				}
				
				
				if(txtPHY1101.getText().equalsIgnoreCase("a")) {
					PHY1101=5*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("b")) {
					PHY1101=4*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("c")) {
					PHY1101=3*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("d")) {
					PHY1101=2*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("e")) {
					PHY1101=1*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("f")) {
					PHY1101=0*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("")) {
					PHY1101=0*PHY1101CU;
				}
				
				if(txtPHY1104.getText().equalsIgnoreCase("a")) {
					PHY1104=5*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("b")) {
					PHY1104=4*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("c")) {
					PHY1104=3*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("d")) {
					PHY1104=2*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("e")) {
					PHY1104=1*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("f")) {
					PHY1104=0*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("")) {
					PHY1104=0*PHY1104CU;
				}
				
				if(txtCHM1101.getText().equalsIgnoreCase("a")) {
					CHM1101=5*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("b")) {
					CHM1101=4*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("c")) {
					CHM1101=3*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("d")) {
					CHM1101=2*CHM1101CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("e")) {
					CHM1101=1*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("f")) {
					CHM1101=0*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("")) {
					CHM1101=0*CHM1101CU;
				}
				
				if(txtBIO1101.getText().equalsIgnoreCase("a")) {
					BIO1101=5*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("b")) {
					BIO1101=4*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("c")) {
					BIO1101=3*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("d")) {
					BIO1101=2*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("e")) {
					BIO1101=1*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("f")) {
					BIO1101=0*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("")) {
					BIO1101=0*BIO1101CU;
				}
				
				if(txtCSC1203.getText().equalsIgnoreCase("a")) {
				    CSC1203=5*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("b")) {
				    CSC1203=4*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("c")) {
				    CSC1203=3*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("d")) {
				    CSC1203=2*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("e")) {
				    CSC1203=1*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("f")) {
				    CSC1203=0*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("")) {
				    CSC1203=0*CSC1203CU;
				}

				creditUnit1= GSS1101CU + GSS1102CU + GSS1103CU + CSC1101CU + MTH1101CU + PHY1101CU + PHY1104CU + CHM1101CU + BIO1101CU;
				gradePoint1= GSS1101 + GSS1102 + GSS1103 + CSC1101 + MTH1101 + PHY1101 + PHY1104 + CHM1101 + BIO1101;
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
				
				if(txtGSS1201.getText().toString().equalsIgnoreCase("a")) {
					GSS1201=5*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("b")) {
					GSS1201=4*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("c")) {
					GSS1201=3*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("d")) {
					GSS1201=2*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("e")) {
					GSS1201=1*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("f")) {
					GSS1201=0*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("")) {
					GSS1201=0*GSS1201CU;
				}

				if(txtGSS1202.getText().equalsIgnoreCase("a")) {
					GSS1202=5*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("b")) {
					GSS1202=4*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("c")) {
					GSS1202=3*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("d")) {
					GSS1202=2*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("e")) {
					GSS1202=1*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("f")) {
					GSS1202=0*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("")) {
					GSS1202=0*GSS1202CU;
				}

				if(txtGSS1203.getText().equalsIgnoreCase("a")) {
					GSS1203=5*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("b")) {
					GSS1203=4*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("c")) {
					GSS1203=3*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("d")) {
					GSS1203=2*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("e")) {
					GSS1203=1*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("f")) {
					GSS1203=0*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("")) {
					GSS1203=0*GSS1203CU;
				}

				if(txtCSC1201.getText().equalsIgnoreCase("a")) {
					CSC1101=5*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("b")) {
					CSC1101=4*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("c")) {
					CSC1101=3*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("d")) {
					CSC1101=2*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("e")) {
					CSC1101=1*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("f")) {
					CSC1101=0*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("")) {
					CSC1101=0*CSC1101CU;
				}

				if(txtCSC1202.getText().equalsIgnoreCase("a")) {
					CSC1202=5*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("b")) {
					CSC1202=4*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("c")) {
					CSC1202=3*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("d")) {
					CSC1202=2*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("e")) {
					CSC1202=1*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("f")) {
					CSC1202=0*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("")) {
					CSC1202=0*CSC1202CU;
				}                

				if(txtMTH1201.getText().equalsIgnoreCase("a")) {
					MTH1201=5*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("b")) {
					MTH1201=4*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("c")) {
					MTH1201=3*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("d")) {
					MTH1201=2*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("e")) {
					MTH1201=1*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("f")) {
					MTH1201=0*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("")) {
					MTH1201=0*MTH1201CU;
				}

				if(txtMTH1203.getText().equalsIgnoreCase("a")) {
					MTH1203=5*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("b")) {
					MTH1203=4*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("c")) {
					MTH1203=3*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("d")) {
					MTH1203=2*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("e")) {
					MTH1203=1*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("f")) {
					MTH1203=0*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("")) {
					MTH1203=0*MTH1203CU;;
				}

				 if(txtPHY1201.getText().equalsIgnoreCase("a")) {
					PHY1201=5*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("b")) {
					PHY1201=4*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("c")) {
					PHY1201=3*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("d")) {
					PHY1201=2*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("e")) {
					PHY1201=1*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("f")) {
					PHY1201=0*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("")) {
					PHY1201=0*PHY1201CU;
				}

				if(txtSTA1201.getText().equalsIgnoreCase("a")) {
					STA1201=5*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("b")) {
					STA1201=4*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("c")) {
					STA1201=3*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("d")) {
					STA1201=2*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("e")) {
					STA1201=1*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("f")) {
					STA1201=0*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("")) {
					STA1201=0*STA1201CU;
				}

				creditUnit2= GSS1201CU + GSS1202CU + GSS1203CU + CSC1201CU + MTH1201CU + PHY1201CU + CSC1202CU + MTH1203CU + STA1201CU + CSC1203CU;
				gradePoint2= GSS1201 + GSS1202 + GSS1203 + CSC1201 + MTH1201 + PHY1201 + CSC1202 + MTH1203 + STA1201 + CSC1203;
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
				txtMain.setText("*************************\nFirst Semester GPA: "+final_gpa1+"\nSecond Semester GPA: "+final_gpa2+"\nYear One CGPA: "+final_cgpa+"\n"+"Remark: "+cgpaClass+"\n\n*************************");
			}
		});
		btnGETCGPA.setEnabled(false);
		btnGETCGPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGETCGPA.setBounds(207, 405, 89, 23);
		contentPane.add(btnGETCGPA);
		
		JButton btn1GPA = new JButton("1st GPA");
		btn1GPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtGSS1101.getText().toString().equalsIgnoreCase("a")) {
					GSS1101=5*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("b")) {
					GSS1101=4*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("c")) {
					GSS1101=3*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("d")) {
					GSS1101=2*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("e")) {
					GSS1101=1*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("f")) {
					GSS1101=0*GSS1101CU;
				}else if(txtGSS1101.getText().equalsIgnoreCase("")) {
					GSS1101=0*GSS1101CU;
				}
				
				if(txtGSS1102.getText().equalsIgnoreCase("a")) {
					GSS1102=5*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("b")) {
					GSS1102=4*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("c")) {
					GSS1102=3*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("d")) {
					GSS1102=2*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("e")) {
					GSS1102=1*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("f")) {
					GSS1102=0*GSS1102CU;
				}else if(txtGSS1102.getText().equalsIgnoreCase("")) {
					GSS1102=0*GSS1102CU;
				}
				
				if(txtGSS1103.getText().equalsIgnoreCase("a")) {
					GSS1103=5*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("b")) {
					GSS1103=4*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("c")) {
					GSS1103=3*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("d")) {
					GSS1103=2*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("e")) {
					GSS1103=1*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("f")) {
					GSS1103=0*GSS1103CU;
				}else if(txtGSS1103.getText().equalsIgnoreCase("")) {
					GSS1103=0*GSS1103CU;
				}
				
				if(txtCSC1101.getText().equalsIgnoreCase("a")) {
					CSC1101=5*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("b")) {
					CSC1101=4*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("c")) {
					CSC1101=3*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("d")) {
					CSC1101=2*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("e")) {
					CSC1101=1*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("f")) {
					CSC1101=0*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("")) {
					CSC1101=0*CSC1101CU;
				}
				
				if(txtMTH1101.getText().equalsIgnoreCase("a")) {
					MTH1101=5*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("b")) {
					MTH1101=4*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("c")) {
					MTH1101=3*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("d")) {
					MTH1101=2*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("e")) {
					MTH1101=1*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("f")) {
					MTH1101=0*MTH1101CU;
				}else if(txtMTH1101.getText().equalsIgnoreCase("")) {
					MTH1101=0*MTH1101CU;
				}
				
				
				if(txtPHY1101.getText().equalsIgnoreCase("a")) {
					PHY1101=5*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("b")) {
					PHY1101=4*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("c")) {
					PHY1101=3*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("d")) {
					PHY1101=2*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("e")) {
					PHY1101=1*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("f")) {
					PHY1101=0*PHY1101CU;
				}else if(txtPHY1101.getText().equalsIgnoreCase("")) {
					PHY1101=0*PHY1101CU;
				}
				
				if(txtPHY1104.getText().equalsIgnoreCase("a")) {
					PHY1104=5*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("b")) {
					PHY1104=4*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("c")) {
					PHY1104=3*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("d")) {
					PHY1104=2*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("e")) {
					PHY1104=1*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("f")) {
					PHY1104=0*PHY1104CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("")) {
					PHY1104=0*PHY1104CU;
				}
				
				if(txtCHM1101.getText().equalsIgnoreCase("a")) {
					CHM1101=5*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("b")) {
					CHM1101=4*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("c")) {
					CHM1101=3*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("d")) {
					CHM1101=2*CHM1101CU;
				}else if(txtPHY1104.getText().equalsIgnoreCase("e")) {
					CHM1101=1*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("f")) {
					CHM1101=0*CHM1101CU;
				}else if(txtCHM1101.getText().equalsIgnoreCase("")) {
					CHM1101=0*CHM1101CU;
				}
				
				if(txtBIO1101.getText().equalsIgnoreCase("a")) {
					BIO1101=5*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("b")) {
					BIO1101=4*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("c")) {
					BIO1101=3*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("d")) {
					BIO1101=2*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("e")) {
					BIO1101=1*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("f")) {
					BIO1101=0*BIO1101CU;
				}else if(txtBIO1101.getText().equalsIgnoreCase("")) {
					BIO1101=0*BIO1101CU;
				}
				
				creditUnit1= GSS1101CU + GSS1102CU + GSS1103CU + CSC1101CU + MTH1101CU + PHY1101CU + PHY1104CU + CHM1101CU + BIO1101CU;
				gradePoint1= GSS1101 + GSS1102 + GSS1103 + CSC1101 + MTH1101 + PHY1101 + PHY1104 + CHM1101 + BIO1101;
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
		btn1GPA.setBounds(10, 405, 89, 23);
		contentPane.add(btn1GPA);
		
		JButton btn2GPA = new JButton("2nd GPA");
		btn2GPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtGSS1201.getText().toString().equalsIgnoreCase("a")) {
					GSS1201=5*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("b")) {
					GSS1201=4*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("c")) {
					GSS1201=3*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("d")) {
					GSS1201=2*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("e")) {
					GSS1201=1*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("f")) {
					GSS1201=0*GSS1201CU;
				}else if(txtGSS1201.getText().equalsIgnoreCase("")) {
					GSS1201=0*GSS1201CU;
				}

				if(txtGSS1202.getText().equalsIgnoreCase("a")) {
					GSS1202=5*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("b")) {
					GSS1202=4*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("c")) {
					GSS1202=3*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("d")) {
					GSS1202=2*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("e")) {
					GSS1202=1*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("f")) {
					GSS1202=0*GSS1202CU;
				}else if(txtGSS1202.getText().equalsIgnoreCase("")) {
					GSS1202=0*GSS1202CU;
				}

				if(txtGSS1203.getText().equalsIgnoreCase("a")) {
					GSS1203=5*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("b")) {
					GSS1203=4*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("c")) {
					GSS1203=3*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("d")) {
					GSS1203=2*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("e")) {
					GSS1203=1*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("f")) {
					GSS1203=0*GSS1203CU;
				}else if(txtGSS1203.getText().equalsIgnoreCase("")) {
					GSS1203=0*GSS1203CU;
				}

				if(txtCSC1201.getText().equalsIgnoreCase("a")) {
					CSC1101=5*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("b")) {
					CSC1101=4*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("c")) {
					CSC1101=3*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("d")) {
					CSC1101=2*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("e")) {
					CSC1101=1*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("f")) {
					CSC1101=0*CSC1101CU;
				}else if(txtCSC1101.getText().equalsIgnoreCase("")) {
					CSC1101=0*CSC1101CU;
				}

				if(txtCSC1202.getText().equalsIgnoreCase("a")) {
					CSC1202=5*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("b")) {
					CSC1202=4*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("c")) {
					CSC1202=3*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("d")) {
					CSC1202=2*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("e")) {
					CSC1202=1*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("f")) {
					CSC1202=0*CSC1202CU;
				}else if(txtCSC1202.getText().equalsIgnoreCase("")) {
					CSC1202=0*CSC1202CU;
				}                

				if(txtMTH1201.getText().equalsIgnoreCase("a")) {
					MTH1201=5*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("b")) {
					MTH1201=4*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("c")) {
					MTH1201=3*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("d")) {
					MTH1201=2*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("e")) {
					MTH1201=1*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("f")) {
					MTH1201=0*MTH1201CU;
				}else if(txtMTH1201.getText().equalsIgnoreCase("")) {
					MTH1201=0*MTH1201CU;
				}

				if(txtMTH1203.getText().equalsIgnoreCase("a")) {
					MTH1203=5*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("b")) {
					MTH1203=4*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("c")) {
					MTH1203=3*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("d")) {
					MTH1203=2*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("e")) {
					MTH1203=1*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("f")) {
					MTH1203=0*MTH1203CU;
				}else if(txtMTH1203.getText().equalsIgnoreCase("")) {
					MTH1203=0*MTH1203CU;;
				}

				 if(txtPHY1201.getText().equalsIgnoreCase("a")) {
					PHY1201=5*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("b")) {
					PHY1201=4*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("c")) {
					PHY1201=3*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("d")) {
					PHY1201=2*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("e")) {
					PHY1201=1*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("f")) {
					PHY1201=0*PHY1201CU;
				}else if(txtPHY1201.getText().equalsIgnoreCase("")) {
					PHY1201=0*PHY1201CU;
				}

				if(txtSTA1201.getText().equalsIgnoreCase("a")) {
					STA1201=5*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("b")) {
					STA1201=4*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("c")) {
					STA1201=3*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("d")) {
					STA1201=2*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("e")) {
					STA1201=1*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("f")) {
					STA1201=0*STA1201CU;
				}else if(txtSTA1201.getText().equalsIgnoreCase("")) {
					STA1201=0*STA1201CU;
				}

				if(txtCSC1203.getText().equalsIgnoreCase("a")) {
				    CSC1203=5*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("b")) {
				    CSC1203=4*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("c")) {
				    CSC1203=3*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("d")) {
				    CSC1203=2*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("e")) {
				    CSC1203=1*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("f")) {
				    CSC1203=0*CSC1203CU;
				}else if(txtCSC1203.getText().equalsIgnoreCase("")) {
				    CSC1203=0*CSC1203CU;
				}
				
				creditUnit2= GSS1201CU + GSS1202CU + GSS1203CU + CSC1201CU + MTH1201CU + PHY1201CU + CSC1202CU + MTH1203CU + STA1201CU + CSC1203CU;
				gradePoint2= GSS1201 + GSS1202 + GSS1203 + CSC1201 + MTH1201 + PHY1201 + CSC1202 + MTH1203 + STA1201 + CSC1203;
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
		btn2GPA.setBounds(386, 405, 89, 23);
		contentPane.add(btn2GPA);
		
		JButton btnRest = new JButton("Rest");
		btnRest.setEnabled(false);
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtGSS1101.setText("");
				txtGSS1102.setText("");
				txtGSS1103.setText("");
				txtCSC1101.setText("");
				txtMTH1101.setText("");
				txtPHY1101.setText("");
				txtPHY1104.setText("");
				txtCHM1101.setText("");
				txtBIO1101.setText("");
				txtGSS1201.setText("");
				txtGSS1202.setText("");
				txtGSS1203.setText("");
				txtCSC1201.setText("");
				txtCSC1202.setText("");
				txtMTH1201.setText("");
				txtMTH1203.setText("");
				txtPHY1201.setText("");
				txtSTA1201.setText("");
				txtCSC1203.setText("");
				txtMain.setText("");
				
			}
		});
		btnRest.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRest.setBounds(207, 303, 89, 23);
		contentPane.add(btnRest);
		
		JCheckBox chckbx1semester = new JCheckBox("First Semester");
		chckbx1semester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbx1semester.isSelected()) {
					txtGSS1101.setEnabled(true);
					txtGSS1102.setEnabled(true);
					txtGSS1103.setEnabled(true);
					txtCSC1101.setEnabled(true);
					txtMTH1101.setEnabled(true);
					txtPHY1101.setEnabled(true);
					txtPHY1104.setEnabled(true);
					txtCHM1101.setEnabled(true);
					txtBIO1101.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btn1GPA.setEnabled(true);
				}else {
					txtGSS1101.setEnabled(false);
					txtGSS1102.setEnabled(false);
					txtGSS1103.setEnabled(false);
					txtCSC1101.setEnabled(false);
					txtMTH1101.setEnabled(false);
					txtPHY1101.setEnabled(false);
					txtPHY1104.setEnabled(false);
					txtCHM1101.setEnabled(false);
					txtBIO1101.setEnabled(false);
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
					txtGSS1201.setEnabled(true);
					txtGSS1202.setEnabled(true);
					txtGSS1203.setEnabled(true);
					txtCSC1201.setEnabled(true);
					txtCSC1202.setEnabled(true);
					txtMTH1201.setEnabled(true);
					txtMTH1203.setEnabled(true);
					txtPHY1201.setEnabled(true);
					txtSTA1201.setEnabled(true);
					txtCSC1203.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btn2GPA.setEnabled(true);
				}else {
					txtGSS1201.setEnabled(false);
					txtGSS1202.setEnabled(false);
					txtGSS1203.setEnabled(false);
					txtCSC1201.setEnabled(false);
					txtCSC1202.setEnabled(false);
					txtMTH1201.setEnabled(false);
					txtMTH1203.setEnabled(false);
					txtPHY1201.setEnabled(false);
					txtSTA1201.setEnabled(false);
					txtCSC1203.setEnabled(false);
					txtMain.setEnabled(false);
					
					btnRest.setEnabled(false);
					btn2GPA.setEnabled(false);
				}
				
				if(chckbx2semester.isSelected()) {
					chckbx1semester.setSelected(false); 
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
					txtGSS1101.setEnabled(true);
					txtGSS1102.setEnabled(true);
					txtGSS1103.setEnabled(true);
					txtCSC1101.setEnabled(true);
					txtMTH1101.setEnabled(true);
					txtPHY1101.setEnabled(true);
					txtPHY1104.setEnabled(true);
					txtCHM1101.setEnabled(true);
					txtBIO1101.setEnabled(true);
					txtMain.setEnabled(true);
					
					txtGSS1201.setEnabled(true);
					txtGSS1202.setEnabled(true);
					txtGSS1203.setEnabled(true);
					txtCSC1201.setEnabled(true);
					txtCSC1202.setEnabled(true);
					txtMTH1201.setEnabled(true);
					txtMTH1203.setEnabled(true);
					txtPHY1201.setEnabled(true);
					txtSTA1201.setEnabled(true);
					txtCSC1203.setEnabled(true);
					txtMain.setEnabled(true);
					
					btnRest.setEnabled(true);
					btnGETCGPA.setEnabled(true);
				}else {
					txtGSS1101.setEnabled(false);
					txtGSS1102.setEnabled(false);
					txtGSS1103.setEnabled(false);
					txtCSC1101.setEnabled(false);
					txtMTH1101.setEnabled(false);
					txtPHY1101.setEnabled(false);
					txtPHY1104.setEnabled(false);
					txtCHM1101.setEnabled(false);
					txtBIO1101.setEnabled(false);
					txtMain.setEnabled(false);
					
					txtGSS1201.setEnabled(false);
					txtGSS1202.setEnabled(false);
					txtGSS1203.setEnabled(false);
					txtCSC1201.setEnabled(false);
					txtCSC1202.setEnabled(false);
					txtMTH1201.setEnabled(false);
					txtMTH1203.setEnabled(false);
					txtPHY1201.setEnabled(false);
					txtSTA1201.setEnabled(false);
					txtCSC1203.setEnabled(false);
					txtMain.setEnabled(false);
					
					btnRest.setEnabled(false);
					btnGETCGPA.setEnabled(false);
				}
				
				if(chckbxBothsemester.isSelected()) {
					chckbx1semester.setSelected(false); 
					chckbx2semester.setSelected(false); 
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
