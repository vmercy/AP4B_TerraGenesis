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
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class HumansInterface extends HomeInterface {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					HumansInterface window = new HumansInterface();
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
	public HumansInterface() {
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
		
		JButton btnExitGame = new JButton("Exit game");
		btnExitGame.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExitGame.setIcon(new ImageIcon(IMAGES_PATH+"close-icon.png"));
		btnExitGame.addActionListener(bHandler);
		btnExitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
        System.exit(0);
			}
		});
		btnExitGame.setBounds(10, 638, 200, 32);
		frame.getContentPane().add(btnExitGame);
		
		JLabel lblGameTitle = new JLabel("Mars 2035");
		lblGameTitle.setForeground(Color.WHITE);
		lblGameTitle.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
		lblGameTitle.setBounds(468, 10, 168, 39);
    frame.getContentPane().add(lblGameTitle);
    
    JLabel lblGameSucess = new JLabel("<html>Well done !  </br>You were able to terraform the planet and add humans to it. The game is over!</html>");
    lblGameSucess.setForeground(Color.WHITE);
    lblGameSucess.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
    lblGameSucess.setBounds(100, 100, 400, 500);
    frame.getContentPane().add(lblGameSucess);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(878, 27, 207, 11);
		progressBar.setValue(30);
		frame.getContentPane().add(progressBar);
	
		JLabel lblNewLabel_3 = new JLabel("Mission");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(955, 12, 59, 11);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("{Mission Name}");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3_1.setBounds(878, 41, 207, 20);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("100000$");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setIcon(new ImageIcon(IMAGES_PATH+"coin-icon.png"));
		lblNewLabel_4.setBounds(38, 10, 123, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(IMAGES_PATH+"planet.png"));
		lblNewLabel.setBounds(570, 79, 515, 523);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon(IMAGES_PATH+"sky.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1106, 680);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
