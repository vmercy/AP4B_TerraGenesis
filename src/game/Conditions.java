
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
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Conditions extends Home{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					Conditions window = new Conditions();
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
	public Conditions() {
		initialize();
		mu.stop();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1109, 717);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		lblNewLabel_3_1_1.setBounds(65, 499, 233, 32);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Oxygen :");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1_2.setBounds(65, 363, 233, 32);
		frame.getContentPane().add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Water :");
		lblNewLabel_3_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_2_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1_2_1.setBounds(65, 429, 233, 32);
		frame.getContentPane().add(lblNewLabel_3_1_2_1);
	
		JLabel lblNewLabel_3_1_2_2 = new JLabel("Biomass :");
		lblNewLabel_3_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1_2_2.setBounds(65, 297, 233, 32);
		frame.getContentPane().add(lblNewLabel_3_1_2_2);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(878, 27, 207, 11);
		progressBar.setValue(100);
		frame.getContentPane().add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(253, 179, 207, 11);
		progressBar_1.setValue(45);
		frame.getContentPane().add(progressBar_1);
		JLabel lblNewLabel_3_3_5 = new JLabel("45%");
		lblNewLabel_3_3_5.setForeground(Color.WHITE);
		lblNewLabel_3_3_5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_3_5.setBounds(468, 166, 50, 32);
		frame.getContentPane().add(lblNewLabel_3_3_5);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setBounds(253, 244, 207, 11);
		progressBar_2.setValue(30);
		frame.getContentPane().add(progressBar_2);
		JLabel lblNewLabel_3_3 = new JLabel("30%");
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_3.setBounds(468, 231, 50, 32);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setBounds(253, 308, 207, 11);
		progressBar_3.setValue(10);
		frame.getContentPane().add(progressBar_3);
		JLabel lblNewLabel_3_3_4 = new JLabel("10%");
		lblNewLabel_3_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_3_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_3_4.setBounds(468, 297, 50, 32);
		frame.getContentPane().add(lblNewLabel_3_3_4);
		
		JProgressBar progressBar_3_1 = new JProgressBar();
		progressBar_3_1.setBounds(253, 374, 207, 11);
		progressBar_3_1.setValue(95);
		frame.getContentPane().add(progressBar_3_1);
		JLabel lblNewLabel_3_3_3 = new JLabel("95%");
		lblNewLabel_3_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_3_3.setBounds(468, 363, 50, 32);
		frame.getContentPane().add(lblNewLabel_3_3_3);
		
		JProgressBar progressBar_3_1_1 = new JProgressBar();
		progressBar_3_1_1.setBounds(253, 443, 207, 11);
		progressBar_3_1_1.setValue(73);
		frame.getContentPane().add(progressBar_3_1_1);
		JLabel lblNewLabel_3_3_2 = new JLabel("73%");
		lblNewLabel_3_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_3_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_3_2.setBounds(468, 429, 50, 32);
		frame.getContentPane().add(lblNewLabel_3_3_2);
		
		JProgressBar progressBar_3_1_2 = new JProgressBar();
		progressBar_3_1_2.setBounds(253, 511, 207, 11);
		progressBar_3_1_2.setValue(66);
		frame.getContentPane().add(progressBar_3_1_2);
		JLabel lblNewLabel_3_3_1 = new JLabel("66%");
		lblNewLabel_3_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_3_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_3_1.setBounds(468, 499, 50, 32);
		frame.getContentPane().add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_6 = new JLabel("Mission");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(955, 12, 59, 11);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("{Mission Name}");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3_2.setBounds(878, 41, 207, 20);
		frame.getContentPane().add(lblNewLabel_3_2);
		
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
	
	public Color getColor()
	  {
	    byte red, green;
	    red = (byte) (255-(10*255));
	    green = (byte) (255 * 10);
	    return (new Color(red, green, 0));
	  }
}
