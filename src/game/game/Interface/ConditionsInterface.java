package game.Interface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class ConditionsInterface extends HomeInterface{

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					ConditionsInterface window = new ConditionsInterface();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConditionsInterface() {
		initialize();
		mu.stop();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 717);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setIcon(new ImageIcon(".\\Images\\Go-back-icon-1.png"));
		btnNewButton_3.addActionListener(bHandler);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		btnNewButton_3.setBounds(10, 638, 103, 32);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Mars 2035");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_2.setBounds(468, 10, 168, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Temperature :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(65, 166, 233, 32);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Pression :");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1.setBounds(65, 231, 233, 32);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Gaz :");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1_1.setBounds(65, 506, 233, 32);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Oxygen :");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1_2.setBounds(65, 368, 233, 32);
		frame.getContentPane().add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Water :");
		lblNewLabel_3_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_2_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1_2_1.setBounds(65, 437, 233, 32);
		frame.getContentPane().add(lblNewLabel_3_1_2_1);
	
		JLabel lblNewLabel_3_1_2_2 = new JLabel("Biomass :");
		lblNewLabel_3_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1_2_2.setBounds(65, 298, 233, 32);
		frame.getContentPane().add(lblNewLabel_3_1_2_2);
		
		textField = new JTextField("5000D");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setBounds(255, 234, 125, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("332147W");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(JTextField.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(255, 301, 125, 32);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField("100P");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(JTextField.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(255, 371, 125, 32);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField("94560ml");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setEditable(false);
		textField_3.setHorizontalAlignment(JTextField.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(255, 440, 125, 32);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField("600�C");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setEditable(false);
		textField_4.setHorizontalAlignment(JTextField.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(255, 169, 125, 32);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField("10000K");
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(JTextField.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(255, 509, 125, 32);
		frame.getContentPane().add(textField_5);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(878, 27, 207, 11);
		frame.getContentPane().add(progressBar);
	
		JLabel lblNewLabel_6 = new JLabel("Mission");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(955, 12, 59, 11);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("100000$");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setIcon(new ImageIcon(".\\Images\\coin-us-dollar-icon-1.png"));
		lblNewLabel_4.setBounds(38, 10, 123, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(".\\Images\\terree.png"));
		lblNewLabel.setBounds(570, 79, 515, 523);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(".\\Images\\lunee.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1106, 680);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
}
