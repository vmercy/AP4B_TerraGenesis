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

public class ConditionsInterface extends HomeInterface{

	JFrame frame;

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
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setIcon(new ImageIcon(IMAGES_PATH+"back-icon.png"));
		btnNewButton_3.addActionListener(bHandler);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
		btnNewButton_3.setBounds(10, 638, 103, 32);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblGameTitle = new JLabel("Mars 2035");
		lblGameTitle.setForeground(Color.WHITE);
		lblGameTitle.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
		lblGameTitle.setBounds(468, 10, 168, 39);
    frame.getContentPane().add(lblGameTitle);
    
    //TODO add icons
		
		JLabel lblWater = new JLabel("Water :");
		lblWater.setForeground(Color.WHITE);
		lblWater.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblWater.setBounds(65, 166, 233, 32);
		frame.getContentPane().add(lblWater);
		
		JLabel lblTemperature = new JLabel("Temperature :");
		lblTemperature.setForeground(Color.WHITE);
		lblTemperature.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblTemperature.setBounds(65, 231, 233, 32);
		frame.getContentPane().add(lblTemperature);
		
		JLabel lblOxygen = new JLabel("Oxygen :");
		lblOxygen.setForeground(Color.WHITE);
		lblOxygen.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblOxygen.setBounds(65, 499, 233, 32);
		frame.getContentPane().add(lblOxygen);
		
		JLabel lblCarbonDioxide = new JLabel("Carbon dioxide :");
		lblCarbonDioxide.setForeground(Color.WHITE);
		lblCarbonDioxide.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblCarbonDioxide.setBounds(65, 363, 233, 32);
		frame.getContentPane().add(lblCarbonDioxide);
		
		JLabel lblPressure = new JLabel("Pressure :");
		lblPressure.setForeground(Color.WHITE);
		lblPressure.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblPressure.setBounds(65, 429, 233, 32);
		frame.getContentPane().add(lblPressure);
	
		JLabel lblBiomass = new JLabel("Biomass :");
		lblBiomass.setForeground(Color.WHITE);
		lblBiomass.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblBiomass.setBounds(65, 297, 233, 32);
		frame.getContentPane().add(lblBiomass);
		
		JProgressBar progressBarMissions = new JProgressBar();
		progressBarMissions.setBounds(878, 27, 207, 11);
		progressBarMissions.setValue(100);
		frame.getContentPane().add(progressBarMissions);
		
		JProgressBar progressBarWater = new JProgressBar();
		progressBarWater.setBounds(253, 179, 207, 11);
		progressBarWater.setValue(45);
		frame.getContentPane().add(progressBarWater);
		JLabel lblNewLabel_3_3_5 = new JLabel("45%");
		lblNewLabel_3_3_5.setForeground(Color.WHITE);
		lblNewLabel_3_3_5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_3_5.setBounds(468, 166, 50, 32);
		frame.getContentPane().add(lblNewLabel_3_3_5);
		
		JProgressBar progressBarTemperature = new JProgressBar();
		progressBarTemperature.setBounds(253, 244, 207, 11);
		progressBarTemperature.setValue(30);
		frame.getContentPane().add(progressBarTemperature);
		JLabel lblTemperatureValue = new JLabel("30%");
		lblTemperatureValue.setForeground(Color.WHITE);
		lblTemperatureValue.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblTemperatureValue.setBounds(468, 231, 50, 32);
		frame.getContentPane().add(lblTemperatureValue);
		
		JProgressBar progressBarOxygen = new JProgressBar();
		progressBarOxygen.setBounds(253, 308, 207, 11);
		progressBarOxygen.setValue(10);
		frame.getContentPane().add(progressBarOxygen);
		JLabel lblOxygenValue = new JLabel("10%");
		lblOxygenValue.setForeground(Color.WHITE);
		lblOxygenValue.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblOxygenValue.setBounds(468, 297, 50, 32);
		frame.getContentPane().add(lblOxygenValue);
		
		JProgressBar progressBarCarbonDioxide = new JProgressBar();
		progressBarCarbonDioxide.setBounds(253, 374, 207, 11);
		progressBarCarbonDioxide.setValue(95);
		frame.getContentPane().add(progressBarCarbonDioxide);
		JLabel lblCarbonDioxideValue = new JLabel("95%");
		lblCarbonDioxideValue.setForeground(Color.WHITE);
		lblCarbonDioxideValue.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblCarbonDioxideValue.setBounds(468, 363, 50, 32);
		frame.getContentPane().add(lblCarbonDioxideValue);
		
		JProgressBar progressBarPressure = new JProgressBar();
		progressBarPressure.setBounds(253, 443, 207, 11);
		progressBarPressure.setValue(73);
		frame.getContentPane().add(progressBarPressure);
		JLabel lblPressureValue = new JLabel("73%");
		lblPressureValue.setForeground(Color.WHITE);
		lblPressureValue.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblPressureValue.setBounds(468, 429, 50, 32);
		frame.getContentPane().add(lblPressureValue);
		
		JProgressBar progressBarBiomass = new JProgressBar();
		progressBarBiomass.setBounds(253, 511, 207, 11);
		progressBarBiomass.setValue(66);
		frame.getContentPane().add(progressBarBiomass);
		JLabel lblBiomassValue = new JLabel("66%");
		lblBiomassValue.setForeground(Color.WHITE);
		lblBiomassValue.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblBiomassValue.setBounds(468, 499, 50, 32);
		frame.getContentPane().add(lblBiomassValue);
		
		JLabel lblMissionIntro = new JLabel("Mission");
		lblMissionIntro.setForeground(Color.WHITE);
		lblMissionIntro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblMissionIntro.setBounds(955, 12, 59, 11);
		frame.getContentPane().add(lblMissionIntro);
		
		JLabel lblNewLabel_3_2 = new JLabel("{Mission Name}");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3_2.setBounds(878, 41, 207, 20);
		frame.getContentPane().add(lblNewLabel_3_2);
		
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
