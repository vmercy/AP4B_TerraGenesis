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
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class CityInterface extends HomeInterface{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					CityInterface window = new CityInterface();
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
	public CityInterface() {
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

		JButton btnNewButton = new JButton("Create Facility");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(bHandler);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FacilityInterface facility = new FacilityInterface();
				facility.frame.setVisible(true);
			}	
		});
		btnNewButton.setBounds(190, 218, 175, 62);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create Laboratory");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(bHandler);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Create a Laboratory : -2000$");

			}
		});
		btnNewButton_1.setBounds(190, 312, 175, 62);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Create Botanic Garden");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(bHandler);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Create a Botanic Garden : -3500$");

			}
		});
		btnNewButton_2.setBounds(190, 405, 175, 62);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setIcon(new ImageIcon(IMAGES_PATH+"Go-back-icon-1.png"));
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
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(878, 27, 207, 11);
		progressBar.setValue(30);
		frame.getContentPane().add(progressBar);

		JLabel lblNewLabel_6 = new JLabel("Mission");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(955, 12, 59, 11);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_1 = new JLabel("{Mission Name}");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3_1.setBounds(878, 41, 207, 20);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("100000$");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setIcon(new ImageIcon(IMAGES_PATH+"coin-us-dollar-icon-1.png"));
		lblNewLabel_4.setBounds(38, 10, 123, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(IMAGES_PATH+"terree.png"));
		lblNewLabel.setBounds(570, 79, 515, 523);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(IMAGES_PATH+"lunee.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1106, 680);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
}
